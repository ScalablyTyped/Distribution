package typings.arangodb.collectionMod

import typings.arangodb.ArangoDB.Collection
import typings.arangodb.Foxx.CollectionSessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@arangodb/foxx/sessions/storages/collection", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: String | Collection[_]): CollectionSessionStorage = js.native
  def apply(options: CollectionStorageOptions): CollectionSessionStorage = js.native
}

