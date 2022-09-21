package typings.auth0Lock

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("auth0-lock", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Auth0LockStatic {
    def this(clientId: String, domain: String) = this()
    def this(clientId: String, domain: String, options: Auth0LockConstructorOptions) = this()
  }
  @JSImport("auth0-lock", JSImport.Default)
  @js.native
  val default: Auth0LockStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("auth0-lock", "Auth0Lock")
  @js.native
  open class Auth0Lock protected ()
    extends StObject
       with Auth0LockStatic {
    def this(clientId: String, domain: String) = this()
    def this(clientId: String, domain: String, options: Auth0LockConstructorOptions) = this()
  }
  @JSImport("auth0-lock", "Auth0Lock")
  @js.native
  val Auth0Lock: Auth0LockStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("auth0-lock", "Auth0LockPasswordless")
  @js.native
  open class Auth0LockPasswordless protected ()
    extends StObject
       with Auth0LockPasswordlessStatic {
    def this(clientId: String, domain: String) = this()
    def this(clientId: String, domain: String, options: Auth0LockPasswordlessConstructorOptions) = this()
  }
  @JSImport("auth0-lock", "Auth0LockPasswordless")
  @js.native
  val Auth0LockPasswordless: Auth0LockPasswordlessStatic = js.native
  
  type _To = Auth0LockStatic
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Auth0LockStatic = default
}
