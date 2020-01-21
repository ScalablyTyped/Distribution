package typings.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloServerEnv.apolloServerEnvStrings.omit
  - typings.apolloServerEnv.apolloServerEnvStrings.`same-origin`
  - typings.apolloServerEnv.apolloServerEnvStrings.include
*/
trait RequestCredentials extends js.Object

object RequestCredentials {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def include: typings.apolloServerEnv.apolloServerEnvStrings.include = this.cast("include")
  @scala.inline
  def omit: typings.apolloServerEnv.apolloServerEnvStrings.omit = this.cast("omit")
  @scala.inline
  def `same-origin`: typings.apolloServerEnv.apolloServerEnvStrings.`same-origin` = this.cast("same-origin")
}

