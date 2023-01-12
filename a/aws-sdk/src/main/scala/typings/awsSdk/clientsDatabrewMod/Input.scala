package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  /**
    * The Glue Data Catalog parameters for the data.
    */
  var DataCatalogInputDefinition: js.UndefOr[typings.awsSdk.clientsDatabrewMod.DataCatalogInputDefinition] = js.undefined
  
  /**
    * Connection information for dataset input files stored in a database.
    */
  var DatabaseInputDefinition: js.UndefOr[typings.awsSdk.clientsDatabrewMod.DatabaseInputDefinition] = js.undefined
  
  /**
    * Contains additional resource information needed for specific datasets.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsDatabrewMod.Metadata] = js.undefined
  
  /**
    * The Amazon S3 location where the data is stored.
    */
  var S3InputDefinition: js.UndefOr[S3Location] = js.undefined
}
object Input {
  
  inline def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    inline def setDataCatalogInputDefinition(value: DataCatalogInputDefinition): Self = StObject.set(x, "DataCatalogInputDefinition", value.asInstanceOf[js.Any])
    
    inline def setDataCatalogInputDefinitionUndefined: Self = StObject.set(x, "DataCatalogInputDefinition", js.undefined)
    
    inline def setDatabaseInputDefinition(value: DatabaseInputDefinition): Self = StObject.set(x, "DatabaseInputDefinition", value.asInstanceOf[js.Any])
    
    inline def setDatabaseInputDefinitionUndefined: Self = StObject.set(x, "DatabaseInputDefinition", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setS3InputDefinition(value: S3Location): Self = StObject.set(x, "S3InputDefinition", value.asInstanceOf[js.Any])
    
    inline def setS3InputDefinitionUndefined: Self = StObject.set(x, "S3InputDefinition", js.undefined)
  }
}
