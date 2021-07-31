package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAngularBootstrapConfig extends StObject {
  
  var strictDi: js.UndefOr[Boolean] = js.undefined
}
object IAngularBootstrapConfig {
  
  @scala.inline
  def apply(): IAngularBootstrapConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAngularBootstrapConfig]
  }
  
  @scala.inline
  implicit class IAngularBootstrapConfigMutableBuilder[Self <: IAngularBootstrapConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrictDi(value: Boolean): Self = StObject.set(x, "strictDi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictDiUndefined: Self = StObject.set(x, "strictDi", js.undefined)
  }
}
