package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logging extends StObject {
  
  /**
    * The access log configuration for a virtual node.
    */
  var accessLog: js.UndefOr[AccessLog] = js.native
}
object Logging {
  
  @scala.inline
  def apply(): Logging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logging]
  }
  
  @scala.inline
  implicit class LoggingMutableBuilder[Self <: Logging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessLog(value: AccessLog): Self = StObject.set(x, "accessLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessLogUndefined: Self = StObject.set(x, "accessLog", js.undefined)
  }
}
