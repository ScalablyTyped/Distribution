package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwapEnvironmentCNAMEsMessage extends js.Object {
  /**
    * The ID of the destination environment.  Condition: You must specify at least the DestinationEnvironmentID or the DestinationEnvironmentName. You may also specify both. You must specify the SourceEnvironmentId with the DestinationEnvironmentId. 
    */
  var DestinationEnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
  /**
    * The name of the destination environment.  Condition: You must specify at least the DestinationEnvironmentID or the DestinationEnvironmentName. You may also specify both. You must specify the SourceEnvironmentName with the DestinationEnvironmentName. 
    */
  var DestinationEnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
  /**
    * The ID of the source environment.  Condition: You must specify at least the SourceEnvironmentID or the SourceEnvironmentName. You may also specify both. If you specify the SourceEnvironmentId, you must specify the DestinationEnvironmentId. 
    */
  var SourceEnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
  /**
    * The name of the source environment.  Condition: You must specify at least the SourceEnvironmentID or the SourceEnvironmentName. You may also specify both. If you specify the SourceEnvironmentName, you must specify the DestinationEnvironmentName. 
    */
  var SourceEnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
}

object SwapEnvironmentCNAMEsMessage {
  @scala.inline
  def apply(
    DestinationEnvironmentId: EnvironmentId = null,
    DestinationEnvironmentName: EnvironmentName = null,
    SourceEnvironmentId: EnvironmentId = null,
    SourceEnvironmentName: EnvironmentName = null
  ): SwapEnvironmentCNAMEsMessage = {
    val __obj = js.Dynamic.literal()
    if (DestinationEnvironmentId != null) __obj.updateDynamic("DestinationEnvironmentId")(DestinationEnvironmentId)
    if (DestinationEnvironmentName != null) __obj.updateDynamic("DestinationEnvironmentName")(DestinationEnvironmentName)
    if (SourceEnvironmentId != null) __obj.updateDynamic("SourceEnvironmentId")(SourceEnvironmentId)
    if (SourceEnvironmentName != null) __obj.updateDynamic("SourceEnvironmentName")(SourceEnvironmentName)
    __obj.asInstanceOf[SwapEnvironmentCNAMEsMessage]
  }
}

