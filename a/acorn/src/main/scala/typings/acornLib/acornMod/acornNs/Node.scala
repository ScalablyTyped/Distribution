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

