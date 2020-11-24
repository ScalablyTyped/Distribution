package typings.auth0Lock

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0-lock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default protected () extends Auth0LockStatic {
    def this(clientId: String, domain: String) = this()
    def this(clientId: String, domain: String, options: Auth0LockConstructorOptions) = this()
  }
  @js.native
  object default extends TopLevel[Auth0LockStatic]
}
