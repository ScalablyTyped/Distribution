package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateS3DataAccessFromS3BucketRequestDetails extends StObject {
  
  /**
    * Details about the S3 data access source asset.
    */
  var AssetSource: S3DataAccessAssetSourceEntry
  
  /**
    * The unique identifier for the data set associated with the creation of this Amazon S3 data access.
    */
  var DataSetId: Id
  
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: Id
}
object CreateS3DataAccessFromS3BucketRequestDetails {
  
  inline def apply(AssetSource: S3DataAccessAssetSourceEntry, DataSetId: Id, RevisionId: Id): CreateS3DataAccessFromS3BucketRequestDetails = {
    val __obj = js.Dynamic.literal(AssetSource = AssetSource.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateS3DataAccessFromS3BucketRequestDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateS3DataAccessFromS3BucketRequestDetails] (val x: Self) extends AnyVal {
    
    inline def setAssetSource(value: S3DataAccessAssetSourceEntry): Self = StObject.set(x, "AssetSource", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
