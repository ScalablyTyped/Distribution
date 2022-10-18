package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartGeneratedCodeJobResult extends StObject {
  
  /**
    *  The identifier of the code generation job. You can use this identifier in the GetGeneratedCodeJob operation. 
    */
  var GeneratedCodeJobId: js.UndefOr[typings.awsSdk.clientsGamesparksMod.GeneratedCodeJobId] = js.undefined
}
object StartGeneratedCodeJobResult {
  
  inline def apply(): StartGeneratedCodeJobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartGeneratedCodeJobResult]
  }
  
  extension [Self <: StartGeneratedCodeJobResult](x: Self) {
    
    inline def setGeneratedCodeJobId(value: GeneratedCodeJobId): Self = StObject.set(x, "GeneratedCodeJobId", value.asInstanceOf[js.Any])
    
    inline def setGeneratedCodeJobIdUndefined: Self = StObject.set(x, "GeneratedCodeJobId", js.undefined)
  }
}
