package typings.apolloDashServerDashEnv.distFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.default
  - typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.`no-store`
  - typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.reload
  - typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.`no-cache`
  - typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.`force-cache`
  - typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.`only-if-cached`
*/
trait RequestCache extends js.Object

object RequestCache {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.default = this.cast("default")
  @scala.inline
  def `force-cache`: typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.`force-cache` = this.cast("force-cache")
  @scala.inline
  def `no-cache`: typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.`no-cache` = this.cast("no-cache")
  @scala.inline
  def `no-store`: typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.`no-store` = this.cast("no-store")
  @scala.inline
  def `only-if-cached`: typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.`only-if-cached` = this.cast("only-if-cached")
  @scala.inline
  def reload: typings.apolloDashServerDashEnv.apolloDashServerDashEnvStrings.reload = this.cast("reload")
}

