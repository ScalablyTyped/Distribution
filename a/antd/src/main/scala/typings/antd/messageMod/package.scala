package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object messageMod {
  type ConfigContent = typings.react.mod.ReactNode | java.lang.String
  type ConfigDuration = scala.Double | js.Function0[scala.Unit]
  type ConfigOnClose = js.Function0[scala.Unit]
  type JointContent = typings.antd.messageMod.ConfigContent | typings.antd.messageMod.ArgsProps
  type ThenableArgument = js.Function1[/* val */ js.Any, scala.Unit]
}
