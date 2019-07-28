package typings.athenajs.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Deferred")
@js.native
class Deferred () extends js.Object {
  var promise: Promise = js.native
  def reject(`val`: js.Any): Unit = js.native
  def resolve(`val`: js.Any): Unit = js.native
}

/* static members */
@JSImport("athenajs", "Deferred")
@js.native
object Deferred extends js.Object {
  /**
    * Creates and immediately resolves a new deferred.
    *
    */
  def resolve(): Promise = js.native
  def resolve(`val`: js.Any): Promise = js.native
}

