package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingsResponse extends StObject {
  
  /**
    * A list of findings.
    */
  var Findings: typings.awsSdk.clientsGuarddutyMod.Findings
}
object GetFindingsResponse {
  
  inline def apply(Findings: Findings): GetFindingsResponse = {
    val __obj = js.Dynamic.literal(Findings = Findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFindingsResponse] (val x: Self) extends AnyVal {
    
    inline def setFindings(value: Findings): Self = StObject.set(x, "Findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsVarargs(value: Finding*): Self = StObject.set(x, "Findings", js.Array(value*))
  }
}
