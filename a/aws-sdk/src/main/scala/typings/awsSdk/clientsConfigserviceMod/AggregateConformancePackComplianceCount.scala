package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateConformancePackComplianceCount extends StObject {
  
  /**
    * Number of compliant conformance packs.
    */
  var CompliantConformancePackCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * Number of noncompliant conformance packs.
    */
  var NonCompliantConformancePackCount: js.UndefOr[Integer] = js.undefined
}
object AggregateConformancePackComplianceCount {
  
  inline def apply(): AggregateConformancePackComplianceCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateConformancePackComplianceCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregateConformancePackComplianceCount] (val x: Self) extends AnyVal {
    
    inline def setCompliantConformancePackCount(value: Integer): Self = StObject.set(x, "CompliantConformancePackCount", value.asInstanceOf[js.Any])
    
    inline def setCompliantConformancePackCountUndefined: Self = StObject.set(x, "CompliantConformancePackCount", js.undefined)
    
    inline def setNonCompliantConformancePackCount(value: Integer): Self = StObject.set(x, "NonCompliantConformancePackCount", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantConformancePackCountUndefined: Self = StObject.set(x, "NonCompliantConformancePackCount", js.undefined)
  }
}
