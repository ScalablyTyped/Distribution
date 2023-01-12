package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChangesetRequest extends StObject {
  
  /**
    * The unique identifier of the Changeset for which to get data.
    */
  var changesetId: ChangesetId
  
  /**
    * The unique identifier for the FinSpace Dataset where the Changeset is created.
    */
  var datasetId: DatasetId
}
object GetChangesetRequest {
  
  inline def apply(changesetId: ChangesetId, datasetId: DatasetId): GetChangesetRequest = {
    val __obj = js.Dynamic.literal(changesetId = changesetId.asInstanceOf[js.Any], datasetId = datasetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChangesetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetChangesetRequest] (val x: Self) extends AnyVal {
    
    inline def setChangesetId(value: ChangesetId): Self = StObject.set(x, "changesetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetId(value: DatasetId): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
  }
}
