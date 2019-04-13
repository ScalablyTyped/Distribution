package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectStackResourceDriftOutput extends js.Object {
  /**
    * Information about whether the resource's actual configuration has drifted from its expected template configuration, including actual and expected property values and any differences detected.
    */
  var StackResourceDrift: awsDashSdkLib.clientsCloudformationMod.StackResourceDrift
}

object DetectStackResourceDriftOutput {
  @scala.inline
  def apply(StackResourceDrift: StackResourceDrift): DetectStackResourceDriftOutput = {
    val __obj = js.Dynamic.literal(StackResourceDrift = StackResourceDrift)
  
    __obj.asInstanceOf[DetectStackResourceDriftOutput]
  }
}

