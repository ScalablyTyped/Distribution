package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorEnrichmentJobInputConfig extends StObject {
  
  /**
    * The input structure for the data source that represents the storage type of the input data objects.
    */
  var DataSourceConfig: VectorEnrichmentJobDataSourceConfigInput
  
  /**
    * The input structure that defines the data source file type.
    */
  var DocumentType: VectorEnrichmentJobDocumentType
}
object VectorEnrichmentJobInputConfig {
  
  inline def apply(
    DataSourceConfig: VectorEnrichmentJobDataSourceConfigInput,
    DocumentType: VectorEnrichmentJobDocumentType
  ): VectorEnrichmentJobInputConfig = {
    val __obj = js.Dynamic.literal(DataSourceConfig = DataSourceConfig.asInstanceOf[js.Any], DocumentType = DocumentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorEnrichmentJobInputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VectorEnrichmentJobInputConfig] (val x: Self) extends AnyVal {
    
    inline def setDataSourceConfig(value: VectorEnrichmentJobDataSourceConfigInput): Self = StObject.set(x, "DataSourceConfig", value.asInstanceOf[js.Any])
    
    inline def setDocumentType(value: VectorEnrichmentJobDocumentType): Self = StObject.set(x, "DocumentType", value.asInstanceOf[js.Any])
  }
}
