package typings.activexDashWord

import typings.activexDashWord.Word.Document
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
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Doc = Doc.asInstanceOf[js.Any], EndRecord = EndRecord.asInstanceOf[js.Any], StartRecord = StartRecord.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CancelDocEndRecord]
  }
}

