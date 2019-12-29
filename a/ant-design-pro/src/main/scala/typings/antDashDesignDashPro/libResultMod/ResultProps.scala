package typings.antDashDesignDashPro.libResultMod

import typings.antDashDesignDashPro.antDashDesignDashProStrings.error
import typings.antDashDesignDashPro.antDashDesignDashProStrings.success
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultProps extends js.Object {
  var actions: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[ReactNode] = js.undefined
  var extra: js.UndefOr[ReactNode] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var `type`: success | error
}

object ResultProps {
  @scala.inline
  def apply(
    `type`: success | error,
    actions: ReactNode = null,
    className: String = null,
    description: ReactNode = null,
    extra: ReactNode = null,
    style: CSSProperties = null,
    title: ReactNode = null
  ): ResultProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultProps]
  }
}

