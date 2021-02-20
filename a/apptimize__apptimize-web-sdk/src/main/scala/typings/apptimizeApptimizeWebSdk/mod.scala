package typings.apptimizeApptimizeWebSdk

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_DEBUG
import typings.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_ERROR
import typings.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_INFO
import typings.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_NONE
import typings.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_VERBOSE
import typings.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_WARN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@apptimize/apptimize-web-sdk", JSImport.Default)
  @js.native
  val default: Apptimize = js.native
  
  @js.native
  trait Apptimize extends StObject {
    
    def flushTracking(): Unit = js.native
    
    def getApptimizeAnonUserId(): String = js.native
    
    def getApptimizeSDKPlatform(): String = js.native
    
    def getApptimizeSDKVersion(): String = js.native
    
    def getBool(name: String, defaultValue: Boolean): Boolean = js.native
    
    def getBoolArray(name: String, defaultValue: js.Array[Boolean]): js.Array[Boolean] = js.native
    
    def getBoolDictionary(name: String, defaultValue: Dictionary[Boolean]): Dictionary[Boolean] = js.native
    
    def getCustomAttributes(): Dictionary[simpleData] = js.native
    
    def getCustomerUserId(): String = js.native
    
    def getDouble(name: String, defaultValue: Double): Double = js.native
    
    def getDoubleArray(name: String, defaultValue: js.Array[Double]): js.Array[Double] = js.native
    
    def getDoubleDictionary(name: String, defaultValue: Dictionary[Double]): Dictionary[Double] = js.native
    
    def getInt(name: String, defaultValue: Double): Double = js.native
    
    def getIntArray(name: String, defaultValue: js.Array[Double]): js.Array[Double] = js.native
    
    def getIntDictionary(name: String, defaultValue: Dictionary[Double]): Dictionary[Double] = js.native
    
    def getString(name: String, defaultValue: String): String = js.native
    
    def getStringArray(name: String, defaultValue: js.Array[String]): js.Array[String] = js.native
    
    def getStringDictionary(name: String, defaultValue: Dictionary[String]): Dictionary[String] = js.native
    
    def getVariantInfo(): js.Array[VariantInfo] = js.native
    
    def isFeatureFlagEnabled(name: String): Boolean = js.native
    
    def runCodeBlock(codeBlockVariableName: String, callback: Dictionary[callback]): Unit = js.native
    
    def setAppName(name: String): Unit = js.native
    
    def setAppVersion(version: String): Unit = js.native
    
    def setCustomAttributes(attributes: Dictionary[simpleData]): Unit = js.native
    
    def setCustomerUserId(id: String): Unit = js.native
    
    def setOnApptimizeInitializedCallback(callback: callback): Unit = js.native
    
    def setOnEnrolledInExperimentCallback(callback: variantInfoCallback): Unit = js.native
    
    def setOnMetadataUpdatedCallback(callback: callback): Unit = js.native
    
    def setOnParticipatedInExperimentCallback(callback: variantInfoCallback): Unit = js.native
    
    def setOnUnenrolledInExperimentCallback(callback: unenrollmentCallback): Unit = js.native
    
    def setPilotTargetingId(id: String): Unit = js.native
    
    def setup(appKey: String): Unit = js.native
    def setup(appKey: String, configAttributes: ConfigAttributes): Unit = js.native
    
    def track(eventName: String): Unit = js.native
    
    def trackValue(eventName: String, value: Double): Unit = js.native
    
    def updateApptimizeMetadataOnce(): Unit = js.native
  }
  
  @js.native
  trait ConfigAttributes extends StObject {
    
    var log_level: js.UndefOr[
        LOG_LEVEL_VERBOSE | LOG_LEVEL_DEBUG | LOG_LEVEL_INFO | LOG_LEVEL_WARN | LOG_LEVEL_ERROR | LOG_LEVEL_NONE
      ] = js.native
    
    var result_post_delay_ms: js.UndefOr[Double] = js.native
  }
  object ConfigAttributes {
    
    @scala.inline
    def apply(): ConfigAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigAttributes]
    }
    
    @scala.inline
    implicit class ConfigAttributesMutableBuilder[Self <: ConfigAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLog_level(
        value: LOG_LEVEL_VERBOSE | LOG_LEVEL_DEBUG | LOG_LEVEL_INFO | LOG_LEVEL_WARN | LOG_LEVEL_ERROR | LOG_LEVEL_NONE
      ): Self = StObject.set(x, "log_level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLog_levelUndefined: Self = StObject.set(x, "log_level", js.undefined)
      
      @scala.inline
      def setResult_post_delay_ms(value: Double): Self = StObject.set(x, "result_post_delay_ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult_post_delay_msUndefined: Self = StObject.set(x, "result_post_delay_ms", js.undefined)
    }
  }
  
  type Dictionary[T] = StringDictionary[T]
  
  @js.native
  trait VariantInfo extends StObject {
    
    def getAnonymousUserId(): String = js.native
    
    def getCurrentPhase(): Double = js.native
    
    def getCycle(): Double = js.native
    
    def getExperimentId(): Double = js.native
    
    def getExperimentName(): String = js.native
    
    def getExperimentType(): Double = js.native
    
    def getExperimentTypeName(): String = js.native
    
    def getParticipationPhase(): Double = js.native
    
    def getUserHasParticipated(): Boolean = js.native
    
    def getUserId(): String = js.native
    
    def getVariantId(): Double = js.native
    
    def getVariantName(): String = js.native
  }
  object VariantInfo {
    
    @scala.inline
    def apply(
      getAnonymousUserId: () => String,
      getCurrentPhase: () => Double,
      getCycle: () => Double,
      getExperimentId: () => Double,
      getExperimentName: () => String,
      getExperimentType: () => Double,
      getExperimentTypeName: () => String,
      getParticipationPhase: () => Double,
      getUserHasParticipated: () => Boolean,
      getUserId: () => String,
      getVariantId: () => Double,
      getVariantName: () => String
    ): VariantInfo = {
      val __obj = js.Dynamic.literal(getAnonymousUserId = js.Any.fromFunction0(getAnonymousUserId), getCurrentPhase = js.Any.fromFunction0(getCurrentPhase), getCycle = js.Any.fromFunction0(getCycle), getExperimentId = js.Any.fromFunction0(getExperimentId), getExperimentName = js.Any.fromFunction0(getExperimentName), getExperimentType = js.Any.fromFunction0(getExperimentType), getExperimentTypeName = js.Any.fromFunction0(getExperimentTypeName), getParticipationPhase = js.Any.fromFunction0(getParticipationPhase), getUserHasParticipated = js.Any.fromFunction0(getUserHasParticipated), getUserId = js.Any.fromFunction0(getUserId), getVariantId = js.Any.fromFunction0(getVariantId), getVariantName = js.Any.fromFunction0(getVariantName))
      __obj.asInstanceOf[VariantInfo]
    }
    
    @scala.inline
    implicit class VariantInfoMutableBuilder[Self <: VariantInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAnonymousUserId(value: () => String): Self = StObject.set(x, "getAnonymousUserId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrentPhase(value: () => Double): Self = StObject.set(x, "getCurrentPhase", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCycle(value: () => Double): Self = StObject.set(x, "getCycle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetExperimentId(value: () => Double): Self = StObject.set(x, "getExperimentId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetExperimentName(value: () => String): Self = StObject.set(x, "getExperimentName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetExperimentType(value: () => Double): Self = StObject.set(x, "getExperimentType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetExperimentTypeName(value: () => String): Self = StObject.set(x, "getExperimentTypeName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParticipationPhase(value: () => Double): Self = StObject.set(x, "getParticipationPhase", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUserHasParticipated(value: () => Boolean): Self = StObject.set(x, "getUserHasParticipated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUserId(value: () => String): Self = StObject.set(x, "getUserId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVariantId(value: () => Double): Self = StObject.set(x, "getVariantId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVariantName(value: () => String): Self = StObject.set(x, "getVariantName", js.Any.fromFunction0(value))
    }
  }
  
  type _To = Apptimize
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Apptimize = default
  
  type callback = js.Function0[Unit]
  
  type simpleData = String | Double | Boolean
  
  type unenrollmentCallback = js.Function2[/* variantInfo */ VariantInfo, /* unenrollmentReason */ String, Unit]
  
  type variantInfoCallback = js.Function1[/* variantInfo */ VariantInfo, Unit]
}
