package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  /**
    * Specifies set of audio selectors within an input to combine. An input may have multiple audio selector groups. See "Audio Selector Group":#inputs-audio_selector_group for more information.
    */
  var AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup] = js.undefined
  /**
    * Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use in your outputs. You can use mutiple Audio selectors per input.
    */
  var AudioSelectors: js.UndefOr[__mapOfAudioSelector] = js.undefined
  /**
    * Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use in your outputs. You can use mutiple captions selectors per input.
    */
  var CaptionSelectors: js.UndefOr[__mapOfCaptionSelector] = js.undefined
  /**
    * Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only manaully controllable for MPEG2 and uncompressed video inputs.
    */
  var DeblockFilter: js.UndefOr[InputDeblockFilter] = js.undefined
  /**
    * Settings for decrypting any input files that you encrypt before you upload them to Amazon S3. MediaConvert can decrypt files only when you use AWS Key Management Service (KMS) to encrypt the data key that you use to encrypt your content.
    */
  var DecryptionSettings: js.UndefOr[InputDecryptionSettings] = js.undefined
  /**
    * Enable Denoise (InputDenoiseFilter) to filter noise from the input.  Default is disabled. Only applicable to MPEG2, H.264, H.265, and uncompressed video inputs.
    */
  var DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.undefined
  /**
    * Specify the source file for your transcoding job. You can use multiple inputs in a single job. The service concatenates these inputs, in the order that you specify them in the job, to create the outputs. If your input format is IMF, specify your input by providing the path to your CPL. For example, "s3://bucket/vf/cpl.xml". If the CPL is in an incomplete IMP, make sure to use *Supplemental IMPs* (SupplementalImps) to specify any supplemental IMPs that contain assets referenced by the CPL.
    */
  var FileInput: js.UndefOr[
    __stringPatternS3MM2VVMMPPEEGGAAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLL
  ] = js.undefined
  /**
    * Use Filter enable (InputFilterEnable) to specify how the transcoding service applies the denoise and deblock filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is filtered regardless of input type.
    */
  var FilterEnable: js.UndefOr[InputFilterEnable] = js.undefined
  /**
    * Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and Denoise). The range is -5 to 5. Default is 0.
    */
  var FilterStrength: js.UndefOr[__integerMinNegative5Max5] = js.undefined
  /**
    * Enable the image inserter feature to include a graphic overlay on your video. Enable or disable this feature for each input individually. This setting is disabled by default.
    */
  var ImageInserter: js.UndefOr[ImageInserter] = js.undefined
  /**
    * (InputClippings) contains sets of start and end times that together specify a portion of the input to be used in the outputs. If you provide only a start time, the clip will be the entire input from that point to the end. If you provide only an end time, it will be the entire input up to that point. When you specify more than one input clip, the transcoding service creates the job outputs by stringing the clips together in the order you specify them.
    */
  var InputClippings: js.UndefOr[__listOfInputClipping] = js.undefined
  /**
    * Use Program (programNumber) to select a specific program from within a multi-program transport stream. Note that Quad 4K is not currently supported. Default is the first program within the transport stream. If the program you specify doesn't exist, the transcoding service will use this default.
    */
  var ProgramNumber: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to scans. * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
    */
  var PsiControl: js.UndefOr[InputPsiControl] = js.undefined
  /**
    * Provide a list of any necessary supplemental IMPs. You need supplemental IMPs if the CPL that you're using for your input is in an incomplete IMP. Specify either the supplemental IMP directories with a trailing slash or the ASSETMAP.xml files. For example ["s3://bucket/ov/", "s3://bucket/vf2/ASSETMAP.xml"]. You don't need to specify the IMP that contains your input CPL, because the service automatically detects it.
    */
  var SupplementalImps: js.UndefOr[__listOf__stringPatternS3ASSETMAPXml] = js.undefined
  /**
    * Timecode source under input settings (InputTimecodeSource) only affects the behavior of features that apply to a single input at a time, such as input clipping and synchronizing some captions formats. Use this setting to specify whether the service counts frames by timecodes embedded in the video (EMBEDDED) or by starting the first frame at zero (ZEROBASED). In both cases, the timecode format is HH:MM:SS:FF or HH:MM:SS;FF, where FF is the frame number. Only set this to EMBEDDED if your source video has embedded timecodes.
    */
  var TimecodeSource: js.UndefOr[InputTimecodeSource] = js.undefined
  /**
    * Selector for video.
    */
  var VideoSelector: js.UndefOr[VideoSelector] = js.undefined
}

object Input {
  @scala.inline
  def apply(
    AudioSelectorGroups: __mapOfAudioSelectorGroup = null,
    AudioSelectors: __mapOfAudioSelector = null,
    CaptionSelectors: __mapOfCaptionSelector = null,
    DeblockFilter: InputDeblockFilter = null,
    DecryptionSettings: InputDecryptionSettings = null,
    DenoiseFilter: InputDenoiseFilter = null,
    FileInput: __stringPatternS3MM2VVMMPPEEGGAAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLL = null,
    FilterEnable: InputFilterEnable = null,
    FilterStrength: js.UndefOr[__integerMinNegative5Max5] = js.undefined,
    ImageInserter: ImageInserter = null,
    InputClippings: __listOfInputClipping = null,
    ProgramNumber: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    PsiControl: InputPsiControl = null,
    SupplementalImps: __listOf__stringPatternS3ASSETMAPXml = null,
    TimecodeSource: InputTimecodeSource = null,
    VideoSelector: VideoSelector = null
  ): Input = {
    val __obj = js.Dynamic.literal()
    if (AudioSelectorGroups != null) __obj.updateDynamic("AudioSelectorGroups")(AudioSelectorGroups)
    if (AudioSelectors != null) __obj.updateDynamic("AudioSelectors")(AudioSelectors)
    if (CaptionSelectors != null) __obj.updateDynamic("CaptionSelectors")(CaptionSelectors)
    if (DeblockFilter != null) __obj.updateDynamic("DeblockFilter")(DeblockFilter.asInstanceOf[js.Any])
    if (DecryptionSettings != null) __obj.updateDynamic("DecryptionSettings")(DecryptionSettings)
    if (DenoiseFilter != null) __obj.updateDynamic("DenoiseFilter")(DenoiseFilter.asInstanceOf[js.Any])
    if (FileInput != null) __obj.updateDynamic("FileInput")(FileInput)
    if (FilterEnable != null) __obj.updateDynamic("FilterEnable")(FilterEnable.asInstanceOf[js.Any])
    if (!js.isUndefined(FilterStrength)) __obj.updateDynamic("FilterStrength")(FilterStrength)
    if (ImageInserter != null) __obj.updateDynamic("ImageInserter")(ImageInserter)
    if (InputClippings != null) __obj.updateDynamic("InputClippings")(InputClippings)
    if (!js.isUndefined(ProgramNumber)) __obj.updateDynamic("ProgramNumber")(ProgramNumber)
    if (PsiControl != null) __obj.updateDynamic("PsiControl")(PsiControl.asInstanceOf[js.Any])
    if (SupplementalImps != null) __obj.updateDynamic("SupplementalImps")(SupplementalImps)
    if (TimecodeSource != null) __obj.updateDynamic("TimecodeSource")(TimecodeSource.asInstanceOf[js.Any])
    if (VideoSelector != null) __obj.updateDynamic("VideoSelector")(VideoSelector)
    __obj.asInstanceOf[Input]
  }
}

