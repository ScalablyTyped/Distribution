package typings.apolloDashClient.coreWatchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloDashClient.apolloDashClientStrings.none
  - typings.apolloDashClient.apolloDashClientStrings.ignore
  - typings.apolloDashClient.apolloDashClientStrings.all
*/
trait ErrorPolicy extends js.Object

object ErrorPolicy {
  @scala.inline
  def all: typings.apolloDashClient.apolloDashClientStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ignore: typings.apolloDashClient.apolloDashClientStrings.ignore = this.cast("ignore")
  @scala.inline
  def none: typings.apolloDashClient.apolloDashClientStrings.none = this.cast("none")
}

