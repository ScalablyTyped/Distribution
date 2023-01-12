package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIndexInput extends StObject {
  
  /**
    * This value helps ensure idempotency. Resource Explorer uses this value to prevent the accidental creation of duplicate versions. We recommend that you generate a UUID-type value to ensure the uniqueness of your views.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The specified tags are attached only to the index created in this Amazon Web Services Region. The tags aren't attached to any of the resources listed in the index.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateIndexInput {
  
  inline def apply(): CreateIndexInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIndexInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateIndexInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
