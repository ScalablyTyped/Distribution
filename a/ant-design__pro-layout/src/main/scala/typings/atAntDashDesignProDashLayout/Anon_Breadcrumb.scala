package typings.atAntDashDesignProDashLayout

import org.scalablytyped.runtime.StringDictionary
import typings.atAntDashDesignProDashLayout.libTypingsMod.MenuDataItem
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Breadcrumb extends js.Object {
  var breadcrumb: StringDictionary[MenuDataItem]
  var breadcrumbMap: Map[String, MenuDataItem]
  var menuData: js.Array[MenuDataItem]
}

object Anon_Breadcrumb {
  @scala.inline
  def apply(
    breadcrumb: StringDictionary[MenuDataItem],
    breadcrumbMap: Map[String, MenuDataItem],
    menuData: js.Array[MenuDataItem]
  ): Anon_Breadcrumb = {
    val __obj = js.Dynamic.literal(breadcrumb = breadcrumb.asInstanceOf[js.Any], breadcrumbMap = breadcrumbMap.asInstanceOf[js.Any], menuData = menuData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Breadcrumb]
  }
}

