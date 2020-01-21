package typings.apolloClient.watchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloClient.apolloClientStrings.`cache-first`
  - typings.apolloClient.apolloClientStrings.`network-only`
  - typings.apolloClient.apolloClientStrings.`cache-only`
  - typings.apolloClient.apolloClientStrings.`no-cache`
  - typings.apolloClient.apolloClientStrings.standby
*/
trait FetchPolicy extends js.Object

object FetchPolicy {
  @scala.inline
  def `cache-first`: typings.apolloClient.apolloClientStrings.`cache-first` = this.cast("cache-first")
  @scala.inline
  def `cache-only`: typings.apolloClient.apolloClientStrings.`cache-only` = this.cast("cache-only")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `network-only`: typings.apolloClient.apolloClientStrings.`network-only` = this.cast("network-only")
  @scala.inline
  def `no-cache`: typings.apolloClient.apolloClientStrings.`no-cache` = this.cast("no-cache")
  @scala.inline
  def standby: typings.apolloClient.apolloClientStrings.standby = this.cast("standby")
}

