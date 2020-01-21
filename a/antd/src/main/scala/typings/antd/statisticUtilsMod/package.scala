package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object statisticUtilsMod {
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdBooleans.`false`
    - typings.antd.antdStrings.number
    - typings.antd.antdStrings.countdown
    - js.Function2[
  / * value * / typings.antd.statisticUtilsMod.valueType, 
  / * config * / js.UndefOr[typings.antd.statisticUtilsMod.FormatConfig], 
  typings.react.mod.ReactNode]
  */
  type Formatter = typings.antd.statisticUtilsMod._Formatter | (js.Function2[
    /* value */ typings.antd.statisticUtilsMod.valueType, 
    /* config */ js.UndefOr[typings.antd.statisticUtilsMod.FormatConfig], 
    typings.react.mod.ReactNode
  ])
  type countdownValueType = typings.antd.statisticUtilsMod.valueType | java.lang.String
  type valueType = scala.Double | java.lang.String
}
