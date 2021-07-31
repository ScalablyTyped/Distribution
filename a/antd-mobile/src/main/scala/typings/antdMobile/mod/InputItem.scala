package typings.antdMobile.mod

import typings.antdMobile.inputItemMod.InputItemProps
import typings.antdMobile.inputItemMod.default
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile", "InputItem")
@js.native
class InputItem protected () extends default {
  def this(props: InputItemProps) = this()
}
object InputItem {
  
  /* static member */
  object contextTypes {
    
    @JSImport("antd-mobile", "InputItem.contextTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile", "InputItem.contextTypes.antLocale")
    @js.native
    def antLocale: Requireable[js.Object] = js.native
    @scala.inline
    def antLocale_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("antLocale")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object defaultProps {
    
    @JSImport("antd-mobile", "InputItem.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile", "InputItem.defaultProps.clear")
    @js.native
    def clear: Boolean = js.native
    @scala.inline
    def clear_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.disabled")
    @js.native
    def disabled: Boolean = js.native
    
    @JSImport("antd-mobile", "InputItem.defaultProps.disabledKeys")
    @js.native
    def disabledKeys: /* is `Null`, but independent javascript fields cannot be in scala 3 */ js.Any = js.native
    @scala.inline
    def disabledKeys_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabledKeys")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.editable")
    @js.native
    def editable: Boolean = js.native
    @scala.inline
    def editable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editable")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.error")
    @js.native
    def error: Boolean = js.native
    @scala.inline
    def error_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.extra")
    @js.native
    def extra: String = js.native
    @scala.inline
    def extra_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extra")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.labelNumber")
    @js.native
    def labelNumber: Double = js.native
    @scala.inline
    def labelNumber_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelNumber")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.moneyKeyboardAlign")
    @js.native
    def moneyKeyboardAlign: String = js.native
    @scala.inline
    def moneyKeyboardAlign_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moneyKeyboardAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.moneyKeyboardHeader")
    @js.native
    def moneyKeyboardHeader: /* is `Null`, but independent javascript fields cannot be in scala 3 */ js.Any = js.native
    @scala.inline
    def moneyKeyboardHeader_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moneyKeyboardHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.onBlur")
    @js.native
    def onBlur: js.Function0[Unit] = js.native
    @scala.inline
    def onBlur_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.onChange")
    @js.native
    def onChange: js.Function0[Unit] = js.native
    @scala.inline
    def onChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.onErrorClick")
    @js.native
    def onErrorClick: js.Function0[Unit] = js.native
    @scala.inline
    def onErrorClick_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onErrorClick")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.onExtraClick")
    @js.native
    def onExtraClick: js.Function0[Unit] = js.native
    @scala.inline
    def onExtraClick_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExtraClick")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.onFocus")
    @js.native
    def onFocus: js.Function0[Unit] = js.native
    @scala.inline
    def onFocus_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.onVirtualKeyboardConfirm")
    @js.native
    def onVirtualKeyboardConfirm: js.Function0[Unit] = js.native
    @scala.inline
    def onVirtualKeyboardConfirm_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onVirtualKeyboardConfirm")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.placeholder")
    @js.native
    def placeholder: String = js.native
    @scala.inline
    def placeholder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.prefixCls")
    @js.native
    def prefixCls: String = js.native
    @scala.inline
    def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.prefixListCls")
    @js.native
    def prefixListCls: String = js.native
    @scala.inline
    def prefixListCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixListCls")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "InputItem.defaultProps.type")
    @js.native
    val `type`: String = js.native
    
    @JSImport("antd-mobile", "InputItem.defaultProps.updatePlaceholder")
    @js.native
    def updatePlaceholder: Boolean = js.native
    @scala.inline
    def updatePlaceholder_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updatePlaceholder")(x.asInstanceOf[js.Any])
  }
}
