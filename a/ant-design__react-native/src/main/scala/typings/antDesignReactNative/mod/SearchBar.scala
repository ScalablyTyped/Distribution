package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.OnBlur
import typings.antDesignReactNative.libSearchBarMod.SearchBarProps
import typings.antDesignReactNative.libSearchBarMod.default
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "SearchBar")
@js.native
open class SearchBar protected () extends default {
  def this(props: SearchBarProps) = this()
}
/* static members */
object SearchBar {
  
  @JSImport("@ant-design/react-native", "SearchBar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "SearchBar.contextType")
  @js.native
  def contextType: Context[js.Object] = js.native
  inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "SearchBar.defaultProps")
  @js.native
  def defaultProps: OnBlur = js.native
  inline def defaultProps_=(x: OnBlur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
