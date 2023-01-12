package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationInput extends StObject {
  
  /**
    * The current name of the application you want to change.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.undefined
  
  /**
    * The new name to give the application.
    */
  var newApplicationName: js.UndefOr[ApplicationName] = js.undefined
}
object UpdateApplicationInput {
  
  inline def apply(): UpdateApplicationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApplicationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApplicationInput] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    inline def setNewApplicationName(value: ApplicationName): Self = StObject.set(x, "newApplicationName", value.asInstanceOf[js.Any])
    
    inline def setNewApplicationNameUndefined: Self = StObject.set(x, "newApplicationName", js.undefined)
  }
}
