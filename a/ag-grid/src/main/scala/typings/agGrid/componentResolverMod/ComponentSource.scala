package typings.agGrid.componentResolverMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ComponentSource extends js.Object
@JSImport("ag-grid/dist/lib/components/framework/componentResolver", "ComponentSource")
@js.native
object ComponentSource extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ComponentSource with Double] = js.native
  
  @js.native
  sealed trait DEFAULT extends ComponentSource
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  @js.native
  sealed trait HARDCODED extends ComponentSource
  /* 2 */ @js.native
  object HARDCODED extends TopLevel[HARDCODED with Double]
  
  @js.native
  sealed trait REGISTERED_BY_NAME extends ComponentSource
  /* 1 */ @js.native
  object REGISTERED_BY_NAME extends TopLevel[REGISTERED_BY_NAME with Double]
}
