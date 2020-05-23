package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is passed to an {@link InteractionHandler} when merging fails due to invalid layer data or access problems.
  * @since OOo 2.0
  */
trait MergeRecoveryRequest extends Exception {
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
  var ErrorLayerId: String
  /**
    * specifies whether the requester wants to remove or skip the invalid layer.
    *
    * If `TRUE` the requester wants to remove the underlying data of the layer. ;  If `FALSE` the request is to skip the underlying data this time, but
    * without removing it.
    */
  var IsRemovalRequest: Boolean
}

object MergeRecoveryRequest {
  @scala.inline
  def apply(
    Context: XInterface,
    ErrorDetails: js.Any,
    ErrorLayerId: String,
    IsRemovalRequest: Boolean,
    Message: String
  ): MergeRecoveryRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrorDetails = ErrorDetails.asInstanceOf[js.Any], ErrorLayerId = ErrorLayerId.asInstanceOf[js.Any], IsRemovalRequest = IsRemovalRequest.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeRecoveryRequest]
  }
}

