package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomActionTypeInput extends StObject {
  
  /**
    * The category of the custom action that you want to delete, such as source or deploy.
    */
  var category: ActionCategory
  
  /**
    * The provider of the service used in the custom action, such as AWS CodeDeploy.
    */
  var provider: ActionProvider
  
  /**
    * The version of the custom action to delete.
    */
  var version: Version
}
object DeleteCustomActionTypeInput {
  
  inline def apply(category: ActionCategory, provider: ActionProvider, version: Version): DeleteCustomActionTypeInput = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomActionTypeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCustomActionTypeInput] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: ActionCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: ActionProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
