package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Playlist extends StObject {
  
  /**
    * The format of the output playlist. Valid formats include HLSv3, HLSv4, and Smooth.
    */
  var Format: js.UndefOr[PlaylistFormat] = js.undefined
  
  /**
    * The HLS content protection settings, if any, that you want Elastic Transcoder to apply to the output files associated with this playlist.
    */
  var HlsContentProtection: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.HlsContentProtection] = js.undefined
  
  /**
    * The name that you want Elastic Transcoder to assign to the master playlist, for example, nyc-vacation.m3u8. If the name includes a / character, the section of the name before the last / must be identical for all Name objects. If you create more than one master playlist, the values of all Name objects must be unique.  Elastic Transcoder automatically appends the relevant file extension to the file name (.m3u8 for HLSv3 and HLSv4 playlists, and .ism and .ismc for Smooth playlists). If you include a file extension in Name, the file name will have two extensions. 
    */
  var Name: js.UndefOr[Filename] = js.undefined
  
  /**
    * For each output in this job that you want to include in a master playlist, the value of the Outputs:Key object.   If your output is not HLS or does not have a segment duration set, the name of the output file is a concatenation of OutputKeyPrefix and Outputs:Key: OutputKeyPrefixOutputs:Key    If your output is HLSv3 and has a segment duration set, or is not included in a playlist, Elastic Transcoder creates an output playlist file with a file extension of .m3u8, and a series of .ts files that include a five-digit sequential counter beginning with 00000: OutputKeyPrefixOutputs:Key.m3u8 OutputKeyPrefixOutputs:Key00000.ts   If your output is HLSv4, has a segment duration set, and is included in an HLSv4 playlist, Elastic Transcoder creates an output playlist file with a file extension of _v4.m3u8. If the output is video, Elastic Transcoder also creates an output file with an extension of _iframe.m3u8: OutputKeyPrefixOutputs:Key_v4.m3u8 OutputKeyPrefixOutputs:Key_iframe.m3u8 OutputKeyPrefixOutputs:Key.ts   Elastic Transcoder automatically appends the relevant file extension to the file name. If you include a file extension in Output Key, the file name will have two extensions. If you include more than one output in a playlist, any segment duration settings, clip settings, or caption settings must be the same for all outputs in the playlist. For Smooth playlists, the Audio:Profile, Video:Profile, and Video:FrameRate to Video:KeyframesMaxDist ratio must be the same for all outputs.
    */
  var OutputKeys: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.OutputKeys] = js.undefined
  
  /**
    * The DRM settings, if any, that you want Elastic Transcoder to apply to the output files associated with this playlist.
    */
  var PlayReadyDrm: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.PlayReadyDrm] = js.undefined
  
  /**
    * The status of the job with which the playlist is associated.
    */
  var Status: js.UndefOr[JobStatus] = js.undefined
  
  /**
    * Information that further explains the status.
    */
  var StatusDetail: js.UndefOr[Description] = js.undefined
}
object Playlist {
  
  inline def apply(): Playlist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Playlist]
  }
  
  extension [Self <: Playlist](x: Self) {
    
    inline def setFormat(value: PlaylistFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setHlsContentProtection(value: HlsContentProtection): Self = StObject.set(x, "HlsContentProtection", value.asInstanceOf[js.Any])
    
    inline def setHlsContentProtectionUndefined: Self = StObject.set(x, "HlsContentProtection", js.undefined)
    
    inline def setName(value: Filename): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutputKeys(value: OutputKeys): Self = StObject.set(x, "OutputKeys", value.asInstanceOf[js.Any])
    
    inline def setOutputKeysUndefined: Self = StObject.set(x, "OutputKeys", js.undefined)
    
    inline def setOutputKeysVarargs(value: Key*): Self = StObject.set(x, "OutputKeys", js.Array(value*))
    
    inline def setPlayReadyDrm(value: PlayReadyDrm): Self = StObject.set(x, "PlayReadyDrm", value.asInstanceOf[js.Any])
    
    inline def setPlayReadyDrmUndefined: Self = StObject.set(x, "PlayReadyDrm", js.undefined)
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetail(value: Description): Self = StObject.set(x, "StatusDetail", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailUndefined: Self = StObject.set(x, "StatusDetail", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
