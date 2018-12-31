package typings
package atAngularCoreLib.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/public_api", "EventEmitter")
@js.native
/**
  * Creates an instance of this class that can
  * deliver events synchronously or asynchronously.
  *
  * @param isAsync When true, deliver events asynchronously.
  *
  */
class EventEmitter[T] ()
  extends atAngularCoreLib.srcCoreMod.EventEmitter[T] {
  def this(isAsync: scala.Boolean) = this()
}

