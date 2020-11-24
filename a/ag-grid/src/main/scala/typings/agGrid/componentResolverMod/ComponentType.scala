package typings.agGrid.componentResolverMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ComponentType extends js.Object
@JSImport("ag-grid/dist/lib/components/framework/componentResolver", "ComponentType")
@js.native
object ComponentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ComponentType with Double] = js.native
  
  @js.native
  sealed trait AG_GRID extends ComponentType
  /* 0 */ @js.native
  object AG_GRID extends TopLevel[AG_GRID with Double]
  
  @js.native
  sealed trait FRAMEWORK extends ComponentType
  /* 1 */ @js.native
  object FRAMEWORK extends TopLevel[FRAMEWORK with Double]
}
