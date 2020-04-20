package typings.antDesignIcons.antdIconMod

import typings.antDesignIconsSvg.typesMod.IconDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconComponentProps extends AntdIconProps {
  var icon: IconDefinition
}

object IconComponentProps {
  @scala.inline
  def apply(icon: IconDefinition, AntdIconProps: AntdIconProps = null): IconComponentProps = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (AntdIconProps != null) js.Dynamic.global.Object.assign(__obj, AntdIconProps)
    __obj.asInstanceOf[IconComponentProps]
  }
}

