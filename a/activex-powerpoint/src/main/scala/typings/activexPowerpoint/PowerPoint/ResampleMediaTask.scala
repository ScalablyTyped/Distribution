package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResampleMediaTask extends StObject {
  
  val AudioCompressionType: String
  
  val AudioSamplingRate: Double
  
  val ContainerType: String
  
  val IsEmbedded: Boolean
  
  val IsLinked: Boolean
  
  @JSName("PowerPoint.ResampleMediaTask_typekey")
  var PowerPointDotResampleMediaTask_typekey: ResampleMediaTask
  
  val SampleHeight: Double
  
  val SampleWidth: Double
  
  val Shape: typings.activexPowerpoint.PowerPoint.Shape
  
  val VideoCompressionType: String
  
  val VideoFrameRate: Double
  
  val profile: PpResampleMediaProfile
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
  implicit class ResampleMediaTaskMutableBuilder[Self <: ResampleMediaTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioCompressionType(value: String): Self = StObject.set(x, "AudioCompressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioSamplingRate(value: Double): Self = StObject.set(x, "AudioSamplingRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerType(value: String): Self = StObject.set(x, "ContainerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmbedded(value: Boolean): Self = StObject.set(x, "IsEmbedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLinked(value: Boolean): Self = StObject.set(x, "IsLinked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotResampleMediaTask_typekey(value: ResampleMediaTask): Self = StObject.set(x, "PowerPoint.ResampleMediaTask_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile(value: PpResampleMediaProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleHeight(value: Double): Self = StObject.set(x, "SampleHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleWidth(value: Double): Self = StObject.set(x, "SampleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: Shape): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCompressionType(value: String): Self = StObject.set(x, "VideoCompressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoFrameRate(value: Double): Self = StObject.set(x, "VideoFrameRate", value.asInstanceOf[js.Any])
  }
}
