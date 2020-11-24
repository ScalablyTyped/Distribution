package typings.arangodb.queuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@arangodb/foxx/queues", "create")
@js.native
object create extends js.Object {
  
  def apply(name: String): Queue = js.native
  def apply(name: String, maxWorkers: Double): Queue = js.native
}
