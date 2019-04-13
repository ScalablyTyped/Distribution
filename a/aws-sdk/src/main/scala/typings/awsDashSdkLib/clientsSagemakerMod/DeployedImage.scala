package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeployedImage extends js.Object {
  /**
    * The date and time when the image path for the model resolved to the ResolvedImage 
    */
  var ResolutionTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The specific digest path of the image hosted in this ProductionVariant.
    */
  var ResolvedImage: js.UndefOr[Image] = js.undefined
  /**
    * The image path you specified when you created the model.
    */
  var SpecifiedImage: js.UndefOr[Image] = js.undefined
}

object DeployedImage {
  @scala.inline
  def apply(ResolutionTime: Timestamp = null, ResolvedImage: Image = null, SpecifiedImage: Image = null): DeployedImage = {
    val __obj = js.Dynamic.literal()
    if (ResolutionTime != null) __obj.updateDynamic("ResolutionTime")(ResolutionTime)
    if (ResolvedImage != null) __obj.updateDynamic("ResolvedImage")(ResolvedImage)
    if (SpecifiedImage != null) __obj.updateDynamic("SpecifiedImage")(SpecifiedImage)
    __obj.asInstanceOf[DeployedImage]
  }
}

