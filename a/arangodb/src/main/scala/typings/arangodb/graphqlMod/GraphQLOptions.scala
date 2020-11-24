package typings.arangodb.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLOptions extends js.Object {
  
  var context: js.UndefOr[js.Any] = js.native
  
  var formatError: js.UndefOr[GraphQLFormatErrorFunction] = js.native
  
  var graphiql: js.UndefOr[Boolean] = js.native
  
  var graphql: js.UndefOr[GraphQLModule] = js.native
  
  var pretty: js.UndefOr[Boolean] = js.native
  
  var rootValue: js.UndefOr[js.Object] = js.native
  
  var schema: GraphQLSchema = js.native
  
  var validationRules: js.UndefOr[js.Array[_]] = js.native
}
object GraphQLOptions {
  
  @scala.inline
  def apply(schema: GraphQLSchema): GraphQLOptions = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLOptions]
  }
  
  @scala.inline
  implicit class GraphQLOptionsOps[Self <: GraphQLOptions] (val x: Self) extends AnyVal {
    
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
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setFormatError(value: /* error */ js.Any => js.Any): Self = this.set("formatError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatError: Self = this.set("formatError", js.undefined)
    
    @scala.inline
    def setGraphiql(value: Boolean): Self = this.set("graphiql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphiql: Self = this.set("graphiql", js.undefined)
    
    @scala.inline
    def setGraphql(value: GraphQLModule): Self = this.set("graphql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphql: Self = this.set("graphql", js.undefined)
    
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    
    @scala.inline
    def setRootValue(value: js.Object): Self = this.set("rootValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootValue: Self = this.set("rootValue", js.undefined)
    
    @scala.inline
    def setValidationRulesVarargs(value: js.Any*): Self = this.set("validationRules", js.Array(value :_*))
    
    @scala.inline
    def setValidationRules(value: js.Array[_]): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
  }
}
