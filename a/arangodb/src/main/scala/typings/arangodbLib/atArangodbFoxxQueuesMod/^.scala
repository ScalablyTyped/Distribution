package typings
package arangodbLib.atArangodbFoxxQueuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@arangodb/foxx/queues", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(name: java.lang.String): arangodbLib.atArangodbFoxxQueuesMod.Queue = js.native
  def create(name: java.lang.String, maxWorkers: scala.Double): arangodbLib.atArangodbFoxxQueuesMod.Queue = js.native
  def delete(name: java.lang.String): scala.Boolean = js.native
  def get(name: java.lang.String): arangodbLib.atArangodbFoxxQueuesMod.Queue = js.native
}

