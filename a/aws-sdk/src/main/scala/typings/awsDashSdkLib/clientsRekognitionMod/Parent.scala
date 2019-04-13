package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parent extends js.Object {
  /**
    * The name of the parent label.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object Parent {
  @scala.inline
  def apply(Name: String = null): Parent = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[Parent]
  }
}

