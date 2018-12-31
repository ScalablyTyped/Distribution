package typings
package asanaLib.asanaMod.asanaNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A _team_ is used to group related projects and people together within an
  * organization. Each project in an organization is associated with a team.
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait Teams extends Resource {
  /**
    * * The user making this call must be a member of the team in order to add others.
    * * The user to add must exist in the same organization as the team in order to be added.
    * * The user to add can be referenced by their globally unique user ID or their email address.
    * * Returns the full user record for the added user.
    *   * @param {Number} team Globally unique identifier for the team.
    *   * @param {Object} data Data for the request
    *   * @param {Number|String} data.user An identifier for the user. Can be one of an email address,
    *   * the globally unique identifier for the user, or the keyword `me`
    *   * to indicate the current user making the request.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param team
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def addUser(team: scala.Double, data: UserParams): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def addUser(team: scala.Double, data: UserParams, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * * Returns the full record for a single team.
    *   * @param {Number} team Globally unique identifier for the team.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param team
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findById(team: scala.Double): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.TeamsNs.Type] = js.native
  def findById(team: scala.Double, params: Params): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.TeamsNs.Type] = js.native
  def findById(team: scala.Double, params: Params, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.TeamsNs.Type] = js.native
  /**
    * * Returns the compact records for all teams in the organization visible to
    * * the authorized user.
    *   * @param {Number} organization Globally unique identifier for the workspace or organization.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param organization
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findByOrganization(organization: scala.Double): bluebirdLib.bluebirdMod.namespaced[SimpleResourceList] = js.native
  def findByOrganization(organization: scala.Double, params: Params): bluebirdLib.bluebirdMod.namespaced[SimpleResourceList] = js.native
  def findByOrganization(organization: scala.Double, params: Params, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[SimpleResourceList] = js.native
  /**
    * * The user to remove can be referenced by their globally unique user ID or their email address.
    * * Removes the user from the specified team. Returns an empty data record.
    *   * @param {Number} team Globally unique identifier for the team.
    *   * @param {Object} data Data for the request
    *   * @param {Number|String} data.user An identifier for the user. Can be one of an email address,
    *   * the globally unique identifier for the user, or the keyword `me`
    *   * to indicate the current user making the request.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param team
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def removeUser(team: scala.Double, data: UserParams): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def removeUser(team: scala.Double, data: UserParams, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * * Returns the compact records for all users that are members of the team.
    *   * @param {Number} team Globally unique identifier for the team.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param team
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def users(team: scala.Double): bluebirdLib.bluebirdMod.namespaced[SimpleResourceList] = js.native
  def users(team: scala.Double, params: Params): bluebirdLib.bluebirdMod.namespaced[SimpleResourceList] = js.native
  def users(team: scala.Double, params: Params, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[SimpleResourceList] = js.native
}

