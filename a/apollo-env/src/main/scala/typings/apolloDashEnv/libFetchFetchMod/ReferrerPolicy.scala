package typings.apolloDashEnv.libFetchFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloDashEnv.apolloDashEnvStrings.Empty
  - typings.apolloDashEnv.apolloDashEnvStrings.`no-referrer`
  - typings.apolloDashEnv.apolloDashEnvStrings.`no-referrer-when-downgrade`
  - typings.apolloDashEnv.apolloDashEnvStrings.`same-origin`
  - typings.apolloDashEnv.apolloDashEnvStrings.origin
  - typings.apolloDashEnv.apolloDashEnvStrings.`strict-origin`
  - typings.apolloDashEnv.apolloDashEnvStrings.`origin-when-cross-origin`
  - typings.apolloDashEnv.apolloDashEnvStrings.`strict-origin-when-cross-origin`
  - typings.apolloDashEnv.apolloDashEnvStrings.`unsafe-url`
*/
trait ReferrerPolicy extends js.Object

object ReferrerPolicy {
  @scala.inline
  def Empty: typings.apolloDashEnv.apolloDashEnvStrings.Empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `no-referrer`: typings.apolloDashEnv.apolloDashEnvStrings.`no-referrer` = this.cast("no-referrer")
  @scala.inline
  def `no-referrer-when-downgrade`: typings.apolloDashEnv.apolloDashEnvStrings.`no-referrer-when-downgrade` = this.cast("no-referrer-when-downgrade")
  @scala.inline
  def origin: typings.apolloDashEnv.apolloDashEnvStrings.origin = this.cast("origin")
  @scala.inline
  def `origin-when-cross-origin`: typings.apolloDashEnv.apolloDashEnvStrings.`origin-when-cross-origin` = this.cast("origin-when-cross-origin")
  @scala.inline
  def `same-origin`: typings.apolloDashEnv.apolloDashEnvStrings.`same-origin` = this.cast("same-origin")
  @scala.inline
  def `strict-origin`: typings.apolloDashEnv.apolloDashEnvStrings.`strict-origin` = this.cast("strict-origin")
  @scala.inline
  def `strict-origin-when-cross-origin`: typings.apolloDashEnv.apolloDashEnvStrings.`strict-origin-when-cross-origin` = this.cast("strict-origin-when-cross-origin")
  @scala.inline
  def `unsafe-url`: typings.apolloDashEnv.apolloDashEnvStrings.`unsafe-url` = this.cast("unsafe-url")
}

