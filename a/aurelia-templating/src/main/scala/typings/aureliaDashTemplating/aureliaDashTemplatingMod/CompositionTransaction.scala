package typings.aureliaDashTemplating.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "CompositionTransaction")
@js.native
/**
  * Creates an instance of CompositionTransaction.
  */
class CompositionTransaction () extends js.Object {
  /**
    * Enlist an async render operation into the transaction.
    * @return A completion notifier.
    */
  def enlist(): CompositionTransactionNotifier = js.native
  /**
    * Attempt to take ownership of the composition transaction.
    * @return An ownership token if successful, otherwise null.
    */
  def tryCapture(): CompositionTransactionOwnershipToken = js.native
}

