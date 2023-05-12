package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAssetFromSignedUrlResponseDetails extends StObject {
  
  /**
    * The name for the asset associated with this import job.
    */
  var AssetName: typings.awsSdk.clientsDataexchangeMod.AssetName
  
  /**
    * The unique identifier for the data set associated with this import job.
    */
  var DataSetId: Id
  
  /**
    * The Base64-encoded Md5 hash for the asset, used to ensure the integrity of the file at that location.
    */
  var Md5Hash: js.UndefOr[stringMin24Max24PatternAZaZ094AZaZ092AZaZ093] = js.undefined
  
  /**
    * The unique identifier for the revision associated with this import response.
    */
  var RevisionId: Id
  
  /**
    * The signed URL.
    */
  var SignedUrl: js.UndefOr[_String] = js.undefined
  
  /**
    * The time and date at which the signed URL expires, in ISO 8601 format.
    */
  var SignedUrlExpiresAt: js.UndefOr[js.Date] = js.undefined
}
object ImportAssetFromSignedUrlResponseDetails {
  
  inline def apply(AssetName: AssetName, DataSetId: Id, RevisionId: Id): ImportAssetFromSignedUrlResponseDetails = {
    val __obj = js.Dynamic.literal(AssetName = AssetName.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetFromSignedUrlResponseDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportAssetFromSignedUrlResponseDetails] (val x: Self) extends AnyVal {
    
    inline def setAssetName(value: AssetName): Self = StObject.set(x, "AssetName", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setMd5Hash(value: stringMin24Max24PatternAZaZ094AZaZ092AZaZ093): Self = StObject.set(x, "Md5Hash", value.asInstanceOf[js.Any])
    
    inline def setMd5HashUndefined: Self = StObject.set(x, "Md5Hash", js.undefined)
    
    inline def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setSignedUrl(value: _String): Self = StObject.set(x, "SignedUrl", value.asInstanceOf[js.Any])
    
    inline def setSignedUrlExpiresAt(value: js.Date): Self = StObject.set(x, "SignedUrlExpiresAt", value.asInstanceOf[js.Any])
    
    inline def setSignedUrlExpiresAtUndefined: Self = StObject.set(x, "SignedUrlExpiresAt", js.undefined)
    
    inline def setSignedUrlUndefined: Self = StObject.set(x, "SignedUrl", js.undefined)
  }
}
