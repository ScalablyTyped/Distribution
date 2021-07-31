package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostBinding extends StObject {
  
  var hostPropertyName: js.UndefOr[String] = js.undefined
}
object HostBinding {
  
  @scala.inline
  def apply(): HostBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostBinding]
  }
  
  @scala.inline
  implicit class HostBindingMutableBuilder[Self <: HostBinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostPropertyName(value: String): Self = StObject.set(x, "hostPropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPropertyNameUndefined: Self = StObject.set(x, "hostPropertyName", js.undefined)
  }
}
