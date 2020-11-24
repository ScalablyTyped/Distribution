package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldName extends js.Object {
  
  var fieldName: String = js.native
  
  var parentTypeName: String = js.native
  
  var selectionSetGraphQL: String = js.native
  
  var selectionSetList: js.Array[String] = js.native
  
  var variables: StringDictionary[js.Any] = js.native
}
object FieldName {
  
  @scala.inline
  def apply(
    fieldName: String,
    parentTypeName: String,
    selectionSetGraphQL: String,
    selectionSetList: js.Array[String],
    variables: StringDictionary[js.Any]
  ): FieldName = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], parentTypeName = parentTypeName.asInstanceOf[js.Any], selectionSetGraphQL = selectionSetGraphQL.asInstanceOf[js.Any], selectionSetList = selectionSetList.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldName]
  }
  
  @scala.inline
  implicit class FieldNameOps[Self <: FieldName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentTypeName(value: String): Self = this.set("parentTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionSetGraphQL(value: String): Self = this.set("selectionSetGraphQL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionSetListVarargs(value: String*): Self = this.set("selectionSetList", js.Array(value :_*))
    
    @scala.inline
    def setSelectionSetList(value: js.Array[String]): Self = this.set("selectionSetList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: StringDictionary[js.Any]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
}
