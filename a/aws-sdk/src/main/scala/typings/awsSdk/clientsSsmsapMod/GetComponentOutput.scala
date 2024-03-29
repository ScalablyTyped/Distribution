package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponentOutput extends StObject {
  
  /**
    * The component of an application registered with AWS Systems Manager for SAP.
    */
  var Component: js.UndefOr[typings.awsSdk.clientsSsmsapMod.Component] = js.undefined
}
object GetComponentOutput {
  
  inline def apply(): GetComponentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComponentOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetComponentOutput] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: Component): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
  }
}
