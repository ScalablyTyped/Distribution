package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetThemeResponse extends StObject {
  
  /**
    * Represents the configuration settings for the theme.
    */
  var theme: js.UndefOr[Theme] = js.undefined
}
object GetThemeResponse {
  
  inline def apply(): GetThemeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetThemeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetThemeResponse] (val x: Self) extends AnyVal {
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
