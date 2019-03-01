package typings
package ansiDashColorsLib.ansiDashColorsMod.colorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedSymbols extends js.Object {
  var ballotCross: java.lang.String
  var questionFull: java.lang.String
}

object ExtendedSymbols {
  @scala.inline
  def apply(ballotCross: java.lang.String, questionFull: java.lang.String): ExtendedSymbols = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ballotCross")(ballotCross)
    __obj.updateDynamic("questionFull")(questionFull)
    __obj.asInstanceOf[ExtendedSymbols]
  }
}

