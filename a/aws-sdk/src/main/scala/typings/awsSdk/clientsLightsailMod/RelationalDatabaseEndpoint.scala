package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationalDatabaseEndpoint extends StObject {
  
  /**
    * Specifies the DNS address of the database.
    */
  var address: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the port that the database is listening on.
    */
  var port: js.UndefOr[integer] = js.undefined
}
object RelationalDatabaseEndpoint {
  
  inline def apply(): RelationalDatabaseEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseEndpoint]
  }
  
  extension [Self <: RelationalDatabaseEndpoint](x: Self) {
    
    inline def setAddress(value: NonEmptyString): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setPort(value: integer): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
