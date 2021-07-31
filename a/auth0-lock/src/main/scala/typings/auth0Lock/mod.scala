package typings.auth0Lock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("auth0-lock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("auth0-lock", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Auth0LockStatic {
    def this(clientId: String, domain: String) = this()
    def this(clientId: String, domain: String, options: Auth0LockConstructorOptions) = this()
  }
  @JSImport("auth0-lock", JSImport.Default)
  @js.native
  def default: Auth0LockStatic = js.native
  @scala.inline
  def default_=(x: Auth0LockStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
