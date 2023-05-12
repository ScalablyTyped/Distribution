package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatabaseInput extends StObject {
  
  /**
    * The ID of the application.
    */
  var ApplicationId: js.UndefOr[typings.awsSdk.clientsSsmsapMod.ApplicationId] = js.undefined
  
  /**
    * The ID of the component.
    */
  var ComponentId: js.UndefOr[typings.awsSdk.clientsSsmsapMod.ComponentId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the database.
    */
  var DatabaseArn: js.UndefOr[SsmSapArn] = js.undefined
  
  /**
    * The ID of the database.
    */
  var DatabaseId: js.UndefOr[typings.awsSdk.clientsSsmsapMod.DatabaseId] = js.undefined
}
object GetDatabaseInput {
  
  inline def apply(): GetDatabaseInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatabaseInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDatabaseInput] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setComponentId(value: ComponentId): Self = StObject.set(x, "ComponentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "ComponentId", js.undefined)
    
    inline def setDatabaseArn(value: SsmSapArn): Self = StObject.set(x, "DatabaseArn", value.asInstanceOf[js.Any])
    
    inline def setDatabaseArnUndefined: Self = StObject.set(x, "DatabaseArn", js.undefined)
    
    inline def setDatabaseId(value: DatabaseId): Self = StObject.set(x, "DatabaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "DatabaseId", js.undefined)
  }
}
