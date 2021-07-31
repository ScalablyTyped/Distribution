package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.AutoHeight
import typings.antDesignReactNative.textareaItemMod.TextareaItemProps
import typings.antDesignReactNative.textareaItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "TextareaItem")
@js.native
class TextareaItem protected () extends default {
  def this(props: TextareaItemProps) = this()
}
/* static members */
object TextareaItem {
  
  @JSImport("@ant-design/react-native", "TextareaItem")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "TextareaItem.defaultProps")
  @js.native
  def defaultProps: AutoHeight = js.native
  @scala.inline
  def defaultProps_=(x: AutoHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
