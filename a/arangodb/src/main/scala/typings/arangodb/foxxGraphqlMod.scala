package typings.arangodb

import typings.arangodb.Foxx.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foxxGraphqlMod {
  
  inline def apply(options: GraphQLOptions): Router = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Router]
  inline def apply(options: GraphQLSchema): Router = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Router]
  
  @JSImport("@arangodb/foxx/graphql", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type GraphQLFormatErrorFunction = js.Function1[/* error */ Any, Any]
  
  trait GraphQLModule extends StObject {
    
    var Source: Any
    
    var execute: Any
    
    def formatError(error: Any): Any
    @JSName("formatError")
    var formatError_Original: GraphQLFormatErrorFunction
    
    var getOperationAST: Any
    
    var parse: Any
    
    var specifiedRules: Any
    
    var validate: Any
  }
  object GraphQLModule {
    
    inline def apply(
      Source: Any,
      execute: Any,
      formatError: /* error */ Any => Any,
      getOperationAST: Any,
      parse: Any,
      specifiedRules: Any,
      validate: Any
    ): GraphQLModule = {
      val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], formatError = js.Any.fromFunction1(formatError), getOperationAST = getOperationAST.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], specifiedRules = specifiedRules.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLModule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GraphQLModule] (val x: Self) extends AnyVal {
      
      inline def setExecute(value: Any): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
      
      inline def setFormatError(value: /* error */ Any => Any): Self = StObject.set(x, "formatError", js.Any.fromFunction1(value))
      
      inline def setGetOperationAST(value: Any): Self = StObject.set(x, "getOperationAST", value.asInstanceOf[js.Any])
      
      inline def setParse(value: Any): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Any): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
      
      inline def setSpecifiedRules(value: Any): Self = StObject.set(x, "specifiedRules", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: Any): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    }
  }
  
  trait GraphQLOptions extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
    
    var formatError: js.UndefOr[GraphQLFormatErrorFunction] = js.undefined
    
    var graphiql: js.UndefOr[Boolean] = js.undefined
    
    var graphql: js.UndefOr[GraphQLModule] = js.undefined
    
    var pretty: js.UndefOr[Boolean] = js.undefined
    
    var rootValue: js.UndefOr[js.Object] = js.undefined
    
    var schema: GraphQLSchema
    
    var validationRules: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object GraphQLOptions {
    
    inline def apply(schema: GraphQLSchema): GraphQLOptions = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GraphQLOptions] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setFormatError(value: /* error */ Any => Any): Self = StObject.set(x, "formatError", js.Any.fromFunction1(value))
      
      inline def setFormatErrorUndefined: Self = StObject.set(x, "formatError", js.undefined)
      
      inline def setGraphiql(value: Boolean): Self = StObject.set(x, "graphiql", value.asInstanceOf[js.Any])
      
      inline def setGraphiqlUndefined: Self = StObject.set(x, "graphiql", js.undefined)
      
      inline def setGraphql(value: GraphQLModule): Self = StObject.set(x, "graphql", value.asInstanceOf[js.Any])
      
      inline def setGraphqlUndefined: Self = StObject.set(x, "graphql", js.undefined)
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setRootValue(value: js.Object): Self = StObject.set(x, "rootValue", value.asInstanceOf[js.Any])
      
      inline def setRootValueUndefined: Self = StObject.set(x, "rootValue", js.undefined)
      
      inline def setSchema(value: GraphQLSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setValidationRules(value: js.Array[Any]): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      inline def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      inline def setValidationRulesVarargs(value: Any*): Self = StObject.set(x, "validationRules", js.Array(value*))
    }
  }
  
  type GraphQLSchema = js.Object
}
