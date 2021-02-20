package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formatter extends StObject {
  
  var align: String = js.native
  
  var formatter: js.Any = js.native
  
  var spacing: Double = js.native
  
  var style: FontFamilyFontSize = js.native
}
object Formatter {
  
  @scala.inline
  def apply(align: String, formatter: js.Any, spacing: Double, style: FontFamilyFontSize): Formatter = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formatter]
  }
  
  @scala.inline
  implicit class FormatterMutableBuilder[Self <: Formatter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatter(value: js.Any): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: FontFamilyFontSize): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
