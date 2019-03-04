package typings
package activexDashWordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeletedRange extends js.Object {
  val DeletedRange: activexDashWordLib.WordNs.Range
  val InUndoRedo: scala.Boolean
  val OldXMLNode: activexDashWordLib.WordNs.XMLNode
}

object Anon_DeletedRange {
  @scala.inline
  def apply(
    DeletedRange: activexDashWordLib.WordNs.Range,
    InUndoRedo: scala.Boolean,
    OldXMLNode: activexDashWordLib.WordNs.XMLNode
  ): Anon_DeletedRange = {
    val __obj = js.Dynamic.literal(DeletedRange = DeletedRange, InUndoRedo = InUndoRedo, OldXMLNode = OldXMLNode)
  
    __obj.asInstanceOf[Anon_DeletedRange]
  }
}

