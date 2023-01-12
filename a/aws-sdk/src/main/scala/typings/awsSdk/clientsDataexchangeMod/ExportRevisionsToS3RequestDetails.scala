package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportRevisionsToS3RequestDetails extends StObject {
  
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id
  
  /**
    * Encryption configuration for the export job.
    */
  var Encryption: js.UndefOr[ExportServerSideEncryption] = js.undefined
  
  /**
    * The destination for the revision.
    */
  var RevisionDestinations: ListOfRevisionDestinationEntry
}
object ExportRevisionsToS3RequestDetails {
  
  inline def apply(DataSetId: Id, RevisionDestinations: ListOfRevisionDestinationEntry): ExportRevisionsToS3RequestDetails = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any], RevisionDestinations = RevisionDestinations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportRevisionsToS3RequestDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportRevisionsToS3RequestDetails] (val x: Self) extends AnyVal {
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setEncryption(value: ExportServerSideEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setRevisionDestinations(value: ListOfRevisionDestinationEntry): Self = StObject.set(x, "RevisionDestinations", value.asInstanceOf[js.Any])
    
    inline def setRevisionDestinationsVarargs(value: RevisionDestinationEntry*): Self = StObject.set(x, "RevisionDestinations", js.Array(value*))
  }
}
