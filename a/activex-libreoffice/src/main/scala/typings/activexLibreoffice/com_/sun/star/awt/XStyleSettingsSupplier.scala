package typings.activexLibreoffice.com_.sun.star.awt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the style settings of a component */
trait XStyleSettingsSupplier extends StObject {
  
  var StyleSettings: XStyleSettings
}
object XStyleSettingsSupplier {
  
  @scala.inline
  def apply(StyleSettings: XStyleSettings): XStyleSettingsSupplier = {
    val __obj = js.Dynamic.literal(StyleSettings = StyleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[XStyleSettingsSupplier]
  }
  
  @scala.inline
  implicit class XStyleSettingsSupplierMutableBuilder[Self <: XStyleSettingsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyleSettings(value: XStyleSettings): Self = StObject.set(x, "StyleSettings", value.asInstanceOf[js.Any])
  }
}
