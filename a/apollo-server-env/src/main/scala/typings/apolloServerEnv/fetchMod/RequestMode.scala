package typings.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloServerEnv.apolloServerEnvStrings.navigate
  - typings.apolloServerEnv.apolloServerEnvStrings.`same-origin`
  - typings.apolloServerEnv.apolloServerEnvStrings.`no-cors`
  - typings.apolloServerEnv.apolloServerEnvStrings.cors
*/
trait RequestMode extends js.Object

object RequestMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typings.apolloServerEnv.apolloServerEnvStrings.cors = this.cast("cors")
  @scala.inline
  def navigate: typings.apolloServerEnv.apolloServerEnvStrings.navigate = this.cast("navigate")
  @scala.inline
  def `no-cors`: typings.apolloServerEnv.apolloServerEnvStrings.`no-cors` = this.cast("no-cors")
  @scala.inline
  def `same-origin`: typings.apolloServerEnv.apolloServerEnvStrings.`same-origin` = this.cast("same-origin")
}

