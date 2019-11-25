package typings.apolloDashClient.coreWatchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloDashClient.apolloDashClientStrings.`cache-first`
  - typings.apolloDashClient.apolloDashClientStrings.`network-only`
  - typings.apolloDashClient.apolloDashClientStrings.`cache-only`
  - typings.apolloDashClient.apolloDashClientStrings.`no-cache`
  - typings.apolloDashClient.apolloDashClientStrings.standby
*/
trait FetchPolicy extends js.Object

object FetchPolicy {
  @scala.inline
  def `cache-first`: typings.apolloDashClient.apolloDashClientStrings.`cache-first` = this.cast("cache-first")
  @scala.inline
  def `cache-only`: typings.apolloDashClient.apolloDashClientStrings.`cache-only` = this.cast("cache-only")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `network-only`: typings.apolloDashClient.apolloDashClientStrings.`network-only` = this.cast("network-only")
  @scala.inline
  def `no-cache`: typings.apolloDashClient.apolloDashClientStrings.`no-cache` = this.cast("no-cache")
  @scala.inline
  def standby: typings.apolloDashClient.apolloDashClientStrings.standby = this.cast("standby")
}

