package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStaticViewConfig extends js.Object {
  var dependencies: js.UndefOr[
    js.Array[js.Function] | (js.Function0[
      js.Array[
        js.Function | (js.Promise[js.Function | (stdLib.Record[java.lang.String, js.Function])])
      ]
    ])
  ] = js.undefined
  var template: java.lang.String | stdLib.HTMLTemplateElement
}

object IStaticViewConfig {
  @scala.inline
  def apply(
    template: java.lang.String | stdLib.HTMLTemplateElement,
    dependencies: js.Array[js.Function] | (js.Function0[
      js.Array[
        js.Function | (js.Promise[js.Function | (stdLib.Record[java.lang.String, js.Function])])
      ]
    ]) = null
  ): IStaticViewConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticViewConfig]
  }
}

