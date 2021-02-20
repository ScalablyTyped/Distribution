package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleName extends StObject {
  
  var moduleName: String = js.native
}
object ModuleName {
  
  @scala.inline
  def apply(moduleName: String): ModuleName = {
    val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleName]
  }
  
  @scala.inline
  implicit class ModuleNameMutableBuilder[Self <: ModuleName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
  }
}
