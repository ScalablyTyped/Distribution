package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataflowGraphRequest extends StObject {
  
  /**
    * The Python script to transform.
    */
  var PythonScript: js.UndefOr[typings.awsSdk.clientsGlueMod.PythonScript] = js.undefined
}
object GetDataflowGraphRequest {
  
  inline def apply(): GetDataflowGraphRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataflowGraphRequest]
  }
  
  extension [Self <: GetDataflowGraphRequest](x: Self) {
    
    inline def setPythonScript(value: PythonScript): Self = StObject.set(x, "PythonScript", value.asInstanceOf[js.Any])
    
    inline def setPythonScriptUndefined: Self = StObject.set(x, "PythonScript", js.undefined)
  }
}
