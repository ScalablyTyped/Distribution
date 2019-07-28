package typings.androiduix.androidNs.textNs.methodNs.ReplacementTransformationMethodNs

import typings.std.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.method.ReplacementTransformationMethod.ReplacementCharSequence")
@js.native
class ReplacementCharSequence protected () extends String {
  def this(
    source: java.lang.String,
    original: js.Array[java.lang.String],
    replacement: js.Array[java.lang.String]
  ) = this()
  var mOriginal: js.Any = js.native
  var mReplacement: js.Any = js.native
  var mSource: js.Any = js.native
  def startReplace(start: Double, end: Double): java.lang.String = js.native
}

