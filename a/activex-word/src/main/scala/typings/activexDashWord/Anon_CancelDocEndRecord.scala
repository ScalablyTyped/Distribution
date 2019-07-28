package typings.activexDashWord

import typings.activexDashWord.WordNs.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelDocEndRecord extends js.Object {
  var Cancel: Boolean
  val Doc: Document
  val EndRecord: Double
  val StartRecord: Double
}

object Anon_CancelDocEndRecord {
  @scala.inline
  def apply(Cancel: Boolean, Doc: Document, EndRecord: Double, StartRecord: Double): Anon_CancelDocEndRecord = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Doc = Doc, EndRecord = EndRecord, StartRecord = StartRecord)
  
    __obj.asInstanceOf[Anon_CancelDocEndRecord]
  }
}

