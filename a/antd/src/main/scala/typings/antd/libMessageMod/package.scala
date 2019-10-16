package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMessageMod {
  import typings.react.reactMod.ReactNode

  type ConfigContent = ReactNode | String
  type ConfigDuration = Double | js.Function0[Unit]
  type ConfigOnClose = js.Function0[Unit]
  type JointContent = ConfigContent | ArgsProps
  type ThenableArgument = js.Function1[/* val */ js.Any, Unit]
}
