package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSet extends StObject {
  
  /**
    * The logical identifier for a specific data set (in mainframe format).
    */
  var datasetName: String
  
  /**
    * The type of dataset. Possible values include VSAM, IS, PS, GDG, PO, PS, UNKNOWN etc.
    */
  var datasetOrg: DatasetOrgAttributes
  
  /**
    * The length of a record.
    */
  var recordLength: RecordLength
  
  /**
    * The relative location of the data set in the database or file system. 
    */
  var relativePath: js.UndefOr[String] = js.undefined
  
  /**
    * The storage type of the data set: database or file system. For Micro Focus, database corresponds to datastore and file system corresponds to EFS/FSX. For Blu Age, there is no support of file system and database corresponds to Blusam. 
    */
  var storageType: js.UndefOr[String] = js.undefined
}
object DataSet {
  
  inline def apply(datasetName: String, datasetOrg: DatasetOrgAttributes, recordLength: RecordLength): DataSet = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any], datasetOrg = datasetOrg.asInstanceOf[js.Any], recordLength = recordLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSet]
  }
  
  extension [Self <: DataSet](x: Self) {
    
    inline def setDatasetName(value: String): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetOrg(value: DatasetOrgAttributes): Self = StObject.set(x, "datasetOrg", value.asInstanceOf[js.Any])
    
    inline def setRecordLength(value: RecordLength): Self = StObject.set(x, "recordLength", value.asInstanceOf[js.Any])
    
    inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
    
    inline def setStorageType(value: String): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "storageType", js.undefined)
  }
}
