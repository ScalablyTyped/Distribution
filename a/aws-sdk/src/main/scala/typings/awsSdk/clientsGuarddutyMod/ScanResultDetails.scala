package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanResultDetails extends StObject {
  
  /**
    * An enum value representing possible scan results.
    */
  var ScanResult: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.ScanResult] = js.undefined
}
object ScanResultDetails {
  
  inline def apply(): ScanResultDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanResultDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScanResultDetails] (val x: Self) extends AnyVal {
    
    inline def setScanResult(value: ScanResult): Self = StObject.set(x, "ScanResult", value.asInstanceOf[js.Any])
    
    inline def setScanResultUndefined: Self = StObject.set(x, "ScanResult", js.undefined)
  }
}
