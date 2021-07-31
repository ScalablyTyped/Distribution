package typings.antdMobile.mod

import typings.antdMobile.anon.Placement
import typings.antdMobile.anon.TypeofItemInstantiable
import typings.antdMobile.popoverMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile", "Popover")
@js.native
class Popover () extends default
/* static members */
object Popover {
  
  @JSImport("antd-mobile", "Popover")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile", "Popover.Item")
  @js.native
  def Item: TypeofItemInstantiable = js.native
  @scala.inline
  def Item_=(x: TypeofItemInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile", "Popover.defaultProps")
  @js.native
  def defaultProps: Placement = js.native
  @scala.inline
  def defaultProps_=(x: Placement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
