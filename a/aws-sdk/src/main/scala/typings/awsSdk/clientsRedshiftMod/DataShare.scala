package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataShare extends StObject {
  
  /**
    * A value that specifies whether the datashare can be shared to a publicly accessible cluster.
    */
  var AllowPubliclyAccessibleConsumers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that references the datashare that is owned by a specific namespace of the producer cluster. A datashare ARN is in the arn:aws:redshift:{region}:{account-id}:{datashare}:{namespace-guid}/{datashare-name} format.
    */
  var DataShareArn: js.UndefOr[String] = js.undefined
  
  /**
    * A value that specifies when the datashare has an association between producer and data consumers.
    */
  var DataShareAssociations: js.UndefOr[DataShareAssociationList] = js.undefined
  
  /**
    * The identifier of a datashare to show its managing entity.
    */
  var ManagedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the producer.
    */
  var ProducerArn: js.UndefOr[String] = js.undefined
}
object DataShare {
  
  inline def apply(): DataShare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataShare]
  }
  
  extension [Self <: DataShare](x: Self) {
    
    inline def setAllowPubliclyAccessibleConsumers(value: Boolean): Self = StObject.set(x, "AllowPubliclyAccessibleConsumers", value.asInstanceOf[js.Any])
    
    inline def setAllowPubliclyAccessibleConsumersUndefined: Self = StObject.set(x, "AllowPubliclyAccessibleConsumers", js.undefined)
    
    inline def setDataShareArn(value: String): Self = StObject.set(x, "DataShareArn", value.asInstanceOf[js.Any])
    
    inline def setDataShareArnUndefined: Self = StObject.set(x, "DataShareArn", js.undefined)
    
    inline def setDataShareAssociations(value: DataShareAssociationList): Self = StObject.set(x, "DataShareAssociations", value.asInstanceOf[js.Any])
    
    inline def setDataShareAssociationsUndefined: Self = StObject.set(x, "DataShareAssociations", js.undefined)
    
    inline def setDataShareAssociationsVarargs(value: DataShareAssociation*): Self = StObject.set(x, "DataShareAssociations", js.Array(value*))
    
    inline def setManagedBy(value: String): Self = StObject.set(x, "ManagedBy", value.asInstanceOf[js.Any])
    
    inline def setManagedByUndefined: Self = StObject.set(x, "ManagedBy", js.undefined)
    
    inline def setProducerArn(value: String): Self = StObject.set(x, "ProducerArn", value.asInstanceOf[js.Any])
    
    inline def setProducerArnUndefined: Self = StObject.set(x, "ProducerArn", js.undefined)
  }
}
