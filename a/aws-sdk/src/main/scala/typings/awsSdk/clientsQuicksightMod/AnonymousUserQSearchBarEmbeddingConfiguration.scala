package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnonymousUserQSearchBarEmbeddingConfiguration extends StObject {
  
  /**
    * The QuickSight Q topic ID of the topic that you want the anonymous user to see first. This ID is included in the output URL. When the URL in response is accessed, Amazon QuickSight renders the Q search bar with this topic pre-selected. The Amazon Resource Name (ARN) of this Q topic must be included in the AuthorizedResourceArns parameter. Otherwise, the request will fail with InvalidParameterValueException.
    */
  var InitialTopicId: RestrictiveResourceId
}
object AnonymousUserQSearchBarEmbeddingConfiguration {
  
  inline def apply(InitialTopicId: RestrictiveResourceId): AnonymousUserQSearchBarEmbeddingConfiguration = {
    val __obj = js.Dynamic.literal(InitialTopicId = InitialTopicId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonymousUserQSearchBarEmbeddingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnonymousUserQSearchBarEmbeddingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setInitialTopicId(value: RestrictiveResourceId): Self = StObject.set(x, "InitialTopicId", value.asInstanceOf[js.Any])
  }
}
