package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingResponse extends StObject {
  
  /**
    * A finding object that contains finding details.
    */
  var finding: js.UndefOr[Finding] = js.undefined
}
object GetFindingResponse {
  
  inline def apply(): GetFindingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFindingResponse] (val x: Self) extends AnyVal {
    
    inline def setFinding(value: Finding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    inline def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
  }
}
