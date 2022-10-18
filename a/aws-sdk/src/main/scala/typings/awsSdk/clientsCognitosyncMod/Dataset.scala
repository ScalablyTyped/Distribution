package typings.awsSdk.clientsCognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dataset extends StObject {
  
  /**
    * Date on which the dataset was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Total size in bytes of the records in this dataset.
    */
  var DataStorage: js.UndefOr[Long] = js.undefined
  
  /**
    * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
    */
  var DatasetName: js.UndefOr[typings.awsSdk.clientsCognitosyncMod.DatasetName] = js.undefined
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.clientsCognitosyncMod.IdentityId] = js.undefined
  
  /**
    * The device that made the last change to this dataset.
    */
  var LastModifiedBy: js.UndefOr[String] = js.undefined
  
  /**
    * Date when the dataset was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Number of records in this dataset.
    */
  var NumRecords: js.UndefOr[Long] = js.undefined
}
object Dataset {
  
  inline def apply(): Dataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dataset]
  }
  
  extension [Self <: Dataset](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDataStorage(value: Long): Self = StObject.set(x, "DataStorage", value.asInstanceOf[js.Any])
    
    inline def setDataStorageUndefined: Self = StObject.set(x, "DataStorage", js.undefined)
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    inline def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    inline def setLastModifiedBy(value: String): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setNumRecords(value: Long): Self = StObject.set(x, "NumRecords", value.asInstanceOf[js.Any])
    
    inline def setNumRecordsUndefined: Self = StObject.set(x, "NumRecords", js.undefined)
  }
}
