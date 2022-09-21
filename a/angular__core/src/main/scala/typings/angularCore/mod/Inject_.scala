package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inject_ extends StObject {
  
  /**
    * A [DI token](guide/glossary#di-token) that maps to the dependency to be injected.
    */
  var token: Any
}
object Inject_ {
  
  @JSImport("@angular/core", "Inject")
  @js.native
  val ^ : InjectDecorator = js.native
  
  extension [Self <: Inject_](x: Self) {
    
    inline def setToken(value: Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
