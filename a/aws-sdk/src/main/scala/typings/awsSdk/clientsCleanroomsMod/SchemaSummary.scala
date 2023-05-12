package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSummary extends StObject {
  
  /**
    * The analysis method for the associated schema. The only valid value is currently `DIRECT_QUERY`.
    */
  var analysisMethod: js.UndefOr[AnalysisMethod] = js.undefined
  
  /**
    * The types of analysis rules that are associated with this schema object.
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
    * The time the schema object was created.
    */
  var createTime: js.Date
  
  /**
    * The unique account ID for the AWS account that owns the schema.
    */
  var creatorAccountId: AccountId
  
  /**
    * The name for the schema object.
    */
  var name: TableAlias
  
  /**
    * The type of schema object. The only valid schema type is currently `TABLE`.
    */
  var `type`: SchemaType
  
  /**
    * The time the schema object was last updated.
    */
  var updateTime: js.Date
}
object SchemaSummary {
  
  inline def apply(
    analysisRuleTypes: AnalysisRuleTypeList,
    collaborationArn: CollaborationArn,
    collaborationId: UUID,
    createTime: js.Date,
    creatorAccountId: AccountId,
    name: TableAlias,
    `type`: SchemaType,
    updateTime: js.Date
  ): SchemaSummary = {
    val __obj = js.Dynamic.literal(analysisRuleTypes = analysisRuleTypes.asInstanceOf[js.Any], collaborationArn = collaborationArn.asInstanceOf[js.Any], collaborationId = collaborationId.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], creatorAccountId = creatorAccountId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaSummary] (val x: Self) extends AnyVal {
    
    inline def setAnalysisMethod(value: AnalysisMethod): Self = StObject.set(x, "analysisMethod", value.asInstanceOf[js.Any])
    
    inline def setAnalysisMethodUndefined: Self = StObject.set(x, "analysisMethod", js.undefined)
    
    inline def setAnalysisRuleTypes(value: AnalysisRuleTypeList): Self = StObject.set(x, "analysisRuleTypes", value.asInstanceOf[js.Any])
    
    inline def setAnalysisRuleTypesVarargs(value: AnalysisRuleType*): Self = StObject.set(x, "analysisRuleTypes", js.Array(value*))
    
    inline def setCollaborationArn(value: CollaborationArn): Self = StObject.set(x, "collaborationArn", value.asInstanceOf[js.Any])
    
    inline def setCollaborationId(value: UUID): Self = StObject.set(x, "collaborationId", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreatorAccountId(value: AccountId): Self = StObject.set(x, "creatorAccountId", value.asInstanceOf[js.Any])
    
    inline def setName(value: TableAlias): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: SchemaType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
