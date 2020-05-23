package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breadcrumb extends js.Object {
  var breadcrumb: StringDictionary[MenuDataItem]
  var breadcrumbMap: Map[String, typings.umijsRouteUtils.typesMod.MenuDataItem]
  var menuData: js.Array[typings.umijsRouteUtils.typesMod.MenuDataItem]
}

object Breadcrumb {
  @scala.inline
  def apply(
    breadcrumb: StringDictionary[MenuDataItem],
    breadcrumbMap: Map[String, typings.umijsRouteUtils.typesMod.MenuDataItem],
    menuData: js.Array[typings.umijsRouteUtils.typesMod.MenuDataItem]
  ): Breadcrumb = {
    val __obj = js.Dynamic.literal(breadcrumb = breadcrumb.asInstanceOf[js.Any], breadcrumbMap = breadcrumbMap.asInstanceOf[js.Any], menuData = menuData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breadcrumb]
  }
}

