package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRecordOutput extends StObject {
  
  /**
    * Indicates whether server-side encryption (SSE) was enabled during this operation.
    */
  var Encrypted: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The ID of the record.
    */
  var RecordId: PutResponseRecordId
}
object PutRecordOutput {
  
  inline def apply(RecordId: PutResponseRecordId): PutRecordOutput = {
    val __obj = js.Dynamic.literal(RecordId = RecordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRecordOutput] (val x: Self) extends AnyVal {
    
    inline def setEncrypted(value: BooleanObject): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setRecordId(value: PutResponseRecordId): Self = StObject.set(x, "RecordId", value.asInstanceOf[js.Any])
  }
}
