package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingsResponse extends StObject {
  
  /**
    * An array of objects, one for each finding that meets the criteria specified in the request.
    */
  var findings: js.UndefOr[listOfFinding] = js.undefined
}
object GetFindingsResponse {
  
  inline def apply(): GetFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFindingsResponse] (val x: Self) extends AnyVal {
    
    inline def setFindings(value: listOfFinding): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    inline def setFindingsVarargs(value: Finding*): Self = StObject.set(x, "findings", js.Array(value*))
  }
}
