package typings.apolloEnv.fetchFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloEnv.apolloEnvStrings._empty
  - typings.apolloEnv.apolloEnvStrings.`no-referrer`
  - typings.apolloEnv.apolloEnvStrings.`no-referrer-when-downgrade`
  - typings.apolloEnv.apolloEnvStrings.`same-origin`
  - typings.apolloEnv.apolloEnvStrings.origin
  - typings.apolloEnv.apolloEnvStrings.`strict-origin`
  - typings.apolloEnv.apolloEnvStrings.`origin-when-cross-origin`
  - typings.apolloEnv.apolloEnvStrings.`strict-origin-when-cross-origin`
  - typings.apolloEnv.apolloEnvStrings.`unsafe-url`
*/
trait ReferrerPolicy extends js.Object

object ReferrerPolicy {
  @scala.inline
  def _empty: typings.apolloEnv.apolloEnvStrings._empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `no-referrer`: typings.apolloEnv.apolloEnvStrings.`no-referrer` = this.cast("no-referrer")
  @scala.inline
  def `no-referrer-when-downgrade`: typings.apolloEnv.apolloEnvStrings.`no-referrer-when-downgrade` = this.cast("no-referrer-when-downgrade")
  @scala.inline
  def origin: typings.apolloEnv.apolloEnvStrings.origin = this.cast("origin")
  @scala.inline
  def `origin-when-cross-origin`: typings.apolloEnv.apolloEnvStrings.`origin-when-cross-origin` = this.cast("origin-when-cross-origin")
  @scala.inline
  def `same-origin`: typings.apolloEnv.apolloEnvStrings.`same-origin` = this.cast("same-origin")
  @scala.inline
  def `strict-origin`: typings.apolloEnv.apolloEnvStrings.`strict-origin` = this.cast("strict-origin")
  @scala.inline
  def `strict-origin-when-cross-origin`: typings.apolloEnv.apolloEnvStrings.`strict-origin-when-cross-origin` = this.cast("strict-origin-when-cross-origin")
  @scala.inline
  def `unsafe-url`: typings.apolloEnv.apolloEnvStrings.`unsafe-url` = this.cast("unsafe-url")
}

