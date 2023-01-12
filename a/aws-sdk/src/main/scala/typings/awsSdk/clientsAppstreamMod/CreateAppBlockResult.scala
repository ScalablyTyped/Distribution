package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppBlockResult extends StObject {
  
  /**
    * The app block.
    */
  var AppBlock: js.UndefOr[typings.awsSdk.clientsAppstreamMod.AppBlock] = js.undefined
}
object CreateAppBlockResult {
  
  inline def apply(): CreateAppBlockResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppBlockResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAppBlockResult] (val x: Self) extends AnyVal {
    
    inline def setAppBlock(value: AppBlock): Self = StObject.set(x, "AppBlock", value.asInstanceOf[js.Any])
    
    inline def setAppBlockUndefined: Self = StObject.set(x, "AppBlock", js.undefined)
  }
}
