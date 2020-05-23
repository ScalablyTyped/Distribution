package typings.asar.anon

import typings.asar.mod.InputMetadataType
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stat extends js.Object {
  var stat: Stats
  var `type`: InputMetadataType
}

object Stat {
  @scala.inline
  def apply(stat: Stats, `type`: InputMetadataType): Stat = {
    val __obj = js.Dynamic.literal(stat = stat.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stat]
  }
}

