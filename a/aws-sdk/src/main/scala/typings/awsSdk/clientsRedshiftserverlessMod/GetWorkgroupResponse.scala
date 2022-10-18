package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkgroupResponse extends StObject {
  
  /**
    * The returned workgroup object.
    */
  var workgroup: Workgroup
}
object GetWorkgroupResponse {
  
  inline def apply(workgroup: Workgroup): GetWorkgroupResponse = {
    val __obj = js.Dynamic.literal(workgroup = workgroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkgroupResponse]
  }
  
  extension [Self <: GetWorkgroupResponse](x: Self) {
    
    inline def setWorkgroup(value: Workgroup): Self = StObject.set(x, "workgroup", value.asInstanceOf[js.Any])
  }
}
