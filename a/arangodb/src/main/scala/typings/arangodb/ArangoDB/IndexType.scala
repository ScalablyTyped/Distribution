package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arangodb.arangodbStrings.hash
  - typings.arangodb.arangodbStrings.skiplist
  - typings.arangodb.arangodbStrings.fulltext
  - typings.arangodb.arangodbStrings.geo
  - typings.arangodb.arangodbStrings.ttl
*/
trait IndexType extends js.Object

object IndexType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fulltext: typings.arangodb.arangodbStrings.fulltext = this.cast("fulltext")
  @scala.inline
  def geo: typings.arangodb.arangodbStrings.geo = this.cast("geo")
  @scala.inline
  def hash: typings.arangodb.arangodbStrings.hash = this.cast("hash")
  @scala.inline
  def skiplist: typings.arangodb.arangodbStrings.skiplist = this.cast("skiplist")
  @scala.inline
  def ttl: typings.arangodb.arangodbStrings.ttl = this.cast("ttl")
}

