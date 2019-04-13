package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileGroupSettings extends js.Object {
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[__stringPatternS3] = js.undefined
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[DestinationSettings] = js.undefined
}

object FileGroupSettings {
  @scala.inline
  def apply(Destination: __stringPatternS3 = null, DestinationSettings: DestinationSettings = null): FileGroupSettings = {
    val __obj = js.Dynamic.literal()
    if (Destination != null) __obj.updateDynamic("Destination")(Destination)
    if (DestinationSettings != null) __obj.updateDynamic("DestinationSettings")(DestinationSettings)
    __obj.asInstanceOf[FileGroupSettings]
  }
}

