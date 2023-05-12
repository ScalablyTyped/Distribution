package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicCalculatedField extends StObject {
  
  /**
    * The default aggregation. Valid values for this structure are SUM, MAX, MIN, COUNT, DISTINCT_COUNT, and AVERAGE.
    */
  var Aggregation: js.UndefOr[DefaultAggregation] = js.undefined
  
  /**
    * The list of aggregation types that are allowed for the calculated field. Valid values for this structure are COUNT, DISTINCT_COUNT, MIN, MAX, MEDIAN, SUM, AVERAGE, STDEV, STDEVP, VAR, VARP, and PERCENTILE.
    */
  var AllowedAggregations: js.UndefOr[AuthorSpecifiedAggregations] = js.undefined
  
  /**
    * The calculated field description.
    */
  var CalculatedFieldDescription: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The calculated field name.
    */
  var CalculatedFieldName: LimitedString
  
  /**
    * The other names or aliases for the calculated field.
    */
  var CalculatedFieldSynonyms: js.UndefOr[Synonyms] = js.undefined
  
  /**
    * The other names or aliases for the calculated field cell value.
    */
  var CellValueSynonyms: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CellValueSynonyms] = js.undefined
  
  /**
    * The column data role for a calculated field. Valid values for this structure are DIMENSION and MEASURE.
    */
  var ColumnDataRole: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ColumnDataRole] = js.undefined
  
  /**
    * The order in which data is displayed for the calculated field when it's used in a comparative context.
    */
  var ComparativeOrder: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ComparativeOrder] = js.undefined
  
  /**
    * The default formatting definition.
    */
  var DefaultFormatting: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DefaultFormatting] = js.undefined
  
  /**
    * A Boolean value that indicates if a calculated field is visible in the autocomplete.
    */
  var DisableIndexing: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The calculated field expression.
    */
  var Expression: typings.awsSdk.clientsQuicksightMod.Expression
  
  /**
    * A boolean value that indicates if a calculated field is included in the topic.
    */
  var IsIncludedInTopic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that indicates whether to never aggregate calculated field in filters.
    */
  var NeverAggregateInFilter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of aggregation types that are not allowed for the calculated field. Valid values for this structure are COUNT, DISTINCT_COUNT, MIN, MAX, MEDIAN, SUM, AVERAGE, STDEV, STDEVP, VAR, VARP, and PERCENTILE.
    */
  var NotAllowedAggregations: js.UndefOr[AuthorSpecifiedAggregations] = js.undefined
  
  /**
    * The semantic type.
    */
  var SemanticType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SemanticType] = js.undefined
  
  /**
    * The level of time precision that is used to aggregate DateTime values.
    */
  var TimeGranularity: js.UndefOr[TopicTimeGranularity] = js.undefined
}
object TopicCalculatedField {
  
