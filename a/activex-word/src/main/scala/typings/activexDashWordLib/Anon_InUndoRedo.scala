package typings
package activexDashWordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InUndoRedo extends js.Object {
  val InUndoRedo: scala.Boolean
  val NewContentControl: activexDashWordLib.WordNs.ContentControl
}

object Anon_InUndoRedo {
  @scala.inline
  def apply(InUndoRedo: scala.Boolean, NewContentControl: activexDashWordLib.WordNs.ContentControl): Anon_InUndoRedo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InUndoRedo")(InUndoRedo)
    __obj.updateDynamic("NewContentControl")(NewContentControl)
    __obj.asInstanceOf[Anon_InUndoRedo]
  }
}

