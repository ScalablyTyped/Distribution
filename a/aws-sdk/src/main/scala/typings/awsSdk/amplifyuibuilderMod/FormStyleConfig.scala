package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormStyleConfig extends StObject {
  
  /**
    * A reference to a design token to use to bind the form's style properties to an existing theme.
    */
  var tokenReference: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the style setting.
    */
  var value: js.UndefOr[String] = js.undefined
}
object FormStyleConfig {
  
  inline def apply(): FormStyleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormStyleConfig]
  }
  
  extension [Self <: FormStyleConfig](x: Self) {
    
    inline def setTokenReference(value: String): Self = StObject.set(x, "tokenReference", value.asInstanceOf[js.Any])
    
    inline def setTokenReferenceUndefined: Self = StObject.set(x, "tokenReference", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
