package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkgroupResponse extends StObject {
  
  /**
    * The deleted workgroup object.
    */
  var workgroup: Workgroup
}
object DeleteWorkgroupResponse {
  
  inline def apply(workgroup: Workgroup): DeleteWorkgroupResponse = {
    val __obj = js.Dynamic.literal(workgroup = workgroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkgroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWorkgroupResponse] (val x: Self) extends AnyVal {
    
    inline def setWorkgroup(value: Workgroup): Self = StObject.set(x, "workgroup", value.asInstanceOf[js.Any])
  }
}
