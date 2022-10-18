package typings.angularCore.mod

import typings.angularCore.anon.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "InjectionToken")
@js.native
open class InjectionToken[T] protected ()
  extends StObject
     with _ProviderToken[T] {
  /**
    * @param _desc   Description for the token,
    *                used only for debugging purposes,
    *                it should but does not need to be unique
    * @param options Options for the token's usage, as described above
    */
  def this(_desc: String) = this()
  def this(_desc: String, options: Factory[T]) = this()
  
  /* protected */ var _desc: String = js.native
  
  val ɵprov: Any = js.native
}
