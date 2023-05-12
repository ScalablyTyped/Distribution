package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAssetsFromS3RequestDetails extends StObject {
  
  /**
    * Is a list of Amazon S3 bucket and object key pairs.
    */
  var AssetSources: ListOfAssetSourceEntry
  
  /**
    * The unique identifier for the data set associated with this import job.
    */
  var DataSetId: Id
  
  /**
    * The unique identifier for the revision associated with this import request.
    */
  var RevisionId: Id
}
object ImportAssetsFromS3RequestDetails {
  
  inline def apply(AssetSources: ListOfAssetSourceEntry, DataSetId: Id, RevisionId: Id): ImportAssetsFromS3RequestDetails = {
    val __obj = js.Dynamic.literal(AssetSources = AssetSources.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetsFromS3RequestDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportAssetsFromS3RequestDetails] (val x: Self) extends AnyVal {
    
    inline def setAssetSources(value: ListOfAssetSourceEntry): Self = StObject.set(x, "AssetSources", value.asInstanceOf[js.Any])
    
    inline def setAssetSourcesVarargs(value: AssetSourceEntry*): Self = StObject.set(x, "AssetSources", js.Array(value*))
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
