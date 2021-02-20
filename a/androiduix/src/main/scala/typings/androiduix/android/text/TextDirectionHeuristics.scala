package typings.androiduix.android.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDirectionHeuristics extends StObject
object TextDirectionHeuristics {
  
  @js.native
  trait AnyStrong extends TextDirectionAlgorithm {
    
    var mLookForRtl: js.Any = js.native
  }
  object AnyStrong {
    
    @scala.inline
    def apply(checkRtl: (String, Double, Double) => Double, mLookForRtl: js.Any): AnyStrong = {
      val __obj = js.Dynamic.literal(checkRtl = js.Any.fromFunction3(checkRtl), mLookForRtl = mLookForRtl.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnyStrong]
    }
    
    @scala.inline
    implicit class AnyStrongMutableBuilder[Self <: AnyStrong] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMLookForRtl(value: js.Any): Self = StObject.set(x, "mLookForRtl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FirstStrong extends TextDirectionAlgorithm
  object FirstStrong {
    
    @scala.inline
    def apply(checkRtl: (String, Double, Double) => Double): FirstStrong = {
      val __obj = js.Dynamic.literal(checkRtl = js.Any.fromFunction3(checkRtl))
      __obj.asInstanceOf[FirstStrong]
    }
  }
  
  @js.native
  trait TextDirectionAlgorithm extends StObject {
    
    def checkRtl(cs: String, start: Double, count: Double): Double = js.native
  }
  object TextDirectionAlgorithm {
    
    @scala.inline
    def apply(checkRtl: (String, Double, Double) => Double): TextDirectionAlgorithm = {
      val __obj = js.Dynamic.literal(checkRtl = js.Any.fromFunction3(checkRtl))
      __obj.asInstanceOf[TextDirectionAlgorithm]
    }
    
    @scala.inline
    implicit class TextDirectionAlgorithmMutableBuilder[Self <: TextDirectionAlgorithm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckRtl(value: (String, Double, Double) => Double): Self = StObject.set(x, "checkRtl", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait TextDirectionHeuristicImpl extends TextDirectionHeuristic {
    
    /* protected */ def defaultIsRtl(): Boolean = js.native
    
    /* private */ def doCheck(cs: js.Any, start: js.Any, count: js.Any): js.Any = js.native
    
    var mAlgorithm: js.Any = js.native
  }
  object TextDirectionHeuristicImpl {
    
    @scala.inline
    def apply(
      defaultIsRtl: () => Boolean,
      doCheck: (js.Any, js.Any, js.Any) => js.Any,
      isRtl: (String, Double, Double) => Boolean,
      mAlgorithm: js.Any
    ): TextDirectionHeuristicImpl = {
      val __obj = js.Dynamic.literal(defaultIsRtl = js.Any.fromFunction0(defaultIsRtl), doCheck = js.Any.fromFunction3(doCheck), isRtl = js.Any.fromFunction3(isRtl), mAlgorithm = mAlgorithm.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextDirectionHeuristicImpl]
    }
    
    @scala.inline
    implicit class TextDirectionHeuristicImplMutableBuilder[Self <: TextDirectionHeuristicImpl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultIsRtl(value: () => Boolean): Self = StObject.set(x, "defaultIsRtl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDoCheck(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "doCheck", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMAlgorithm(value: js.Any): Self = StObject.set(x, "mAlgorithm", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {
    
    var mDefaultIsRtl: js.Any = js.native
  }
  object TextDirectionHeuristicInternal {
    
    @scala.inline
    def apply(
      defaultIsRtl: () => Boolean,
      doCheck: (js.Any, js.Any, js.Any) => js.Any,
      isRtl: (String, Double, Double) => Boolean,
      mAlgorithm: js.Any,
      mDefaultIsRtl: js.Any
    ): TextDirectionHeuristicInternal = {
      val __obj = js.Dynamic.literal(defaultIsRtl = js.Any.fromFunction0(defaultIsRtl), doCheck = js.Any.fromFunction3(doCheck), isRtl = js.Any.fromFunction3(isRtl), mAlgorithm = mAlgorithm.asInstanceOf[js.Any], mDefaultIsRtl = mDefaultIsRtl.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextDirectionHeuristicInternal]
    }
    
    @scala.inline
    implicit class TextDirectionHeuristicInternalMutableBuilder[Self <: TextDirectionHeuristicInternal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMDefaultIsRtl(value: js.Any): Self = StObject.set(x, "mDefaultIsRtl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl
  object TextDirectionHeuristicLocale {
    
    @scala.inline
    def apply(
      defaultIsRtl: () => Boolean,
      doCheck: (js.Any, js.Any, js.Any) => js.Any,
      isRtl: (String, Double, Double) => Boolean,
      mAlgorithm: js.Any
    ): TextDirectionHeuristicLocale = {
      val __obj = js.Dynamic.literal(defaultIsRtl = js.Any.fromFunction0(defaultIsRtl), doCheck = js.Any.fromFunction3(doCheck), isRtl = js.Any.fromFunction3(isRtl), mAlgorithm = mAlgorithm.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextDirectionHeuristicLocale]
    }
  }
}
