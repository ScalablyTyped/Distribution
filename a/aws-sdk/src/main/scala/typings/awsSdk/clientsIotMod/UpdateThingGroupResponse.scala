package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThingGroupResponse extends StObject {
  
  /**
    * The version of the updated thing group.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object UpdateThingGroupResponse {
  
  inline def apply(): UpdateThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateThingGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateThingGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
