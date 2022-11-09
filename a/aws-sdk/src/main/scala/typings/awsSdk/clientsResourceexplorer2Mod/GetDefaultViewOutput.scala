package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDefaultViewOutput extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the view that is the current default for the Amazon Web Services Region in which you called this operation.
    */
  var ViewArn: js.UndefOr[String] = js.undefined
}
object GetDefaultViewOutput {
  
  inline def apply(): GetDefaultViewOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDefaultViewOutput]
  }
  
  extension [Self <: GetDefaultViewOutput](x: Self) {
    
    inline def setViewArn(value: String): Self = StObject.set(x, "ViewArn", value.asInstanceOf[js.Any])
    
    inline def setViewArnUndefined: Self = StObject.set(x, "ViewArn", js.undefined)
  }
}
