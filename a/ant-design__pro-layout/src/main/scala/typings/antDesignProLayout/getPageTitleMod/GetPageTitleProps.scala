package typings.antDesignProLayout.getPageTitleMod

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.AnonDefaultMessage
import typings.antDesignProLayout.AnonDefaultOpenAll
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPageTitleProps extends js.Object {
  var breadcrumb: js.UndefOr[StringDictionary[MenuDataItem]] = js.undefined
  var breadcrumbMap: js.UndefOr[Map[String, MenuDataItem]] = js.undefined
  var formatMessage: js.UndefOr[js.Function1[/* data */ AnonDefaultMessage, String]] = js.undefined
  var menu: js.UndefOr[AnonDefaultOpenAll] = js.undefined
  var pageName: js.UndefOr[String] = js.undefined
  var pathname: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object GetPageTitleProps {
  @scala.inline
  def apply(
    breadcrumb: StringDictionary[MenuDataItem] = null,
    breadcrumbMap: Map[String, MenuDataItem] = null,
    formatMessage: /* data */ AnonDefaultMessage => String = null,
    menu: AnonDefaultOpenAll = null,
    pageName: String = null,
    pathname: String = null,
    title: String = null
  ): GetPageTitleProps = {
    val __obj = js.Dynamic.literal()
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb.asInstanceOf[js.Any])
    if (breadcrumbMap != null) __obj.updateDynamic("breadcrumbMap")(breadcrumbMap.asInstanceOf[js.Any])
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1(formatMessage))
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (pageName != null) __obj.updateDynamic("pageName")(pageName.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPageTitleProps]
  }
}

