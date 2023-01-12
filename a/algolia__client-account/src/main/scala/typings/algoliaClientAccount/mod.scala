package typings.algoliaClientAccount

import typings.algoliaClientCommon.mod.WaitablePromise
import typings.algoliaClientSearch.mod.SearchIndex
import typings.algoliaTransporter.mod.RequestOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/client-account", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def accountCopyIndex(source: SearchIndex, destination: SearchIndex): WaitablePromise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("accountCopyIndex")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[WaitablePromise[Unit]]
  inline def accountCopyIndex(source: SearchIndex, destination: SearchIndex, requestOptions: RequestOptions): WaitablePromise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("accountCopyIndex")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[WaitablePromise[Unit]]
  
  inline def createDestinationIndiceExistsError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("createDestinationIndiceExistsError")().asInstanceOf[js.Error]
  
  inline def createIndicesInSameAppError(appId: String): IndicesInSameAppError = ^.asInstanceOf[js.Dynamic].applyDynamic("createIndicesInSameAppError")(appId.asInstanceOf[js.Any]).asInstanceOf[IndicesInSameAppError]
  
  trait IndicesInSameAppError
    extends StObject
       with Error {
    
    /**
      * The app id.
      */
    val appId: String
  }
  object IndicesInSameAppError {
    
    inline def apply(appId: String, message: String, name: String): IndicesInSameAppError = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndicesInSameAppError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndicesInSameAppError] (val x: Self) extends AnyVal {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    }
  }
}
