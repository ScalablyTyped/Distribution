package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrustedScript extends StObject {
  
  var __brand__ : typings.angularCore.angularCoreStrings.TrustedScript = js.native
}
object TrustedScript {
  
  @scala.inline
  def apply(__brand__ : typings.angularCore.angularCoreStrings.TrustedScript): TrustedScript = {
    val __obj = js.Dynamic.literal(__brand__ = __brand__.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedScript]
  }
  
  @scala.inline
  implicit class TrustedScriptMutableBuilder[Self <: TrustedScript] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__brand__(value: typings.angularCore.angularCoreStrings.TrustedScript): Self = StObject.set(x, "__brand__", value.asInstanceOf[js.Any])
  }
}
