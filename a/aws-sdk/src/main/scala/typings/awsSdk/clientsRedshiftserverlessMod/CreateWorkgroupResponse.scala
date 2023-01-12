package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkgroupResponse extends StObject {
  
  /**
    * The created workgroup object.
    */
  var workgroup: js.UndefOr[Workgroup] = js.undefined
}
object CreateWorkgroupResponse {
  
  inline def apply(): CreateWorkgroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkgroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkgroupResponse] (val x: Self) extends AnyVal {
    
    inline def setWorkgroup(value: Workgroup): Self = StObject.set(x, "workgroup", value.asInstanceOf[js.Any])
    
    inline def setWorkgroupUndefined: Self = StObject.set(x, "workgroup", js.undefined)
  }
}
