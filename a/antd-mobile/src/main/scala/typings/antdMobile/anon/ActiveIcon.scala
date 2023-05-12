package typings.antdMobile.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveIcon extends StObject {
  
  var activeIcon: js.UndefOr[ReactNode] = js.undefined
  
  def check(`val`: String): Unit
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var extra: js.UndefOr[js.Function1[/* active */ Boolean, ReactNode]] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  def uncheck(`val`: String): Unit
  
  var value: js.Array[String]
}
object ActiveIcon {
  
  inline def apply(check: String => Unit, uncheck: String => Unit, value: js.Array[String]): ActiveIcon = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), uncheck = js.Any.fromFunction1(uncheck), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveIcon] (val x: Self) extends AnyVal {
    
    inline def setActiveIcon(value: ReactNode): Self = StObject.set(x, "activeIcon", value.asInstanceOf[js.Any])
    
    inline def setActiveIconUndefined: Self = StObject.set(x, "activeIcon", js.undefined)
    
    inline def setCheck(value: String => Unit): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExtra(value: /* active */ Boolean => ReactNode): Self = StObject.set(x, "extra", js.Any.fromFunction1(value))
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setUncheck(value: String => Unit): Self = StObject.set(x, "uncheck", js.Any.fromFunction1(value))
    
    inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
