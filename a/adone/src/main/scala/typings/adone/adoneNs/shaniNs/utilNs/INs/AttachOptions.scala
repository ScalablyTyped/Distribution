package typings.adone.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachOptions extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AttachOptions {
  @scala.inline
  def apply(filename: String = null, `type`: String = null): AttachOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AttachOptions]
  }
}

