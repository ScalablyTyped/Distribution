package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionControls extends StObject {
  
  /**
    * A SsmControls object.
    */
  var SsmControls: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.SsmControls] = js.undefined
}
object ExecutionControls {
  
  inline def apply(): ExecutionControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionControls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionControls] (val x: Self) extends AnyVal {
    
    inline def setSsmControls(value: SsmControls): Self = StObject.set(x, "SsmControls", value.asInstanceOf[js.Any])
    
    inline def setSsmControlsUndefined: Self = StObject.set(x, "SsmControls", js.undefined)
  }
}
