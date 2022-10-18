package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOutpostInput extends StObject {
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the Outpost. 
    */
  var OutpostId: typings.awsSdk.clientsOutpostsMod.OutpostId
}
object GetOutpostInput {
  
  inline def apply(OutpostId: OutpostId): GetOutpostInput = {
    val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOutpostInput]
  }
  
  extension [Self <: GetOutpostInput](x: Self) {
    
    inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
  }
}
