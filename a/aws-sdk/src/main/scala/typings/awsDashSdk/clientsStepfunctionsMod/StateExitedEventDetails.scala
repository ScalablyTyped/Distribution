package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateExitedEventDetails extends js.Object {
  /**
    * The name of the state. A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
    */
  var name: Name
  /**
    * The JSON output data of the state.
    */
  var output: js.UndefOr[SensitiveData] = js.undefined
}

object StateExitedEventDetails {
  @scala.inline
  def apply(name: Name, output: SensitiveData = null): StateExitedEventDetails = {
    val __obj = js.Dynamic.literal(name = name)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[StateExitedEventDetails]
  }
}

