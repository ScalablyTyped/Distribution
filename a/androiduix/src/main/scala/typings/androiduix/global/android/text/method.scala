package typings.androiduix.global.android.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.method")
@js.native
object method extends js.Object {
  @js.native
  class AllCapsTransformationMethod ()
    extends typings.androiduix.android.text.method.AllCapsTransformationMethod {
    def this(context: js.Any) = this()
  }
  
  @js.native
  class PasswordTransformationMethod ()
    extends typings.androiduix.android.text.method.PasswordTransformationMethod
  
  @js.native
  abstract class ReplacementTransformationMethod ()
    extends typings.androiduix.android.text.method.ReplacementTransformationMethod
  
  @js.native
  class SingleLineTransformationMethod ()
    extends typings.androiduix.android.text.method.SingleLineTransformationMethod
  
  /* static members */
  @js.native
  object AllCapsTransformationMethod extends js.Object {
    var TAG: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object PasswordTransformationMethod extends js.Object {
    var instance: js.Any = js.native
    def getInstance(): typings.androiduix.android.text.method.PasswordTransformationMethod = js.native
  }
  
  @js.native
  object ReplacementTransformationMethod extends js.Object {
    @js.native
    class ReplacementCharSequence protected ()
      extends typings.androiduix.android.text.method.ReplacementTransformationMethod.ReplacementCharSequence {
      def this(source: String, original: js.Array[String], replacement: js.Array[String]) = this()
    }
    
  }
  
  /* static members */
  @js.native
  object SingleLineTransformationMethod extends js.Object {
    var ORIGINAL: js.Any = js.native
    var REPLACEMENT: js.Any = js.native
    var sInstance: js.Any = js.native
    def getInstance(): typings.androiduix.android.text.method.SingleLineTransformationMethod = js.native
  }
  
  @js.native
  object TransformationMethod extends js.Object {
    def isImpl(obj: js.Any): Boolean = js.native
  }
  
  @js.native
  object TransformationMethod2 extends js.Object {
    def isImpl(obj: js.Any): Boolean = js.native
  }
  
}

