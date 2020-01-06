package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnFailure extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the destination resource.
    */
  var Destination: js.UndefOr[DestinationArn] = js.native
}

object OnFailure {
  @scala.inline
  def apply(Destination: DestinationArn = null): OnFailure = {
    val __obj = js.Dynamic.literal()
    if (Destination != null) __obj.updateDynamic("Destination")(Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFailure]
  }
}

