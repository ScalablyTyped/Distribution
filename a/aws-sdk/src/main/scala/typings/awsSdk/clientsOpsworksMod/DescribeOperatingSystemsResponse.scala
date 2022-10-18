package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOperatingSystemsResponse extends StObject {
  
  /**
    * Contains information in response to a DescribeOperatingSystems request.
    */
  var OperatingSystems: js.UndefOr[typings.awsSdk.clientsOpsworksMod.OperatingSystems] = js.undefined
}
object DescribeOperatingSystemsResponse {
  
  inline def apply(): DescribeOperatingSystemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOperatingSystemsResponse]
  }
  
  extension [Self <: DescribeOperatingSystemsResponse](x: Self) {
    
    inline def setOperatingSystems(value: OperatingSystems): Self = StObject.set(x, "OperatingSystems", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemsUndefined: Self = StObject.set(x, "OperatingSystems", js.undefined)
    
    inline def setOperatingSystemsVarargs(value: OperatingSystem*): Self = StObject.set(x, "OperatingSystems", js.Array(value*))
  }
}
