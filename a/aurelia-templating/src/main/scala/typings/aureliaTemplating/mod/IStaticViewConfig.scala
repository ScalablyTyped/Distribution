package typings.aureliaTemplating.mod

import typings.std.HTMLTemplateElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStaticViewConfig extends js.Object {
  var dependencies: js.UndefOr[
    js.Array[js.Function] | (js.Function0[
      js.Array[js.Function | (js.Promise[js.Function | (Record[String, js.Function])])]
    ])
  ] = js.undefined
  var template: String | HTMLTemplateElement
}

object IStaticViewConfig {
  @scala.inline
  def apply(
    template: String | HTMLTemplateElement,
    dependencies: js.Array[js.Function] | (js.Function0[
      js.Array[js.Function | (js.Promise[js.Function | (Record[String, js.Function])])]
    ]) = null
  ): IStaticViewConfig = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticViewConfig]
  }
}

