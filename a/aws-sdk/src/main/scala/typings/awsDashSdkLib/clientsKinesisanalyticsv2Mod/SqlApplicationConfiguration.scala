package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlApplicationConfiguration extends js.Object {
  /**
    * The array of Input objects describing the input streams used by the application.
    */
  var Inputs: js.UndefOr[Inputs] = js.undefined
  /**
    * The array of Output objects describing the destination streams used by the application.
    */
  var Outputs: js.UndefOr[Outputs] = js.undefined
  /**
    * The array of ReferenceDataSource objects describing the reference data sources used by the application.
    */
  var ReferenceDataSources: js.UndefOr[ReferenceDataSources] = js.undefined
}

object SqlApplicationConfiguration {
  @scala.inline
  def apply(Inputs: Inputs = null, Outputs: Outputs = null, ReferenceDataSources: ReferenceDataSources = null): SqlApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Inputs != null) __obj.updateDynamic("Inputs")(Inputs)
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs)
    if (ReferenceDataSources != null) __obj.updateDynamic("ReferenceDataSources")(ReferenceDataSources)
    __obj.asInstanceOf[SqlApplicationConfiguration]
  }
}

