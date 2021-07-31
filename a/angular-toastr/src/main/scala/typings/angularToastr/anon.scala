package typings.angularToastr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var info: js.UndefOr[String] = js.undefined
    
    var success: js.UndefOr[String] = js.undefined
    
    var warning: js.UndefOr[String] = js.undefined
  }
  object Error {
    
    @scala.inline
    def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  trait Progressbar extends StObject {
    
    var progressbar: js.UndefOr[String] = js.undefined
    
    var toast: js.UndefOr[String] = js.undefined
  }
  object Progressbar {
    
    @scala.inline
    def apply(): Progressbar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Progressbar]
    }
    
    @scala.inline
    implicit class ProgressbarMutableBuilder[Self <: Progressbar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProgressbar(value: String): Self = StObject.set(x, "progressbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressbarUndefined: Self = StObject.set(x, "progressbar", js.undefined)
      
      @scala.inline
      def setToast(value: String): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastUndefined: Self = StObject.set(x, "toast", js.undefined)
    }
  }
}
