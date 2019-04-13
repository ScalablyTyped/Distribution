package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartImportTaskResponse extends js.Object {
  /**
    * An array of information related to the import task request including status information, times, IDs, the Amazon S3 Object URL for the import file, and more. 
    */
  var task: js.UndefOr[ImportTask] = js.undefined
}

object StartImportTaskResponse {
  @scala.inline
  def apply(task: ImportTask = null): StartImportTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (task != null) __obj.updateDynamic("task")(task)
    __obj.asInstanceOf[StartImportTaskResponse]
  }
}

