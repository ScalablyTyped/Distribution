package typings.angularCompiler.t2ApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetBinder[D /* <: DirectiveMeta */] extends js.Object {
  def bind(target: Target): BoundTarget[D]
}

object TargetBinder {
  @scala.inline
  def apply[D /* <: DirectiveMeta */](bind: Target => BoundTarget[D]): TargetBinder[D] = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind))
  
    __obj.asInstanceOf[TargetBinder[D]]
  }
}

