package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachOptions extends js.Object {
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AttachOptions {
  @scala.inline
  def apply(filename: java.lang.String = null, `type`: java.lang.String = null): AttachOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AttachOptions]
  }
}

