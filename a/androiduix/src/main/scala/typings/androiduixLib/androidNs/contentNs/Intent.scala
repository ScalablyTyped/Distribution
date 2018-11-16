package typings
package androiduixLib.androidNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.content.Intent")
@js.native
class Intent () extends js.Object {
  def this(activityName: java.lang.String) = this()
  var activityName: js.Any = js.native
  var mExtras: js.Any = js.native
  var mFlags: js.Any = js.native
  var mRequestCode: js.Any = js.native
  def addFlags(flags: scala.Double): Intent = js.native
  def getBooleanArrayExtra(name: java.lang.String): js.Array[scala.Boolean] = js.native
  def getBooleanArrayExtra(name: java.lang.String, defaultValue: js.Array[scala.Boolean]): js.Array[scala.Boolean] = js.native
  def getBooleanExtra(name: java.lang.String, defaultValue: scala.Boolean): scala.Boolean = js.native
  def getDoubleArrayExtra(name: java.lang.String): js.Array[scala.Double] = js.native
  def getDoubleArrayExtra(name: java.lang.String, defaultValue: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def getDoubleExtra(name: java.lang.String, defaultValue: scala.Double): scala.Double = js.native
  def getExtras(): androiduixLib.androidNs.osNs.Bundle = js.native
  def getFlags(): scala.Double = js.native
  def getFloatArrayExtra(name: java.lang.String): js.Array[scala.Double] = js.native
  def getFloatArrayExtra(name: java.lang.String, defaultValue: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def getFloatExtra(name: java.lang.String, defaultValue: scala.Double): scala.Double = js.native
  def getIntExtra(name: java.lang.String, defaultValue: scala.Double): scala.Double = js.native
  def getIntegerArrayExtra(name: java.lang.String): js.Array[scala.Double] = js.native
  def getIntegerArrayExtra(name: java.lang.String, defaultValue: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def getLongArrayExtra(name: java.lang.String): js.Array[scala.Double] = js.native
  def getLongArrayExtra(name: java.lang.String, defaultValue: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def getLongExtra(name: java.lang.String, defaultValue: scala.Double): scala.Double = js.native
  def getStringArrayExtra(name: java.lang.String): js.Array[java.lang.String] = js.native
  def getStringArrayExtra(name: java.lang.String, defaultValue: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def getStringExtra(name: java.lang.String): java.lang.String = js.native
  def getStringExtra(name: java.lang.String, defaultValue: java.lang.String): java.lang.String = js.native
  def hasExtra(name: java.lang.String): scala.Boolean = js.native
  def putExtra(name: java.lang.String, value: js.Any): Intent = js.native
  def setFlags(flags: scala.Double): Intent = js.native
}

@JSGlobal("android.content.Intent")
@js.native
object Intent extends js.Object {
  var FLAG_ACTIVITY_CLEAR_TOP: scala.Double = js.native
}

