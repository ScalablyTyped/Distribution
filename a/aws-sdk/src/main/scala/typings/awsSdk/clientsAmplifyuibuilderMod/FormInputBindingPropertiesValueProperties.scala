package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormInputBindingPropertiesValueProperties extends StObject {
  
  /**
    * An Amplify DataStore model.
    */
  var model: js.UndefOr[String] = js.undefined
}
object FormInputBindingPropertiesValueProperties {
  
  inline def apply(): FormInputBindingPropertiesValueProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormInputBindingPropertiesValueProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormInputBindingPropertiesValueProperties] (val x: Self) extends AnyVal {
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
