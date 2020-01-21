package typings.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloServerEnv.apolloServerEnvStrings.default
  - typings.apolloServerEnv.apolloServerEnvStrings.`no-store`
  - typings.apolloServerEnv.apolloServerEnvStrings.reload
  - typings.apolloServerEnv.apolloServerEnvStrings.`no-cache`
  - typings.apolloServerEnv.apolloServerEnvStrings.`force-cache`
  - typings.apolloServerEnv.apolloServerEnvStrings.`only-if-cached`
*/
trait RequestCache extends js.Object

object RequestCache {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.apolloServerEnv.apolloServerEnvStrings.default = this.cast("default")
  @scala.inline
  def `force-cache`: typings.apolloServerEnv.apolloServerEnvStrings.`force-cache` = this.cast("force-cache")
  @scala.inline
  def `no-cache`: typings.apolloServerEnv.apolloServerEnvStrings.`no-cache` = this.cast("no-cache")
  @scala.inline
  def `no-store`: typings.apolloServerEnv.apolloServerEnvStrings.`no-store` = this.cast("no-store")
  @scala.inline
  def `only-if-cached`: typings.apolloServerEnv.apolloServerEnvStrings.`only-if-cached` = this.cast("only-if-cached")
  @scala.inline
  def reload: typings.apolloServerEnv.apolloServerEnvStrings.reload = this.cast("reload")
}

