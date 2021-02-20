package typings.antd.mod

import typings.antd.descriptionsMod.DescriptionsProps
import typings.antd.itemMod.DescriptionsItemProps
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Descriptions {
  
  @JSImport("antd", "Descriptions")
  @js.native
  def apply(hasPrefixClsTitleExtraColumnColonBorderedLayoutChildrenClassNameStyleSize: DescriptionsProps): Element = js.native
  @JSImport("antd", "Descriptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd", "Descriptions.Item")
  @js.native
  def Item: FC[DescriptionsItemProps] = js.native
  @scala.inline
  def Item_=(x: FC[DescriptionsItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
