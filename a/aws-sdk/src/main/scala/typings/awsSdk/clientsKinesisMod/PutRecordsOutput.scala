package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRecordsOutput extends StObject {
  
  /**
    * The encryption type used on the records. This parameter can be one of the following values:    NONE: Do not encrypt the records.    KMS: Use server-side encryption on the records using a customer-managed Amazon Web Services KMS key.  
    */
  var EncryptionType: js.UndefOr[typings.awsSdk.clientsKinesisMod.EncryptionType] = js.undefined
  
  /**
    * The number of unsuccessfully processed records in a PutRecords request.
    */
  var FailedRecordCount: js.UndefOr[PositiveIntegerObject] = js.undefined
  
  /**
    * An array of successfully and unsuccessfully processed record results. A record that is successfully added to a stream includes SequenceNumber and ShardId in the result. A record that fails to be added to a stream includes ErrorCode and ErrorMessage in the result.
    */
  var Records: PutRecordsResultEntryList
}
object PutRecordsOutput {
  
  inline def apply(Records: PutRecordsResultEntryList): PutRecordsOutput = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordsOutput]
  }
  
  extension [Self <: PutRecordsOutput](x: Self) {
    
    inline def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
    
    inline def setFailedRecordCount(value: PositiveIntegerObject): Self = StObject.set(x, "FailedRecordCount", value.asInstanceOf[js.Any])
    
    inline def setFailedRecordCountUndefined: Self = StObject.set(x, "FailedRecordCount", js.undefined)
    
    inline def setRecords(value: PutRecordsResultEntryList): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    inline def setRecordsVarargs(value: PutRecordsResultEntry*): Self = StObject.set(x, "Records", js.Array(value*))
  }
}
