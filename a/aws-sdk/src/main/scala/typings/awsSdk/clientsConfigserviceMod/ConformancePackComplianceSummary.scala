package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformancePackComplianceSummary extends StObject {
  
  /**
    * The status of the conformance pack.
    */
  var ConformancePackComplianceStatus: ConformancePackComplianceType
  
  /**
    * The name of the conformance pack name.
    */
  var ConformancePackName: typings.awsSdk.clientsConfigserviceMod.ConformancePackName
}
object ConformancePackComplianceSummary {
  
  inline def apply(
    ConformancePackComplianceStatus: ConformancePackComplianceType,
    ConformancePackName: ConformancePackName
  ): ConformancePackComplianceSummary = {
    val __obj = js.Dynamic.literal(ConformancePackComplianceStatus = ConformancePackComplianceStatus.asInstanceOf[js.Any], ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackComplianceSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConformancePackComplianceSummary] (val x: Self) extends AnyVal {
    
    inline def setConformancePackComplianceStatus(value: ConformancePackComplianceType): Self = StObject.set(x, "ConformancePackComplianceStatus", value.asInstanceOf[js.Any])
    
    inline def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
  }
}
