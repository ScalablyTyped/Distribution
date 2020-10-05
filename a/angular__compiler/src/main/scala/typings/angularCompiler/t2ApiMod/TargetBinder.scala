package typings.angularCompiler.t2ApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetBinder[D /* <: DirectiveMeta */] extends js.Object {
  def bind(target: Target): BoundTarget[D] = js.native
}

object TargetBinder {
  @scala.inline
  def apply[/* <: typings.angularCompiler.t2ApiMod.DirectiveMeta */ D](bind: Target => BoundTarget[D]): TargetBinder[D] = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind))
    __obj.asInstanceOf[TargetBinder[D]]
  }
  @scala.inline
  implicit class TargetBinderOps[Self <: TargetBinder[_], /* <: typings.angularCompiler.t2ApiMod.DirectiveMeta */ D] (val x: Self with TargetBinder[D]) extends AnyVal {
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
    def setBind(value: Target => BoundTarget[D]): Self = this.set("bind", js.Any.fromFunction1(value))
  }
  
}

