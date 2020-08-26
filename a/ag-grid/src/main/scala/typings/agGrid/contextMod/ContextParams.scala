package typings.agGrid.contextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextParams extends js.Object {
  var beans: js.Array[_] = js.native
  var components: js.Array[ComponentMeta] = js.native
  var debug: Boolean = js.native
  var overrideBeans: js.Array[_] = js.native
  var seed: js.Any = js.native
}

object ContextParams {
  @scala.inline
  def apply(
    beans: js.Array[_],
    components: js.Array[ComponentMeta],
    debug: Boolean,
    overrideBeans: js.Array[_],
    seed: js.Any
  ): ContextParams = {
    val __obj = js.Dynamic.literal(beans = beans.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], overrideBeans = overrideBeans.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextParams]
  }
  @scala.inline
  implicit class ContextParamsOps[Self <: ContextParams] (val x: Self) extends AnyVal {
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
    def setBeansVarargs(value: js.Any*): Self = this.set("beans", js.Array(value :_*))
    @scala.inline
    def setBeans(value: js.Array[_]): Self = this.set("beans", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentsVarargs(value: ComponentMeta*): Self = this.set("components", js.Array(value :_*))
    @scala.inline
    def setComponents(value: js.Array[ComponentMeta]): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverrideBeansVarargs(value: js.Any*): Self = this.set("overrideBeans", js.Array(value :_*))
    @scala.inline
    def setOverrideBeans(value: js.Array[_]): Self = this.set("overrideBeans", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeed(value: js.Any): Self = this.set("seed", value.asInstanceOf[js.Any])
  }
  
}

