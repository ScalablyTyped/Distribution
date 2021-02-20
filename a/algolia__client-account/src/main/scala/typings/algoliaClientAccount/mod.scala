package typings.algoliaClientAccount

import typings.algoliaClientCommon.mod.WaitablePromise
import typings.algoliaClientSearch.mod.SearchIndex
import typings.algoliaTransporter.mod.RequestOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/client-account", "accountCopyIndex")
  @js.native
  def accountCopyIndex(source: SearchIndex, destination: SearchIndex): WaitablePromise[Unit] = js.native
  @JSImport("@algolia/client-account", "accountCopyIndex")
  @js.native
  def accountCopyIndex(source: SearchIndex, destination: SearchIndex, requestOptions: RequestOptions): WaitablePromise[Unit] = js.native
  
  @JSImport("@algolia/client-account", "createDestinationIndiceExistsError")
  @js.native
  def createDestinationIndiceExistsError(): Error = js.native
  
  @JSImport("@algolia/client-account", "createIndicesInSameAppError")
  @js.native
  def createIndicesInSameAppError(appId: String): IndicesInSameAppError = js.native
  
  /* Inlined std.Error & { readonly appId :string} */
  @js.native
  trait IndicesInSameAppError extends StObject {
    
    /**
      * The app id.
      */
    val appId: String = js.native
    
    var message: String = js.native
    
    var name: String = js.native
    
    var stack: js.UndefOr[String] = js.native
  }
  object IndicesInSameAppError {
    
    @scala.inline
    def apply(appId: String, message: String, name: String): IndicesInSameAppError = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndicesInSameAppError]
    }
    
    @scala.inline
    implicit class IndicesInSameAppErrorMutableBuilder[Self <: IndicesInSameAppError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
}
