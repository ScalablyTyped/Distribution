package typings.antDesignProLayout.basicLayoutMod

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.typingsMod.MenuDataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in 'location' ]: @ant-design/pro-layout.@ant-design/pro-layout/lib/BasicLayout.BasicLayoutProps[K]} & {  breadcrumb  :{[path: string] : @ant-design/pro-layout.@ant-design/pro-layout/lib/typings.MenuDataItem}} */
trait BasicLayoutContext extends js.Object {
  var breadcrumb: StringDictionary[MenuDataItem]
  var location: js.UndefOr[js.Any] = js.undefined
}

object BasicLayoutContext {
  @scala.inline
  def apply(breadcrumb: StringDictionary[MenuDataItem], location: js.Any = null): BasicLayoutContext = {
    val __obj = js.Dynamic.literal(breadcrumb = breadcrumb.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicLayoutContext]
  }
}

