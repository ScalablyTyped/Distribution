package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportRevisionsToS3ResponseDetails extends StObject {
  
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id
  
  /**
    * Encryption configuration of the export job.
    */
  var Encryption: js.UndefOr[ExportServerSideEncryption] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the event action.
    */
  var EventActionArn: js.UndefOr[string] = js.undefined
  
  /**
    * The destination in Amazon S3 where the revision is exported.
    */
  var RevisionDestinations: ListOfRevisionDestinationEntry
}
object ExportRevisionsToS3ResponseDetails {
  
  inline def apply(DataSetId: Id, RevisionDestinations: ListOfRevisionDestinationEntry): ExportRevisionsToS3ResponseDetails = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any], RevisionDestinations = RevisionDestinations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportRevisionsToS3ResponseDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportRevisionsToS3ResponseDetails] (val x: Self) extends AnyVal {
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setEncryption(value: ExportServerSideEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setEventActionArn(value: string): Self = StObject.set(x, "EventActionArn", value.asInstanceOf[js.Any])
    
    inline def setEventActionArnUndefined: Self = StObject.set(x, "EventActionArn", js.undefined)
    
    inline def setRevisionDestinations(value: ListOfRevisionDestinationEntry): Self = StObject.set(x, "RevisionDestinations", value.asInstanceOf[js.Any])
    
    inline def setRevisionDestinationsVarargs(value: RevisionDestinationEntry*): Self = StObject.set(x, "RevisionDestinations", js.Array(value*))
  }
}
