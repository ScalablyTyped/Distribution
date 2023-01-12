package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvisibleFieldInfo extends StObject {
  
  /**
    * Identifier of the invisible field.
    */
  var Id: js.UndefOr[TaskTemplateFieldIdentifier] = js.undefined
}
object InvisibleFieldInfo {
  
  inline def apply(): InvisibleFieldInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvisibleFieldInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvisibleFieldInfo] (val x: Self) extends AnyVal {
    
    inline def setId(value: TaskTemplateFieldIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
