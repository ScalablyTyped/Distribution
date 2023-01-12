package typings.awsLambda

import typings.awsLambda.anon.DomainName
import typings.awsLambda.anon.Result
import typings.awsLambda.handlerMod.Handler
import typings.awsLambda.triggerAppsyncResolverMod.AppSyncIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerAmplifyResolverMod {
  
  trait AmplifyGraphQlResolverEvent[TArguments, TSource] extends StObject {
    
    /** A map of GraphQL arguments passed to the field being resolved. */
    var arguments: TArguments
    
    /** The field within the given type to resolve. */
    var fieldName: String
    
    /** The identity used to authenticate the request to AppSync. */
    var identity: js.UndefOr[AppSyncIdentity] = js.undefined
    
    /** The object returned by a possible previous pipeline resolver function. */
    var prev: Result | Null
    
    /** The request headers  */
    var request: DomainName
    
    /** The parent object's value if resolving a nested field. */
    var source: TSource
    
    /** The name of the parent object type (data model) of the field being resolved. */
    var typeName: String
  }
  object AmplifyGraphQlResolverEvent {
    
    inline def apply[TArguments, TSource](arguments: TArguments, fieldName: String, request: DomainName, source: TSource, typeName: String): AmplifyGraphQlResolverEvent[TArguments, TSource] = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any], prev = null)
      __obj.asInstanceOf[AmplifyGraphQlResolverEvent[TArguments, TSource]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AmplifyGraphQlResolverEvent[?, ?], TArguments, TSource] (val x: Self & (AmplifyGraphQlResolverEvent[TArguments, TSource])) extends AnyVal {
      
      inline def setArguments(value: TArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: AppSyncIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityNull: Self = StObject.set(x, "identity", null)
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setPrev(value: Result): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevNull: Self = StObject.set(x, "prev", null)
      
      inline def setRequest(value: DomainName): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setSource(value: TSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    }
  }
  
  type AmplifyGraphQlResolverHandler[TArguments, TSource] = Handler[AmplifyGraphQlResolverEvent[TArguments, TSource], Any]
}
