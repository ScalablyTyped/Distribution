package typings.actionsDashOnDashGoogle.distServiceSmarthomeSmarthomeMod

import typings.actionsDashOnDashGoogle.distAssistantMod.ServiceBaseApp
import typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1DisconnectRequest
import typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1DisconnectResponse
import typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1ExecuteRequest
import typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1ExecuteResponse
import typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1Intents
import typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1QueryRequest
import typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1QueryResponse
import typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1ReportStateRequest
import typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1Request
import typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1Response
import typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1SyncRequest
import typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1SyncResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeApp extends ServiceBaseApp {
  /** @hidden */
  var _intents: SmartHomeHandlers = js.native
  /** @public */
  var jwt: js.UndefOr[SmartHomeJwt] = js.native
  /** @public */
  var key: js.UndefOr[String] = js.native
  /** @hidden */
  def _intent(intent: SmartHomeV1Intents, handler: SmartHomeHandler[SmartHomeV1Request, SmartHomeV1Response]): this.type = js.native
  /**
    * Defines a function that will run when a DISCONNECT request is received.
    *
    * @example
    * ```javascript
    *
    * const app = smarthome();
    * app.onDisconnect((body, headers) => {
    *   // User unlinked their account, stop reporting state for user
    *   return {}
    * })
    * ```
    * @param handler The function that will run for an EXECUTE request. It should
    *   return a valid response or a Promise that resolves to valid response.
    *
    * @public
    */
  def onDisconnect(handler: SmartHomeHandler[SmartHomeV1DisconnectRequest, SmartHomeV1DisconnectResponse]): this.type = js.native
  /**
    * Defines a function that will run when an EXECUTE request is received.
    *
    * @example
    * ```javascript
    *
    * const app = smarthome();
    * app.onExecute((body, headers) => {
    *   return {
    *     requestId: 'ff36...',
    *     payload: {
    *       ...
    *     }
    *   }
    * })
    * ```
    * @param handler The function that will run for an EXECUTE request. It should
    *   return a valid response or a Promise that resolves to valid response.
    *
    * @public
    */
  def onExecute(handler: SmartHomeHandler[SmartHomeV1ExecuteRequest, SmartHomeV1ExecuteResponse]): this.type = js.native
  /**
    * Defines a function that will run when a QUERY request is received.
    *
    * @example
    * ```javascript
    *
    * const app = smarthome();
    * app.onQuery((body, headers) => {
    *   return {
    *     requestId: 'ff36...',
    *     payload: {
    *       ...
    *     }
    *   }
    * })
    * ```
    *
    * @param handler The function that will run for a QUERY request. It should
    *   return a valid response or a Promise that resolves to valid response.
    *
    * @public
    */
  def onQuery(handler: SmartHomeHandler[SmartHomeV1QueryRequest, SmartHomeV1QueryResponse]): this.type = js.native
  /**
    * Defines a function that will run when a SYNC request is received.
    *
    * @example
    * ```javascript
    *
    * const app = smarthome();
    * app.onSync((body, headers) => {
    *   return {
    *     requestId: 'ff36...',
    *     payload: {
    *       ...
    *     }
    *   }
    * })
    * ```
    *
    * @param handler The function that will run for a SYNC request. It should
    *   return a valid response or a Promise that resolves to valid response.
    *
    * @public
    */
  def onSync(handler: SmartHomeHandler[SmartHomeV1SyncRequest, SmartHomeV1SyncResponse]): this.type = js.native
  /**
    * Reports the current state of a device or set of devices to the home graph.
    * This may be done if the state of the device was changed locally, like a
    * light turning on through a light switch.
    *
    * When calling this function, a JWT (JSON Web Token) needs to be provided
    * as an option in the constructor.
    *
    * @example
    * ```javascript
    * const app = smarthome({
    *   jwt: require('./jwt.json');
    * });
    *
    * const reportState = () => {
    *   app.reportState({
    *     requestId: '123ABC',
    *     agentUserId: 'user-123',
    *     payload: {
    *       devices: {
    *         states: {
    *           "light-123": {
    *             on: true
    *           }
    *         }
    *       }
    *     }
    *   })
    *   .then((res) => {
    *     // Report state was successful
    *   })
    *   .catch((res) => {
    *     // Report state failed
    *   })
    * };
    * ```
    *
    * @param reportedState A payload containing a device or set of devices with their states
    *
    * @public
    */
  def reportState(reportedState: SmartHomeV1ReportStateRequest): js.Promise[String] = js.native
  /**
    * Sends a request to the home graph to send a new SYNC request. This should
    * be called when a device is added or removed for a given user id.
    *
    * When calling this function, an API key needs to be provided as an option
    * in the constructor. See https://developers.google.com/actions/smarthome/create-app#request-sync
    * to learn more.
    *
    * @example
    * ```javascript
    *
    * const app = smarthome({
    *   key: "123ABC"
    * });
    *
    * const addNewDevice = () => {
    *   app.requestSync('user-123')
    *     .then((res) => {
    *       // Request sync was successful
    *     })
    *     .catch((res) => {
    *       // Request sync failed
    *     })
    * }
    *
    * // When request sync is called, a SYNC
    * // intent will be received soon after.
    * app.onSync(body => {
    *   // ...
    * })
    * ```
    *
    * @param agentUserId The user identifier.
    *
    * @public
    */
  def requestSync(agentUserId: String): js.Promise[String] = js.native
}

