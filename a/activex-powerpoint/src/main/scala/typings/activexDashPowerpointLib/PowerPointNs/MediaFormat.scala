package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.MediaFormat")
@js.native
class MediaFormat protected () extends js.Object {
  val Application: Application = js.native
  val AudioCompressionType: java.lang.String = js.native
  val AudioSamplingRate: scala.Double = js.native
  var EndPoint: scala.Double = js.native
  var FadeInDuration: scala.Double = js.native
  var FadeOutDuration: scala.Double = js.native
  val IsEmbedded: scala.Boolean = js.native
  val IsLinked: scala.Boolean = js.native
  val Length: scala.Double = js.native
  val MediaBookmarks: MediaBookmarks = js.native
  var Muted: scala.Boolean = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.MediaFormat_typekey`: MediaFormat = js.native
  val ResamplingStatus: PpMediaTaskStatus = js.native
  val SampleHeight: scala.Double = js.native
  val SampleWidth: scala.Double = js.native
  var StartPoint: scala.Double = js.native
  val VideoCompressionType: java.lang.String = js.native
  val VideoFrameRate: scala.Double = js.native
  var Volume: scala.Double = js.native
  /**
           * @param boolean [Trim=false]
           * @param number [SampleHeight=768]
           * @param number [SampleWidth=1280]
           * @param number [VideoFrameRate=24]
           * @param number [AudioSamplingRate=48000]
           * @param number [VideoBitRate=7000000]
           */
  def Resample(
    Trim: js.UndefOr[scala.Boolean],
    SampleHeight: js.UndefOr[scala.Double],
    SampleWidth: js.UndefOr[scala.Double],
    VideoFrameRate: js.UndefOr[scala.Double],
    AudioSamplingRate: js.UndefOr[scala.Double],
    VideoBitRate: js.UndefOr[scala.Double]
  ): scala.Unit = js.native
  /** @param PowerPoint.PpResampleMediaProfile [profile=2] */
  def ResampleFromProfile(): scala.Unit = js.native
  /** @param PowerPoint.PpResampleMediaProfile [profile=2] */
  def ResampleFromProfile(profile: PpResampleMediaProfile): scala.Unit = js.native
  def SetDisplayPicture(Position: scala.Double): scala.Unit = js.native
  def SetDisplayPictureFromFile(FilePath: java.lang.String): scala.Unit = js.native
}

