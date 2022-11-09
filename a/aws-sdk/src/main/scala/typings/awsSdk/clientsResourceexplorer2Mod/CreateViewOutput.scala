package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateViewOutput extends StObject {
  
  /**
    * A structure that contains the details about the new view.
    */
  var View: js.UndefOr[typings.awsSdk.clientsResourceexplorer2Mod.View] = js.undefined
}
object CreateViewOutput {
  
  inline def apply(): CreateViewOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateViewOutput]
  }
  
  extension [Self <: CreateViewOutput](x: Self) {
    
    inline def setView(value: View): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "View", js.undefined)
  }
}
