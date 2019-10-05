package typings.arangodb.atArangodbFoxxSessionsStoragesJwtMod

import typings.arangodb.Foxx.SessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@arangodb/foxx/sessions/storages/jwt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: String): SessionStorage = js.native
  def apply(options: SafeJwtStorageOptions): SessionStorage = js.native
  def apply(options: UnsafeJwtStorageOptions): SessionStorage = js.native
}

