package typings.arangodb

import typings.arangodb.Foxx.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphqlMod {
  
  @scala.inline
  def apply(options: GraphQLOptions): Router = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Router]
  @scala.inline
  def apply(options: GraphQLSchema): Router = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Router]
  
  @JSImport("@arangodb/foxx/graphql", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type GraphQLFormatErrorFunction = js.Function1[/* error */ js.Any, js.Any]
  
  trait GraphQLModule extends StObject {
    
    var Source: js.Any
    
    var execute: js.Any
    
    def formatError(error: js.Any): js.Any
    @JSName("formatError")
    var formatError_Original: GraphQLFormatErrorFunction
    
    var getOperationAST: js.Any
    
    var parse: js.Any
    
    var specifiedRules: js.Any
    
    var validate: js.Any
  }
  object GraphQLModule {
    
    @scala.inline
    def apply(
      Source: js.Any,
      execute: js.Any,
      formatError: /* error */ js.Any => js.Any,
      getOperationAST: js.Any,
      parse: js.Any,
      specifiedRules: js.Any,
      validate: js.Any
    ): GraphQLModule = {
      val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], formatError = js.Any.fromFunction1(formatError), getOperationAST = getOperationAST.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], specifiedRules = specifiedRules.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLModule]
    }
    
    @scala.inline
    implicit class GraphQLModuleMutableBuilder[Self <: GraphQLModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecute(value: js.Any): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatError(value: /* error */ js.Any => js.Any): Self = StObject.set(x, "formatError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOperationAST(value: js.Any): Self = StObject.set(x, "getOperationAST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParse(value: js.Any): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecifiedRules(value: js.Any): Self = StObject.set(x, "specifiedRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidate(value: js.Any): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    }
  }
  
  trait GraphQLOptions extends StObject {
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var formatError: js.UndefOr[GraphQLFormatErrorFunction] = js.undefined
    
    var graphiql: js.UndefOr[Boolean] = js.undefined
    
    var graphql: js.UndefOr[GraphQLModule] = js.undefined
    
    var pretty: js.UndefOr[Boolean] = js.undefined
    
    var rootValue: js.UndefOr[js.Object] = js.undefined
    
    var schema: GraphQLSchema
    
    var validationRules: js.UndefOr[js.Array[js.Any]] = js.undefined
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
      def setValidationRules(value: js.Array[js.Any]): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      @scala.inline
      def setValidationRulesVarargs(value: js.Any*): Self = StObject.set(x, "validationRules", js.Array(value :_*))
    }
  }
  
  type GraphQLSchema = js.Object
}
