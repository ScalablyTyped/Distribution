package typings.androiduix.android.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextUtils extends StObject
object TextUtils {
  
  @js.native
  sealed trait TruncateAt extends StObject
  @JSGlobal("android.text.TextUtils.TruncateAt")
  @js.native
  object TruncateAt extends StObject {
    
    @js.native
    sealed trait END extends TruncateAt
    
    @js.native
    sealed trait END_SMALL extends TruncateAt
    
    @js.native
    sealed trait MARQUEE extends TruncateAt
    
    @js.native
    sealed trait MIDDLE extends TruncateAt
    
    @js.native
    sealed trait START extends TruncateAt
  }
  
  @js.native
  trait EllipsizeCallback extends StObject {
    
    def ellipsized(start: Double, end: Double): Unit = js.native
  }
  object EllipsizeCallback {
    
    @scala.inline
    def apply(ellipsized: (Double, Double) => Unit): EllipsizeCallback = {
      val __obj = js.Dynamic.literal(ellipsized = js.Any.fromFunction2(ellipsized))
      __obj.asInstanceOf[EllipsizeCallback]
    }
    
    @scala.inline
    implicit class EllipsizeCallbackMutableBuilder[Self <: EllipsizeCallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEllipsized(value: (Double, Double) => Unit): Self = StObject.set(x, "ellipsized", js.Any.fromFunction2(value))
    }
  }
}
