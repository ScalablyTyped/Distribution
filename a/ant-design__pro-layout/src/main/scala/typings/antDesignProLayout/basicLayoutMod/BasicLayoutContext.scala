package typings.antDesignProLayout.basicLayoutMod

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.typingsMod.MenuDataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in 'location' ]: @ant-design/pro-layout.@ant-design/pro-layout/lib/BasicLayout.BasicLayoutProps[K]} & {  breadcrumb :{[path: string] : @ant-design/pro-layout.@ant-design/pro-layout/lib/typings.MenuDataItem}} */
@js.native
trait BasicLayoutContext extends js.Object {
  var breadcrumb: StringDictionary[MenuDataItem] = js.native
  var location: js.UndefOr[js.Any] = js.native
}

object BasicLayoutContext {
  @scala.inline
  def apply(breadcrumb: StringDictionary[MenuDataItem]): BasicLayoutContext = {
    val __obj = js.Dynamic.literal(breadcrumb = breadcrumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicLayoutContext]
  }
  @scala.inline
  implicit class BasicLayoutContextOps[Self <: BasicLayoutContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBreadcrumb(value: StringDictionary[MenuDataItem]): Self = this.set("breadcrumb", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: js.Any): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

