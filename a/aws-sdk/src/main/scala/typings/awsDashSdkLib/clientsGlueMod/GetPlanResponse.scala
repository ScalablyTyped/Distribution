package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPlanResponse extends js.Object {
  /**
    * A Python script to perform the mapping.
    */
  var PythonScript: js.UndefOr[PythonScript] = js.undefined
  /**
    * Scala code to perform the mapping.
    */
  var ScalaCode: js.UndefOr[ScalaCode] = js.undefined
}

object GetPlanResponse {
  @scala.inline
  def apply(PythonScript: PythonScript = null, ScalaCode: ScalaCode = null): GetPlanResponse = {
    val __obj = js.Dynamic.literal()
    if (PythonScript != null) __obj.updateDynamic("PythonScript")(PythonScript)
    if (ScalaCode != null) __obj.updateDynamic("ScalaCode")(ScalaCode)
    __obj.asInstanceOf[GetPlanResponse]
  }
}

