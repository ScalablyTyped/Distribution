package typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod

import org.scalablytyped.runtime.TopLevel
import typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod.HDirection.Left
import typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod.HDirection.Right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HDirection extends js.Object

@JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "HDirection")
@js.native
object HDirection extends js.Object {
  @js.native
  sealed trait Left extends HDirection
  
  @js.native
  sealed trait Right extends HDirection
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HDirection with Double] = js.native
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 1 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

