package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arangodb.ArangoDB.ObjectWithId
  - typings.arangodb.ArangoDB.ObjectWithKey
*/
trait DocumentLike extends StObject
object DocumentLike {
  
  @scala.inline
  def ObjectWithId(_id: String): typings.arangodb.ArangoDB.ObjectWithId = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arangodb.ArangoDB.ObjectWithId]
  }
  
  @scala.inline
  def ObjectWithKey(_key: String): typings.arangodb.ArangoDB.ObjectWithKey = {
    val __obj = js.Dynamic.literal(_key = _key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arangodb.ArangoDB.ObjectWithKey]
  }
}
