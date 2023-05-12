package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateS3DataAccessFromS3BucketResponseDetails extends StObject {
  
  /**
    * Details about the asset source from an Amazon S3 bucket.
    */
  var AssetSource: S3DataAccessAssetSourceEntry
  
  /**
    * The unique identifier for this data set.
    */
  var DataSetId: Id
  
  /**
    * The unique identifier for the revision.
    */
  var RevisionId: Id
}
object CreateS3DataAccessFromS3BucketResponseDetails {
  
  inline def apply(AssetSource: S3DataAccessAssetSourceEntry, DataSetId: Id, RevisionId: Id): CreateS3DataAccessFromS3BucketResponseDetails = {
    val __obj = js.Dynamic.literal(AssetSource = AssetSource.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateS3DataAccessFromS3BucketResponseDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateS3DataAccessFromS3BucketResponseDetails] (val x: Self) extends AnyVal {
    
    inline def setAssetSource(value: S3DataAccessAssetSourceEntry): Self = StObject.set(x, "AssetSource", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
