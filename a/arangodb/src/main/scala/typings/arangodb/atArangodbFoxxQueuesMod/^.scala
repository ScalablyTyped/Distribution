package typings.arangodb.atArangodbFoxxQueuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@arangodb/foxx/queues", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(name: String): Queue = js.native
  def create(name: String, maxWorkers: Double): Queue = js.native
  def delete(name: String): Boolean = js.native
  def get(name: String): Queue = js.native
}

