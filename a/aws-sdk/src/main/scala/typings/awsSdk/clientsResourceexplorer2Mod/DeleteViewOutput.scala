package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteViewOutput extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the view that you successfully deleted.
    */
  var ViewArn: js.UndefOr[String] = js.undefined
}
object DeleteViewOutput {
  
  inline def apply(): DeleteViewOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteViewOutput]
  }
  
  extension [Self <: DeleteViewOutput](x: Self) {
    
    inline def setViewArn(value: String): Self = StObject.set(x, "ViewArn", value.asInstanceOf[js.Any])
    
    inline def setViewArnUndefined: Self = StObject.set(x, "ViewArn", js.undefined)
  }
}
