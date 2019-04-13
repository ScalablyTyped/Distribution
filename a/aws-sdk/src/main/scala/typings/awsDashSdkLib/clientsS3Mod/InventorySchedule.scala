package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventorySchedule extends js.Object {
  /**
    * Specifies how frequently inventory results are produced.
    */
  var Frequency: InventoryFrequency
}

object InventorySchedule {
  @scala.inline
  def apply(Frequency: InventoryFrequency): InventorySchedule = {
    val __obj = js.Dynamic.literal(Frequency = Frequency.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InventorySchedule]
  }
}

