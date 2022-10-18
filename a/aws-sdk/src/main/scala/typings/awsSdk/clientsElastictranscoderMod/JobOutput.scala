package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobOutput extends StObject {
  
  /**
    * The album art to be associated with the output file, if any.
    */
  var AlbumArt: js.UndefOr[JobAlbumArt] = js.undefined
  
  /**
    * If Elastic Transcoder used a preset with a ColorSpaceConversionMode to transcode the output file, the AppliedColorSpaceConversion parameter shows the conversion used. If no ColorSpaceConversionMode was defined in the preset, this parameter is not be included in the job response.
    */
  var AppliedColorSpaceConversion: js.UndefOr[String] = js.undefined
  
  /**
    * You can configure Elastic Transcoder to transcode captions, or subtitles, from one format to another. All captions must be in UTF-8. Elastic Transcoder supports two types of captions:    Embedded: Embedded captions are included in the same file as the audio and video. Elastic Transcoder supports only one embedded caption per language, to a maximum of 300 embedded captions per file. Valid input values include: CEA-608 (EIA-608, first non-empty channel only), CEA-708 (EIA-708, first non-empty channel only), and mov-text  Valid outputs include: mov-text  Elastic Transcoder supports a maximum of one embedded format per output.    Sidecar: Sidecar captions are kept in a separate metadata file from the audio and video data. Sidecar captions require a player that is capable of understanding the relationship between the video file and the sidecar file. Elastic Transcoder supports only one sidecar caption per language, to a maximum of 20 sidecar captions per file. Valid input values include: dfxp (first div element only), ebu-tt, scc, smpt, srt, ttml (first div element only), and webvtt  Valid outputs include: dfxp (first div element only), scc, srt, and webvtt.   If you want ttml or smpte-tt compatible captions, specify dfxp as your output format. Elastic Transcoder does not support OCR (Optical Character Recognition), does not accept pictures as a valid input for captions, and is not available for audio-only transcoding. Elastic Transcoder does not preserve text formatting (for example, italics) during the transcoding process. To remove captions or leave the captions empty, set Captions to null. To pass through existing captions unchanged, set the MergePolicy to MergeRetain, and pass in a null CaptionSources array. For more information on embedded files, see the Subtitles Wikipedia page. For more information on sidecar files, see the Extensible Metadata Platform and Sidecar file Wikipedia pages.
    */
  var Captions: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.Captions] = js.undefined
  
  /**
    * You can create an output file that contains an excerpt from the input file. This excerpt, called a clip, can come from the beginning, middle, or end of the file. The Composition object contains settings for the clips that make up an output file. For the current release, you can only specify settings for a single clip per output file. The Composition object cannot be null.
    */
  var Composition: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.Composition] = js.undefined
  
  /**
    * Duration of the output file, in seconds.
    */
  var Duration: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * Duration of the output file, in milliseconds.
    */
  var DurationMillis: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * The encryption settings, if any, that you want Elastic Transcoder to apply to your output files. If you choose to use encryption, you must specify a mode to use. If you choose not to use encryption, Elastic Transcoder writes an unencrypted file to your Amazon S3 bucket.
    */
  var Encryption: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.Encryption] = js.undefined
  
  /**
    * File size of the output file, in bytes.
    */
  var FileSize: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * Frame rate of the output file, in frames per second.
    */
  var FrameRate: js.UndefOr[FloatString] = js.undefined
  
  /**
    * Height of the output file, in pixels.
    */
  var Height: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * A sequential counter, starting with 1, that identifies an output among the outputs from the current job. In the Output syntax, this value is always 1.
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    *  The name to assign to the transcoded file. Elastic Transcoder saves the file in the Amazon S3 bucket specified by the OutputBucket object in the pipeline that is specified by the pipeline ID.
    */
  var Key: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.Key] = js.undefined
  
  /**
    * The value of the Id object for the preset that you want to use for this job. The preset determines the audio, video, and thumbnail settings that Elastic Transcoder uses for transcoding. To use a preset that you created, specify the preset ID that Elastic Transcoder returned in the response when you created the preset. You can also use the Elastic Transcoder system presets, which you can get with ListPresets.
    */
  var PresetId: js.UndefOr[Id] = js.undefined
  
  /**
    * The number of degrees clockwise by which you want Elastic Transcoder to rotate the output relative to the input. Enter one of the following values:  auto, 0, 90, 180, 270   The value auto generally works only if the file that you're transcoding contains rotation metadata.
    */
  var Rotate: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.Rotate] = js.undefined
  
  /**
    *  (Outputs in Fragmented MP4 or MPEG-TS format only.  If you specify a preset in PresetId for which the value of Container is fmp4 (Fragmented MP4) or ts (MPEG-TS), SegmentDuration is the target maximum duration of each segment in seconds. For HLSv3 format playlists, each media segment is stored in a separate .ts file. For HLSv4, MPEG-DASH, and Smooth playlists, all media segments for an output are stored in a single file. Each segment is approximately the length of the SegmentDuration, though individual segments might be shorter or longer. The range of valid values is 1 to 60 seconds. If the duration of the video is not evenly divisible by SegmentDuration, the duration of the last segment is the remainder of total length/SegmentDuration. Elastic Transcoder creates an output-specific playlist for each output HLS output that you specify in OutputKeys. To add an output to the master playlist for this job, include it in the OutputKeys of the associated playlist.
    */
  var SegmentDuration: js.UndefOr[FloatString] = js.undefined
  
  /**
    *  The status of one output in a job. If you specified only one output for the job, Outputs:Status is always the same as Job:Status. If you specified more than one output:     Job:Status and Outputs:Status for all of the outputs is Submitted until Elastic Transcoder starts to process the first output.   When Elastic Transcoder starts to process the first output, Outputs:Status for that output and Job:Status both change to Progressing. For each output, the value of Outputs:Status remains Submitted until Elastic Transcoder starts to process the output.   Job:Status remains Progressing until all of the outputs reach a terminal status, either Complete or Error.   When all of the outputs reach a terminal status, Job:Status changes to Complete only if Outputs:Status for all of the outputs is Complete. If Outputs:Status for one or more outputs is Error, the terminal status for Job:Status is also Error.   The value of Status is one of the following: Submitted, Progressing, Complete, Canceled, or Error. 
    */
  var Status: js.UndefOr[JobStatus] = js.undefined
  
  /**
    * Information that further explains Status.
    */
  var StatusDetail: js.UndefOr[Description] = js.undefined
  
  /**
    * The encryption settings, if any, that you want Elastic Transcoder to apply to your thumbnail.
    */
  var ThumbnailEncryption: js.UndefOr[Encryption] = js.undefined
  
  /**
    * Whether you want Elastic Transcoder to create thumbnails for your videos and, if so, how you want Elastic Transcoder to name the files. If you don't want Elastic Transcoder to create thumbnails, specify "". If you do want Elastic Transcoder to create thumbnails, specify the information that you want to include in the file name for each thumbnail. You can specify the following values in any sequence:     {count} (Required): If you want to create thumbnails, you must include {count} in the ThumbnailPattern object. Wherever you specify {count}, Elastic Transcoder adds a five-digit sequence number (beginning with 00001) to thumbnail file names. The number indicates where a given thumbnail appears in the sequence of thumbnails for a transcoded file.   If you specify a literal value and/or {resolution} but you omit {count}, Elastic Transcoder returns a validation error and does not create the job.     Literal values (Optional): You can specify literal values anywhere in the ThumbnailPattern object. For example, you can include them as a file name prefix or as a delimiter between {resolution} and {count}.      {resolution} (Optional): If you want Elastic Transcoder to include the resolution in the file name, include {resolution} in the ThumbnailPattern object.    When creating thumbnails, Elastic Transcoder automatically saves the files in the format (.jpg or .png) that appears in the preset that you specified in the PresetID value of CreateJobOutput. Elastic Transcoder also appends the applicable file name extension.
    */
  var ThumbnailPattern: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.ThumbnailPattern] = js.undefined
  
  /**
    * Information about the watermarks that you want Elastic Transcoder to add to the video during transcoding. You can specify up to four watermarks for each output. Settings for each watermark must be defined in the preset that you specify in Preset for the current output. Watermarks are added to the output video in the sequence in which you list them in the job output—the first watermark in the list is added to the output video first, the second watermark in the list is added next, and so on. As a result, if the settings in a preset cause Elastic Transcoder to place all watermarks in the same location, the second watermark that you add covers the first one, the third one covers the second, and the fourth one covers the third.
    */
  var Watermarks: js.UndefOr[JobWatermarks] = js.undefined
  
  /**
    * Specifies the width of the output file in pixels.
    */
  var Width: js.UndefOr[NullableInteger] = js.undefined
}
object JobOutput {
  
