package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformancePackComplianceScoresFilters extends StObject {
  
  /**
    * The names of the conformance packs whose compliance scores you want to include in the conformance pack compliance score result set. You can include up to 25 conformance packs in the ConformancePackNames array of strings, each with a character limit of 256 characters for the conformance pack name.
    */
  var ConformancePackNames: ConformancePackNameFilter
}
object ConformancePackComplianceScoresFilters {
  
  inline def apply(ConformancePackNames: ConformancePackNameFilter): ConformancePackComplianceScoresFilters = {
    val __obj = js.Dynamic.literal(ConformancePackNames = ConformancePackNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackComplianceScoresFilters]
  }
  
  extension [Self <: ConformancePackComplianceScoresFilters](x: Self) {
    
    inline def setConformancePackNames(value: ConformancePackNameFilter): Self = StObject.set(x, "ConformancePackNames", value.asInstanceOf[js.Any])
    
    inline def setConformancePackNamesVarargs(value: ConformancePackName*): Self = StObject.set(x, "ConformancePackNames", js.Array(value*))
  }
}
