package typings.agGrid.floatingFilterMod

import typings.agGrid.baseFilterMod.CombinedFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFloatingFilter[M, F /* <: FloatingFilterChange */, P /* <: IFloatingFilterParams[M, F] */] extends js.Object {
  def onParentModelChanged(parentModel: M): Unit = js.native
  def onParentModelChanged(parentModel: M, combinedModel: CombinedFilter[M]): Unit = js.native
}

