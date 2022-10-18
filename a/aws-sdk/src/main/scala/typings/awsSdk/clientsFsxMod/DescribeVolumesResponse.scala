package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVolumesResponse extends StObject {
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsFsxMod.NextToken] = js.undefined
  
  /**
    * Returned after a successful DescribeVolumes operation, describing each volume.
    */
  var Volumes: js.UndefOr[typings.awsSdk.clientsFsxMod.Volumes] = js.undefined
}
object DescribeVolumesResponse {
  
  inline def apply(): DescribeVolumesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesResponse]
  }
  
  extension [Self <: DescribeVolumesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVolumes(value: Volumes): Self = StObject.set(x, "Volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "Volumes", js.undefined)
    
    inline def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "Volumes", js.Array(value*))
  }
}
