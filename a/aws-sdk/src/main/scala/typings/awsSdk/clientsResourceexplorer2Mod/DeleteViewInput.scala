package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteViewInput extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the view that you want to delete.
    */
  var ViewArn: DeleteViewInputViewArnString
}
object DeleteViewInput {
  
  inline def apply(ViewArn: DeleteViewInputViewArnString): DeleteViewInput = {
    val __obj = js.Dynamic.literal(ViewArn = ViewArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteViewInput]
  }
  
  extension [Self <: DeleteViewInput](x: Self) {
    
    inline def setViewArn(value: DeleteViewInputViewArnString): Self = StObject.set(x, "ViewArn", value.asInstanceOf[js.Any])
  }
}
