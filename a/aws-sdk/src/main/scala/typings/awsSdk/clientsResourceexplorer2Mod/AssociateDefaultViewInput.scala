package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateDefaultViewInput extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the view to set as the default for the Amazon Web Services Region and Amazon Web Services account in which you call this operation. The specified view must already exist in the called Region.
    */
  var ViewArn: AssociateDefaultViewInputViewArnString
}
object AssociateDefaultViewInput {
  
  inline def apply(ViewArn: AssociateDefaultViewInputViewArnString): AssociateDefaultViewInput = {
    val __obj = js.Dynamic.literal(ViewArn = ViewArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDefaultViewInput]
  }
  
  extension [Self <: AssociateDefaultViewInput](x: Self) {
    
    inline def setViewArn(value: AssociateDefaultViewInputViewArnString): Self = StObject.set(x, "ViewArn", value.asInstanceOf[js.Any])
  }
}
