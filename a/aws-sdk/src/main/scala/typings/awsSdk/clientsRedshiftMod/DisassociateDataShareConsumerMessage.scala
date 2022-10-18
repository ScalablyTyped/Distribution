package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateDataShareConsumerMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the consumer that association for the datashare is removed from.
    */
  var ConsumerArn: js.UndefOr[String] = js.undefined
  
  /**
    * From a datashare consumer account, removes association of a datashare from all the existing and future namespaces in the specified Amazon Web Services Region.
    */
  var ConsumerRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the datashare to remove association for. 
    */
  var DataShareArn: String
  
  /**
    * A value that specifies whether association for the datashare is removed from the entire account.
    */
  var DisassociateEntireAccount: js.UndefOr[BooleanOptional] = js.undefined
}
object DisassociateDataShareConsumerMessage {
  
  inline def apply(DataShareArn: String): DisassociateDataShareConsumerMessage = {
    val __obj = js.Dynamic.literal(DataShareArn = DataShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateDataShareConsumerMessage]
  }
  
  extension [Self <: DisassociateDataShareConsumerMessage](x: Self) {
    
    inline def setConsumerArn(value: String): Self = StObject.set(x, "ConsumerArn", value.asInstanceOf[js.Any])
    
    inline def setConsumerArnUndefined: Self = StObject.set(x, "ConsumerArn", js.undefined)
    
    inline def setConsumerRegion(value: String): Self = StObject.set(x, "ConsumerRegion", value.asInstanceOf[js.Any])
    
    inline def setConsumerRegionUndefined: Self = StObject.set(x, "ConsumerRegion", js.undefined)
    
    inline def setDataShareArn(value: String): Self = StObject.set(x, "DataShareArn", value.asInstanceOf[js.Any])
    
    inline def setDisassociateEntireAccount(value: BooleanOptional): Self = StObject.set(x, "DisassociateEntireAccount", value.asInstanceOf[js.Any])
    
    inline def setDisassociateEntireAccountUndefined: Self = StObject.set(x, "DisassociateEntireAccount", js.undefined)
  }
}
