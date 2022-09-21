package typings.actionsOnGoogle

import org.scalablytyped.runtime.StringDictionary
import typings.actionsOnGoogle.actionsOnGoogleStrings.service_account
import typings.actionsOnGoogle.apiV1Mod.SmartHomeV1DisconnectRequest
import typings.actionsOnGoogle.apiV1Mod.SmartHomeV1DisconnectResponse
import typings.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteRequest
import typings.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteResponse
import typings.actionsOnGoogle.apiV1Mod.SmartHomeV1Intents
import typings.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryRequest
import typings.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryResponse
import typings.actionsOnGoogle.apiV1Mod.SmartHomeV1ReportStateRequest
import typings.actionsOnGoogle.apiV1Mod.SmartHomeV1Request
import typings.actionsOnGoogle.apiV1Mod.SmartHomeV1Response
import typings.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncRequest
import typings.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncResponse
import typings.actionsOnGoogle.assistantMod.AppHandler
import typings.actionsOnGoogle.assistantMod.AppOptions
import typings.actionsOnGoogle.assistantMod.ServiceBaseApp
import typings.actionsOnGoogle.commonMod.JsonObject
import typings.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata
import typings.actionsOnGoogle.frameworkFrameworkMod.Headers
import typings.actionsOnGoogle.frameworkFrameworkMod.StandardResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smarthomeSmarthomeMod {
  
  @JSImport("actions-on-google/dist/service/smarthome/smarthome", "smarthome")
  @js.native
  val smarthome: SmartHome_ = js.native
  
  trait SmartHomeApp
    extends StObject
       with ServiceBaseApp {
    
    /** @hidden */
    def _intent(intent: SmartHomeV1Intents, handler: SmartHomeHandler[SmartHomeV1Request, SmartHomeV1Response]): this.type
    
    /** @hidden */
    var _intents: SmartHomeHandlers
    
    /**
      * @public
      * @deprecated Home Graph credentials are deprecated.
      * Use Google APIs Node.js Client for Home Graph:
      * https://www.npmjs.com/package/@googleapis/homegraph
      */
    var jwt: js.UndefOr[SmartHomeJwt] = js.undefined
    
    /**
      * @public
      * @deprecated Home Graph credentials are deprecated.
      * Use Google APIs Node.js Client for Home Graph:
      * https://www.npmjs.com/package/@googleapis/homegraph
      */
    var key: js.UndefOr[String] = js.undefined
    
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
    def onDisconnect(handler: SmartHomeHandler[SmartHomeV1DisconnectRequest, SmartHomeV1DisconnectResponse]): this.type
    
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
    def onExecute(handler: SmartHomeHandler[SmartHomeV1ExecuteRequest, SmartHomeV1ExecuteResponse]): this.type
    
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
    def onQuery(handler: SmartHomeHandler[SmartHomeV1QueryRequest, SmartHomeV1QueryResponse]): this.type
    
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
    def onSync(handler: SmartHomeHandler[SmartHomeV1SyncRequest, SmartHomeV1SyncResponse]): this.type
    
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
      * @deprecated Home Graph wrapper methods are deprecated.
      * Use Google APIs Node.js Client for Home Graph:
      * https://www.npmjs.com/package/@googleapis/homegraph
      */
    def reportState(reportedState: SmartHomeV1ReportStateRequest): js.Promise[String]
    
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
      * @deprecated Home Graph wrapper methods are deprecated.
      * Use Google APIs Node.js Client for Home Graph:
      * https://www.npmjs.com/package/@googleapis/homegraph
      */
    def requestSync(agentUserId: String): js.Promise[String]
  }
  object SmartHomeApp {
    
    inline def apply(
      _intent: (SmartHomeV1Intents, SmartHomeHandler[SmartHomeV1Request, SmartHomeV1Response]) => SmartHomeApp,
      _intents: SmartHomeHandlers,
      handler: (/* body */ JsonObject, /* headers */ Headers, /* metadata */ js.UndefOr[BuiltinFrameworkMetadata]) => js.Promise[StandardResponse],
      onDisconnect: SmartHomeHandler[SmartHomeV1DisconnectRequest, SmartHomeV1DisconnectResponse] => SmartHomeApp,
      onExecute: SmartHomeHandler[SmartHomeV1ExecuteRequest, SmartHomeV1ExecuteResponse] => SmartHomeApp,
      onQuery: SmartHomeHandler[SmartHomeV1QueryRequest, SmartHomeV1QueryResponse] => SmartHomeApp,
      onSync: SmartHomeHandler[SmartHomeV1SyncRequest, SmartHomeV1SyncResponse] => SmartHomeApp,
      reportState: SmartHomeV1ReportStateRequest => js.Promise[String],
      requestSync: String => js.Promise[String]
    ): SmartHomeApp = {
      val __obj = js.Dynamic.literal(_intent = js.Any.fromFunction2(_intent), _intents = _intents.asInstanceOf[js.Any], handler = js.Any.fromFunction3(handler), onDisconnect = js.Any.fromFunction1(onDisconnect), onExecute = js.Any.fromFunction1(onExecute), onQuery = js.Any.fromFunction1(onQuery), onSync = js.Any.fromFunction1(onSync), reportState = js.Any.fromFunction1(reportState), requestSync = js.Any.fromFunction1(requestSync))
      __obj.asInstanceOf[SmartHomeApp]
    }
    
    extension [Self <: SmartHomeApp](x: Self) {
      
      inline def setJwt(value: SmartHomeJwt): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
      
      inline def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnDisconnect(
        value: SmartHomeHandler[SmartHomeV1DisconnectRequest, SmartHomeV1DisconnectResponse] => SmartHomeApp
      ): Self = StObject.set(x, "onDisconnect", js.Any.fromFunction1(value))
      
      inline def setOnExecute(value: SmartHomeHandler[SmartHomeV1ExecuteRequest, SmartHomeV1ExecuteResponse] => SmartHomeApp): Self = StObject.set(x, "onExecute", js.Any.fromFunction1(value))
      
      inline def setOnQuery(value: SmartHomeHandler[SmartHomeV1QueryRequest, SmartHomeV1QueryResponse] => SmartHomeApp): Self = StObject.set(x, "onQuery", js.Any.fromFunction1(value))
      
      inline def setOnSync(value: SmartHomeHandler[SmartHomeV1SyncRequest, SmartHomeV1SyncResponse] => SmartHomeApp): Self = StObject.set(x, "onSync", js.Any.fromFunction1(value))
      
      inline def setReportState(value: SmartHomeV1ReportStateRequest => js.Promise[String]): Self = StObject.set(x, "reportState", js.Any.fromFunction1(value))
      
      inline def setRequestSync(value: String => js.Promise[String]): Self = StObject.set(x, "requestSync", js.Any.fromFunction1(value))
      
      inline def set_intent(
        value: (SmartHomeV1Intents, SmartHomeHandler[SmartHomeV1Request, SmartHomeV1Response]) => SmartHomeApp
      ): Self = StObject.set(x, "_intent", js.Any.fromFunction2(value))
      
      inline def set_intents(value: SmartHomeHandlers): Self = StObject.set(x, "_intents", value.asInstanceOf[js.Any])
    }
  }
  
  type SmartHomeHandler[TRequest /* <: SmartHomeV1Request */, TResponse /* <: SmartHomeV1Response */] = js.Function3[
    /* body */ TRequest, 
    /* headers */ Headers, 
    /* framework */ BuiltinFrameworkMetadata, 
    TResponse | js.Promise[TResponse]
  ]
  
  type SmartHomeHandlers = StringDictionary[SmartHomeHandler[SmartHomeV1Request, SmartHomeV1Response]]
  
  trait SmartHomeJwt extends StObject {
    
    var auth_provider_x509_cert_url: String
    
    var auth_uri: String
    
    var client_email: String
    
    var client_id: String
    
    var client_x509_cert_url: String
    
    var private_key: String
    
    var private_key_id: String
    
    var project_id: String
    
    var token_uri: String
    
    var `type`: service_account
  }
  object SmartHomeJwt {
    
    inline def apply(
      auth_provider_x509_cert_url: String,
      auth_uri: String,
      client_email: String,
      client_id: String,
      client_x509_cert_url: String,
      private_key: String,
      private_key_id: String,
      project_id: String,
      token_uri: String
    ): SmartHomeJwt = {
      val __obj = js.Dynamic.literal(auth_provider_x509_cert_url = auth_provider_x509_cert_url.asInstanceOf[js.Any], auth_uri = auth_uri.asInstanceOf[js.Any], client_email = client_email.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], client_x509_cert_url = client_x509_cert_url.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any], private_key_id = private_key_id.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], token_uri = token_uri.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("service_account")
      __obj.asInstanceOf[SmartHomeJwt]
    }
    
    extension [Self <: SmartHomeJwt](x: Self) {
      
      inline def setAuth_provider_x509_cert_url(value: String): Self = StObject.set(x, "auth_provider_x509_cert_url", value.asInstanceOf[js.Any])
      
      inline def setAuth_uri(value: String): Self = StObject.set(x, "auth_uri", value.asInstanceOf[js.Any])
      
      inline def setClient_email(value: String): Self = StObject.set(x, "client_email", value.asInstanceOf[js.Any])
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_x509_cert_url(value: String): Self = StObject.set(x, "client_x509_cert_url", value.asInstanceOf[js.Any])
      
      inline def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      inline def setPrivate_key_id(value: String): Self = StObject.set(x, "private_key_id", value.asInstanceOf[js.Any])
      
      inline def setProject_id(value: String): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
      
      inline def setToken_uri(value: String): Self = StObject.set(x, "token_uri", value.asInstanceOf[js.Any])
      
      inline def setType(value: service_account): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SmartHomeOptions
    extends StObject
       with AppOptions {
    
    /**
      * A JWT (JSON Web Token) that is able to access the home graph API.
      * This is used for report state. See https://jwt.io/. A JWT can be
      * created through the Google Cloud Console: https://console.cloud.google.com/apis/credentials
      * @public
      * @deprecated Home Graph credentials are deprecated.
      * Use Google APIs Node.js Client for Home Graph:
      * https://www.npmjs.com/package/@googleapis/homegraph
      */
    var jwt: js.UndefOr[SmartHomeJwt] = js.undefined
    
    /**
      * An API key to use the home graph API. See
      * https://console.cloud.google.com/apis/api/homegraph.googleapis.com/overview
      * to learn more.
      * @public
      * @deprecated Home Graph credentials are deprecated.
      * Use Google APIs Node.js Client for Home Graph:
      * https://www.npmjs.com/package/@googleapis/homegraph
      */
    var key: js.UndefOr[String] = js.undefined
  }
  object SmartHomeOptions {
    
    inline def apply(): SmartHomeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmartHomeOptions]
    }
    
    extension [Self <: SmartHomeOptions](x: Self) {
      
      inline def setJwt(value: SmartHomeJwt): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
      
      inline def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  type SmartHome_ = js.Function1[/* options */ js.UndefOr[SmartHomeOptions], AppHandler & SmartHomeApp]
}
