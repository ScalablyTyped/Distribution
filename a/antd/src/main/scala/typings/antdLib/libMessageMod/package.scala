package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMessageMod {
  type ConfigContent = reactLib.reactMod.ReactNs.ReactNode | java.lang.String
  type ConfigDuration = scala.Double | js.Function0[scala.Unit]
  type ConfigOnClose = js.Function0[scala.Unit]
  type NoticeType = antdLib.antdLibStrings.info | antdLib.antdLibStrings.success | antdLib.antdLibStrings.error | antdLib.antdLibStrings.warning | antdLib.antdLibStrings.loading
  type ThenableArgument = js.Function1[/* _ */ js.Any, js.Any]
}
