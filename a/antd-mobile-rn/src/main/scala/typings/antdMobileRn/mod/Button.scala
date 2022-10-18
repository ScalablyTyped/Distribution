package typings.antdMobileRn.mod

import typings.antdMobileRn.anon.Disabled
import typings.antdMobileRn.libButtonIndexDotnativeMod.ButtonProps
import typings.antdMobileRn.libButtonIndexDotnativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn", "Button")
@js.native
open class Button protected () extends default {
  def this(props: ButtonProps) = this()
}
/* static members */
object Button {
  
  @JSImport("antd-mobile-rn", "Button")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile-rn", "Button.defaultProps")
  @js.native
  def defaultProps: Disabled = js.native
  inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
