package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadOnlyFieldInfo extends StObject {
  
  /**
    * Identifier of the read-only field.
    */
  var Id: js.UndefOr[TaskTemplateFieldIdentifier] = js.undefined
}
object ReadOnlyFieldInfo {
  
  inline def apply(): ReadOnlyFieldInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOnlyFieldInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadOnlyFieldInfo] (val x: Self) extends AnyVal {
    
    inline def setId(value: TaskTemplateFieldIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
