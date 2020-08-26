package typings.antDesignProLayout.getPageTitleMod

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.anon.DefaultMessage
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPageTitleProps extends js.Object {
  var breadcrumb: js.UndefOr[StringDictionary[MenuDataItem]] = js.native
  var breadcrumbMap: js.UndefOr[Map[String, MenuDataItem]] = js.native
  var formatMessage: js.UndefOr[js.Function1[/* data */ DefaultMessage, String]] = js.native
  var menu: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.ProSettings['menu'] */ js.Any
  ] = js.native
  var pageName: js.UndefOr[String] = js.native
  var pathname: js.UndefOr[String] = js.native
  var title: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.ProSettings['title'] */ js.Any
  ] = js.native
}

object GetPageTitleProps {
  @scala.inline
  def apply(): GetPageTitleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPageTitleProps]
  }
  @scala.inline
  implicit class GetPageTitlePropsOps[Self <: GetPageTitleProps] (val x: Self) extends AnyVal {
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
    def deleteBreadcrumb: Self = this.set("breadcrumb", js.undefined)
    @scala.inline
    def setBreadcrumbMap(value: Map[String, MenuDataItem]): Self = this.set("breadcrumbMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreadcrumbMap: Self = this.set("breadcrumbMap", js.undefined)
    @scala.inline
    def setFormatMessage(value: /* data */ DefaultMessage => String): Self = this.set("formatMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatMessage: Self = this.set("formatMessage", js.undefined)
    @scala.inline
    def setMenu(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.ProSettings['menu'] */ js.Any
    ): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    @scala.inline
    def setPageName(value: String): Self = this.set("pageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageName: Self = this.set("pageName", js.undefined)
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathname: Self = this.set("pathname", js.undefined)
    @scala.inline
    def setTitle(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.ProSettings['title'] */ js.Any
    ): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

