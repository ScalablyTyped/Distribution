package typings.androiduix.android.text.method

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplacementTransformationMethod extends TransformationMethod {
  
  /* protected */ def getOriginal(): js.Array[String] = js.native
  
  /* protected */ def getReplacement(): js.Array[String] = js.native
}
@JSGlobal("android.text.method.ReplacementTransformationMethod")
@js.native
object ReplacementTransformationMethod extends js.Object {
  
  @js.native
  trait ReplacementCharSequence
    extends typings.std.String {
    
    var mOriginal: js.Any = js.native
    
    var mReplacement: js.Any = js.native
    
    var mSource: js.Any = js.native
    
    def startReplace(start: Double, end: Double): String = js.native
  }
}
