package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportAssetToSignedUrlRequestDetails extends StObject {
  
  /**
    * The unique identifier for the asset that is exported to a signed URL.
    */
  var AssetId: Id
  
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id
  
  /**
    * The unique identifier for the revision associated with this export request.
    */
  var RevisionId: Id
}
object ExportAssetToSignedUrlRequestDetails {
  
  inline def apply(AssetId: Id, DataSetId: Id, RevisionId: Id): ExportAssetToSignedUrlRequestDetails = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAssetToSignedUrlRequestDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportAssetToSignedUrlRequestDetails] (val x: Self) extends AnyVal {
    
    inline def setAssetId(value: Id): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
