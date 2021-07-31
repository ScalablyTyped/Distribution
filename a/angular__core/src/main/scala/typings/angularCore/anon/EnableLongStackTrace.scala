package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableLongStackTrace extends StObject {
  
  var enableLongStackTrace: js.UndefOr[Boolean] = js.undefined
  
  var shouldCoalesceEventChangeDetection: js.UndefOr[Boolean] = js.undefined
}
object EnableLongStackTrace {
  
  @scala.inline
  def apply(): EnableLongStackTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableLongStackTrace]
  }
  
  @scala.inline
  implicit class EnableLongStackTraceMutableBuilder[Self <: EnableLongStackTrace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableLongStackTrace(value: Boolean): Self = StObject.set(x, "enableLongStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableLongStackTraceUndefined: Self = StObject.set(x, "enableLongStackTrace", js.undefined)
    
    @scala.inline
    def setShouldCoalesceEventChangeDetection(value: Boolean): Self = StObject.set(x, "shouldCoalesceEventChangeDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldCoalesceEventChangeDetectionUndefined: Self = StObject.set(x, "shouldCoalesceEventChangeDetection", js.undefined)
  }
}
