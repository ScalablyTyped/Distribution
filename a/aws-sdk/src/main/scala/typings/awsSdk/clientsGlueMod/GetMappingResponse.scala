package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMappingResponse extends StObject {
  
  /**
    * A list of mappings to the specified targets.
    */
  var Mapping: MappingList
}
object GetMappingResponse {
  
  inline def apply(Mapping: MappingList): GetMappingResponse = {
    val __obj = js.Dynamic.literal(Mapping = Mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMappingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMappingResponse] (val x: Self) extends AnyVal {
    
    inline def setMapping(value: MappingList): Self = StObject.set(x, "Mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingVarargs(value: MappingEntry*): Self = StObject.set(x, "Mapping", js.Array(value*))
  }
}
