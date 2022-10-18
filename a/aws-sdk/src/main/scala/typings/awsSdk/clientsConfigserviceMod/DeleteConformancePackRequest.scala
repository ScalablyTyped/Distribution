package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConformancePackRequest extends StObject {
  
  /**
    * Name of the conformance pack you want to delete.
    */
  var ConformancePackName: typings.awsSdk.clientsConfigserviceMod.ConformancePackName
}
object DeleteConformancePackRequest {
  
  inline def apply(ConformancePackName: ConformancePackName): DeleteConformancePackRequest = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConformancePackRequest]
  }
  
  extension [Self <: DeleteConformancePackRequest](x: Self) {
    
    inline def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
  }
}
