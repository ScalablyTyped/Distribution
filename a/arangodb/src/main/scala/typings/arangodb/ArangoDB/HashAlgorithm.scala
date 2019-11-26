package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arangodb.arangodbStrings.sha512
  - typings.arangodb.arangodbStrings.sha384
  - typings.arangodb.arangodbStrings.sha256
  - typings.arangodb.arangodbStrings.sha224
  - typings.arangodb.arangodbStrings.sha1
  - typings.arangodb.arangodbStrings.md5
*/
trait HashAlgorithm extends js.Object

object HashAlgorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def md5: typings.arangodb.arangodbStrings.md5 = this.cast("md5")
  @scala.inline
  def sha1: typings.arangodb.arangodbStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha224: typings.arangodb.arangodbStrings.sha224 = this.cast("sha224")
  @scala.inline
  def sha256: typings.arangodb.arangodbStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typings.arangodb.arangodbStrings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typings.arangodb.arangodbStrings.sha512 = this.cast("sha512")
}

