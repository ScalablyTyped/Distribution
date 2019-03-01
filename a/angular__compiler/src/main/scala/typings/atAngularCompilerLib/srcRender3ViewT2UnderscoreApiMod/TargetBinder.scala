package typings
package atAngularCompilerLib.srcRender3ViewT2UnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetBinder[D /* <: DirectiveMeta */] extends js.Object {
  def bind(target: Target): BoundTarget[D]
}

object TargetBinder {
  @scala.inline
  def apply[D /* <: DirectiveMeta */](bind: js.Function1[Target, BoundTarget[D]]): TargetBinder[D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(bind)
    __obj.asInstanceOf[TargetBinder[D]]
  }
}

