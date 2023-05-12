package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schema extends StObject {
  
  /**
    * The analysis method for the schema. The only valid value is currently DIRECT_QUERY.
    */
  var analysisMethod: js.UndefOr[AnalysisMethod] = js.undefined
  
  /**
    * The analysis rule types associated with the schema. Valued values are LIST and AGGREGATION. Currently, only one entry is present.
    */
  var analysisRuleTypes: AnalysisRuleTypeList
  
  /**
    * The unique ARN for the collaboration that the schema belongs to.
    */
  var collaborationArn: CollaborationArn
  
  /**
    * The unique ID for the collaboration that the schema belongs to.
    */
  var collaborationId: UUID
  
  /**
    * The columns for the relation this schema represents.
    */
  var columns: ColumnList
  
  /**
    * The time the schema was created.
    */
  var createTime: js.Date
  
  /**
    * The unique account ID for the AWS account that owns the schema.
    */
  var creatorAccountId: AccountId
  
  /**
    * A description for the schema.
    */
  var description: TableDescription
  
  /**
    * A name for the schema. The schema relation is referred to by this name when queried by a protected query.
    */
  var name: TableAlias
  
  /**
    * The partition keys for the dataset underlying this schema.
    */
  var partitionKeys: ColumnList
  
  /**
    * The type of schema. The only valid value is currently `TABLE`.
    */
  var `type`: SchemaType
  
  /**
    * The time the schema was last updated.
    */
  var updateTime: js.Date
}
object Schema {
  
  inline def apply(
    analysisRuleTypes: AnalysisRuleTypeList,
    collaborationArn: CollaborationArn,
    collaborationId: UUID,
    columns: ColumnList,
    createTime: js.Date,
    creatorAccountId: AccountId,
    description: TableDescription,
    name: TableAlias,
    partitionKeys: ColumnList,
    `type`: SchemaType,
    updateTime: js.Date
  ): Schema = {
    val __obj = js.Dynamic.literal(analysisRuleTypes = analysisRuleTypes.asInstanceOf[js.Any], collaborationArn = collaborationArn.asInstanceOf[js.Any], collaborationId = collaborationId.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], creatorAccountId = creatorAccountId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionKeys = partitionKeys.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
    
    inline def setAnalysisMethod(value: AnalysisMethod): Self = StObject.set(x, "analysisMethod", value.asInstanceOf[js.Any])
    
    inline def setAnalysisMethodUndefined: Self = StObject.set(x, "analysisMethod", js.undefined)
    
    inline def setAnalysisRuleTypes(value: AnalysisRuleTypeList): Self = StObject.set(x, "analysisRuleTypes", value.asInstanceOf[js.Any])
    
    inline def setAnalysisRuleTypesVarargs(value: AnalysisRuleType*): Self = StObject.set(x, "analysisRuleTypes", js.Array(value*))
    
    inline def setCollaborationArn(value: CollaborationArn): Self = StObject.set(x, "collaborationArn", value.asInstanceOf[js.Any])
    
    inline def setCollaborationId(value: UUID): Self = StObject.set(x, "collaborationId", value.asInstanceOf[js.Any])
    
    inline def setColumns(value: ColumnList): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreatorAccountId(value: AccountId): Self = StObject.set(x, "creatorAccountId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: TableDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: TableAlias): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeys(value: ColumnList): Self = StObject.set(x, "partitionKeys", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeysVarargs(value: Column*): Self = StObject.set(x, "partitionKeys", js.Array(value*))
    
    inline def setType(value: SchemaType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
