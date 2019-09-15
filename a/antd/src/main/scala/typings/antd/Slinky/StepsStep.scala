package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.antdStrings.error
import typings.antd.antdStrings.finish
import typings.antd.antdStrings.process
import typings.antd.antdStrings.wait
import typings.antd.esStepsMod.StepProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onClick, style, className, disabled */
object StepsStep
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esMod.Steps.Step.asInstanceOf[String | js.Object]
  def apply(
    description: TagMod[Any] = null,
    icon: TagMod[Any] = null,
    status: wait | process | finish | error = null,
    subTitle: TagMod[Any] = null,
    title: TagMod[Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle)
    if (title != null) __obj.updateDynamic("title")(title)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StepProps
}

