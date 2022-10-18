package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.Disabled
import typings.antDesignReactNative.libButtonMod.ButtonProps
import typings.antDesignReactNative.libButtonMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "Button")
@js.native
open class Button protected () extends default {
  def this(props: ButtonProps) = this()
}
/* static members */
object Button {
  
  @JSImport("@ant-design/react-native", "Button")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "Button.defaultProps")
  @js.native
  def defaultProps: Disabled = js.native
  inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
