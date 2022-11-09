package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateDefaultViewOutput extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the view that the operation set as the default for queries made in the Amazon Web Services Region and Amazon Web Services account in which you called this operation.
    */
  var ViewArn: js.UndefOr[String] = js.undefined
}
object AssociateDefaultViewOutput {
  
  inline def apply(): AssociateDefaultViewOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateDefaultViewOutput]
  }
  
  extension [Self <: AssociateDefaultViewOutput](x: Self) {
    
    inline def setViewArn(value: String): Self = StObject.set(x, "ViewArn", value.asInstanceOf[js.Any])
    
    inline def setViewArnUndefined: Self = StObject.set(x, "ViewArn", js.undefined)
  }
}
