package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataEditorEventType extends js.Object

/** specifies the type of an event from an {@link XDataEditor} . */
@JSGlobal("com.sun.star.util.DataEditorEventType")
@js.native
object DataEditorEventType extends js.Object {
  /** specifies that the data editing was canceled by the user (data not stored). */
  @js.native
  sealed trait CANCELED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DataEditorEventType
  
  /** specifies that the data editing is done (data stored). */
  @js.native
  sealed trait DONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DataEditorEventType
  
  /* 1 */ val CANCELED: CANCELED with scala.Double = js.native
  /* 0 */ val DONE: DONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DataEditorEventType with scala.Double
  ] = js.native
}

