package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrustedScriptURL extends StObject {
  
  var __brand__ : typings.angularCore.angularCoreStrings.TrustedScriptURL = js.native
}
object TrustedScriptURL {
  
  @scala.inline
  def apply(__brand__ : typings.angularCore.angularCoreStrings.TrustedScriptURL): TrustedScriptURL = {
    val __obj = js.Dynamic.literal(__brand__ = __brand__.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedScriptURL]
  }
  
  @scala.inline
  implicit class TrustedScriptURLMutableBuilder[Self <: TrustedScriptURL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__brand__(value: typings.angularCore.angularCoreStrings.TrustedScriptURL): Self = StObject.set(x, "__brand__", value.asInstanceOf[js.Any])
  }
}
