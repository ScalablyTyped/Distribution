package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is passed to an {@link InteractionHandler} when merging fails due to invalid layer data or access problems.
  * @since OOo 2.0
  */
trait MergeRecoveryRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /**
    * data that provides more detailed information about the reason and location of the error.
    *
    * Typically this member should contain an exception characterizing the error in detail.
    *
    * For example the following exceptions may be used: **MalformedException **: for layers containing invalid data.;
    *
    * **BackendAccessException**: for layers that can't be accessed.
    *
    *
    *
    * If no more detail information is available, this may be left `VOID` .
    */
  var ErrorDetails: js.Any
  /** Identifier of the layer object containing the invalid data. */
  var ErrorLayerId: java.lang.String
  /**
    * specifies whether the requester wants to remove or skip the invalid layer.
    *
    * If `TRUE` the requester wants to remove the underlying data of the layer. ;  If `FALSE` the request is to skip the underlying data this time, but
    * without removing it.
    */
  var IsRemovalRequest: scala.Boolean
}

object MergeRecoveryRequest {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ErrorDetails: js.Any,
    ErrorLayerId: java.lang.String,
    IsRemovalRequest: scala.Boolean,
    Message: java.lang.String
  ): MergeRecoveryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("ErrorDetails")(ErrorDetails)
    __obj.updateDynamic("ErrorLayerId")(ErrorLayerId)
    __obj.updateDynamic("IsRemovalRequest")(IsRemovalRequest)
    __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[MergeRecoveryRequest]
  }
}

