package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingAnimation extends StObject {
  
  /**
    * The visibility configuration of LoadingAnimation.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object LoadingAnimation {
  
  inline def apply(): LoadingAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadingAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadingAnimation] (val x: Self) extends AnyVal {
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
