package typings.antDesignReactNative.paginationMod

import typings.antDesignReactNative.paginationPropsTypeMod.PaginationState
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pagination
  extends Component[PaginationNativeProps, PaginationState, js.Any] {
  
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MPagination(nextProps: PaginationNativeProps): Unit = js.native
  
  def onChange(p: Double): Unit = js.native
}
