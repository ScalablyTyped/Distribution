package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanStatus extends StObject {
  
  /**
    * The reason for the scan.
    */
  var reason: ScanStatusReason
  
  /**
    * The status code of the scan.
    */
  var statusCode: ScanStatusCode
}
object ScanStatus {
  
  inline def apply(reason: ScanStatusReason, statusCode: ScanStatusCode): ScanStatus = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScanStatus] (val x: Self) extends AnyVal {
    
    inline def setReason(value: ScanStatusReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: ScanStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
