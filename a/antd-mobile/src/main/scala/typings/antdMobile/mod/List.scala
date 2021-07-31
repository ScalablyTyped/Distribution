package typings.antdMobile.mod

import org.scalablytyped.runtime.Instantiable1
import typings.antdMobile.anon.PartialListProps
import typings.antdMobile.anon.TypeofItem
import typings.antdMobile.listItemMod.ListItemProps
import typings.antdMobile.listMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile", "List")
@js.native
class List () extends default
/* static members */
object List {
  
  @JSImport("antd-mobile", "List")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile", "List.Item")
  @js.native
  def Item: (Instantiable1[/* props */ ListItemProps, typings.antdMobile.listItemMod.default]) & TypeofItem = js.native
  @scala.inline
  def Item_=(x: (Instantiable1[/* props */ ListItemProps, typings.antdMobile.listItemMod.default]) & TypeofItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile", "List.defaultProps")
  @js.native
  def defaultProps: PartialListProps = js.native
  @scala.inline
  def defaultProps_=(x: PartialListProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