  inline def apply(CalculatedFieldName: LimitedString, Expression: Expression): TopicCalculatedField = {
    val __obj = js.Dynamic.literal(CalculatedFieldName = CalculatedFieldName.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicCalculatedField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicCalculatedField] (val x: Self) extends AnyVal {
    
    inline def setAggregation(value: DefaultAggregation): Self = StObject.set(x, "Aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "Aggregation", js.undefined)
    
    inline def setAllowedAggregations(value: AuthorSpecifiedAggregations): Self = StObject.set(x, "AllowedAggregations", value.asInstanceOf[js.Any])
    
    inline def setAllowedAggregationsUndefined: Self = StObject.set(x, "AllowedAggregations", js.undefined)
    
    inline def setAllowedAggregationsVarargs(value: AuthorSpecifiedAggregation*): Self = StObject.set(x, "AllowedAggregations", js.Array(value*))
    
    inline def setCalculatedFieldDescription(value: LimitedString): Self = StObject.set(x, "CalculatedFieldDescription", value.asInstanceOf[js.Any])
    
    inline def setCalculatedFieldDescriptionUndefined: Self = StObject.set(x, "CalculatedFieldDescription", js.undefined)
    
    inline def setCalculatedFieldName(value: LimitedString): Self = StObject.set(x, "CalculatedFieldName", value.asInstanceOf[js.Any])
    
    inline def setCalculatedFieldSynonyms(value: Synonyms): Self = StObject.set(x, "CalculatedFieldSynonyms", value.asInstanceOf[js.Any])
    
    inline def setCalculatedFieldSynonymsUndefined: Self = StObject.set(x, "CalculatedFieldSynonyms", js.undefined)
    
    inline def setCalculatedFieldSynonymsVarargs(value: LimitedString*): Self = StObject.set(x, "CalculatedFieldSynonyms", js.Array(value*))
    
    inline def setCellValueSynonyms(value: CellValueSynonyms): Self = StObject.set(x, "CellValueSynonyms", value.asInstanceOf[js.Any])
    
    inline def setCellValueSynonymsUndefined: Self = StObject.set(x, "CellValueSynonyms", js.undefined)
    
    inline def setCellValueSynonymsVarargs(value: CellValueSynonym*): Self = StObject.set(x, "CellValueSynonyms", js.Array(value*))
    
    inline def setColumnDataRole(value: ColumnDataRole): Self = StObject.set(x, "ColumnDataRole", value.asInstanceOf[js.Any])
    
    inline def setColumnDataRoleUndefined: Self = StObject.set(x, "ColumnDataRole", js.undefined)
    
    inline def setComparativeOrder(value: ComparativeOrder): Self = StObject.set(x, "ComparativeOrder", value.asInstanceOf[js.Any])
    
    inline def setComparativeOrderUndefined: Self = StObject.set(x, "ComparativeOrder", js.undefined)
    
    inline def setDefaultFormatting(value: DefaultFormatting): Self = StObject.set(x, "DefaultFormatting", value.asInstanceOf[js.Any])
    
    inline def setDefaultFormattingUndefined: Self = StObject.set(x, "DefaultFormatting", js.undefined)
    
    inline def setDisableIndexing(value: NullableBoolean): Self = StObject.set(x, "DisableIndexing", value.asInstanceOf[js.Any])
    
    inline def setDisableIndexingUndefined: Self = StObject.set(x, "DisableIndexing", js.undefined)
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setIsIncludedInTopic(value: Boolean): Self = StObject.set(x, "IsIncludedInTopic", value.asInstanceOf[js.Any])
    
    inline def setIsIncludedInTopicUndefined: Self = StObject.set(x, "IsIncludedInTopic", js.undefined)
    
    inline def setNeverAggregateInFilter(value: Boolean): Self = StObject.set(x, "NeverAggregateInFilter", value.asInstanceOf[js.Any])
    
    inline def setNeverAggregateInFilterUndefined: Self = StObject.set(x, "NeverAggregateInFilter", js.undefined)
    
    inline def setNotAllowedAggregations(value: AuthorSpecifiedAggregations): Self = StObject.set(x, "NotAllowedAggregations", value.asInstanceOf[js.Any])
    
    inline def setNotAllowedAggregationsUndefined: Self = StObject.set(x, "NotAllowedAggregations", js.undefined)
    
    inline def setNotAllowedAggregationsVarargs(value: AuthorSpecifiedAggregation*): Self = StObject.set(x, "NotAllowedAggregations", js.Array(value*))
    
    inline def setSemanticType(value: SemanticType): Self = StObject.set(x, "SemanticType", value.asInstanceOf[js.Any])
    
    inline def setSemanticTypeUndefined: Self = StObject.set(x, "SemanticType", js.undefined)
    
    inline def setTimeGranularity(value: TopicTimeGranularity): Self = StObject.set(x, "TimeGranularity", value.asInstanceOf[js.Any])
    
    inline def setTimeGranularityUndefined: Self = StObject.set(x, "TimeGranularity", js.undefined)
  }
}
