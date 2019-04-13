package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSourceSettings extends js.Object {
  /**
    * If set to UPCONVERT, 608 caption data is both passed through via the "608 compatibility bytes" fields of the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
    */
  var Convert608To708: js.UndefOr[FileSourceConvert608To708] = js.undefined
  /**
    * External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp', 'stl', 'srt', and 'smi'.
    */
  var SourceFile: js.UndefOr[__stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTSmiSMI] = js.undefined
  /**
    * Specifies a time delta in seconds to offset the captions from the source file.
    */
  var TimeDelta: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
}

object FileSourceSettings {
  @scala.inline
  def apply(
    Convert608To708: FileSourceConvert608To708 = null,
    SourceFile: __stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTSmiSMI = null,
    TimeDelta: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
  ): FileSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (Convert608To708 != null) __obj.updateDynamic("Convert608To708")(Convert608To708.asInstanceOf[js.Any])
    if (SourceFile != null) __obj.updateDynamic("SourceFile")(SourceFile)
    if (!js.isUndefined(TimeDelta)) __obj.updateDynamic("TimeDelta")(TimeDelta)
    __obj.asInstanceOf[FileSourceSettings]
  }
}

