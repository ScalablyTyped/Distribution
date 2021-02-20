package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.TypeofDefaultTabBar
import typings.antDesignReactNative.tabsMod.default
import typings.antDesignReactNative.tabsPropsTypeMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "Tabs")
@js.native
class Tabs protected () extends default {
  def this(props: PropsType) = this()
}
/* static members */
object Tabs {
  
  @JSImport("@ant-design/react-native", "Tabs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "Tabs.DefaultTabBar")
  @js.native
  def DefaultTabBar: TypeofDefaultTabBar = js.native
  @scala.inline
  def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "Tabs.defaultProps")
  @js.native
  def defaultProps: PropsType = js.native
  @scala.inline
  def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
