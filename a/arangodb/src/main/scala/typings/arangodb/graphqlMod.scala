package typings.arangodb

import typings.arangodb.Foxx.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphqlMod {
  
  @JSImport("@arangodb/foxx/graphql", JSImport.Namespace)
  @js.native
  def apply(options: GraphQLOptions): Router = js.native
  @JSImport("@arangodb/foxx/graphql", JSImport.Namespace)
  @js.native
  def apply(options: GraphQLSchema): Router = js.native
  
  type GraphQLFormatErrorFunction = js.Function1[/* error */ js.Any, js.Any]
  
  @js.native
  trait GraphQLModule extends StObject {
    
    var Source: js.Any = js.native
    
    var execute: js.Any = js.native
    
    def formatError(error: js.Any): js.Any = js.native
    @JSName("formatError")
    var formatError_Original: GraphQLFormatErrorFunction = js.native
    
    var getOperationAST: js.Any = js.native
    
    var parse: js.Any = js.native
    
    var specifiedRules: js.Any = js.native
    
    var validate: js.Any = js.native
  }
  
  @js.native
  trait GraphQLOptions extends StObject {
    
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
    implicit class GraphQLOptionsMutableBuilder[Self <: GraphQLOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setFormatError(value: /* error */ js.Any => js.Any): Self = StObject.set(x, "formatError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatErrorUndefined: Self = StObject.set(x, "formatError", js.undefined)
      
      @scala.inline
      def setGraphiql(value: Boolean): Self = StObject.set(x, "graphiql", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphiqlUndefined: Self = StObject.set(x, "graphiql", js.undefined)
      
      @scala.inline
      def setGraphql(value: GraphQLModule): Self = StObject.set(x, "graphql", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphqlUndefined: Self = StObject.set(x, "graphql", js.undefined)
      
      @scala.inline
      def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      @scala.inline
      def setRootValue(value: js.Object): Self = StObject.set(x, "rootValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootValueUndefined: Self = StObject.set(x, "rootValue", js.undefined)
      
      @scala.inline
      def setSchema(value: GraphQLSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationRules(value: js.Array[_]): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      @scala.inline
      def setValidationRulesVarargs(value: js.Any*): Self = StObject.set(x, "validationRules", js.Array(value :_*))
    }
  }
  
  type GraphQLSchema = js.Object
}
