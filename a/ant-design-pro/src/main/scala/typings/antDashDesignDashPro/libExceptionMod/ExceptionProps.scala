package typings.antDashDesignDashPro.libExceptionMod

import typings.antDashDesignDashPro.antDashDesignDashProStrings.`403`
import typings.antDashDesignDashPro.antDashDesignDashProStrings.`404`
import typings.antDashDesignDashPro.antDashDesignDashProStrings.`500`
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionProps[L] extends js.Object {
  var actions: js.UndefOr[ReactNode] = js.undefined
  var backText: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var desc: js.UndefOr[ReactNode] = js.undefined
  var img: js.UndefOr[String] = js.undefined
  var linkElement: js.UndefOr[String | ComponentType[L]] = js.undefined
  var redirect: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var `type`: js.UndefOr[`403` | `404` | `500`] = js.undefined
}

object ExceptionProps {
  @scala.inline
  def apply[L](
    actions: ReactNode = null,
    backText: ReactNode = null,
    className: String = null,
    desc: ReactNode = null,
    img: String = null,
    linkElement: String | ComponentType[L] = null,
    redirect: String = null,
    style: CSSProperties = null,
    title: ReactNode = null,
    `type`: `403` | `404` | `500` = null
  ): ExceptionProps[L] = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (backText != null) __obj.updateDynamic("backText")(backText.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (linkElement != null) __obj.updateDynamic("linkElement")(linkElement.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionProps[L]]
  }
}

