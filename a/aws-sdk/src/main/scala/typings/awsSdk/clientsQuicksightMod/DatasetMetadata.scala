package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetMetadata extends StObject {
  
  /**
    * The list of calculated field definitions.
    */
  var CalculatedFields: js.UndefOr[TopicCalculatedFields] = js.undefined
  
  /**
    * The list of column definitions.
    */
  var Columns: js.UndefOr[TopicColumns] = js.undefined
  
  /**
    * The definition of a data aggregation.
    */
  var DataAggregation: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DataAggregation] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: Arn
  
  /**
    * The description of the dataset.
    */
  var DatasetDescription: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The name of the dataset.
    */
  var DatasetName: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The list of filter definitions.
    */
  var Filters: js.UndefOr[TopicFilters] = js.undefined
  
  /**
    * The list of named entities definitions.
    */
  var NamedEntities: js.UndefOr[TopicNamedEntities] = js.undefined
}
object DatasetMetadata {
  
  inline def apply(DatasetArn: Arn): DatasetMetadata = {
    val __obj = js.Dynamic.literal(DatasetArn = DatasetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetMetadata] (val x: Self) extends AnyVal {
    
    inline def setCalculatedFields(value: TopicCalculatedFields): Self = StObject.set(x, "CalculatedFields", value.asInstanceOf[js.Any])
    
    inline def setCalculatedFieldsUndefined: Self = StObject.set(x, "CalculatedFields", js.undefined)
    
    inline def setCalculatedFieldsVarargs(value: TopicCalculatedField*): Self = StObject.set(x, "CalculatedFields", js.Array(value*))
    
    inline def setColumns(value: TopicColumns): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "Columns", js.undefined)
    
    inline def setColumnsVarargs(value: TopicColumn*): Self = StObject.set(x, "Columns", js.Array(value*))
    
    inline def setDataAggregation(value: DataAggregation): Self = StObject.set(x, "DataAggregation", value.asInstanceOf[js.Any])
    
    inline def setDataAggregationUndefined: Self = StObject.set(x, "DataAggregation", js.undefined)
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetDescription(value: LimitedString): Self = StObject.set(x, "DatasetDescription", value.asInstanceOf[js.Any])
    
    inline def setDatasetDescriptionUndefined: Self = StObject.set(x, "DatasetDescription", js.undefined)
    
    inline def setDatasetName(value: LimitedString): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    inline def setFilters(value: TopicFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: TopicFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setNamedEntities(value: TopicNamedEntities): Self = StObject.set(x, "NamedEntities", value.asInstanceOf[js.Any])
    
    inline def setNamedEntitiesUndefined: Self = StObject.set(x, "NamedEntities", js.undefined)
    
    inline def setNamedEntitiesVarargs(value: TopicNamedEntity*): Self = StObject.set(x, "NamedEntities", js.Array(value*))
  }
}
