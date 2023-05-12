package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfiguredTableInput extends StObject {
  
  /**
    * The columns of the underlying table that can be used by collaborations or analysis rules.
    */
  var allowedColumns: AllowedColumnList
  
  /**
    * The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
    */
  var analysisMethod: AnalysisMethod
  
  /**
    * A description for the configured table.
    */
  var description: js.UndefOr[TableDescription] = js.undefined
  
  /**
    * The name of the configured table.
    */
  var name: DisplayName
  
  /**
    * A reference to the AWS Glue table being configured.
    */
  var tableReference: TableReference
  
  /**
    * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM policies to control access to this resource.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateConfiguredTableInput {
  
  inline def apply(
    allowedColumns: AllowedColumnList,
    analysisMethod: AnalysisMethod,
    name: DisplayName,
    tableReference: TableReference
  ): CreateConfiguredTableInput = {
    val __obj = js.Dynamic.literal(allowedColumns = allowedColumns.asInstanceOf[js.Any], analysisMethod = analysisMethod.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tableReference = tableReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfiguredTableInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateConfiguredTableInput] (val x: Self) extends AnyVal {
    
    inline def setAllowedColumns(value: AllowedColumnList): Self = StObject.set(x, "allowedColumns", value.asInstanceOf[js.Any])
    
    inline def setAllowedColumnsVarargs(value: ColumnName*): Self = StObject.set(x, "allowedColumns", js.Array(value*))
    
    inline def setAnalysisMethod(value: AnalysisMethod): Self = StObject.set(x, "analysisMethod", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: TableDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: DisplayName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTableReference(value: TableReference): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
