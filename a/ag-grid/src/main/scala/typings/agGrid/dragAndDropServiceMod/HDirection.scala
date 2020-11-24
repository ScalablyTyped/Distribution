package typings.agGrid.dragAndDropServiceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HDirection extends js.Object
@JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "HDirection")
@js.native
object HDirection extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HDirection with Double] = js.native
  
  @js.native
  sealed trait Left extends HDirection
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  @js.native
  sealed trait Right extends HDirection
  /* 1 */ @js.native
  object Right extends TopLevel[Right with Double]
}
