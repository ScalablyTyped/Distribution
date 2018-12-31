package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "CompositionTransactionOwnershipToken")
@js.native
class CompositionTransactionOwnershipToken () extends js.Object {
  def this(owner: js.Any) = this()
  /**
    * Used internall to resolve the composition complete promise.
    */
  def resolve(): scala.Unit = js.native
  /**
    * Allows the transaction owner to wait for the completion of all child compositions.
    * @return A promise that resolves when all child compositions are done.
    */
  def waitForCompositionComplete(): js.Promise[scala.Unit] = js.native
}

