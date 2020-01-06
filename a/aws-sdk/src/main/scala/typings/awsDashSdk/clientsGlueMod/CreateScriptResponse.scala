package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateScriptResponse extends js.Object {
  /**
    * The Python script generated from the DAG.
    */
  var PythonScript: js.UndefOr[typings.awsDashSdk.clientsGlueMod.PythonScript] = js.native
  /**
    * The Scala code generated from the DAG.
    */
  var ScalaCode: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ScalaCode] = js.native
}

object CreateScriptResponse {
  @scala.inline
  def apply(PythonScript: PythonScript = null, ScalaCode: ScalaCode = null): CreateScriptResponse = {
    val __obj = js.Dynamic.literal()
    if (PythonScript != null) __obj.updateDynamic("PythonScript")(PythonScript.asInstanceOf[js.Any])
    if (ScalaCode != null) __obj.updateDynamic("ScalaCode")(ScalaCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScriptResponse]
  }
}

