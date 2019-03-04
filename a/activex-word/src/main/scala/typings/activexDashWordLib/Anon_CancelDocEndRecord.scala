package typings
package activexDashWordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelDocEndRecord extends js.Object {
  var Cancel: scala.Boolean
  val Doc: activexDashWordLib.WordNs.Document
  val EndRecord: scala.Double
  val StartRecord: scala.Double
}

object Anon_CancelDocEndRecord {
  @scala.inline
  def apply(
    Cancel: scala.Boolean,
    Doc: activexDashWordLib.WordNs.Document,
    EndRecord: scala.Double,
    StartRecord: scala.Double
  ): Anon_CancelDocEndRecord = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Doc = Doc, EndRecord = EndRecord, StartRecord = StartRecord)
  
    __obj.asInstanceOf[Anon_CancelDocEndRecord]
  }
}

