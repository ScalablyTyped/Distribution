package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobCommand extends js.Object {
  /**
    * The name of the job command: this must be glueetl, for an Apache Spark ETL job, or pythonshell, for a Python shell job.
    */
  var Name: js.UndefOr[GenericString] = js.undefined
  /**
    * Specifies the S3 path to a script that executes a job (required).
    */
  var ScriptLocation: js.UndefOr[ScriptLocationString] = js.undefined
}

object JobCommand {
  @scala.inline
  def apply(Name: GenericString = null, ScriptLocation: ScriptLocationString = null): JobCommand = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ScriptLocation != null) __obj.updateDynamic("ScriptLocation")(ScriptLocation)
    __obj.asInstanceOf[JobCommand]
  }
}

