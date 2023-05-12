package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportAssetToSignedUrlResponseDetails extends StObject {
  
  /**
    * The unique identifier for the asset associated with this export job.
    */
  var AssetId: Id
  
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id
  
  /**
    * The unique identifier for the revision associated with this export response.
    */
  var RevisionId: Id
  
  /**
    * The signed URL for the export request.
    */
  var SignedUrl: js.UndefOr[_String] = js.undefined
  
  /**
    * The date and time that the signed URL expires, in ISO 8601 format.
    */
  var SignedUrlExpiresAt: js.UndefOr[js.Date] = js.undefined
}
object ExportAssetToSignedUrlResponseDetails {
  
  inline def apply(AssetId: Id, DataSetId: Id, RevisionId: Id): ExportAssetToSignedUrlResponseDetails = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAssetToSignedUrlResponseDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportAssetToSignedUrlResponseDetails] (val x: Self) extends AnyVal {
    
    inline def setAssetId(value: Id): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setSignedUrl(value: _String): Self = StObject.set(x, "SignedUrl", value.asInstanceOf[js.Any])
    
    inline def setSignedUrlExpiresAt(value: js.Date): Self = StObject.set(x, "SignedUrlExpiresAt", value.asInstanceOf[js.Any])
    
    inline def setSignedUrlExpiresAtUndefined: Self = StObject.set(x, "SignedUrlExpiresAt", js.undefined)
    
    inline def setSignedUrlUndefined: Self = StObject.set(x, "SignedUrl", js.undefined)
  }
}
