package typings.antdMobileRn.mod

import typings.antdMobileRn.anon.Styles
import typings.antdMobileRn.radioIndexNativeMod.default
import typings.antdMobileRn.radioNativeMod.RadioNativeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn", "Radio")
@js.native
open class Radio protected () extends default {
  def this(props: RadioNativeProps, context: Any) = this()
}
/* static members */
object Radio {
  
  @JSImport("antd-mobile-rn", "Radio")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile-rn", "Radio.RadioItem")
  @js.native
  def RadioItem: Any = js.native
  inline def RadioItem_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RadioItem")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile-rn", "Radio.defaultProps")
  @js.native
  def defaultProps: Styles = js.native
  inline def defaultProps_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
