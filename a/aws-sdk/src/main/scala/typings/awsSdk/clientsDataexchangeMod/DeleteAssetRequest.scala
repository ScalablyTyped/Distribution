package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssetRequest extends StObject {
  
  /**
    * The unique identifier for an asset.
    */
  var AssetId: _String
  
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: _String
  
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: _String
}
object DeleteAssetRequest {
  
  inline def apply(AssetId: _String, DataSetId: _String, RevisionId: _String): DeleteAssetRequest = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAssetRequest] (val x: Self) extends AnyVal {
    
    inline def setAssetId(value: _String): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: _String): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: _String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
