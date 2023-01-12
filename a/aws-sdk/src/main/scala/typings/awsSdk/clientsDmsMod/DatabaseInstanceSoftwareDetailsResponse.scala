package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseInstanceSoftwareDetailsResponse extends StObject {
  
  /**
    * The database engine of a database in a Fleet Advisor collector inventory, for example Microsoft SQL Server.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The database engine edition of a database in a Fleet Advisor collector inventory, for example Express.
    */
  var EngineEdition: js.UndefOr[String] = js.undefined
  
  /**
    * The database engine version of a database in a Fleet Advisor collector inventory, for example 2019.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The operating system architecture of the database.
    */
  var OsArchitecture: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The service pack level of the database.
    */
  var ServicePack: js.UndefOr[String] = js.undefined
  
  /**
    * The support level of the database, for example Mainstream support.
    */
  var SupportLevel: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the database engine software, for example Mainstream support ends on November 14th, 2024.
    */
  var Tooltip: js.UndefOr[String] = js.undefined
}
object DatabaseInstanceSoftwareDetailsResponse {
  
  inline def apply(): DatabaseInstanceSoftwareDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseInstanceSoftwareDetailsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseInstanceSoftwareDetailsResponse] (val x: Self) extends AnyVal {
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineEdition(value: String): Self = StObject.set(x, "EngineEdition", value.asInstanceOf[js.Any])
    
    inline def setEngineEditionUndefined: Self = StObject.set(x, "EngineEdition", js.undefined)
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setOsArchitecture(value: IntegerOptional): Self = StObject.set(x, "OsArchitecture", value.asInstanceOf[js.Any])
    
    inline def setOsArchitectureUndefined: Self = StObject.set(x, "OsArchitecture", js.undefined)
    
    inline def setServicePack(value: String): Self = StObject.set(x, "ServicePack", value.asInstanceOf[js.Any])
    
    inline def setServicePackUndefined: Self = StObject.set(x, "ServicePack", js.undefined)
    
    inline def setSupportLevel(value: String): Self = StObject.set(x, "SupportLevel", value.asInstanceOf[js.Any])
    
    inline def setSupportLevelUndefined: Self = StObject.set(x, "SupportLevel", js.undefined)
    
    inline def setTooltip(value: String): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
  }
}
