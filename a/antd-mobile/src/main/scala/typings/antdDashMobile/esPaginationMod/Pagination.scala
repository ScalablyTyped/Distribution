package typings.antdDashMobile.esPaginationMod

import typings.antdDashMobile.esPaginationPropsTypeMod.PaginationState
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pagination
  extends Component[PaginationProps, PaginationState, js.Any] {
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MPagination(nextProps: PaginationProps): Unit = js.native
  def onChange(p: Double): Unit = js.native
}

