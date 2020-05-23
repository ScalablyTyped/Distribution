package typings.antDesignPro.descriptionListMod

import typings.antDesignPro.antDesignProStrings.horizontal
import typings.antDesignPro.antDesignProStrings.large
import typings.antDesignPro.antDesignProStrings.small
import typings.antDesignPro.antDesignProStrings.vertical
import typings.antDesignPro.descriptionMod.DescriptionProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
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
    col: js.UndefOr[Double] = js.undefined,
    description: js.Array[DescriptionProps] = null,
    gutter: js.UndefOr[Double] = js.undefined,
    layout: horizontal | vertical = null,
    size: large | small = null,
    style: CSSProperties = null,
    title: ReactNode = null
  ): DescriptionListProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(col)) __obj.updateDynamic("col")(col.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(gutter)) __obj.updateDynamic("gutter")(gutter.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionListProps]
  }
}

