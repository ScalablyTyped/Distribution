package typings.apolloDashServerDashEnv.distFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.omit
  - typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.`same-origin`
  - typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.include
*/
trait RequestCredentials extends js.Object

object RequestCredentials {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def include: typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.include = this.cast("include")
  @scala.inline
  def omit: typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.omit = this.cast("omit")
  @scala.inline
  def `same-origin`: typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.`same-origin` = this.cast("same-origin")
}

