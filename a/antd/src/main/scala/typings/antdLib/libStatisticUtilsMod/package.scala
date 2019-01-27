package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libStatisticUtilsMod {
  type Formatter = antdLib.antdLibNumbers.`false` | antdLib.antdLibStrings.number | antdLib.antdLibStrings.countdown | (js.Function2[
    /* value */ valueType, 
    /* config */ js.UndefOr[FormatConfig], 
    reactLib.reactMod.ReactNs.ReactNode
  ])
  type countdownValueType = valueType | java.lang.String
  type valueType = scala.Double | java.lang.String
}
