package typings.agGrid.componentProviderMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RegisteredComponentSource extends js.Object

@JSImport("ag-grid/dist/lib/components/framework/componentProvider", "RegisteredComponentSource")
@js.native
object RegisteredComponentSource extends js.Object {
  @js.native
  sealed trait DEFAULT extends RegisteredComponentSource
  
  @js.native
  sealed trait REGISTERED extends RegisteredComponentSource
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RegisteredComponentSource with Double] = js.native
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  /* 1 */ @js.native
  object REGISTERED extends TopLevel[REGISTERED with Double]
  
}

