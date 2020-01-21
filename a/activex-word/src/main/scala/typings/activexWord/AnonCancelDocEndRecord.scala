package typings.activexWord

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelDocEndRecord extends js.Object {
  var Cancel: Boolean
  val Doc: Document
  val EndRecord: Double
  val StartRecord: Double
}

object AnonCancelDocEndRecord {
  @scala.inline
  def apply(Cancel: Boolean, Doc: Document, EndRecord: Double, StartRecord: Double): AnonCancelDocEndRecord = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Doc = Doc.asInstanceOf[js.Any], EndRecord = EndRecord.asInstanceOf[js.Any], StartRecord = StartRecord.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelDocEndRecord]
  }
}

