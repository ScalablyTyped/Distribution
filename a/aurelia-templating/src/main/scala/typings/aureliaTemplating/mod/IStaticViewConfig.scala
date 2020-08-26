package typings.aureliaTemplating.mod

import typings.std.HTMLTemplateElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStaticViewConfig extends js.Object {
  var dependencies: js.UndefOr[
    js.Array[js.Function] | (js.Function0[
      js.Array[js.Function | (js.Promise[js.Function | (Record[String, js.Function])])]
    ])
  ] = js.native
  var template: String | HTMLTemplateElement = js.native
}

object IStaticViewConfig {
  @scala.inline
  def apply(template: String | HTMLTemplateElement): IStaticViewConfig = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticViewConfig]
  }
  @scala.inline
  implicit class IStaticViewConfigOps[Self <: IStaticViewConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTemplate(value: String | HTMLTemplateElement): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependenciesVarargs(value: js.Function*): Self = this.set("dependencies", js.Array(value :_*))
    @scala.inline
    def setDependenciesFunction0(value: () => js.Array[js.Function | (js.Promise[js.Function | (Record[String, js.Function])])]): Self = this.set("dependencies", js.Any.fromFunction0(value))
    @scala.inline
    def setDependencies(
      value: js.Array[js.Function] | (js.Function0[
          js.Array[js.Function | (js.Promise[js.Function | (Record[String, js.Function])])]
        ])
    ): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
  }
  
}

