package typings.apolloDashServerDashEnv.distFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.follow
  - typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.error
  - typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.manual
*/
trait RequestRedirect extends js.Object

object RequestRedirect {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.error = this.cast("error")
  @scala.inline
  def follow: typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.follow = this.cast("follow")
  @scala.inline
  def manual: typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.manual = this.cast("manual")
}

