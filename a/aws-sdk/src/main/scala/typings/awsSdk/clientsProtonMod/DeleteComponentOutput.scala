package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteComponentOutput extends StObject {
  
  /**
    * The detailed data of the component being deleted.
    */
  var component: js.UndefOr[Component] = js.undefined
}
object DeleteComponentOutput {
  
  inline def apply(): DeleteComponentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteComponentOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteComponentOutput] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: Component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
