package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssetRequest extends StObject {
  
  /**
    * The unique identifier for an asset.
    */
  var AssetId: string
  
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string
  
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: string
}
object DeleteAssetRequest {
  
  inline def apply(AssetId: string, DataSetId: string, RevisionId: string): DeleteAssetRequest = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssetRequest]
  }
  
  extension [Self <: DeleteAssetRequest](x: Self) {
    
    inline def setAssetId(value: string): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: string): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: string): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
