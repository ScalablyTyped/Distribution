package typings
package awsDashSdkLib.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetainRule extends js.Object {
  /**
    * The number of snapshots to keep for each volume, up to a maximum of 1000.
    */
  var Count: awsDashSdkLib.clientsDlmMod.Count
}

object RetainRule {
  @scala.inline
  def apply(Count: Count): RetainRule = {
    val __obj = js.Dynamic.literal(Count = Count)
  
    __obj.asInstanceOf[RetainRule]
  }
}

