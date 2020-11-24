package typings.antdMobile.paginationMod

import typings.antdMobile.paginationPropsTypeMod.PaginationState
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pagination
  extends Component[PaginationProps, PaginationState, js.Any] {
  
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MPagination(nextProps: PaginationProps): Unit = js.native
  
  def onChange(p: Double): Unit = js.native
}
