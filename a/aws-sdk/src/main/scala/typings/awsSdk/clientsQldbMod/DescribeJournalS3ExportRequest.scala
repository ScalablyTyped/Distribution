package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJournalS3ExportRequest extends StObject {
  
  /**
    * The UUID (represented in Base62-encoded text) of the journal export job to describe.
    */
  var ExportId: UniqueId
  
  /**
    * The name of the ledger.
    */
  var Name: LedgerName
}
object DescribeJournalS3ExportRequest {
  
  inline def apply(ExportId: UniqueId, Name: LedgerName): DescribeJournalS3ExportRequest = {
    val __obj = js.Dynamic.literal(ExportId = ExportId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJournalS3ExportRequest]
  }
  
  extension [Self <: DescribeJournalS3ExportRequest](x: Self) {
    
    inline def setExportId(value: UniqueId): Self = StObject.set(x, "ExportId", value.asInstanceOf[js.Any])
    
    inline def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
