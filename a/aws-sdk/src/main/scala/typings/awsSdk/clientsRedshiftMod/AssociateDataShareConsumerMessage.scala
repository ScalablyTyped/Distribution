package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateDataShareConsumerMessage extends StObject {
  
  /**
    * A value that specifies whether the datashare is associated with the entire account.
    */
  var AssociateEntireAccount: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the consumer that is associated with the datashare.
    */
  var ConsumerArn: js.UndefOr[String] = js.undefined
  
  /**
    * From a datashare consumer account, associates a datashare with all existing and future namespaces in the specified Amazon Web Services Region.
    */
  var ConsumerRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the datashare that the consumer is to use with the account or the namespace.
    */
  var DataShareArn: String
}
object AssociateDataShareConsumerMessage {
  
  inline def apply(DataShareArn: String): AssociateDataShareConsumerMessage = {
    val __obj = js.Dynamic.literal(DataShareArn = DataShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDataShareConsumerMessage]
  }
  
  extension [Self <: AssociateDataShareConsumerMessage](x: Self) {
    
    inline def setAssociateEntireAccount(value: BooleanOptional): Self = StObject.set(x, "AssociateEntireAccount", value.asInstanceOf[js.Any])
    
    inline def setAssociateEntireAccountUndefined: Self = StObject.set(x, "AssociateEntireAccount", js.undefined)
    
    inline def setConsumerArn(value: String): Self = StObject.set(x, "ConsumerArn", value.asInstanceOf[js.Any])
    
    inline def setConsumerArnUndefined: Self = StObject.set(x, "ConsumerArn", js.undefined)
    
    inline def setConsumerRegion(value: String): Self = StObject.set(x, "ConsumerRegion", value.asInstanceOf[js.Any])
    
    inline def setConsumerRegionUndefined: Self = StObject.set(x, "ConsumerRegion", js.undefined)
    
    inline def setDataShareArn(value: String): Self = StObject.set(x, "DataShareArn", value.asInstanceOf[js.Any])
  }
}
