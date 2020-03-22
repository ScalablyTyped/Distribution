package typings.asar

import typings.asar.mod.InputMetadataType
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStat extends js.Object {
  var stat: Stats
  var `type`: InputMetadataType
}

object AnonStat {
  @scala.inline
  def apply(stat: Stats, `type`: InputMetadataType): AnonStat = {
    val __obj = js.Dynamic.literal(stat = stat.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStat]
  }
}

