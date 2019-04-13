package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggeringDataset extends js.Object {
  /**
    * The name of the data set whose content generation triggers the new data set content generation.
    */
  var name: DatasetName
}

object TriggeringDataset {
  @scala.inline
  def apply(name: DatasetName): TriggeringDataset = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[TriggeringDataset]
  }
}

