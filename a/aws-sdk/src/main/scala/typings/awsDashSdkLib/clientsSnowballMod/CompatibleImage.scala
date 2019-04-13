package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompatibleImage extends js.Object {
  /**
    * The unique identifier for an individual Snowball Edge AMI.
    */
  var AmiId: js.UndefOr[String] = js.undefined
  /**
    * The optional name of a compatible image.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object CompatibleImage {
  @scala.inline
  def apply(AmiId: String = null, Name: String = null): CompatibleImage = {
    val __obj = js.Dynamic.literal()
    if (AmiId != null) __obj.updateDynamic("AmiId")(AmiId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[CompatibleImage]
  }
}

