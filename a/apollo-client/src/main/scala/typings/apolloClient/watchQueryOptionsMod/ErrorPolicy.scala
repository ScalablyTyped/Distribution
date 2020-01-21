package typings.apolloClient.watchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloClient.apolloClientStrings.none
  - typings.apolloClient.apolloClientStrings.ignore
  - typings.apolloClient.apolloClientStrings.all
*/
trait ErrorPolicy extends js.Object

object ErrorPolicy {
  @scala.inline
  def all: typings.apolloClient.apolloClientStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ignore: typings.apolloClient.apolloClientStrings.ignore = this.cast("ignore")
  @scala.inline
  def none: typings.apolloClient.apolloClientStrings.none = this.cast("none")
}

