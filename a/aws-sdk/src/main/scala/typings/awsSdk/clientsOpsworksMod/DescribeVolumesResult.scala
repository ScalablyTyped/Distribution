package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVolumesResult extends StObject {
  
  /**
    * An array of volume IDs.
    */
  var Volumes: js.UndefOr[typings.awsSdk.clientsOpsworksMod.Volumes] = js.undefined
}
object DescribeVolumesResult {
  
  inline def apply(): DescribeVolumesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesResult]
  }
  
  extension [Self <: DescribeVolumesResult](x: Self) {
    
    inline def setVolumes(value: Volumes): Self = StObject.set(x, "Volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "Volumes", js.undefined)
    
    inline def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "Volumes", js.Array(value*))
  }
}
