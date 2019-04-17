package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportedPlatform extends js.Object {
  /**
    * 
    */
  var Name: js.UndefOr[String] = js.undefined
}

object SupportedPlatform {
  @scala.inline
  def apply(Name: String = null): SupportedPlatform = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[SupportedPlatform]
  }
}

