package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arangodb.arangodbStrings.mmfiles
  - typings.arangodb.arangodbStrings.rocksdb
*/
trait EngineType extends js.Object

object EngineType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mmfiles: typings.arangodb.arangodbStrings.mmfiles = this.cast("mmfiles")
  @scala.inline
  def rocksdb: typings.arangodb.arangodbStrings.rocksdb = this.cast("rocksdb")
}

