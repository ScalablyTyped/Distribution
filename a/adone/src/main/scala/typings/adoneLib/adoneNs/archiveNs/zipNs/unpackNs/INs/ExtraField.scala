package typings
package adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraField extends js.Object {
  var data: nodeLib.Buffer
  var id: scala.Double
}

object ExtraField {
  @scala.inline
  def apply(data: nodeLib.Buffer, id: scala.Double): ExtraField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ExtraField]
  }
}

