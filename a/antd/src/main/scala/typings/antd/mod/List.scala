package typings.antd.mod

import typings.antd.listItemMod.ListItemTypeProps
import typings.antd.listMod.ListProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  inline def apply[T](
    hasPaginationCustomizePrefixClsBorderedSplitClassNameChildrenItemLayoutLoadMoreGridDataSourceSizeHeaderFooterLoadingRowKeyRenderItemLocaleRest: ListProps[T]
  ): Element = ^.asInstanceOf[js.Dynamic].apply(hasPaginationCustomizePrefixClsBorderedSplitClassNameChildrenItemLayoutLoadMoreGridDataSourceSizeHeaderFooterLoadingRowKeyRenderItemLocaleRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("antd", "List")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd", "List.Item")
  @js.native
  def Item: ListItemTypeProps = js.native
  inline def Item_=(x: ListItemTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
