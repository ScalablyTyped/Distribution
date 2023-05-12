package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssetRequest extends StObject {
  
  /**
    * The unique identifier for an asset.
    */
  var AssetId: _String
  
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: _String
  
  /**
    * The name of the asset. When importing from Amazon S3, the Amazon S3 object key is used as the asset name. When exporting to Amazon S3, the asset name is used as default target Amazon S3 object key. When importing from Amazon API Gateway API, the API name is used as the asset name. When importing from Amazon Redshift, the datashare name is used as the asset name. When importing from AWS Lake Formation, the static values of "Database(s) included in the LF-tag policy" or "Table(s) included in LF-tag policy" are used as the name.
    */
  var Name: AssetName
  
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: _String
}
object UpdateAssetRequest {
  
  inline def apply(AssetId: _String, DataSetId: _String, Name: AssetName, RevisionId: _String): UpdateAssetRequest = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAssetRequest] (val x: Self) extends AnyVal {
    
    inline def setAssetId(value: _String): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: _String): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setName(value: AssetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: _String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
