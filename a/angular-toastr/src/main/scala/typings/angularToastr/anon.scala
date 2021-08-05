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
    
    inline def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  trait Progressbar extends StObject {
    
    var progressbar: js.UndefOr[String] = js.undefined
    
    var toast: js.UndefOr[String] = js.undefined
  }
  object Progressbar {
    
    inline def apply(): Progressbar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Progressbar]
    }
    
    extension [Self <: Progressbar](x: Self) {
      
      inline def setProgressbar(value: String): Self = StObject.set(x, "progressbar", value.asInstanceOf[js.Any])
      
      inline def setProgressbarUndefined: Self = StObject.set(x, "progressbar", js.undefined)
      
      inline def setToast(value: String): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
      
      inline def setToastUndefined: Self = StObject.set(x, "toast", js.undefined)
    }
  }
}
