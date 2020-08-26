package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arangodb.ArangoDB.ObjectWithId
  - typings.arangodb.ArangoDB.ObjectWithKey
*/
trait DocumentLike extends js.Object

object DocumentLike {
  @scala.inline
  def ObjectWithId(_id: String): DocumentLike = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLike]
  }
  @scala.inline
  def ObjectWithKey(_key: String): DocumentLike = {
    val __obj = js.Dynamic.literal(_key = _key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLike]
  }
}

