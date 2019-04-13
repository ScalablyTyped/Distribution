package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataflowGraphRequest extends js.Object {
  /**
    * The Python script to transform.
    */
  var PythonScript: js.UndefOr[PythonScript] = js.undefined
}

object GetDataflowGraphRequest {
  @scala.inline
  def apply(PythonScript: PythonScript = null): GetDataflowGraphRequest = {
    val __obj = js.Dynamic.literal()
    if (PythonScript != null) __obj.updateDynamic("PythonScript")(PythonScript)
    __obj.asInstanceOf[GetDataflowGraphRequest]
  }
}

