package typings.antDesignProLayout.themeColorMod

import typings.antDesignProLayout.anon.Color
import typings.antDesignProLayout.anon.DefaultMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeColorProps extends js.Object {
  
  var colors: js.UndefOr[js.Array[Color]] = js.native
  
  def formatMessage(data: DefaultMessage): String = js.native
  
  def onChange(color: String): Unit = js.native
  
  var value: String = js.native
}
object ThemeColorProps {
  
  @scala.inline
  def apply(formatMessage: DefaultMessage => String, onChange: String => Unit, value: String): ThemeColorProps = {
    val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeColorProps]
  }
  
  @scala.inline
  implicit class ThemeColorPropsOps[Self <: ThemeColorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormatMessage(value: DefaultMessage => String): Self = this.set("formatMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChange(value: String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsVarargs(value: Color*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[Color]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
  }
}
