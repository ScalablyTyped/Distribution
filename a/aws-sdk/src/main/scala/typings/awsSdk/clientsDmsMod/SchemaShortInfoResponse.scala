package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShortInfoResponse extends StObject {
  
  /**
    * The ID of a database in a Fleet Advisor collector inventory.
    */
  var DatabaseId: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address of a database in a Fleet Advisor collector inventory.
    */
  var DatabaseIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a database in a Fleet Advisor collector inventory.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of a schema in a Fleet Advisor collector inventory.
    */
  var SchemaId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a schema in a Fleet Advisor collector inventory.
    */
  var SchemaName: js.UndefOr[String] = js.undefined
}
object SchemaShortInfoResponse {
  
  inline def apply(): SchemaShortInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShortInfoResponse]
  }
  
  extension [Self <: SchemaShortInfoResponse](x: Self) {
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "DatabaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "DatabaseId", js.undefined)
    
    inline def setDatabaseIpAddress(value: String): Self = StObject.set(x, "DatabaseIpAddress", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIpAddressUndefined: Self = StObject.set(x, "DatabaseIpAddress", js.undefined)
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setSchemaId(value: String): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
    
    inline def setSchemaIdUndefined: Self = StObject.set(x, "SchemaId", js.undefined)
    
    inline def setSchemaName(value: String): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
  }
}
