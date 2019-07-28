package typings.androiduix.androidNs.contentNs

import typings.androiduix.androidNs.osNs.Bundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.content.Intent")
@js.native
class Intent () extends js.Object {
  def this(activityName: String) = this()
  var activityName: js.Any = js.native
  var mExtras: js.Any = js.native
  var mFlags: js.Any = js.native
  var mRequestCode: js.Any = js.native
  def addFlags(flags: Double): Intent = js.native
  def getBooleanArrayExtra(name: String): js.Array[Boolean] = js.native
  def getBooleanArrayExtra(name: String, defaultValue: js.Array[Boolean]): js.Array[Boolean] = js.native
  def getBooleanExtra(name: String, defaultValue: Boolean): Boolean = js.native
  def getDoubleArrayExtra(name: String): js.Array[Double] = js.native
  def getDoubleArrayExtra(name: String, defaultValue: js.Array[Double]): js.Array[Double] = js.native
  def getDoubleExtra(name: String, defaultValue: Double): Double = js.native
  def getExtras(): Bundle = js.native
  def getFlags(): Double = js.native
  def getFloatArrayExtra(name: String): js.Array[Double] = js.native
  def getFloatArrayExtra(name: String, defaultValue: js.Array[Double]): js.Array[Double] = js.native
  def getFloatExtra(name: String, defaultValue: Double): Double = js.native
  def getIntExtra(name: String, defaultValue: Double): Double = js.native
  def getIntegerArrayExtra(name: String): js.Array[Double] = js.native
  def getIntegerArrayExtra(name: String, defaultValue: js.Array[Double]): js.Array[Double] = js.native
  def getLongArrayExtra(name: String): js.Array[Double] = js.native
  def getLongArrayExtra(name: String, defaultValue: js.Array[Double]): js.Array[Double] = js.native
  def getLongExtra(name: String, defaultValue: Double): Double = js.native
  def getStringArrayExtra(name: String): js.Array[String] = js.native
  def getStringArrayExtra(name: String, defaultValue: js.Array[String]): js.Array[String] = js.native
  def getStringExtra(name: String): String = js.native
  def getStringExtra(name: String, defaultValue: String): String = js.native
  def hasExtra(name: String): Boolean = js.native
  def putExtra(name: String, value: js.Any): Intent = js.native
  def setFlags(flags: Double): Intent = js.native
}

/* static members */
@JSGlobal("android.content.Intent")
@js.native
object Intent extends js.Object {
  var FLAG_ACTIVITY_CLEAR_TOP: Double = js.native
}

