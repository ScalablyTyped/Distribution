package typings.areNa.mod

import typings.areNa.anon.AddCollaborators
import typings.areNa.anon.All
import typings.areNa.anon.Channels
import typings.areNa.anon.Create
import typings.areNa.anon.Followers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arena class, organized hierarchically as nested objects
  */
@js.native
trait Arena extends StObject {
  
  /**
    * Base object for block related API requests
    *
    * ```js
    * // Basic usage
    * arena.block(3088).get()
    * ```
    *
    * @param id - Block id, such as 3088
    * @param params - Additional parameters
    */
  def block(id: String): Create = js.native
  def block(id: String, params: Params): Create = js.native
  def block(id: Double): Create = js.native
  def block(id: Double, params: Params): Create = js.native
  
  /**
    * Base object for channel related API requests
    *
    * ```js
    * // Basic usage
    * arena.channel("arena-influences").get()
    * ```
    *
    * @param indentifier - Channel slug or id, such as "arena-influences" or 275
    * @param params - Additional parameters
    */
  def channel(indentifier: String): AddCollaborators = js.native
  def channel(indentifier: String, params: Params): AddCollaborators = js.native
  def channel(indentifier: Double): AddCollaborators = js.native
  def channel(indentifier: Double, params: Params): AddCollaborators = js.native
  
  /**
    * Base object for Group related API requests
    *
    * ```js
    * // Basic usage
    * arena.group("are-na-team").get()
    * ```
    *
    * @param indentifier - Group slug such as "are-na-team"
    * @param params - Additional parameters
    */
  def group(indentifier: String): Channels = js.native
  def group(indentifier: String, params: Params): Channels = js.native
  
  /**
    * Base object for user related API requests
    *
    * ```js
    * // Basic usage
    * arena.search("fruit").channels()
    * ```
    *
    * @param query - Search term, such as "fruit"
    * @param params - Additional parameters
    */
  def search(query: String): All = js.native
  def search(query: String, params: Params): All = js.native
  
  /**
    * Base object for user related API requests
    *
    * ```js
    * // Basic usage
    * arena.user(16).get()
    * ```
    *
    * @param id - User id, such as 16
    * @param params - Additional parameters
    */
  def user(id: String): Followers = js.native
  def user(id: String, params: Params): Followers = js.native
  def user(id: Double): Followers = js.native
  def user(id: Double, params: Params): Followers = js.native
}
