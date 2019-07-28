package typings.adone.adoneNs.archiveNs.zipNs.unpackNs.INs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraField extends js.Object {
  var data: Buffer
  var id: Double
}

object ExtraField {
  @scala.inline
  def apply(data: Buffer, id: Double): ExtraField = {
    val __obj = js.Dynamic.literal(data = data, id = id)
  
    __obj.asInstanceOf[ExtraField]
  }
}

