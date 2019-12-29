package typings.antDashDesignDashPro.libDescriptionListMod

import typings.antDashDesignDashPro.antDashDesignDashProStrings.horizontal
import typings.antDashDesignDashPro.antDashDesignDashProStrings.large
import typings.antDashDesignDashPro.antDashDesignDashProStrings.small
import typings.antDashDesignDashPro.antDashDesignDashProStrings.vertical
import typings.antDashDesignDashPro.libDescriptionListDescriptionMod.DescriptionProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionListProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var col: js.UndefOr[Double] = js.undefined
  var description: js.UndefOr[js.Array[DescriptionProps]] = js.undefined
  var gutter: js.UndefOr[Double] = js.undefined
  var layout: js.UndefOr[horizontal | vertical] = js.undefined
  var size: js.UndefOr[large | small] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
}

object DescriptionListProps {
  @scala.inline
  def apply(
    className: String = null,
    col: Int | Double = null,
    description: js.Array[DescriptionProps] = null,
    gutter: Int | Double = null,
    layout: horizontal | vertical = null,
    size: large | small = null,
    style: CSSProperties = null,
    title: ReactNode = null
  ): DescriptionListProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (col != null) __obj.updateDynamic("col")(col.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionListProps]
  }
}

