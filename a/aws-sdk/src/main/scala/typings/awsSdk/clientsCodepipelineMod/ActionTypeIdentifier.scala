package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionTypeIdentifier extends StObject {
  
  /**
    * Defines what kind of action can be taken in the stage, one of the following:    Source     Build     Test     Deploy     Approval     Invoke   
    */
  var category: ActionCategory
  
  /**
    * The creator of the action type being called: AWS or ThirdParty.
    */
  var owner: ActionTypeOwner
  
  /**
    * The provider of the action type being called. The provider name is supplied when the action type is created.
    */
  var provider: ActionProvider
  
  /**
    * A string that describes the action type version.
    */
  var version: Version
}
object ActionTypeIdentifier {
  
  inline def apply(category: ActionCategory, owner: ActionTypeOwner, provider: ActionProvider, version: Version): ActionTypeIdentifier = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTypeIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionTypeIdentifier] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: ActionCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: ActionTypeOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: ActionProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
