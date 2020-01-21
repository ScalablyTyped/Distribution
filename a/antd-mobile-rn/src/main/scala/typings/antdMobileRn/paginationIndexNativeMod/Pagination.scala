package typings.antdMobileRn.paginationIndexNativeMod

import typings.antdMobileRn.paginationPropsTypeMod.PaginationState
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pagination
  extends Component[PaginationNativeProps, PaginationState, js.Any] {
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MPagination(nextProps: PaginationNativeProps): Unit = js.native
  def onChange(p: Double): Unit = js.native
}

