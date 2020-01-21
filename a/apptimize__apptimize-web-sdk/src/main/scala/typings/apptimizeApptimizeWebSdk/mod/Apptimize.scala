package typings.apptimizeApptimizeWebSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Apptimize extends js.Object {
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