  inline def apply(): JobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobOutput]
  }
  
  extension [Self <: JobOutput](x: Self) {
    
    inline def setAlbumArt(value: JobAlbumArt): Self = StObject.set(x, "AlbumArt", value.asInstanceOf[js.Any])
    
    inline def setAlbumArtUndefined: Self = StObject.set(x, "AlbumArt", js.undefined)
    
    inline def setAppliedColorSpaceConversion(value: String): Self = StObject.set(x, "AppliedColorSpaceConversion", value.asInstanceOf[js.Any])
    
    inline def setAppliedColorSpaceConversionUndefined: Self = StObject.set(x, "AppliedColorSpaceConversion", js.undefined)
    
    inline def setCaptions(value: Captions): Self = StObject.set(x, "Captions", value.asInstanceOf[js.Any])
    
    inline def setCaptionsUndefined: Self = StObject.set(x, "Captions", js.undefined)
    
    inline def setComposition(value: Composition): Self = StObject.set(x, "Composition", value.asInstanceOf[js.Any])
    
    inline def setCompositionUndefined: Self = StObject.set(x, "Composition", js.undefined)
    
    inline def setCompositionVarargs(value: Clip*): Self = StObject.set(x, "Composition", js.Array(value*))
    
    inline def setDuration(value: NullableLong): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationMillis(value: NullableLong): Self = StObject.set(x, "DurationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisUndefined: Self = StObject.set(x, "DurationMillis", js.undefined)
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setEncryption(value: Encryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setFileSize(value: NullableLong): Self = StObject.set(x, "FileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "FileSize", js.undefined)
    
    inline def setFrameRate(value: FloatString): Self = StObject.set(x, "FrameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "FrameRate", js.undefined)
    
    inline def setHeight(value: NullableInteger): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setPresetId(value: Id): Self = StObject.set(x, "PresetId", value.asInstanceOf[js.Any])
    
    inline def setPresetIdUndefined: Self = StObject.set(x, "PresetId", js.undefined)
    
    inline def setRotate(value: Rotate): Self = StObject.set(x, "Rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "Rotate", js.undefined)
    
    inline def setSegmentDuration(value: FloatString): Self = StObject.set(x, "SegmentDuration", value.asInstanceOf[js.Any])
    
    inline def setSegmentDurationUndefined: Self = StObject.set(x, "SegmentDuration", js.undefined)
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetail(value: Description): Self = StObject.set(x, "StatusDetail", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailUndefined: Self = StObject.set(x, "StatusDetail", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setThumbnailEncryption(value: Encryption): Self = StObject.set(x, "ThumbnailEncryption", value.asInstanceOf[js.Any])
    
    inline def setThumbnailEncryptionUndefined: Self = StObject.set(x, "ThumbnailEncryption", js.undefined)
    
    inline def setThumbnailPattern(value: ThumbnailPattern): Self = StObject.set(x, "ThumbnailPattern", value.asInstanceOf[js.Any])
    
    inline def setThumbnailPatternUndefined: Self = StObject.set(x, "ThumbnailPattern", js.undefined)
    
    inline def setWatermarks(value: JobWatermarks): Self = StObject.set(x, "Watermarks", value.asInstanceOf[js.Any])
    
    inline def setWatermarksUndefined: Self = StObject.set(x, "Watermarks", js.undefined)
    
    inline def setWatermarksVarargs(value: JobWatermark*): Self = StObject.set(x, "Watermarks", js.Array(value*))
    
    inline def setWidth(value: NullableInteger): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}
