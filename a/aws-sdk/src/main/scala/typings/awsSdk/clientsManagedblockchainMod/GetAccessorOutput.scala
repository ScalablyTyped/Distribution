package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessorOutput extends StObject {
  
  /**
    * The properties of the accessor.
    */
  var Accessor: js.UndefOr[typings.awsSdk.clientsManagedblockchainMod.Accessor] = js.undefined
}
object GetAccessorOutput {
  
  inline def apply(): GetAccessorOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessorOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccessorOutput] (val x: Self) extends AnyVal {
    
    inline def setAccessor(value: Accessor): Self = StObject.set(x, "Accessor", value.asInstanceOf[js.Any])
    
    inline def setAccessorUndefined: Self = StObject.set(x, "Accessor", js.undefined)
  }
}
