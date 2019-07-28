package typings.awsDashSdk.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentServiceWarning extends js.Object {
  /**
    * The description for a warning returned by the document service.
    */
  var message: js.UndefOr[String] = js.undefined
}

object DocumentServiceWarning {
  @scala.inline
  def apply(message: String = null): DocumentServiceWarning = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[DocumentServiceWarning]
  }
}

