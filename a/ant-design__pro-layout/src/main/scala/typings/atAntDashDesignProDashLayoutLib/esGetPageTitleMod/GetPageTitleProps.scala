package typings
package atAntDashDesignProDashLayoutLib.esGetPageTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPageTitleProps extends js.Object {
  var breadcrumb: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem]
  ] = js.undefined
  var formatMessage: js.UndefOr[
    js.Function1[/* data */ atAntDashDesignProDashLayoutLib.Anon_DefaultMessageId, java.lang.String]
  ] = js.undefined
  var menu: js.UndefOr[atAntDashDesignProDashLayoutLib.Anon_Locale] = js.undefined
  var pageName: js.UndefOr[java.lang.String] = js.undefined
  var pathname: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object GetPageTitleProps {
  @scala.inline
  def apply(
    breadcrumb: org.scalablytyped.runtime.StringDictionary[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem] = null,
    formatMessage: /* data */ atAntDashDesignProDashLayoutLib.Anon_DefaultMessageId => java.lang.String = null,
    menu: atAntDashDesignProDashLayoutLib.Anon_Locale = null,
    pageName: java.lang.String = null,
    pathname: java.lang.String = null,
    title: java.lang.String = null
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

