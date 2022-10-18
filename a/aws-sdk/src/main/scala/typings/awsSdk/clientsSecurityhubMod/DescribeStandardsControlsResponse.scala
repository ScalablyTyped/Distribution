package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStandardsControlsResponse extends StObject {
  
  /**
    * A list of security standards controls.
    */
  var Controls: js.UndefOr[StandardsControls] = js.undefined
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
}
object DescribeStandardsControlsResponse {
  
  inline def apply(): DescribeStandardsControlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStandardsControlsResponse]
  }
  
  extension [Self <: DescribeStandardsControlsResponse](x: Self) {
    
    inline def setControls(value: StandardsControls): Self = StObject.set(x, "Controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "Controls", js.undefined)
    
    inline def setControlsVarargs(value: StandardsControl*): Self = StObject.set(x, "Controls", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
