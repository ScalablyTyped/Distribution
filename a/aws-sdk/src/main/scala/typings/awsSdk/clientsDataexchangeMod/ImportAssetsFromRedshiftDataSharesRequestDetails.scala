package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAssetsFromRedshiftDataSharesRequestDetails extends StObject {
  
  /**
    * A list of Amazon Redshift datashare assets.
    */
  var AssetSources: ListOfRedshiftDataShareAssetSourceEntry
  
  /**
    * The unique identifier for the data set associated with this import job.
    */
  var DataSetId: Id
  
  /**
    * The unique identifier for the revision associated with this import job.
    */
  var RevisionId: Id
}
object ImportAssetsFromRedshiftDataSharesRequestDetails {
  
  inline def apply(AssetSources: ListOfRedshiftDataShareAssetSourceEntry, DataSetId: Id, RevisionId: Id): ImportAssetsFromRedshiftDataSharesRequestDetails = {
    val __obj = js.Dynamic.literal(AssetSources = AssetSources.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetsFromRedshiftDataSharesRequestDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportAssetsFromRedshiftDataSharesRequestDetails] (val x: Self) extends AnyVal {
    
    inline def setAssetSources(value: ListOfRedshiftDataShareAssetSourceEntry): Self = StObject.set(x, "AssetSources", value.asInstanceOf[js.Any])
    
    inline def setAssetSourcesVarargs(value: RedshiftDataShareAssetSourceEntry*): Self = StObject.set(x, "AssetSources", js.Array(value*))
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
