package typings.agGrid.componentResolverMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ComponentSource extends js.Object

@JSImport("ag-grid/dist/lib/components/framework/componentResolver", "ComponentSource")
@js.native
object ComponentSource extends js.Object {
  @js.native
  sealed trait DEFAULT extends ComponentSource
  
  @js.native
  sealed trait HARDCODED extends ComponentSource
  
  @js.native
  sealed trait REGISTERED_BY_NAME extends ComponentSource
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ComponentSource with Double] = js.native
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  /* 2 */ @js.native
  object HARDCODED extends TopLevel[HARDCODED with Double]
  
  /* 1 */ @js.native
  object REGISTERED_BY_NAME extends TopLevel[REGISTERED_BY_NAME with Double]
  
}

