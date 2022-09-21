package typings.awsSdk.appintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataIntegrationAssociationSummary extends StObject {
  
  /**
    * The identifier for teh client that is associated with the DataIntegration association.
    */
  var ClientId: js.UndefOr[typings.awsSdk.appintegrationsMod.ClientId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN)of the DataIntegration.
    */
  var DataIntegrationArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the DataIntegration association.
    */
  var DataIntegrationAssociationArn: js.UndefOr[Arn] = js.undefined
}
object DataIntegrationAssociationSummary {
  
  inline def apply(): DataIntegrationAssociationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataIntegrationAssociationSummary]
  }
  
  extension [Self <: DataIntegrationAssociationSummary](x: Self) {
    
    inline def setClientId(value: ClientId): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    inline def setDataIntegrationArn(value: Arn): Self = StObject.set(x, "DataIntegrationArn", value.asInstanceOf[js.Any])
    
    inline def setDataIntegrationArnUndefined: Self = StObject.set(x, "DataIntegrationArn", js.undefined)
    
    inline def setDataIntegrationAssociationArn(value: Arn): Self = StObject.set(x, "DataIntegrationAssociationArn", value.asInstanceOf[js.Any])
    
    inline def setDataIntegrationAssociationArnUndefined: Self = StObject.set(x, "DataIntegrationAssociationArn", js.undefined)
  }
}
