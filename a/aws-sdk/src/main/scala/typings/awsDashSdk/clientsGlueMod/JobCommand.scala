package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobCommand extends js.Object {
  /**
    * The name of the job command. For an Apache Spark ETL job, this must be glueetl. For a Python shell job, it must be pythonshell.
    */
  var Name: js.UndefOr[GenericString] = js.undefined
  /**
    * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
    */
  var PythonVersion: js.UndefOr[PythonVersionString] = js.undefined
  /**
    * Specifies the Amazon Simple Storage Service (Amazon S3) path to a script that executes a job.
    */
  var ScriptLocation: js.UndefOr[ScriptLocationString] = js.undefined
}

object JobCommand {
  @scala.inline
  def apply(
    Name: GenericString = null,
    PythonVersion: PythonVersionString = null,
    ScriptLocation: ScriptLocationString = null
  ): JobCommand = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (PythonVersion != null) __obj.updateDynamic("PythonVersion")(PythonVersion)
    if (ScriptLocation != null) __obj.updateDynamic("ScriptLocation")(ScriptLocation)
    __obj.asInstanceOf[JobCommand]
  }
}

