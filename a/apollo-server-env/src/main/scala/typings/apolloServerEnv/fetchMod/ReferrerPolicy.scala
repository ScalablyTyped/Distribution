package typings.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloServerEnv.apolloServerEnvStrings._empty
  - typings.apolloServerEnv.apolloServerEnvStrings.`no-referrer`
  - typings.apolloServerEnv.apolloServerEnvStrings.`no-referrer-when-downgrade`
  - typings.apolloServerEnv.apolloServerEnvStrings.`same-origin`
  - typings.apolloServerEnv.apolloServerEnvStrings.origin
  - typings.apolloServerEnv.apolloServerEnvStrings.`strict-origin`
  - typings.apolloServerEnv.apolloServerEnvStrings.`origin-when-cross-origin`
  - typings.apolloServerEnv.apolloServerEnvStrings.`strict-origin-when-cross-origin`
  - typings.apolloServerEnv.apolloServerEnvStrings.`unsafe-url`
*/
trait ReferrerPolicy extends js.Object

object ReferrerPolicy {
  @scala.inline
  def _empty: typings.apolloServerEnv.apolloServerEnvStrings._empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `no-referrer`: typings.apolloServerEnv.apolloServerEnvStrings.`no-referrer` = this.cast("no-referrer")
  @scala.inline
  def `no-referrer-when-downgrade`: typings.apolloServerEnv.apolloServerEnvStrings.`no-referrer-when-downgrade` = this.cast("no-referrer-when-downgrade")
  @scala.inline
  def origin: typings.apolloServerEnv.apolloServerEnvStrings.origin = this.cast("origin")
  @scala.inline
  def `origin-when-cross-origin`: typings.apolloServerEnv.apolloServerEnvStrings.`origin-when-cross-origin` = this.cast("origin-when-cross-origin")
  @scala.inline
  def `same-origin`: typings.apolloServerEnv.apolloServerEnvStrings.`same-origin` = this.cast("same-origin")
  @scala.inline
  def `strict-origin`: typings.apolloServerEnv.apolloServerEnvStrings.`strict-origin` = this.cast("strict-origin")
  @scala.inline
  def `strict-origin-when-cross-origin`: typings.apolloServerEnv.apolloServerEnvStrings.`strict-origin-when-cross-origin` = this.cast("strict-origin-when-cross-origin")
  @scala.inline
  def `unsafe-url`: typings.apolloServerEnv.apolloServerEnvStrings.`unsafe-url` = this.cast("unsafe-url")
}

