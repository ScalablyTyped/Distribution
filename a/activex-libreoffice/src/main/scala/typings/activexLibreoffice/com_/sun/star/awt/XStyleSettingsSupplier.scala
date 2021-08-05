package typings.activexLibreoffice.com_.sun.star.awt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the style settings of a component */
trait XStyleSettingsSupplier extends StObject {
  
  var StyleSettings: XStyleSettings
}
object XStyleSettingsSupplier {
  
  inline def apply(StyleSettings: XStyleSettings): XStyleSettingsSupplier = {
    val __obj = js.Dynamic.literal(StyleSettings = StyleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[XStyleSettingsSupplier]
  }
  
  extension [Self <: XStyleSettingsSupplier](x: Self) {
    
    inline def setStyleSettings(value: XStyleSettings): Self = StObject.set(x, "StyleSettings", value.asInstanceOf[js.Any])
  }
}
