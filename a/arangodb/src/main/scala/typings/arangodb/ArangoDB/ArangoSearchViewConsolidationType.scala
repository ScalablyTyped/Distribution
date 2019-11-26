package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arangodb.arangodbStrings.bytes
  - typings.arangodb.arangodbStrings.bytes_accum
  - typings.arangodb.arangodbStrings.count
  - typings.arangodb.arangodbStrings.fill
*/
trait ArangoSearchViewConsolidationType extends js.Object

object ArangoSearchViewConsolidationType {
  @scala.inline
  def bytes: typings.arangodb.arangodbStrings.bytes = this.cast("bytes")
  @scala.inline
  def bytes_accum: typings.arangodb.arangodbStrings.bytes_accum = this.cast("bytes_accum")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def count: typings.arangodb.arangodbStrings.count = this.cast("count")
  @scala.inline
  def fill: typings.arangodb.arangodbStrings.fill = this.cast("fill")
}

