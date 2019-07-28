package typings.antd

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMessageMod {
  type ConfigContent = ReactNode | String
  type ConfigDuration = Double | js.Function0[Unit]
  type ConfigOnClose = js.Function0[Unit]
  type ThenableArgument = js.Function1[/* val */ js.Any, Unit]
}
