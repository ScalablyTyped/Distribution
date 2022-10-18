package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJournalS3ExportResponse extends StObject {
  
  /**
    * Information about the journal export job returned by a DescribeJournalS3Export request.
    */
  var ExportDescription: JournalS3ExportDescription
}
object DescribeJournalS3ExportResponse {
  
  inline def apply(ExportDescription: JournalS3ExportDescription): DescribeJournalS3ExportResponse = {
    val __obj = js.Dynamic.literal(ExportDescription = ExportDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJournalS3ExportResponse]
  }
  
  extension [Self <: DescribeJournalS3ExportResponse](x: Self) {
    
    inline def setExportDescription(value: JournalS3ExportDescription): Self = StObject.set(x, "ExportDescription", value.asInstanceOf[js.Any])
  }
}
