package typings.agGrid.componentProviderMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RegisteredComponentSource extends js.Object
@JSImport("ag-grid/dist/lib/components/framework/componentProvider", "RegisteredComponentSource")
@js.native
object RegisteredComponentSource extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RegisteredComponentSource with Double] = js.native
  
  @js.native
  sealed trait DEFAULT extends RegisteredComponentSource
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  @js.native
  sealed trait REGISTERED extends RegisteredComponentSource
  /* 1 */ @js.native
  object REGISTERED extends TopLevel[REGISTERED with Double]
}
