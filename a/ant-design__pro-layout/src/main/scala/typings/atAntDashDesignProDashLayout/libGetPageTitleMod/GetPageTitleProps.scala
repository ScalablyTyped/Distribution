package typings.atAntDashDesignProDashLayout.libGetPageTitleMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAntDashDesignProDashLayout.Anon_DefaultMessageId
import typings.atAntDashDesignProDashLayout.Anon_Locale
import typings.atAntDashDesignProDashLayout.libTypingsMod.MenuDataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPageTitleProps extends js.Object {
  var breadcrumb: js.UndefOr[StringDictionary[MenuDataItem]] = js.undefined
  var formatMessage: js.UndefOr[js.Function1[/* data */ Anon_DefaultMessageId, String]] = js.undefined
  var menu: js.UndefOr[Anon_Locale] = js.undefined
  var pageName: js.UndefOr[String] = js.undefined
  var pathname: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object GetPageTitleProps {
  @scala.inline
  def apply(
    breadcrumb: StringDictionary[MenuDataItem] = null,
    formatMessage: /* data */ Anon_DefaultMessageId => String = null,
    menu: Anon_Locale = null,
    pageName: String = null,
    pathname: String = null,
    title: String = null
  ): GetPageTitleProps = {
    val __obj = js.Dynamic.literal()
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb)
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1(formatMessage))
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (pageName != null) __obj.updateDynamic("pageName")(pageName)
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[GetPageTitleProps]
  }
}

