package typings.ace.global.AceAjax

import typings.ace.AceAjax.IEditSession
import typings.ace.AceAjax.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AceAjax.PlaceHolder")
@js.native
class PlaceHolderCls protected ()
  extends typings.ace.AceAjax.PlaceHolder {
  def this(session: IEditSession, length: Double, pos: Position, positions: js.Array[Position]) = this()
  /**
    * - @param session (Document): The document to associate with the anchor
    * - @param length (Number): The starting row position
    * - @param pos (Number): The starting column position
    * - @param others (String):
    * - @param mainClass (String):
    * - @param othersClass (String):
    **/
  def this(
    session: typings.ace.AceAjax.Document,
    length: Double,
    pos: Double,
    others: String,
    mainClass: String,
    othersClass: String
  ) = this()
}
