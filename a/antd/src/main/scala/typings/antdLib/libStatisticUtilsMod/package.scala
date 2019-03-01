package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libStatisticUtilsMod {
  type Formatter = _Formatter | (js.Function2[
    /* value */ valueType, 
    /* config */ js.UndefOr[FormatConfig], 
    reactLib.reactMod.ReactNs.ReactNode
  ])
  type countdownValueType = valueType | java.lang.String
  type valueType = scala.Double | java.lang.String
}
