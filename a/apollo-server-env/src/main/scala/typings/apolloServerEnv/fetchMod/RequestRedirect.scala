package typings.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloServerEnv.apolloServerEnvStrings.follow
  - typings.apolloServerEnv.apolloServerEnvStrings.error
  - typings.apolloServerEnv.apolloServerEnvStrings.manual
*/
trait RequestRedirect extends js.Object

object RequestRedirect {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.apolloServerEnv.apolloServerEnvStrings.error = this.cast("error")
  @scala.inline
  def follow: typings.apolloServerEnv.apolloServerEnvStrings.follow = this.cast("follow")
  @scala.inline
  def manual: typings.apolloServerEnv.apolloServerEnvStrings.manual = this.cast("manual")
}

