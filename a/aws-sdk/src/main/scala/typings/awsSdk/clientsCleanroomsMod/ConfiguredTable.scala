package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfiguredTable extends StObject {
  
  /**
    * The columns within the underlying AWS Glue table that can be utilized within collaborations.
    */
  var allowedColumns: AllowedColumnList
  
  /**
    * The analysis method for the configured table. The only valid value is currently `DIRECT_QUERY`.
    */
  var analysisMethod: AnalysisMethod
  
  /**
    * The types of analysis rules associated with this configured table. Valid values are `AGGREGATION` and `LIST`. Currently, only one analysis rule may be associated with a configured table.
    */
  var analysisRuleTypes: ConfiguredTableAnalysisRuleTypeList
  
  /**
    * The unique ARN for the configured table.
    */
  var arn: ConfiguredTableArn
  
  /**
    * The time the configured table was created.
    */
  var createTime: js.Date
  
  /**
    * A description for the configured table.
    */
  var description: js.UndefOr[TableDescription] = js.undefined
  
  /**
    * The unique ID for the configured table.
    */
  var id: UUID
  
  /**
    * A name for the configured table.
    */
  var name: DisplayName
  
  /**
    * The AWS Glue table that this configured table represents.
    */
  var tableReference: TableReference
  
  /**
    * The time the configured table was last updated
    */
  var updateTime: js.Date
}
object ConfiguredTable {
  
  inline def apply(
    allowedColumns: AllowedColumnList,
    analysisMethod: AnalysisMethod,
    analysisRuleTypes: ConfiguredTableAnalysisRuleTypeList,
    arn: ConfiguredTableArn,
    createTime: js.Date,
    id: UUID,
    name: DisplayName,
    tableReference: TableReference,
    updateTime: js.Date
  ): ConfiguredTable = {
    val __obj = js.Dynamic.literal(allowedColumns = allowedColumns.asInstanceOf[js.Any], analysisMethod = analysisMethod.asInstanceOf[js.Any], analysisRuleTypes = analysisRuleTypes.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tableReference = tableReference.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfiguredTable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfiguredTable] (val x: Self) extends AnyVal {
    
    inline def setAllowedColumns(value: AllowedColumnList): Self = StObject.set(x, "allowedColumns", value.asInstanceOf[js.Any])
    
    inline def setAllowedColumnsVarargs(value: ColumnName*): Self = StObject.set(x, "allowedColumns", js.Array(value*))
    
    inline def setAnalysisMethod(value: AnalysisMethod): Self = StObject.set(x, "analysisMethod", value.asInstanceOf[js.Any])
    
    inline def setAnalysisRuleTypes(value: ConfiguredTableAnalysisRuleTypeList): Self = StObject.set(x, "analysisRuleTypes", value.asInstanceOf[js.Any])
    
    inline def setAnalysisRuleTypesVarargs(value: ConfiguredTableAnalysisRuleType*): Self = StObject.set(x, "analysisRuleTypes", js.Array(value*))
    
    inline def setArn(value: ConfiguredTableArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: TableDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: DisplayName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTableReference(value: TableReference): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
