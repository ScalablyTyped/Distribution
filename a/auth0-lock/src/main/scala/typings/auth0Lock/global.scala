package typings.auth0Lock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Auth0Lock")
  @js.native
  class Auth0Lock protected ()
    extends StObject
       with Auth0LockStatic {
    def this(clientId: String, domain: String) = this()
    def this(clientId: String, domain: String, options: Auth0LockConstructorOptions) = this()
  }
  @JSGlobal("Auth0Lock")
  @js.native
  def Auth0Lock: Auth0LockStatic = js.native
  inline def Auth0Lock_=(x: Auth0LockStatic): Unit = js.Dynamic.global.updateDynamic("Auth0Lock")(x.asInstanceOf[js.Any])
}
