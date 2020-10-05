package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipeTransform extends js.Object {
  def transform(value: js.Any, args: js.Any*): js.Any = js.native
}

object PipeTransform {
  @scala.inline
  def apply(transform: (js.Any, /* repeated */ js.Any) => js.Any): PipeTransform = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction2(transform))
    __obj.asInstanceOf[PipeTransform]
  }
  @scala.inline
  implicit class PipeTransformOps[Self <: PipeTransform] (val x: Self) extends AnyVal {
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
    def setTransform(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = this.set("transform", js.Any.fromFunction2(value))
  }
  
}

