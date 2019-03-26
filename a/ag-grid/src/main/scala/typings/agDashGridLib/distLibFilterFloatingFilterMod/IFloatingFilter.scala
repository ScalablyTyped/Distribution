package typings
package agDashGridLib.distLibFilterFloatingFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFloatingFilter[M, F /* <: FloatingFilterChange */, P /* <: IFloatingFilterParams[M, F] */] extends js.Object {
  def onParentModelChanged(parentModel: M): scala.Unit = js.native
  def onParentModelChanged(parentModel: M, combinedModel: agDashGridLib.distLibFilterBaseFilterMod.CombinedFilter[M]): scala.Unit = js.native
}

