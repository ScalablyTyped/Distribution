package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MsSmoothGroupSettings extends StObject {
  
  /**
    * By default, the service creates one .ism Microsoft Smooth Streaming manifest for each Microsoft Smooth Streaming output group in your job. This default manifest references every output in the output group. To create additional manifests that reference a subset of the outputs in the output group, specify a list of them here.
    */
  var AdditionalManifests: js.UndefOr[listOfMsSmoothAdditionalManifest] = js.undefined
  
  /**
    * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output group into a single audio stream.
    */
  var AudioDeduplication: js.UndefOr[MsSmoothAudioDeduplication] = js.undefined
  
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[stringPatternS3] = js.undefined
  
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.DestinationSettings] = js.undefined
  
  /**
    * If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.
    */
  var Encryption: js.UndefOr[MsSmoothEncryptionSettings] = js.undefined
  
  /**
    * Specify how you want MediaConvert to determine the fragment length. Choose Exact (EXACT) to have the encoder use the exact length that you specify with the setting Fragment length (FragmentLength). This might result in extra I-frames. Choose Multiple of GOP (GOP_MULTIPLE) to have the encoder round up the segment lengths to match the next GOP boundary.
    */
  var FragmentLength: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Specify how you want MediaConvert to determine the fragment length. Choose Exact (EXACT) to have the encoder use the exact length that you specify with the setting Fragment length (FragmentLength). This might result in extra I-frames. Choose Multiple of GOP (GOP_MULTIPLE) to have the encoder round up the segment lengths to match the next GOP boundary.
    */
  var FragmentLengthControl: js.UndefOr[MsSmoothFragmentLengthControl] = js.undefined
  
  /**
    * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client manifest. Valid options are utf8 and utf16.
    */
  var ManifestEncoding: js.UndefOr[MsSmoothManifestEncoding] = js.undefined
}
object MsSmoothGroupSettings {
  
  inline def apply(): MsSmoothGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsSmoothGroupSettings]
  }
  
  extension [Self <: MsSmoothGroupSettings](x: Self) {
    
    inline def setAdditionalManifests(value: listOfMsSmoothAdditionalManifest): Self = StObject.set(x, "AdditionalManifests", value.asInstanceOf[js.Any])
    
    inline def setAdditionalManifestsUndefined: Self = StObject.set(x, "AdditionalManifests", js.undefined)
    
    inline def setAdditionalManifestsVarargs(value: MsSmoothAdditionalManifest*): Self = StObject.set(x, "AdditionalManifests", js.Array(value*))
    
    inline def setAudioDeduplication(value: MsSmoothAudioDeduplication): Self = StObject.set(x, "AudioDeduplication", value.asInstanceOf[js.Any])
    
    inline def setAudioDeduplicationUndefined: Self = StObject.set(x, "AudioDeduplication", js.undefined)
    
    inline def setDestination(value: stringPatternS3): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationSettings(value: DestinationSettings): Self = StObject.set(x, "DestinationSettings", value.asInstanceOf[js.Any])
    
    inline def setDestinationSettingsUndefined: Self = StObject.set(x, "DestinationSettings", js.undefined)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setEncryption(value: MsSmoothEncryptionSettings): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setFragmentLength(value: integerMin1Max2147483647): Self = StObject.set(x, "FragmentLength", value.asInstanceOf[js.Any])
    
    inline def setFragmentLengthControl(value: MsSmoothFragmentLengthControl): Self = StObject.set(x, "FragmentLengthControl", value.asInstanceOf[js.Any])
    
    inline def setFragmentLengthControlUndefined: Self = StObject.set(x, "FragmentLengthControl", js.undefined)
    
    inline def setFragmentLengthUndefined: Self = StObject.set(x, "FragmentLength", js.undefined)
    
    inline def setManifestEncoding(value: MsSmoothManifestEncoding): Self = StObject.set(x, "ManifestEncoding", value.asInstanceOf[js.Any])
    
    inline def setManifestEncodingUndefined: Self = StObject.set(x, "ManifestEncoding", js.undefined)
  }
}
