package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateViewOutput extends StObject {
  
  /**
    * Details about the view that you changed with this operation.
    */
  var View: js.UndefOr[typings.awsSdk.clientsResourceexplorer2Mod.View] = js.undefined
}
object UpdateViewOutput {
  
  inline def apply(): UpdateViewOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateViewOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateViewOutput] (val x: Self) extends AnyVal {
    
    inline def setView(value: View): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "View", js.undefined)
  }
}
