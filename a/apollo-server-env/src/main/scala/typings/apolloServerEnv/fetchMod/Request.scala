package typings.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-env/dist/fetch", "Request")
@js.native
class Request protected () extends Body {
  def this(input: String) = this()
  def this(input: Request) = this()
  def this(input: String, init: RequestInit) = this()
  def this(input: Request, init: RequestInit) = this()
  
  val headers: Headers = js.native
  
  val method: String = js.native
  
  val url: String = js.native
}
