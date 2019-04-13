package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HadoopJarStepConfig extends js.Object {
  /**
    * A list of command line arguments passed to the JAR file's main function when executed.
    */
  var Args: js.UndefOr[XmlStringList] = js.undefined
  /**
    * A path to a JAR file run during the step.
    */
  var Jar: XmlString
  /**
    * The name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
    */
  var MainClass: js.UndefOr[XmlString] = js.undefined
  /**
    * A list of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
    */
  var Properties: js.UndefOr[KeyValueList] = js.undefined
}

object HadoopJarStepConfig {
  @scala.inline
  def apply(
    Jar: XmlString,
    Args: XmlStringList = null,
    MainClass: XmlString = null,
    Properties: KeyValueList = null
  ): HadoopJarStepConfig = {
    val __obj = js.Dynamic.literal(Jar = Jar)
    if (Args != null) __obj.updateDynamic("Args")(Args)
    if (MainClass != null) __obj.updateDynamic("MainClass")(MainClass)
    if (Properties != null) __obj.updateDynamic("Properties")(Properties)
    __obj.asInstanceOf[HadoopJarStepConfig]
  }
}

