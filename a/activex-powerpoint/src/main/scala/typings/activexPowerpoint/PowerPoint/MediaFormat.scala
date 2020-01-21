package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.MediaFormat")
@js.native
class MediaFormat protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val AudioCompressionType: String = js.native
  val AudioSamplingRate: Double = js.native
  var EndPoint: Double = js.native
  var FadeInDuration: Double = js.native
  var FadeOutDuration: Double = js.native
  val IsEmbedded: Boolean = js.native
  val IsLinked: Boolean = js.native
  val Length: Double = js.native
  val MediaBookmarks: typings.activexPowerpoint.PowerPoint.MediaBookmarks = js.native
  var Muted: Boolean = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.MediaFormat_typekey")
  var PowerPointDotMediaFormat_typekey: MediaFormat = js.native
  val ResamplingStatus: PpMediaTaskStatus = js.native
  val SampleHeight: Double = js.native
  val SampleWidth: Double = js.native
  var StartPoint: Double = js.native
  val VideoCompressionType: String = js.native
  val VideoFrameRate: Double = js.native
  var Volume: Double = js.native
  /**
    * @param boolean [Trim=false]
    * @param number [SampleHeight=768]
    * @param number [SampleWidth=1280]
    * @param number [VideoFrameRate=24]
    * @param number [AudioSamplingRate=48000]
    * @param number [VideoBitRate=7000000]
    */
  def Resample(
    Trim: js.UndefOr[Boolean],
    SampleHeight: js.UndefOr[Double],
    SampleWidth: js.UndefOr[Double],
    VideoFrameRate: js.UndefOr[Double],
    AudioSamplingRate: js.UndefOr[Double],
    VideoBitRate: js.UndefOr[Double]
  ): Unit = js.native
  /** @param PowerPoint.PpResampleMediaProfile [profile=2] */
  def ResampleFromProfile(): Unit = js.native
  def ResampleFromProfile(profile: PpResampleMediaProfile): Unit = js.native
  def SetDisplayPicture(Position: Double): Unit = js.native
  def SetDisplayPictureFromFile(FilePath: String): Unit = js.native
}

