package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateAccessLogsResult extends StObject {
  
  /**
    *  The pre-signed URL for the requested access logs. 
    */
  var logUrl: js.UndefOr[LogUrl] = js.undefined
}
object GenerateAccessLogsResult {
  
  @scala.inline
  def apply(): GenerateAccessLogsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateAccessLogsResult]
  }
  
  @scala.inline
  implicit class GenerateAccessLogsResultMutableBuilder[Self <: GenerateAccessLogsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogUrl(value: LogUrl): Self = StObject.set(x, "logUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUrlUndefined: Self = StObject.set(x, "logUrl", js.undefined)
  }
}
