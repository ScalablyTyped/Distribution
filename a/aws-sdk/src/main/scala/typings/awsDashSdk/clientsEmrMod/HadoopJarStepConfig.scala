package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HadoopJarStepConfig extends js.Object {
  /**
    * A list of command line arguments passed to the JAR file's main function when executed.
    */
  var Args: js.UndefOr[XmlStringList] = js.native
  /**
    * A path to a JAR file run during the step.
    */
  var Jar: XmlString = js.native
  /**
    * The name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
    */
  var MainClass: js.UndefOr[XmlString] = js.native
  /**
    * A list of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
    */
  var Properties: js.UndefOr[KeyValueList] = js.native
}

object HadoopJarStepConfig {
  @scala.inline
  def apply(
    Jar: XmlString,
    Args: XmlStringList = null,
    MainClass: XmlString = null,
    Properties: KeyValueList = null
  ): HadoopJarStepConfig = {
    val __obj = js.Dynamic.literal(Jar = Jar.asInstanceOf[js.Any])
    if (Args != null) __obj.updateDynamic("Args")(Args.asInstanceOf[js.Any])
    if (MainClass != null) __obj.updateDynamic("MainClass")(MainClass.asInstanceOf[js.Any])
    if (Properties != null) __obj.updateDynamic("Properties")(Properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[HadoopJarStepConfig]
  }
}

