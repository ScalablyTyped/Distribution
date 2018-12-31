package typings
package atAngularCoreLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "EventEmitter")
@js.native
/**
  * Creates an instance of this class that can
  * deliver events synchronously or asynchronously.
  *
  * @param isAsync When true, deliver events asynchronously.
  *
  */
class EventEmitter[T] ()
  extends atAngularCoreLib.publicUnderscoreApiMod.EventEmitter[T] {
  def this(isAsync: scala.Boolean) = this()
}

