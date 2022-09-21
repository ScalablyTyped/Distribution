package typings.areNa.mod

import typings.areNa.anon.AccessToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arena class, organized hierarchically as nested objects
  */
@JSImport("are.na", JSImport.Namespace)
@js.native
/**
  * Arena class, organized hierarchically as nested objects
  *
  * ```js
  * // Request for a channel with slug of "arena-influences"
  * const arena = new Arena();
  * arena.channel("arena-influences").get()
  * ```
  * @param accessToken - Your are.na API access token
  * @param baseURL - Base URL to make requests on (default: https://api.are.na/v2/)
  * @param authToken - Optional auth token request header
  * @param requestHandler - Custom request handler
  */
open class ^ ()
  extends StObject
     with Arena {
  def this(config: AccessToken) = this()
}
