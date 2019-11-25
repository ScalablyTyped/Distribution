package typings.apolloDashServerDashEnv.distFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.navigate
  - typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.`same-origin`
  - typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.`no-cors`
  - typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.cors
*/
trait RequestMode extends js.Object

object RequestMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.cors = this.cast("cors")
  @scala.inline
  def navigate: typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.navigate = this.cast("navigate")
  @scala.inline
  def `no-cors`: typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.`no-cors` = this.cast("no-cors")
  @scala.inline
  def `same-origin`: typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.`same-origin` = this.cast("same-origin")
}

