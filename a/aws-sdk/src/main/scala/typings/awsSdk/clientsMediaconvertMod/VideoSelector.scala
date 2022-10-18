package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoSelector extends StObject {
  
  /**
    * Ignore this setting unless this input is a QuickTime animation with an alpha channel. Use this setting to create separate Key and Fill outputs. In each output, specify which part of the input MediaConvert uses. Leave this setting at the default value DISCARD to delete the alpha channel and preserve the video. Set it to REMAP_TO_LUMA to delete the video and map the alpha channel to the luma channel of your outputs.
    */
  var AlphaBehavior: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.AlphaBehavior] = js.undefined
  
  /**
    * If your input video has accurate color space metadata, or if you don't know about color space, leave this set to the default value Follow (FOLLOW). The service will automatically detect your input color space. If your input video has metadata indicating the wrong color space, specify the accurate color space here. If your input video is HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't present in your video stream, or if that metadata is present but not accurate, choose Force HDR 10 (FORCE_HDR10) here and specify correct values in the input HDR 10 metadata (Hdr10Metadata) settings. For more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
    */
  var ColorSpace: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.ColorSpace] = js.undefined
  
  /**
    * There are two sources for color metadata, the input file and the job input settings Color space (ColorSpace) and HDR master display information settings(Hdr10Metadata). The Color space usage setting determines which takes precedence. Choose Force (FORCE) to use color metadata from the input job settings. If you don't specify values for those settings, the service defaults to using metadata from your input. FALLBACK - Choose Fallback (FALLBACK) to use color metadata from the source when it is present. If there's no color metadata in your input file, the service defaults to using values you specify in the input settings.
    */
  var ColorSpaceUsage: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.ColorSpaceUsage] = js.undefined
  
  /**
    * Set Embedded timecode override (embeddedTimecodeOverride) to Use MDPM (USE_MDPM) when your AVCHD input contains timecode tag data in the Modified Digital Video Pack Metadata (MDPM). When you do, we recommend you also set Timecode source (inputTimecodeSource) to Embedded (EMBEDDED). Leave Embedded timecode override blank, or set to None (NONE), when your input does not contain MDPM timecode.
    */
  var EmbeddedTimecodeOverride: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.EmbeddedTimecodeOverride] = js.undefined
  
  /**
    * Use these settings to provide HDR 10 metadata that is missing or inaccurate in your input video. Appropriate values vary depending on the input video and must be provided by a color grader. The color grader generates these values during the HDR 10 mastering process. The valid range for each of these settings is 0 to 50,000. Each increment represents 0.00002 in CIE1931 color coordinate. Related settings - When you specify these values, you must also set Color space (ColorSpace) to HDR 10 (HDR10). To specify whether the the values you specify here take precedence over the values in the metadata of your input file, set Color space usage (ColorSpaceUsage). To specify whether color metadata is included in an output, set Color metadata (ColorMetadata). For more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
    */
  var Hdr10Metadata: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.Hdr10Metadata] = js.undefined
  
  /**
    * Use this setting if your input has video and audio durations that don't align, and your output or player has strict alignment requirements. Examples: Input audio track has a delayed start. Input video track ends before audio ends. When you set Pad video (padVideo) to Black (BLACK), MediaConvert generates black video frames so that output video and audio durations match. Black video frames are added at the beginning or end, depending on your input. To keep the default behavior and not generate black video, set Pad video to Disabled (DISABLED) or leave blank.
    */
  var PadVideo: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.PadVideo] = js.undefined
  
  /**
    * Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the system automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or packet identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
    */
  var Pid: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not currently supported.
    */
  var ProgramNumber: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.undefined
  
  /**
    * Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation or specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input video container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the service rotate your video according to the rotation specified in the metadata. The rotation must be within one degree of 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service will default to no rotation. By default, the service does no rotation, even if your input video has rotation metadata. The service doesn't pass through rotation metadata.
    */
  var Rotate: js.UndefOr[InputRotate] = js.undefined
  
  /**
    * If the sample range metadata in your input video is accurate, or if you don't know about sample range, keep the default value, Follow (FOLLOW), for this setting. When you do, the service automatically detects your input sample range. If your input video has metadata indicating the wrong sample range, specify the accurate sample range here. When you do, MediaConvert ignores any sample range information in the input metadata. Regardless of whether MediaConvert uses the input sample range or the sample range that you specify, MediaConvert uses the sample range for transcoding and also writes it to the output metadata.
    */
  var SampleRange: js.UndefOr[InputSampleRange] = js.undefined
}
object VideoSelector {
  
  inline def apply(): VideoSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSelector]
  }
  
  extension [Self <: VideoSelector](x: Self) {
    
    inline def setAlphaBehavior(value: AlphaBehavior): Self = StObject.set(x, "AlphaBehavior", value.asInstanceOf[js.Any])
    
    inline def setAlphaBehaviorUndefined: Self = StObject.set(x, "AlphaBehavior", js.undefined)
    
    inline def setColorSpace(value: ColorSpace): Self = StObject.set(x, "ColorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "ColorSpace", js.undefined)
    
    inline def setColorSpaceUsage(value: ColorSpaceUsage): Self = StObject.set(x, "ColorSpaceUsage", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUsageUndefined: Self = StObject.set(x, "ColorSpaceUsage", js.undefined)
    
    inline def setEmbeddedTimecodeOverride(value: EmbeddedTimecodeOverride): Self = StObject.set(x, "EmbeddedTimecodeOverride", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedTimecodeOverrideUndefined: Self = StObject.set(x, "EmbeddedTimecodeOverride", js.undefined)
    
    inline def setHdr10Metadata(value: Hdr10Metadata): Self = StObject.set(x, "Hdr10Metadata", value.asInstanceOf[js.Any])
    
    inline def setHdr10MetadataUndefined: Self = StObject.set(x, "Hdr10Metadata", js.undefined)
    
    inline def setPadVideo(value: PadVideo): Self = StObject.set(x, "PadVideo", value.asInstanceOf[js.Any])
    
    inline def setPadVideoUndefined: Self = StObject.set(x, "PadVideo", js.undefined)
    
    inline def setPid(value: integerMin1Max2147483647): Self = StObject.set(x, "Pid", value.asInstanceOf[js.Any])
    
    inline def setPidUndefined: Self = StObject.set(x, "Pid", js.undefined)
    
    inline def setProgramNumber(value: integerMinNegative2147483648Max2147483647): Self = StObject.set(x, "ProgramNumber", value.asInstanceOf[js.Any])
    
    inline def setProgramNumberUndefined: Self = StObject.set(x, "ProgramNumber", js.undefined)
    
    inline def setRotate(value: InputRotate): Self = StObject.set(x, "Rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "Rotate", js.undefined)
    
    inline def setSampleRange(value: InputSampleRange): Self = StObject.set(x, "SampleRange", value.asInstanceOf[js.Any])
    
    inline def setSampleRangeUndefined: Self = StObject.set(x, "SampleRange", js.undefined)
  }
}
