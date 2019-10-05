package typings.asana.asanaMod

import org.scalablytyped.runtime.TopLevel
import typings.asana.asanaMod.auth.App
import typings.asana.asanaMod.auth.OauthAuthenticatorOptions
import typings.asana.asanaMod.resources.Attachments
import typings.asana.asanaMod.resources.Events
import typings.asana.asanaMod.resources.Projects
import typings.asana.asanaMod.resources.Sections
import typings.asana.asanaMod.resources.Stories
import typings.asana.asanaMod.resources.Tags
import typings.asana.asanaMod.resources.Tasks
import typings.asana.asanaMod.resources.Teams
import typings.asana.asanaMod.resources.Users
import typings.asana.asanaMod.resources.Workspaces
import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  /**
    * Store off Oauth info.
    */
  var app: App = js.native
  /**
    * An instance of the Attachments resource.
    * @type {Attachments}
    */
  var attachments: Attachments = js.native
  /**
    * The internal dispatcher. This is mostly used by the resources but provided
    * for custom requests to the API or API features that have not yet been added
    * to the client.
    * @type {Dispatcher}
    */
  var dispatcher: Dispatcher = js.native
  /**
    * An instance of the Events resource.
    * @type {Events}
    */
  var events: Events = js.native
  /**
    * An instance of the Projects resource.
    * @type {Projects}
    */
  var projects: Projects = js.native
  /**
    * An instance of the Sections resource.
    * @type {Sections}
    */
  var sections: Sections = js.native
  /**
    * An instance of the Stories resource.
    * @type {Stories}
    */
  var stories: Stories = js.native
  /**
    * An instance of the Tags resource.
    * @type {Tags}
    */
  var tags: Tags = js.native
  /**
    * An instance of the Tasks resource.
    * @type {Tasks}
    */
  var tasks: Tasks = js.native
  /**
    * An instance of the Teams resource.
    * @type {Teams}
    */
  var teams: Teams = js.native
  /**
    * An instance of the Users resource.
    * @type {Users}
    */
  var users: Users = js.native
  /**
    * An instance of the Workspaces resource.
    * @type {Workspaces}
    */
  var workspaces: Workspaces = js.native
  /**
    * Ensures the client is authorized to make requests. Kicks off the
    * configured Oauth flow, if any.
    *
    * @returns {Promise<Client>} A promise that resolves to this client when
    *     authorization is complete.
    */
  def authorize(): ^[Client] = js.native
  /**
    * Configure the client to authenticate using a Personal Access Token.
    * @param  {String} accessToken The Personal Access Token to use for
    * authenticating requests.
    * @return {Client}             this
    * @param accessToken
    * @return
    */
  def useAccessToken(accessToken: String): this.type = js.native
  /**
    * Configure the Client to use a user's API Key and then authenticate
    * through HTTP Basic Authentication. This should only be done for testing,
    * as requests using Oauth can provide more security, higher rate limits, and
    * more features.
    * @param  {String} apiKey The Asana Api Key of the user
    * @return {Client}        this
    * @param apiKey
    * @return
    */
  def useBasicAuth(apiKey: String): this.type = js.native
  /**
    * Configure the client to authenticate via Oauth. Credentials can be
    * supplied, or they can be obtained by running an Oauth flow.
    * @param  {Object} options Options for Oauth. Includes any options for
    *     the selected flow.
    * @option {Function} [flowType]  Type of OauthFlow to use to obtain user
    *     authorization. Defaults to autodetect based on environment.
    * @option {Object} [credentials] Credentials to use; no flow required to
    *     obtain authorization. This object should at a minimum contain an
    *     `access_token` string field.
    * @return {Client} this
    * @param options
    * @return
    */
  def useOauth(): this.type = js.native
  def useOauth(options: OauthAuthenticatorOptions): this.type = js.native
}

@JSImport("asana", "Client")
@js.native
object Client extends TopLevel[ClientStatic]

