package typings.asciify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsciifyOptions extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
}
object AsciifyOptions {
  
  @scala.inline
  def apply(): AsciifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsciifyOptions]
  }
  
  @scala.inline
  implicit class AsciifyOptionsMutableBuilder[Self <: AsciifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
  }
}
