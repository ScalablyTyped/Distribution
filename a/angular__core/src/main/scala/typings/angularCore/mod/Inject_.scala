package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inject_ extends StObject {
  
  /**
    * A [DI token](guide/glossary#di-token) that maps to the dependency to be injected.
    */
  var token: js.Any = js.native
}
object Inject_ {
  
  @JSImport("@angular/core", "Inject")
  @js.native
  val ^ : InjectDecorator = js.native
  
  @scala.inline
  implicit class Inject_MutableBuilder[Self <: Inject_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToken(value: js.Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
