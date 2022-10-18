package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.OnSelect
import typings.antDesignReactNative.anon.TypeofPopoverItem
import typings.antDesignReactNative.libPopoverMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "Popover")
@js.native
open class Popover () extends default
/* static members */
object Popover {
  
  @JSImport("@ant-design/react-native", "Popover")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "Popover.Item")
  @js.native
  def Item: TypeofPopoverItem = js.native
  inline def Item_=(x: TypeofPopoverItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "Popover.defaultProps")
  @js.native
  def defaultProps: OnSelect = js.native
  inline def defaultProps_=(x: OnSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
