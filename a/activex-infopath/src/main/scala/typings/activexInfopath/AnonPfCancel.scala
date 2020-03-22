package typings.activexInfopath

import typings.activexInfopath.InfoPath._XDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPfCancel extends js.Object {
  val pDocument: _XDocument
  var pfCancel: Boolean
}

object AnonPfCancel {
  @scala.inline
  def apply(pDocument: _XDocument, pfCancel: Boolean): AnonPfCancel = {
    val __obj = js.Dynamic.literal(pDocument = pDocument.asInstanceOf[js.Any], pfCancel = pfCancel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPfCancel]
  }
}

