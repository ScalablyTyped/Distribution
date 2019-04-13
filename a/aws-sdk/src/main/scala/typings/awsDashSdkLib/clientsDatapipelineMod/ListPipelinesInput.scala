package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPipelinesInput extends js.Object {
  /**
    * The starting point for the results to be returned. For the first call, this value should be empty. As long as there are more results, continue to call ListPipelines with the marker value from the previous call to retrieve the next set of results.
    */
  var marker: js.UndefOr[java.lang.String] = js.undefined
}

object ListPipelinesInput {
  @scala.inline
  def apply(marker: java.lang.String = null): ListPipelinesInput = {
    val __obj = js.Dynamic.literal()
    if (marker != null) __obj.updateDynamic("marker")(marker)
    __obj.asInstanceOf[ListPipelinesInput]
  }
}

