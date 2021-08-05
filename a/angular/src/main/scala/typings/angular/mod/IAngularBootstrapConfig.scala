package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAngularBootstrapConfig extends StObject {
  
  var strictDi: js.UndefOr[Boolean] = js.undefined
}
object IAngularBootstrapConfig {
  
  inline def apply(): IAngularBootstrapConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAngularBootstrapConfig]
  }
  
  extension [Self <: IAngularBootstrapConfig](x: Self) {
    
    inline def setStrictDi(value: Boolean): Self = StObject.set(x, "strictDi", value.asInstanceOf[js.Any])
    
    inline def setStrictDiUndefined: Self = StObject.set(x, "strictDi", js.undefined)
  }
}
