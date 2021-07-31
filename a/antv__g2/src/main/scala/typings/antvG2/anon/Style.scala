package typings.antvG2.anon

import typings.antvG2.antvG2Strings.cross
import typings.antvG2.antvG2Strings.rect
import typings.antvG2.antvG2Strings.x
import typings.antvG2.antvG2Strings.y
import typings.antvG2.mod.Styles.background
import typings.antvG2.mod.Styles.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style extends StObject {
  
  var style: js.UndefOr[background | line] = js.undefined
  
  /**
    * rect 表示矩形框，x 表示水平辅助线，y 表示垂直辅助线，cross 表示十字辅助线
    */
  var `type`: js.UndefOr[rect | x | y | cross | typings.antvG2.antvG2Strings.line] = js.undefined
}
object Style {
  
  @scala.inline
  def apply(): Style = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style]
  }
  
  @scala.inline
  implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: background | line): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setType(value: rect | typings.antvG2.antvG2Strings.x | y | cross | typings.antvG2.antvG2Strings.line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
