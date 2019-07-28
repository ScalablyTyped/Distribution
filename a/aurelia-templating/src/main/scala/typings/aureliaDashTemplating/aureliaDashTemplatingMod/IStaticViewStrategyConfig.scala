package typings.aureliaDashTemplating.aureliaDashTemplatingMod

import typings.std.HTMLTemplateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStaticViewStrategyConfig extends js.Object {
  var dependencies: js.UndefOr[js.Array[js.Function] | js.Object] = js.undefined
  var template: String | HTMLTemplateElement
}

object IStaticViewStrategyConfig {
  @scala.inline
  def apply(template: String | HTMLTemplateElement, dependencies: js.Array[js.Function] | js.Object = null): IStaticViewStrategyConfig = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticViewStrategyConfig]
  }
}

