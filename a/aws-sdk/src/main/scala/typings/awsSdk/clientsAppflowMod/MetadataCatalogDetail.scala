package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataCatalogDetail extends StObject {
  
  /**
    * The type of metadata catalog that Amazon AppFlow used for the associated flow run. This parameter returns the following value:  GLUE  The metadata catalog is provided by the Glue Data Catalog. Glue includes the Glue Data Catalog as a component.  
    */
  var catalogType: js.UndefOr[CatalogType] = js.undefined
  
  /**
    * Describes the status of the attempt from Amazon AppFlow to register the data partitions with the metadata catalog. The data partitions organize the flow output into a hierarchical path, such as a folder path in an S3 bucket. Amazon AppFlow creates the partitions (if they don't already exist) based on your flow configuration.
    */
  var partitionRegistrationOutput: js.UndefOr[RegistrationOutput] = js.undefined
  
  /**
    * The name of the table that stores the metadata for the associated flow run. The table stores metadata that represents the data that the flow transferred. Amazon AppFlow stores the table in the metadata catalog.
    */
  var tableName: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the status of the attempt from Amazon AppFlow to register the metadata table with the metadata catalog. Amazon AppFlow creates or updates this table for the associated flow run.
    */
  var tableRegistrationOutput: js.UndefOr[RegistrationOutput] = js.undefined
}
object MetadataCatalogDetail {
  
  inline def apply(): MetadataCatalogDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataCatalogDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataCatalogDetail] (val x: Self) extends AnyVal {
    
    inline def setCatalogType(value: CatalogType): Self = StObject.set(x, "catalogType", value.asInstanceOf[js.Any])
    
    inline def setCatalogTypeUndefined: Self = StObject.set(x, "catalogType", js.undefined)
    
    inline def setPartitionRegistrationOutput(value: RegistrationOutput): Self = StObject.set(x, "partitionRegistrationOutput", value.asInstanceOf[js.Any])
    
    inline def setPartitionRegistrationOutputUndefined: Self = StObject.set(x, "partitionRegistrationOutput", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    
    inline def setTableRegistrationOutput(value: RegistrationOutput): Self = StObject.set(x, "tableRegistrationOutput", value.asInstanceOf[js.Any])
    
    inline def setTableRegistrationOutputUndefined: Self = StObject.set(x, "tableRegistrationOutput", js.undefined)
  }
}
