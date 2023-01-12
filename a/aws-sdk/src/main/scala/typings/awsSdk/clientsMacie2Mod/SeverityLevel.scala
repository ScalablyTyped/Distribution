package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeverityLevel extends StObject {
  
  /**
    * The minimum number of occurrences of text that must match the custom data identifier's detection criteria in order to produce a finding with the specified severity (severity).
    */
  var occurrencesThreshold: long
  
  /**
    * The severity to assign to a finding: if the number of occurrences is greater than or equal to the specified threshold (occurrencesThreshold); and, if applicable, the number of occurrences is less than the threshold for the next consecutive severity level for the custom data identifier, moving from LOW to HIGH.
    */
  var severity: DataIdentifierSeverity
}
object SeverityLevel {
  
  inline def apply(occurrencesThreshold: long, severity: DataIdentifierSeverity): SeverityLevel = {
    val __obj = js.Dynamic.literal(occurrencesThreshold = occurrencesThreshold.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeverityLevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeverityLevel] (val x: Self) extends AnyVal {
    
    inline def setOccurrencesThreshold(value: long): Self = StObject.set(x, "occurrencesThreshold", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: DataIdentifierSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
  }
}
