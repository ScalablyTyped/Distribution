package typings.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeywordDefinition extends js.Object {
  
  @JSName("$data")
  var $data: js.UndefOr[Boolean] = js.native
  
  var async: js.UndefOr[Boolean] = js.native
  
  var compile: js.UndefOr[
    js.Function3[
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      /* it */ CompilationContext, 
      ValidateFunction
    ]
  ] = js.native
  
  var dependencies: js.UndefOr[js.Array[String]] = js.native
  
  var errors: js.UndefOr[Boolean | String] = js.native
  
  var `inline`: js.UndefOr[
    js.Function4[
      /* it */ CompilationContext, 
      /* keyword */ String, 
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      String
    ]
  ] = js.native
  
  var `macro`: js.UndefOr[
    js.Function3[
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      /* it */ CompilationContext, 
      js.Object | Boolean
    ]
  ] = js.native
  
  var metaSchema: js.UndefOr[js.Object] = js.native
  
  var modifying: js.UndefOr[Boolean] = js.native
  
  // schema: false makes validate not to expect schema (ValidateFunction)
  var schema: js.UndefOr[Boolean] = js.native
  
  var statements: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  
  var valid: js.UndefOr[Boolean] = js.native
  
  // one and only one of the following properties should be present
  var validate: js.UndefOr[SchemaValidateFunction | ValidateFunction] = js.native
}
object KeywordDefinition {
  
  @scala.inline
  def apply(): KeywordDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeywordDefinition]
  }
  
  @scala.inline
  implicit class KeywordDefinitionOps[Self <: KeywordDefinition] (val x: Self) extends AnyVal {
    
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
    def set$data(value: Boolean): Self = this.set("$data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$data: Self = this.set("$data", js.undefined)
    
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setCompile(
      value: (/* schema */ js.Any, /* parentSchema */ js.Object, /* it */ CompilationContext) => ValidateFunction
    ): Self = this.set("compile", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCompile: Self = this.set("compile", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = this.set("dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setErrors(value: Boolean | String): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setInline(
      value: (/* it */ CompilationContext, /* keyword */ String, /* schema */ js.Any, /* parentSchema */ js.Object) => String
    ): Self = this.set("inline", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setMacro(
      value: (/* schema */ js.Any, /* parentSchema */ js.Object, /* it */ CompilationContext) => js.Object | Boolean
    ): Self = this.set("macro", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteMacro: Self = this.set("macro", js.undefined)
    
    @scala.inline
    def setMetaSchema(value: js.Object): Self = this.set("metaSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaSchema: Self = this.set("metaSchema", js.undefined)
    
    @scala.inline
    def setModifying(value: Boolean): Self = this.set("modifying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifying: Self = this.set("modifying", js.undefined)
    
    @scala.inline
    def setSchema(value: Boolean): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setStatements(value: Boolean): Self = this.set("statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatements: Self = this.set("statements", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String | js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
    
    @scala.inline
    def setValidate(value: SchemaValidateFunction | ValidateFunction): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
