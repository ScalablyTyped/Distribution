package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRecordOutput extends StObject {
  
  /**
    * The encryption type to use on the record. This parameter can be one of the following values:    NONE: Do not encrypt the records in the stream.    KMS: Use server-side encryption on the records in the stream using a customer-managed Amazon Web Services KMS key.  
    */
  var EncryptionType: js.UndefOr[typings.awsSdk.clientsKinesisMod.EncryptionType] = js.undefined
  
  /**
    * The sequence number identifier that was assigned to the put data record. The sequence number for the record is unique across all records in the stream. A sequence number is the identifier associated with every record put into the stream.
    */
  var SequenceNumber: typings.awsSdk.clientsKinesisMod.SequenceNumber
  
  /**
    * The shard ID of the shard where the data record was placed.
    */
  var ShardId: typings.awsSdk.clientsKinesisMod.ShardId
}
object PutRecordOutput {
  
  inline def apply(SequenceNumber: SequenceNumber, ShardId: ShardId): PutRecordOutput = {
    val __obj = js.Dynamic.literal(SequenceNumber = SequenceNumber.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordOutput]
  }
  
  extension [Self <: PutRecordOutput](x: Self) {
    
    inline def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
    
    inline def setSequenceNumber(value: SequenceNumber): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setShardId(value: ShardId): Self = StObject.set(x, "ShardId", value.asInstanceOf[js.Any])
  }
}
