package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HsmConfigurationMessage extends js.Object {
  /**
    * A list of HsmConfiguration objects.
    */
  var HsmConfigurations: js.UndefOr[HsmConfigurationList] = js.undefined
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object HsmConfigurationMessage {
  @scala.inline
  def apply(HsmConfigurations: HsmConfigurationList = null, Marker: String = null): HsmConfigurationMessage = {
    val __obj = js.Dynamic.literal()
    if (HsmConfigurations != null) __obj.updateDynamic("HsmConfigurations")(HsmConfigurations)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[HsmConfigurationMessage]
  }
}

