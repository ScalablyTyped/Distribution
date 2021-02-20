package typings.androiduix.global.android.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object method {
  
  @JSGlobal("android.text.method.AllCapsTransformationMethod")
  @js.native
  class AllCapsTransformationMethod ()
    extends typings.androiduix.android.text.method.AllCapsTransformationMethod {
    def this(context: js.Any) = this()
  }
  object AllCapsTransformationMethod {
    
    @JSGlobal("android.text.method.AllCapsTransformationMethod")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.text.method.AllCapsTransformationMethod.TAG")
    @js.native
    def TAG: js.Any = js.native
    @scala.inline
    def TAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAG")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("android.text.method.PasswordTransformationMethod")
  @js.native
  class PasswordTransformationMethod ()
    extends typings.androiduix.android.text.method.PasswordTransformationMethod
  object PasswordTransformationMethod {
    
    @JSGlobal("android.text.method.PasswordTransformationMethod")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.text.method.PasswordTransformationMethod.getInstance")
    @js.native
    def getInstance(): typings.androiduix.android.text.method.PasswordTransformationMethod = js.native
    
    /* static member */
    @JSGlobal("android.text.method.PasswordTransformationMethod.instance")
    @js.native
    def instance: js.Any = js.native
    @scala.inline
    def instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("android.text.method.ReplacementTransformationMethod")
  @js.native
  abstract class ReplacementTransformationMethod ()
    extends typings.androiduix.android.text.method.ReplacementTransformationMethod
  object ReplacementTransformationMethod {
    
    @JSGlobal("android.text.method.ReplacementTransformationMethod.ReplacementCharSequence")
    @js.native
    class ReplacementCharSequence protected ()
      extends typings.androiduix.android.text.method.ReplacementTransformationMethod.ReplacementCharSequence {
      def this(source: String, original: js.Array[String], replacement: js.Array[String]) = this()
    }
  }
  
  @JSGlobal("android.text.method.SingleLineTransformationMethod")
  @js.native
  class SingleLineTransformationMethod ()
    extends typings.androiduix.android.text.method.SingleLineTransformationMethod
  object SingleLineTransformationMethod {
    
    @JSGlobal("android.text.method.SingleLineTransformationMethod")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.text.method.SingleLineTransformationMethod.ORIGINAL")
    @js.native
    def ORIGINAL: js.Any = js.native
    @scala.inline
    def ORIGINAL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIGINAL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.text.method.SingleLineTransformationMethod.REPLACEMENT")
    @js.native
    def REPLACEMENT: js.Any = js.native
    @scala.inline
    def REPLACEMENT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REPLACEMENT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.text.method.SingleLineTransformationMethod.getInstance")
    @js.native
    def getInstance(): typings.androiduix.android.text.method.SingleLineTransformationMethod = js.native
    
    /* static member */
    @JSGlobal("android.text.method.SingleLineTransformationMethod.sInstance")
    @js.native
    def sInstance: js.Any = js.native
    @scala.inline
    def sInstance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sInstance")(x.asInstanceOf[js.Any])
  }
  
  object TransformationMethod {
    
    @JSGlobal("android.text.method.TransformationMethod.isImpl")
    @js.native
    def isImpl(obj: js.Any): Boolean = js.native
  }
  
  object TransformationMethod2 {
    
    @JSGlobal("android.text.method.TransformationMethod2.isImpl")
    @js.native
    def isImpl(obj: js.Any): Boolean = js.native
  }
}
