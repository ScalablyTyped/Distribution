package typings
package androiduixLib.androidNs.textNs.methodNs.ReplacementTransformationMethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped String */ @JSGlobal("android.text.method.ReplacementTransformationMethod.ReplacementCharSequence")
@js.native
class ReplacementCharSequence protected () extends js.Object {
  def this(source: java.lang.String, original: js.Array[java.lang.String], replacement: js.Array[java.lang.String]) = this()
  var mOriginal: js.Any = js.native
  var mReplacement: js.Any = js.native
  var mSource: js.Any = js.native
  def charAt(i: scala.Double): java.lang.String = js.native
  def startReplace(start: scala.Double, end: scala.Double): java.lang.String = js.native
  def substr(from: scala.Double, length: scala.Double): java.lang.String = js.native
  def substring(start: scala.Double, end: scala.Double): java.lang.String = js.native
}

