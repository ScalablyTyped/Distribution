package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Limitation extends StObject {
  
  /**
    * The identifier of the source database.
    */
  var DatabaseId: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the limitation. Provides additional information about the limitation, and includes recommended actions that you can take to address or avoid this limitation.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the target engine that Fleet Advisor should use in the target engine recommendation. Valid values include "rds-aurora-mysql", "rds-aurora-postgresql", "rds-mysql", "rds-oracle", "rds-sql-server", and "rds-postgresql".
    */
  var EngineName: js.UndefOr[String] = js.undefined
  
  /**
    * The impact of the limitation. You can use this parameter to prioritize limitations that you want to address. Valid values include "Blocker", "High", "Medium", and "Low".
    */
  var Impact: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the limitation. Describes unsupported database features, migration action items, and other limitations.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the limitation, such as action required, upgrade required, and limited feature.
    */
  var Type: js.UndefOr[String] = js.undefined
}
object Limitation {
  
  inline def apply(): Limitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Limitation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Limitation] (val x: Self) extends AnyVal {
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "DatabaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "DatabaseId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEngineName(value: String): Self = StObject.set(x, "EngineName", value.asInstanceOf[js.Any])
    
    inline def setEngineNameUndefined: Self = StObject.set(x, "EngineName", js.undefined)
    
    inline def setImpact(value: String): Self = StObject.set(x, "Impact", value.asInstanceOf[js.Any])
    
    inline def setImpactUndefined: Self = StObject.set(x, "Impact", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
