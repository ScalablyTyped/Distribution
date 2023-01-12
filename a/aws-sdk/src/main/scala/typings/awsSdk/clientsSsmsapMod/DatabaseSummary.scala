package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseSummary extends StObject {
  
  /**
    * 
    */
  var ApplicationId: js.UndefOr[typings.awsSdk.clientsSsmsapMod.ApplicationId] = js.undefined
  
  /**
    * 
    */
  var Arn: js.UndefOr[SsmSapArn] = js.undefined
  
  /**
    * 
    */
  var ComponentId: js.UndefOr[typings.awsSdk.clientsSsmsapMod.ComponentId] = js.undefined
  
  /**
    * 
    */
  var DatabaseId: js.UndefOr[typings.awsSdk.clientsSsmsapMod.DatabaseId] = js.undefined
  
  /**
    * 
    */
  var DatabaseType: js.UndefOr[typings.awsSdk.clientsSsmsapMod.DatabaseType] = js.undefined
  
  /**
    * 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object DatabaseSummary {
  
  inline def apply(): DatabaseSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseSummary] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setArn(value: SsmSapArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setComponentId(value: ComponentId): Self = StObject.set(x, "ComponentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "ComponentId", js.undefined)
    
    inline def setDatabaseId(value: DatabaseId): Self = StObject.set(x, "DatabaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "DatabaseId", js.undefined)
    
    inline def setDatabaseType(value: DatabaseType): Self = StObject.set(x, "DatabaseType", value.asInstanceOf[js.Any])
    
    inline def setDatabaseTypeUndefined: Self = StObject.set(x, "DatabaseType", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
