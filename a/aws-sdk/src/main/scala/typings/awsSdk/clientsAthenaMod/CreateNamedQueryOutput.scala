package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNamedQueryOutput extends StObject {
  
  /**
    * The unique ID of the query.
    */
  var NamedQueryId: js.UndefOr[typings.awsSdk.clientsAthenaMod.NamedQueryId] = js.undefined
}
object CreateNamedQueryOutput {
  
  inline def apply(): CreateNamedQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNamedQueryOutput]
  }
  
  extension [Self <: CreateNamedQueryOutput](x: Self) {
    
    inline def setNamedQueryId(value: NamedQueryId): Self = StObject.set(x, "NamedQueryId", value.asInstanceOf[js.Any])
    
    inline def setNamedQueryIdUndefined: Self = StObject.set(x, "NamedQueryId", js.undefined)
  }
}
