package typings
package atAntDashDesignReactDashNativeLib.libPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pagination
  extends reactLib.reactMod.Component[
      PaginationNativeProps, 
      atAntDashDesignReactDashNativeLib.libPaginationPropsTypeMod.PaginationState, 
      js.Any
    ] {
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MPagination(nextProps: PaginationNativeProps): scala.Unit = js.native
  def onChange(p: scala.Double): scala.Unit = js.native
}

