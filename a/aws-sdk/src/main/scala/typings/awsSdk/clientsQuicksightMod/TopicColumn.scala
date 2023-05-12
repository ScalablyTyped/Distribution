package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicColumn extends StObject {
  
  /**
    * The type of aggregation that is performed on the column data when it's queried. Valid values for this structure are SUM, MAX, MIN, COUNT, DISTINCT_COUNT, and AVERAGE.
    */
  var Aggregation: js.UndefOr[DefaultAggregation] = js.undefined
  
  /**
    * The list of aggregation types that are allowed for the column. Valid values for this structure are COUNT, DISTINCT_COUNT, MIN, MAX, MEDIAN, SUM, AVERAGE, STDEV, STDEVP, VAR, VARP, and PERCENTILE.
    */
  var AllowedAggregations: js.UndefOr[AuthorSpecifiedAggregations] = js.undefined
  
  /**
    * The other names or aliases for the column cell value.
    */
  var CellValueSynonyms: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CellValueSynonyms] = js.undefined
  
  /**
    * The role of the column in the data. Valid values are DIMENSION and MEASURE.
    */
  var ColumnDataRole: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ColumnDataRole] = js.undefined
  
  /**
    * A description of the column and its contents.
    */
  var ColumnDescription: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * A user-friendly name for the column.
    */
  var ColumnFriendlyName: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The name of the column.
    */
  var ColumnName: LimitedString
  
  /**
    * The other names or aliases for the column.
    */
  var ColumnSynonyms: js.UndefOr[Synonyms] = js.undefined
  
  /**
    * The order in which data is displayed for the column when it's used in a comparative context.
    */
  var ComparativeOrder: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ComparativeOrder] = js.undefined
  
  /**
    * The default formatting used for values in the column.
    */
  var DefaultFormatting: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DefaultFormatting] = js.undefined
  
  /**
    * A Boolean value that indicates whether the column shows in the autocomplete functionality.
    */
  var DisableIndexing: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * A Boolean value that indicates whether the column is included in the query results.
    */
  var IsIncludedInTopic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that indicates whether to aggregate the column data when it's used in a filter context.
    */
  var NeverAggregateInFilter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of aggregation types that are not allowed for the column. Valid values for this structure are COUNT, DISTINCT_COUNT, MIN, MAX, MEDIAN, SUM, AVERAGE, STDEV, STDEVP, VAR, VARP, and PERCENTILE.
    */
  var NotAllowedAggregations: js.UndefOr[AuthorSpecifiedAggregations] = js.undefined
  
  /**
    * The semantic type of data contained in the column.
    */
  var SemanticType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SemanticType] = js.undefined
  
  /**
    * The level of time precision that is used to aggregate DateTime values.
    */
  var TimeGranularity: js.UndefOr[TopicTimeGranularity] = js.undefined
}
object TopicColumn {
  
  inline def apply(ColumnName: LimitedString): TopicColumn = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicColumn] (val x: Self) extends AnyVal {
    
    inline def setAggregation(value: DefaultAggregation): Self = StObject.set(x, "Aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "Aggregation", js.undefined)
    
    inline def setAllowedAggregations(value: AuthorSpecifiedAggregations): Self = StObject.set(x, "AllowedAggregations", value.asInstanceOf[js.Any])
    
    inline def setAllowedAggregationsUndefined: Self = StObject.set(x, "AllowedAggregations", js.undefined)
    
    inline def setAllowedAggregationsVarargs(value: AuthorSpecifiedAggregation*): Self = StObject.set(x, "AllowedAggregations", js.Array(value*))
    
    inline def setCellValueSynonyms(value: CellValueSynonyms): Self = StObject.set(x, "CellValueSynonyms", value.asInstanceOf[js.Any])
    
    inline def setCellValueSynonymsUndefined: Self = StObject.set(x, "CellValueSynonyms", js.undefined)
    
    inline def setCellValueSynonymsVarargs(value: CellValueSynonym*): Self = StObject.set(x, "CellValueSynonyms", js.Array(value*))
    
    inline def setColumnDataRole(value: ColumnDataRole): Self = StObject.set(x, "ColumnDataRole", value.asInstanceOf[js.Any])
    
    inline def setColumnDataRoleUndefined: Self = StObject.set(x, "ColumnDataRole", js.undefined)
    
    inline def setColumnDescription(value: LimitedString): Self = StObject.set(x, "ColumnDescription", value.asInstanceOf[js.Any])
    
    inline def setColumnDescriptionUndefined: Self = StObject.set(x, "ColumnDescription", js.undefined)
    
    inline def setColumnFriendlyName(value: LimitedString): Self = StObject.set(x, "ColumnFriendlyName", value.asInstanceOf[js.Any])
    
    inline def setColumnFriendlyNameUndefined: Self = StObject.set(x, "ColumnFriendlyName", js.undefined)
    
    inline def setColumnName(value: LimitedString): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    inline def setColumnSynonyms(value: Synonyms): Self = StObject.set(x, "ColumnSynonyms", value.asInstanceOf[js.Any])
    
    inline def setColumnSynonymsUndefined: Self = StObject.set(x, "ColumnSynonyms", js.undefined)
    
    inline def setColumnSynonymsVarargs(value: LimitedString*): Self = StObject.set(x, "ColumnSynonyms", js.Array(value*))
    
    inline def setComparativeOrder(value: ComparativeOrder): Self = StObject.set(x, "ComparativeOrder", value.asInstanceOf[js.Any])
    
    inline def setComparativeOrderUndefined: Self = StObject.set(x, "ComparativeOrder", js.undefined)
    
    inline def setDefaultFormatting(value: DefaultFormatting): Self = StObject.set(x, "DefaultFormatting", value.asInstanceOf[js.Any])
    
    inline def setDefaultFormattingUndefined: Self = StObject.set(x, "DefaultFormatting", js.undefined)
    
    inline def setDisableIndexing(value: NullableBoolean): Self = StObject.set(x, "DisableIndexing", value.asInstanceOf[js.Any])
    
    inline def setDisableIndexingUndefined: Self = StObject.set(x, "DisableIndexing", js.undefined)
    
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
