package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esStatisticUtilsMod {
  /* Rewritten from type alias, can be one of: 
    - antdLib.antdLibNumbers.`false`
    - antdLib.antdLibStrings.number
    - antdLib.antdLibStrings.countdown
    - js.Function2[
  / * value * / valueType, 
  / * config * / js.UndefOr[FormatConfig], 
  reactLib.reactMod.ReactNode]
  */
  type Formatter = _Formatter | (js.Function2[
    /* value */ valueType, 
    /* config */ js.UndefOr[FormatConfig], 
    reactLib.reactMod.ReactNode
  ])
  type countdownValueType = valueType | java.lang.String
  type valueType = scala.Double | java.lang.String
}
