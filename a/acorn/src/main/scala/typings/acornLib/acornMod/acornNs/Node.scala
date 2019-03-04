package typings
package acornLib.acornMod.acornNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var end: scala.Double
  var loc: js.UndefOr[estreeLib.estreeMod.SourceLocation] = js.undefined
  var range: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var sourceFile: js.UndefOr[java.lang.String] = js.undefined
  var start: scala.Double
  var `type`: java.lang.String
}

object Node {
  @scala.inline
  def apply(
    end: scala.Double,
    start: scala.Double,
    `type`: java.lang.String,
    loc: estreeLib.estreeMod.SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    sourceFile: java.lang.String = null
  ): Node = {
    val __obj = js.Dynamic.literal(end = end, start = start)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (sourceFile != null) __obj.updateDynamic("sourceFile")(sourceFile)
    __obj.asInstanceOf[Node]
  }
}

