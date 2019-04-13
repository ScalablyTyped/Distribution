package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsSmoothGroupSettings extends js.Object {
  /**
    * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output group into a single audio stream.
    */
  var AudioDeduplication: js.UndefOr[MsSmoothAudioDeduplication] = js.undefined
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[__stringPatternS3] = js.undefined
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[DestinationSettings] = js.undefined
  /**
    * If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.
    */
  var Encryption: js.UndefOr[MsSmoothEncryptionSettings] = js.undefined
  /**
    * Use Fragment length (FragmentLength) to specify the mp4 fragment sizes in seconds. Fragment length must be compatible with GOP size and frame rate.
    */
  var FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client manifest. Valid options are utf8 and utf16.
    */
  var ManifestEncoding: js.UndefOr[MsSmoothManifestEncoding] = js.undefined
}

object MsSmoothGroupSettings {
  @scala.inline
  def apply(
    AudioDeduplication: MsSmoothAudioDeduplication = null,
    Destination: __stringPatternS3 = null,
    DestinationSettings: DestinationSettings = null,
    Encryption: MsSmoothEncryptionSettings = null,
    FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    ManifestEncoding: MsSmoothManifestEncoding = null
  ): MsSmoothGroupSettings = {
    val __obj = js.Dynamic.literal()
    if (AudioDeduplication != null) __obj.updateDynamic("AudioDeduplication")(AudioDeduplication.asInstanceOf[js.Any])
    if (Destination != null) __obj.updateDynamic("Destination")(Destination)
    if (DestinationSettings != null) __obj.updateDynamic("DestinationSettings")(DestinationSettings)
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (!js.isUndefined(FragmentLength)) __obj.updateDynamic("FragmentLength")(FragmentLength)
    if (ManifestEncoding != null) __obj.updateDynamic("ManifestEncoding")(ManifestEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsSmoothGroupSettings]
  }
}

