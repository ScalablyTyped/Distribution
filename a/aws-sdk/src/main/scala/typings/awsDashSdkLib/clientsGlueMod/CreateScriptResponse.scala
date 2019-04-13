package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateScriptResponse extends js.Object {
  /**
    * The Python script generated from the DAG.
    */
  var PythonScript: js.UndefOr[PythonScript] = js.undefined
  /**
    * The Scala code generated from the DAG.
    */
  var ScalaCode: js.UndefOr[ScalaCode] = js.undefined
}

object CreateScriptResponse {
  @scala.inline
  def apply(PythonScript: PythonScript = null, ScalaCode: ScalaCode = null): CreateScriptResponse = {
    val __obj = js.Dynamic.literal()
    if (PythonScript != null) __obj.updateDynamic("PythonScript")(PythonScript)
    if (ScalaCode != null) __obj.updateDynamic("ScalaCode")(ScalaCode)
    __obj.asInstanceOf[CreateScriptResponse]
  }
}

