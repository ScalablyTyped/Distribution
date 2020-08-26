package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResampleMediaTask extends js.Object {
  val AudioCompressionType: String = js.native
  val AudioSamplingRate: Double = js.native
  val ContainerType: String = js.native
  val IsEmbedded: Boolean = js.native
  val IsLinked: Boolean = js.native
  @JSName("PowerPoint.ResampleMediaTask_typekey")
  var PowerPointDotResampleMediaTask_typekey: ResampleMediaTask = js.native
  val SampleHeight: Double = js.native
  val SampleWidth: Double = js.native
  val Shape: typings.activexPowerpoint.PowerPoint.Shape = js.native
  val VideoCompressionType: String = js.native
  val VideoFrameRate: Double = js.native
  val profile: PpResampleMediaProfile = js.native
}

object ResampleMediaTask {
  @scala.inline
  def apply(
    AudioCompressionType: String,
    AudioSamplingRate: Double,
    ContainerType: String,
    IsEmbedded: Boolean,
    IsLinked: Boolean,
    PowerPointDotResampleMediaTask_typekey: ResampleMediaTask,
    SampleHeight: Double,
    SampleWidth: Double,
    Shape: Shape,
    VideoCompressionType: String,
    VideoFrameRate: Double,
    profile: PpResampleMediaProfile
  ): ResampleMediaTask = {
    val __obj = js.Dynamic.literal(AudioCompressionType = AudioCompressionType.asInstanceOf[js.Any], AudioSamplingRate = AudioSamplingRate.asInstanceOf[js.Any], ContainerType = ContainerType.asInstanceOf[js.Any], IsEmbedded = IsEmbedded.asInstanceOf[js.Any], IsLinked = IsLinked.asInstanceOf[js.Any], SampleHeight = SampleHeight.asInstanceOf[js.Any], SampleWidth = SampleWidth.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], VideoCompressionType = VideoCompressionType.asInstanceOf[js.Any], VideoFrameRate = VideoFrameRate.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ResampleMediaTask_typekey")(PowerPointDotResampleMediaTask_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResampleMediaTask]
  }
  @scala.inline
  implicit class ResampleMediaTaskOps[Self <: ResampleMediaTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudioCompressionType(value: String): Self = this.set("AudioCompressionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudioSamplingRate(value: Double): Self = this.set("AudioSamplingRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerType(value: String): Self = this.set("ContainerType", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEmbedded(value: Boolean): Self = this.set("IsEmbedded", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLinked(value: Boolean): Self = this.set("IsLinked", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotResampleMediaTask_typekey(value: ResampleMediaTask): Self = this.set("PowerPoint.ResampleMediaTask_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSampleHeight(value: Double): Self = this.set("SampleHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setSampleWidth(value: Double): Self = this.set("SampleWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape(value: Shape): Self = this.set("Shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoCompressionType(value: String): Self = this.set("VideoCompressionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoFrameRate(value: Double): Self = this.set("VideoFrameRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfile(value: PpResampleMediaProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
  }
  
}

