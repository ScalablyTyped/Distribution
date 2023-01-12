package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAssetFromSignedUrlRequestDetails extends StObject {
  
  /**
    * The name of the asset. When importing from Amazon S3, the S3 object key is used as the asset name.
    */
  var AssetName: typings.awsSdk.clientsDataexchangeMod.AssetName
  
  /**
    * The unique identifier for the data set associated with this import job.
    */
  var DataSetId: Id
  
  /**
    * The Base64-encoded Md5 hash for the asset, used to ensure the integrity of the file at that location.
    */
  var Md5Hash: stringMin24Max24PatternAZaZ094AZaZ092AZaZ093
  
  /**
    * The unique identifier for the revision associated with this import request.
    */
  var RevisionId: Id
}
object ImportAssetFromSignedUrlRequestDetails {
  
  inline def apply(
    AssetName: AssetName,
    DataSetId: Id,
    Md5Hash: stringMin24Max24PatternAZaZ094AZaZ092AZaZ093,
    RevisionId: Id
  ): ImportAssetFromSignedUrlRequestDetails = {
    val __obj = js.Dynamic.literal(AssetName = AssetName.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], Md5Hash = Md5Hash.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetFromSignedUrlRequestDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportAssetFromSignedUrlRequestDetails] (val x: Self) extends AnyVal {
    
    inline def setAssetName(value: AssetName): Self = StObject.set(x, "AssetName", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setMd5Hash(value: stringMin24Max24PatternAZaZ094AZaZ092AZaZ093): Self = StObject.set(x, "Md5Hash", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
