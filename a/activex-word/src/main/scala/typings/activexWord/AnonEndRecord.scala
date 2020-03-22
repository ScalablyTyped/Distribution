package typings.activexWord

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndRecord extends js.Object {
  var Cancel: Boolean
  val Doc: Document
  val EndRecord: Double
  val StartRecord: Double
}

object AnonEndRecord {
  @scala.inline
  def apply(Cancel: Boolean, Doc: Document, EndRecord: Double, StartRecord: Double): AnonEndRecord = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Doc = Doc.asInstanceOf[js.Any], EndRecord = EndRecord.asInstanceOf[js.Any], StartRecord = StartRecord.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEndRecord]
  }
}

