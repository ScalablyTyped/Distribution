package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseResponse extends StObject {
  
  /**
    * A list of collectors associated with the database.
    */
  var Collectors: js.UndefOr[CollectorsList] = js.undefined
  
  /**
    * The ID of a database in a Fleet Advisor collector inventory.
    */
  var DatabaseId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a database in a Fleet Advisor collector inventory. 
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address of a database in a Fleet Advisor collector inventory. 
    */
  var IpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The number of schemas in a Fleet Advisor collector inventory database. 
    */
  var NumberOfSchemas: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * The server name of a database in a Fleet Advisor collector inventory. 
    */
  var Server: js.UndefOr[ServerShortInfoResponse] = js.undefined
  
  /**
    * The software details of a database in a Fleet Advisor collector inventory, such as database engine and version.
    */
  var SoftwareDetails: js.UndefOr[DatabaseInstanceSoftwareDetailsResponse] = js.undefined
}
object DatabaseResponse {
  
  inline def apply(): DatabaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseResponse] (val x: Self) extends AnyVal {
    
    inline def setCollectors(value: CollectorsList): Self = StObject.set(x, "Collectors", value.asInstanceOf[js.Any])
    
    inline def setCollectorsUndefined: Self = StObject.set(x, "Collectors", js.undefined)
    
    inline def setCollectorsVarargs(value: CollectorShortInfoResponse*): Self = StObject.set(x, "Collectors", js.Array(value*))
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "DatabaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "DatabaseId", js.undefined)
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setNumberOfSchemas(value: LongOptional): Self = StObject.set(x, "NumberOfSchemas", value.asInstanceOf[js.Any])
    
    inline def setNumberOfSchemasUndefined: Self = StObject.set(x, "NumberOfSchemas", js.undefined)
    
    inline def setServer(value: ServerShortInfoResponse): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "Server", js.undefined)
    
    inline def setSoftwareDetails(value: DatabaseInstanceSoftwareDetailsResponse): Self = StObject.set(x, "SoftwareDetails", value.asInstanceOf[js.Any])
    
    inline def setSoftwareDetailsUndefined: Self = StObject.set(x, "SoftwareDetails", js.undefined)
  }
}
