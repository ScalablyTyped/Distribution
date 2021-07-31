package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "CompositionTransactionOwnershipToken")
@js.native
class CompositionTransactionOwnershipToken () extends StObject {
  def this(owner: js.Any) = this()
  
  /**
    * Used internall to resolve the composition complete promise.
    */
  def resolve(): Unit = js.native
  
  /**
    * Allows the transaction owner to wait for the completion of all child compositions.
    * @return A promise that resolves when all child compositions are done.
    */
  def waitForCompositionComplete(): js.Promise[Unit] = js.native
}
