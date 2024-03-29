package typings.amazonConnectStreams

import typings.amazonConnectStreams.connect.Agent
import typings.amazonConnectStreams.connect.AgentApp
import typings.amazonConnectStreams.connect.AgentCallback
import typings.amazonConnectStreams.connect.Callback
import typings.amazonConnectStreams.connect.Contact
import typings.amazonConnectStreams.connect.ContactCallback
import typings.amazonConnectStreams.connect.Core
import typings.amazonConnectStreams.connect.EndpointType
import typings.amazonConnectStreams.connect.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object connect {
    
    @JSGlobal("connect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("connect.AgentAvailStates")
    @js.native
    object AgentAvailStates extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.AgentAvailStates & String] = js.native
      
      /* "AfterCallWork" */ val AFTER_CALL_WORK: typings.amazonConnectStreams.connect.AgentAvailStates.AFTER_CALL_WORK & String = js.native
      
      /* "Busy" */ val BUSY: typings.amazonConnectStreams.connect.AgentAvailStates.BUSY & String = js.native
      
      /* "CallingCustomer" */ val CALLING_CUSTOMER: typings.amazonConnectStreams.connect.AgentAvailStates.CALLING_CUSTOMER & String = js.native
      
      /* "Dialing" */ val DIALING: typings.amazonConnectStreams.connect.AgentAvailStates.DIALING & String = js.native
      
      /* "Init" */ val INIT: typings.amazonConnectStreams.connect.AgentAvailStates.INIT & String = js.native
      
      /* "Joining" */ val JOINING: typings.amazonConnectStreams.connect.AgentAvailStates.JOINING & String = js.native
      
      /* "PendingAvailable" */ val PENDING_AVAILABLE: typings.amazonConnectStreams.connect.AgentAvailStates.PENDING_AVAILABLE & String = js.native
      
      /* "PendingBusy" */ val PENDING_BUSY: typings.amazonConnectStreams.connect.AgentAvailStates.PENDING_BUSY & String = js.native
    }
    
    @JSGlobal("connect.AgentErrorStates")
    @js.native
    object AgentErrorStates extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.AgentErrorStates & String] = js.native
      
      /* "AgentHungUp" */ val AGENT_HUNG_UP: typings.amazonConnectStreams.connect.AgentErrorStates.AGENT_HUNG_UP & String = js.native
      
      /* "BadAddressAgent" */ val BAD_ADDRESS_AGENT: typings.amazonConnectStreams.connect.AgentErrorStates.BAD_ADDRESS_AGENT & String = js.native
      
      /* "BadAddressCustomer" */ val BAD_ADDRESS_CUSTOMER: typings.amazonConnectStreams.connect.AgentErrorStates.BAD_ADDRESS_CUSTOMER & String = js.native
      
      /* "Default" */ val DEFAULT: typings.amazonConnectStreams.connect.AgentErrorStates.DEFAULT & String = js.native
      
      /* "Error" */ val ERROR: typings.amazonConnectStreams.connect.AgentErrorStates.ERROR & String = js.native
      
      /* "FailedConnectAgent" */ val FAILED_CONNECT_AGENT: typings.amazonConnectStreams.connect.AgentErrorStates.FAILED_CONNECT_AGENT & String = js.native
      
      /* "FailedConnectCustomer" */ val FAILED_CONNECT_CUSTOMER: typings.amazonConnectStreams.connect.AgentErrorStates.FAILED_CONNECT_CUSTOMER & String = js.native
      
      /* "LineEngagedAgent" */ val LINE_ENGAGED_AGENT: typings.amazonConnectStreams.connect.AgentErrorStates.LINE_ENGAGED_AGENT & String = js.native
      
      /* "LineEngagedCustomer" */ val LINE_ENGAGED_CUSTOMER: typings.amazonConnectStreams.connect.AgentErrorStates.LINE_ENGAGED_CUSTOMER & String = js.native
      
      /* "MissedCallAgent" */ val MISSED_CALL_AGENT: typings.amazonConnectStreams.connect.AgentErrorStates.MISSED_CALL_AGENT & String = js.native
      
      /* "MissedCallCustomer" */ val MISSED_CALL_CUSTOMER: typings.amazonConnectStreams.connect.AgentErrorStates.MISSED_CALL_CUSTOMER & String = js.native
      
      /* "MultipleCcpWindows" */ val MULTIPLE_CCP_WINDOWS: typings.amazonConnectStreams.connect.AgentErrorStates.MULTIPLE_CCP_WINDOWS & String = js.native
      
      /* "RealtimeCommunicationError" */ val REALTIME_COMMUNICATION_ERROR: typings.amazonConnectStreams.connect.AgentErrorStates.REALTIME_COMMUNICATION_ERROR & String = js.native
    }
    
    @JSGlobal("connect.AgentEvents")
    @js.native
    object AgentEvents extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.AgentEvents & String] = js.native
      
      /* "acw" */ val ACW: typings.amazonConnectStreams.connect.AgentEvents.ACW & String = js.native
      
      /* "contact_pending" */ val CONTACT_PENDING: typings.amazonConnectStreams.connect.AgentEvents.CONTACT_PENDING & String = js.native
      
      /* "enqueued_next_state" */ val ENQUEUED_NEXT_STATE: typings.amazonConnectStreams.connect.AgentEvents.ENQUEUED_NEXT_STATE & String = js.native
      
      /* "error" */ val ERROR: typings.amazonConnectStreams.connect.AgentEvents.ERROR & String = js.native
      
      /* "init" */ val INIT: typings.amazonConnectStreams.connect.AgentEvents.INIT & String = js.native
      
      /* "local_media_stream_created" */ val LOCAL_MEDIA_STREAM_CREATED: typings.amazonConnectStreams.connect.AgentEvents.LOCAL_MEDIA_STREAM_CREATED & String = js.native
      
      /* "mute_toggle" */ val MUTE_TOGGLE: typings.amazonConnectStreams.connect.AgentEvents.MUTE_TOGGLE & String = js.native
      
      /* "not_routable" */ val NOT_ROUTABLE: typings.amazonConnectStreams.connect.AgentEvents.NOT_ROUTABLE & String = js.native
      
      /* "offline" */ val OFFLINE: typings.amazonConnectStreams.connect.AgentEvents.OFFLINE & String = js.native
      
      /* "pending" */ val PENDING: typings.amazonConnectStreams.connect.AgentEvents.PENDING & String = js.native
      
      /* "refresh" */ val REFRESH: typings.amazonConnectStreams.connect.AgentEvents.REFRESH & String = js.native
      
      /* "routable" */ val ROUTABLE: typings.amazonConnectStreams.connect.AgentEvents.ROUTABLE & String = js.native
      
      /* "softphone_error" */ val SOFTPHONE_ERROR: typings.amazonConnectStreams.connect.AgentEvents.SOFTPHONE_ERROR & String = js.native
      
      /* "state_change" */ val STATE_CHANGE: typings.amazonConnectStreams.connect.AgentEvents.STATE_CHANGE & String = js.native
      
      /* "update" */ val UPDATE: typings.amazonConnectStreams.connect.AgentEvents.UPDATE & String = js.native
      
      /* "websocket_connection_gained" */ val WEBSOCKET_CONNECTION_GAINED: typings.amazonConnectStreams.connect.AgentEvents.WEBSOCKET_CONNECTION_GAINED & String = js.native
      
      /* "websocket_connection_lost" */ val WEBSOCKET_CONNECTION_LOST: typings.amazonConnectStreams.connect.AgentEvents.WEBSOCKET_CONNECTION_LOST & String = js.native
    }
    
    /** This enumeration lists the different types of agent states. */
    @JSGlobal("connect.AgentStateType")
    @js.native
    object AgentStateType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.AgentStateType & String] = js.native
      
      /* "init" */ val INIT: typings.amazonConnectStreams.connect.AgentStateType.INIT & String = js.native
      
      /* "not_routable" */ val NOT_ROUTABLE: typings.amazonConnectStreams.connect.AgentStateType.NOT_ROUTABLE & String = js.native
      
      /* "offline" */ val OFFLINE: typings.amazonConnectStreams.connect.AgentStateType.OFFLINE & String = js.native
      
      /* "routable" */ val ROUTABLE: typings.amazonConnectStreams.connect.AgentStateType.ROUTABLE & String = js.native
    }
    
    /**
      * The Agent API provides event subscription methods and action methods which can be called on behalf of the agent.
      * There is only ever one agent per Streams instantiation and all contacts and actions are assumed to be taken on behalf of this one agent.
      */
    @JSGlobal("connect.Agent")
    @js.native
    open class Agent_ ()
      extends StObject
         with Agent
    
    /**
      * The Connection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular connection within a contact.
      * Like contacts, connections come and go.
      * It is good practice not to persist these objects or keep them as internal state.
      * If you need to, store the contactId and connectionId of the connection and make sure that the contact and connection still exist by fetching them in order from the Agent API object before calling methods on them.
      */
    @JSGlobal("connect.BaseConnection")
    @js.native
    open class BaseConnection ()
      extends StObject
         with typings.amazonConnectStreams.connect.BaseConnection
    
    @JSGlobal("connect.CONTACT_ACTIVE_STATES")
    @js.native
    object CONTACT_ACTIVE_STATES extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES & String] = js.native
      
      /* "connected" */ val CONNECTED: typings.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES.CONNECTED & String = js.native
      
      /* "connecting" */ val CONNECTING: typings.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES.CONNECTING & String = js.native
      
      /* "incoming" */ val INCOMING: typings.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES.INCOMING & String = js.native
      
      /* "pending" */ val PENDING: typings.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES.PENDING & String = js.native
    }
    
    @JSGlobal("connect.CTIExceptions")
    @js.native
    object CTIExceptions extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.CTIExceptions & String] = js.native
      
      /* "AccessDeniedException" */ val ACCESS_DENIED_EXCEPTION: typings.amazonConnectStreams.connect.CTIExceptions.ACCESS_DENIED_EXCEPTION & String = js.native
      
      /* "BadEndpointException" */ val BAD_ENDPOINT_EXCEPTION: typings.amazonConnectStreams.connect.CTIExceptions.BAD_ENDPOINT_EXCEPTION & String = js.native
      
      /* "InvalidAgentARNException" */ val INVALID_AGENT_ARNEXCEPTION: typings.amazonConnectStreams.connect.CTIExceptions.INVALID_AGENT_ARNEXCEPTION & String = js.native
      
      /* "InvalidConfigurationException" */ val INVALID_CONFIGURATION_EXCEPTION: typings.amazonConnectStreams.connect.CTIExceptions.INVALID_CONFIGURATION_EXCEPTION & String = js.native
      
      /* "InvalidContactTypeException" */ val INVALID_CONTACT_TYPE_EXCEPTION: typings.amazonConnectStreams.connect.CTIExceptions.INVALID_CONTACT_TYPE_EXCEPTION & String = js.native
      
      /* "InvalidStateException" */ val INVALID_STATE_EXCEPTION: typings.amazonConnectStreams.connect.CTIExceptions.INVALID_STATE_EXCEPTION & String = js.native
      
      /* "PaginationException" */ val PAGINATION_EXCEPTION: typings.amazonConnectStreams.connect.CTIExceptions.PAGINATION_EXCEPTION & String = js.native
      
      /* "RefreshTokenExpiredException" */ val REFRESH_TOKEN_EXPIRED_EXCEPTION: typings.amazonConnectStreams.connect.CTIExceptions.REFRESH_TOKEN_EXPIRED_EXCEPTION & String = js.native
      
      /* "SendDataFailedException" */ val SEND_DATA_FAILED_EXCEPTION: typings.amazonConnectStreams.connect.CTIExceptions.SEND_DATA_FAILED_EXCEPTION & String = js.native
      
      /* "UnauthorizedException" */ val UNAUTHORIZED_EXCEPTION: typings.amazonConnectStreams.connect.CTIExceptions.UNAUTHORIZED_EXCEPTION & String = js.native
    }
    
    /** This enumeration lists the different types of contact channels. */
    @JSGlobal("connect.ChannelType")
    @js.native
    object ChannelType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.ChannelType & String] = js.native
      
      /* "CHAT" */ val CHAT: typings.amazonConnectStreams.connect.ChannelType.CHAT & String = js.native
      
      /* "TASK" */ val TASK: typings.amazonConnectStreams.connect.ChannelType.TASK & String = js.native
      
      /* "VOICE" */ val VOICE: typings.amazonConnectStreams.connect.ChannelType.VOICE & String = js.native
    }
    
    /**
      * The ChatConnection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular chat connection within a contact.
      * Like contacts, connections come and go.
      * It is good practice not to persist these objects or keep them as internal state.
      * If you need to, store the `contactId` and `connectionId` of the connection and make sure that the contact and connection still exist by fetching them in order from the `Agent` API object before calling methods on them.
      */
    @JSGlobal("connect.ChatConnection")
    @js.native
    open class ChatConnection ()
      extends StObject
         with typings.amazonConnectStreams.connect.ChatConnection
    
    @JSGlobal("connect.ClickType")
    @js.native
    object ClickType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.ClickType & String] = js.native
      
      /* "Accept" */ val ACCEPT: typings.amazonConnectStreams.connect.ClickType.ACCEPT & String = js.native
      
      /* "Hangup" */ val HANGUP: typings.amazonConnectStreams.connect.ClickType.HANGUP & String = js.native
      
      /* "Reject" */ val REJECT: typings.amazonConnectStreams.connect.ClickType.REJECT & String = js.native
    }
    
    /** An enumeration listing the different states that a connection can have. */
    @JSGlobal("connect.ConnectionStateType")
    @js.native
    object ConnectionStateType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.ConnectionStateType & String] = js.native
      
      /* "barge" */ val BARGE: typings.amazonConnectStreams.connect.ConnectionStateType.BARGE & String = js.native
      
      /* "connected" */ val CONNECTED: typings.amazonConnectStreams.connect.ConnectionStateType.CONNECTED & String = js.native
      
      /* "connecting" */ val CONNECTING: typings.amazonConnectStreams.connect.ConnectionStateType.CONNECTING & String = js.native
      
      /* "disconnected" */ val DISCONNECTED: typings.amazonConnectStreams.connect.ConnectionStateType.DISCONNECTED & String = js.native
      
      /* "hold" */ val HOLD: typings.amazonConnectStreams.connect.ConnectionStateType.HOLD & String = js.native
      
      /* "init" */ val INIT: typings.amazonConnectStreams.connect.ConnectionStateType.INIT & String = js.native
      
      /* "silent_monitor" */ val SILENT_MONITOR: typings.amazonConnectStreams.connect.ConnectionStateType.SILENT_MONITOR & String = js.native
    }
    
    /** Lists the different types of connections. */
    @JSGlobal("connect.ConnectionType")
    @js.native
    object ConnectionType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.ConnectionType & String] = js.native
      
      /* "agent" */ val AGENT: typings.amazonConnectStreams.connect.ConnectionType.AGENT & String = js.native
      
      /* "inbound" */ val INBOUND: typings.amazonConnectStreams.connect.ConnectionType.INBOUND & String = js.native
      
      /* "monitoring" */ val MONITORING: typings.amazonConnectStreams.connect.ConnectionType.MONITORING & String = js.native
      
      /* "outbound" */ val OUTBOUND: typings.amazonConnectStreams.connect.ConnectionType.OUTBOUND & String = js.native
    }
    
    @JSGlobal("connect.ContactEvents")
    @js.native
    object ContactEvents extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.ContactEvents & String] = js.native
      
      /* "accepted" */ val ACCEPTED: typings.amazonConnectStreams.connect.ContactEvents.ACCEPTED & String = js.native
      
      /* "acw" */ val ACW: typings.amazonConnectStreams.connect.ContactEvents.ACW & String = js.native
      
      /* "connected" */ val CONNECTED: typings.amazonConnectStreams.connect.ContactEvents.CONNECTED & String = js.native
      
      /* "connecting" */ val CONNECTING: typings.amazonConnectStreams.connect.ContactEvents.CONNECTING & String = js.native
      
      /* "destroyed" */ val DESTROYED: typings.amazonConnectStreams.connect.ContactEvents.DESTROYED & String = js.native
      
      /* "ended" */ val ENDED: typings.amazonConnectStreams.connect.ContactEvents.ENDED & String = js.native
      
      /* "error" */ val ERROR: typings.amazonConnectStreams.connect.ContactEvents.ERROR & String = js.native
      
      /* "incoming" */ val INCOMING: typings.amazonConnectStreams.connect.ContactEvents.INCOMING & String = js.native
      
      /* "init" */ val INIT: typings.amazonConnectStreams.connect.ContactEvents.INIT & String = js.native
      
      /* "missed" */ val MISSED: typings.amazonConnectStreams.connect.ContactEvents.MISSED & String = js.native
      
      /* "pending" */ val PENDING: typings.amazonConnectStreams.connect.ContactEvents.PENDING & String = js.native
      
      /* "refresh" */ val REFRESH: typings.amazonConnectStreams.connect.ContactEvents.REFRESH & String = js.native
      
      /* "view" */ val VIEW: typings.amazonConnectStreams.connect.ContactEvents.VIEW & String = js.native
    }
    
    /** An enumeration listing the different high-level states that a contact can have. */
    @JSGlobal("connect.ContactStateType")
    @js.native
    object ContactStateType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.ContactStateType & String] = js.native
      
      /* "acw" */ val ACW: typings.amazonConnectStreams.connect.ContactStateType.ACW & String = js.native
      
      /* "cleared" */ val CLEARED: typings.amazonConnectStreams.connect.ContactStateType.CLEARED & String = js.native
      
      /* "connected" */ val CONNECTED: typings.amazonConnectStreams.connect.ContactStateType.CONNECTED & String = js.native
      
      /* "connecting" */ val CONNECTING: typings.amazonConnectStreams.connect.ContactStateType.CONNECTING & String = js.native
      
      /* "ended" */ val ENDED: typings.amazonConnectStreams.connect.ContactStateType.ENDED & String = js.native
      
      /* "error" */ val ERROR: typings.amazonConnectStreams.connect.ContactStateType.ERROR & String = js.native
      
      /* "incoming" */ val INCOMING: typings.amazonConnectStreams.connect.ContactStateType.INCOMING & String = js.native
      
      /* "init" */ val INIT: typings.amazonConnectStreams.connect.ContactStateType.INIT & String = js.native
      
      /* "missed" */ val MISSED: typings.amazonConnectStreams.connect.ContactStateType.MISSED & String = js.native
      
      /* "pending" */ val PENDING: typings.amazonConnectStreams.connect.ContactStateType.PENDING & String = js.native
      
      /* "rejected" */ val REJECTED: typings.amazonConnectStreams.connect.ContactStateType.REJECTED & String = js.native
    }
    
    /** This enumeration lists all of the contact types supported by Connect Streams. */
    @JSGlobal("connect.ContactType")
    @js.native
    object ContactType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.ContactType & String] = js.native
      
      /* "chat" */ val CHAT: typings.amazonConnectStreams.connect.ContactType.CHAT & String = js.native
      
      /* "queue_callback" */ val QUEUE_CALLBACK: typings.amazonConnectStreams.connect.ContactType.QUEUE_CALLBACK & String = js.native
      
      /* "task" */ val TASK: typings.amazonConnectStreams.connect.ContactType.TASK & String = js.native
      
      /* "voice" */ val VOICE: typings.amazonConnectStreams.connect.ContactType.VOICE & String = js.native
    }
    
    /**
      * The Contact API provides event subscription methods and action methods which can be called on behalf of a specific contact.
      * Contacts come and go and so should these API objects.
      * It is good practice not to persist these objects or keep them as internal state.
      * If you need to, store the `contactId` of the contact and make sure that the contact still exists by fetching it from the `Agent` API object before calling methods on it.
      */
    @JSGlobal("connect.Contact")
    @js.native
    open class Contact_ ()
      extends StObject
         with Contact
    
    @JSGlobal("connect.Endpoint")
    @js.native
    open class Endpoint ()
      extends StObject
         with typings.amazonConnectStreams.connect.Endpoint {
      
      /* CompleteClass */
      override val agentLogin: String = js.native
      
      /* CompleteClass */
      override val endpointARN: String = js.native
      
      /* CompleteClass */
      override val endpointId: String = js.native
      
      /* CompleteClass */
      override val name: String = js.native
      
      /* CompleteClass */
      override val phoneNumber: String = js.native
      
      /* CompleteClass */
      override val queue: String = js.native
      
      /* CompleteClass */
      override val `type`: EndpointType = js.native
    }
    object Endpoint {
      
      @JSGlobal("connect.Endpoint")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates an endpoint from a E.164 phone number.
        *
        * @param phoneNumber The E.164 endpoint phone number.
        */
      /* static member */
      inline def byPhoneNumber(phoneNumber: String): typings.amazonConnectStreams.connect.Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("byPhoneNumber")(phoneNumber.asInstanceOf[js.Any]).asInstanceOf[typings.amazonConnectStreams.connect.Endpoint]
    }
    
    /** This enumeration lists the different types of endpoints. */
    @JSGlobal("connect.EndpointType")
    @js.native
    object EndpointType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.EndpointType & String] = js.native
      
      /* "agent" */ val AGENT: typings.amazonConnectStreams.connect.EndpointType.AGENT & String = js.native
      
      /* "phone_number" */ val PHONE_NUMBER: typings.amazonConnectStreams.connect.EndpointType.PHONE_NUMBER & String = js.native
      
      /* "queue" */ val QUEUE: typings.amazonConnectStreams.connect.EndpointType.QUEUE & String = js.native
    }
    
    @JSGlobal("connect.EventType")
    @js.native
    object EventType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.EventType & String] = js.native
      
      /* "access_denied" */ val ACCESS_DENIED: typings.amazonConnectStreams.connect.EventType.ACCESS_DENIED & String = js.native
      
      /* "acknowledge" */ val ACKNOWLEDGE: typings.amazonConnectStreams.connect.EventType.ACKNOWLEDGE & String = js.native
      
      /* "ack_timeout" */ val ACK_TIMEOUT: typings.amazonConnectStreams.connect.EventType.ACK_TIMEOUT & String = js.native
      
      /* "api_metric" */ val API_METRIC: typings.amazonConnectStreams.connect.EventType.API_METRIC & String = js.native
      
      /* "api_request" */ val API_REQUEST: typings.amazonConnectStreams.connect.EventType.API_REQUEST & String = js.native
      
      /* "api_response" */ val API_RESPONSE: typings.amazonConnectStreams.connect.EventType.API_RESPONSE & String = js.native
      
      /* "authorize_retries_exhausted" */ val AUTHORIZE_RETRIES_EXHAUSTED: typings.amazonConnectStreams.connect.EventType.AUTHORIZE_RETRIES_EXHAUSTED & String = js.native
      
      /* "authorize_success" */ val AUTHORIZE_SUCCESS: typings.amazonConnectStreams.connect.EventType.AUTHORIZE_SUCCESS & String = js.native
      
      /* "auth_fail" */ val AUTH_FAIL: typings.amazonConnectStreams.connect.EventType.AUTH_FAIL & String = js.native
      
      /* "broadcast" */ val BROADCAST: typings.amazonConnectStreams.connect.EventType.BROADCAST & String = js.native
      
      /* "click_stream_data" */ val CLICK_STREAM_DATA: typings.amazonConnectStreams.connect.EventType.CLICK_STREAM_DATA & String = js.native
      
      /* "client_metric" */ val CLIENT_METRIC: typings.amazonConnectStreams.connect.EventType.CLIENT_METRIC & String = js.native
      
      /* "client_side_logs" */ val CLIENT_SIDE_LOGS: typings.amazonConnectStreams.connect.EventType.CLIENT_SIDE_LOGS & String = js.native
      
      /* "close" */ val CLOSE: typings.amazonConnectStreams.connect.EventType.CLOSE & String = js.native
      
      /* "configure" */ val CONFIGURE: typings.amazonConnectStreams.connect.EventType.CONFIGURE & String = js.native
      
      /* "cti_authorize_retries_exhausted" */ val CTI_AUTHORIZE_RETRIES_EXHAUSTED: typings.amazonConnectStreams.connect.EventType.CTI_AUTHORIZE_RETRIES_EXHAUSTED & String = js.native
      
      /* "iframe_retries_exhausted" */ val IFRAME_RETRIES_EXHAUSTED: typings.amazonConnectStreams.connect.EventType.IFRAME_RETRIES_EXHAUSTED & String = js.native
      
      /* "iframe_style" */ val IFRAME_STYLE: typings.amazonConnectStreams.connect.EventType.IFRAME_STYLE & String = js.native
      
      /* "init" */ val INIT: typings.amazonConnectStreams.connect.EventType.INIT & String = js.native
      
      /* "log" */ val LOG: typings.amazonConnectStreams.connect.EventType.LOG & String = js.native
      
      /* "master_request" */ val MASTER_REQUEST: typings.amazonConnectStreams.connect.EventType.MASTER_REQUEST & String = js.native
      
      /* "master_response" */ val MASTER_RESPONSE: typings.amazonConnectStreams.connect.EventType.MASTER_RESPONSE & String = js.native
      
      /* "media_device_request" */ val MEDIA_DEVICE_REQUEST: typings.amazonConnectStreams.connect.EventType.MEDIA_DEVICE_REQUEST & String = js.native
      
      /* "media_device_response" */ val MEDIA_DEVICE_RESPONSE: typings.amazonConnectStreams.connect.EventType.MEDIA_DEVICE_RESPONSE & String = js.native
      
      /* "mute" */ val MUTE: typings.amazonConnectStreams.connect.EventType.MUTE & String = js.native
      
      /* "outer_context_info" */ val OUTER_CONTEXT_INFO: typings.amazonConnectStreams.connect.EventType.OUTER_CONTEXT_INFO & String = js.native
      
      /* "reload_agent_configuration" */ val RELOAD_AGENT_CONFIGURATION: typings.amazonConnectStreams.connect.EventType.RELOAD_AGENT_CONFIGURATION & String = js.native
      
      /* "send_logs" */ val SEND_LOGS: typings.amazonConnectStreams.connect.EventType.SEND_LOGS & String = js.native
      
      /* "server_bound_internal_log" */ val SERVER_BOUND_INTERNAL_LOG: typings.amazonConnectStreams.connect.EventType.SERVER_BOUND_INTERNAL_LOG & String = js.native
      
      /* "softphone_report" */ val SOFTPHONE_REPORT: typings.amazonConnectStreams.connect.EventType.SOFTPHONE_REPORT & String = js.native
      
      /* "softphone_stats" */ val SOFTPHONE_STATS: typings.amazonConnectStreams.connect.EventType.SOFTPHONE_STATS & String = js.native
      
      /* "synchronize" */ val SYNCHRONIZE: typings.amazonConnectStreams.connect.EventType.SYNCHRONIZE & String = js.native
      
      /* "tab_id" */ val TAB_ID: typings.amazonConnectStreams.connect.EventType.TAB_ID & String = js.native
      
      /* "terminate" */ val TERMINATE: typings.amazonConnectStreams.connect.EventType.TERMINATE & String = js.native
      
      /* "terminated" */ val TERMINATED: typings.amazonConnectStreams.connect.EventType.TERMINATED & String = js.native
      
      /* "update_connected_ccps" */ val UPDATE_CONNECTED_CCPS: typings.amazonConnectStreams.connect.EventType.UPDATE_CONNECTED_CCPS & String = js.native
    }
    
    @JSGlobal("connect.LogLevel")
    @js.native
    object LogLevel extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.LogLevel & String] = js.native
      
      /* "CRITICAL" */ val CRITICAL: typings.amazonConnectStreams.connect.LogLevel.CRITICAL & String = js.native
      
      /* "DEBUG" */ val DEBUG: typings.amazonConnectStreams.connect.LogLevel.DEBUG & String = js.native
      
      /* "ERROR" */ val ERROR: typings.amazonConnectStreams.connect.LogLevel.ERROR & String = js.native
      
      /* "INFO" */ val INFO: typings.amazonConnectStreams.connect.LogLevel.INFO & String = js.native
      
      /* "LOG" */ val LOG: typings.amazonConnectStreams.connect.LogLevel.LOG & String = js.native
      
      /* "TEST" */ val TEST: typings.amazonConnectStreams.connect.LogLevel.TEST & String = js.native
      
      /* "TRACE" */ val TRACE: typings.amazonConnectStreams.connect.LogLevel.TRACE & String = js.native
      
      /* "WARN" */ val WARN: typings.amazonConnectStreams.connect.LogLevel.WARN & String = js.native
    }
    
    @JSGlobal("connect.MasterTopics")
    @js.native
    object MasterTopics extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.MasterTopics & String] = js.native
      
      /* "loginPopup" */ val LOGIN_POPUP: typings.amazonConnectStreams.connect.MasterTopics.LOGIN_POPUP & String = js.native
      
      /* "metrics" */ val METRICS: typings.amazonConnectStreams.connect.MasterTopics.METRICS & String = js.native
      
      /* "ringtone" */ val RINGTONE: typings.amazonConnectStreams.connect.MasterTopics.RINGTONE & String = js.native
      
      /* "sendLogs" */ val SEND_LOGS: typings.amazonConnectStreams.connect.MasterTopics.SEND_LOGS & String = js.native
      
      /* "softphone" */ val SOFTPHONE: typings.amazonConnectStreams.connect.MasterTopics.SOFTPHONE & String = js.native
    }
    
    @JSGlobal("connect.MediaType")
    @js.native
    object MediaType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.MediaType & String] = js.native
      
      /* "chat" */ val CHAT: typings.amazonConnectStreams.connect.MediaType.CHAT & String = js.native
      
      /* "softphone" */ val SOFTPHONE: typings.amazonConnectStreams.connect.MediaType.SOFTPHONE & String = js.native
      
      /* "task" */ val TASK: typings.amazonConnectStreams.connect.MediaType.TASK & String = js.native
    }
    
    @JSGlobal("connect.MonitoringMode")
    @js.native
    object MonitoringMode extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.MonitoringMode & String] = js.native
      
      /* "BARGE" */ val BARGE: typings.amazonConnectStreams.connect.MonitoringMode.BARGE & String = js.native
      
      /* "SILENT_MONITOR" */ val SLIENT_MONITOR: typings.amazonConnectStreams.connect.MonitoringMode.SLIENT_MONITOR & String = js.native
    }
    
    @JSGlobal("connect.ReferenceType")
    @js.native
    object ReferenceType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.ReferenceType & String] = js.native
      
      /* "URL" */ val URL: typings.amazonConnectStreams.connect.ReferenceType.URL & String = js.native
    }
    
    @JSGlobal("connect.SoftphoneCallType")
    @js.native
    object SoftphoneCallType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.SoftphoneCallType & String] = js.native
      
      /* "audio_only" */ val AUDIO_ONLY: typings.amazonConnectStreams.connect.SoftphoneCallType.AUDIO_ONLY & String = js.native
      
      /* "audio_video" */ val AUDIO_VIDEO: typings.amazonConnectStreams.connect.SoftphoneCallType.AUDIO_VIDEO & String = js.native
      
      /* "none" */ val NONE: typings.amazonConnectStreams.connect.SoftphoneCallType.NONE & String = js.native
      
      /* "video_only" */ val VIDEO_ONLY: typings.amazonConnectStreams.connect.SoftphoneCallType.VIDEO_ONLY & String = js.native
    }
    
    @JSGlobal("connect.SoftphoneError")
    @js.native
    open class SoftphoneError protected ()
      extends StObject
         with typings.amazonConnectStreams.connect.SoftphoneError {
      def this(errorType: String, errorMessage: String, endPointUrl: String) = this()
      
      /* CompleteClass */
      override val endPointUrl: String = js.native
      
      /* CompleteClass */
      override val errorMessage: String = js.native
      
      /* CompleteClass */
      override val errorType: String = js.native
      
      /* CompleteClass */
      override def getEndPointUrl(): String = js.native
      
      /* CompleteClass */
      override def getErrorMessage(): String = js.native
      
      /* CompleteClass */
      override def getErrorType(): String = js.native
    }
    
    @JSGlobal("connect.SoftphoneErrorTypes")
    @js.native
    object SoftphoneErrorTypes extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.SoftphoneErrorTypes & String] = js.native
      
      /* "ice_collection_timeout" */ val ICE_COLLECTION_TIMEOUT: typings.amazonConnectStreams.connect.SoftphoneErrorTypes.ICE_COLLECTION_TIMEOUT & String = js.native
      
      /* "microphone_not_shared" */ val MICROPHONE_NOT_SHARED: typings.amazonConnectStreams.connect.SoftphoneErrorTypes.MICROPHONE_NOT_SHARED & String = js.native
      
      /* "other" */ val OTHER: typings.amazonConnectStreams.connect.SoftphoneErrorTypes.OTHER & String = js.native
      
      /* "realtime_communication_error" */ val REALTIME_COMMUNICATION_ERROR: typings.amazonConnectStreams.connect.SoftphoneErrorTypes.REALTIME_COMMUNICATION_ERROR & String = js.native
      
      /* "signalling_connection_failure" */ val SIGNALLING_CONNECTION_FAILURE: typings.amazonConnectStreams.connect.SoftphoneErrorTypes.SIGNALLING_CONNECTION_FAILURE & String = js.native
      
      /* "signalling_handshake_failure" */ val SIGNALLING_HANDSHAKE_FAILURE: typings.amazonConnectStreams.connect.SoftphoneErrorTypes.SIGNALLING_HANDSHAKE_FAILURE & String = js.native
      
      /* "unsupported_browser" */ val UNSUPPORTED_BROWSER: typings.amazonConnectStreams.connect.SoftphoneErrorTypes.UNSUPPORTED_BROWSER & String = js.native
      
      /* "user_busy_error" */ val USER_BUSY_ERROR: typings.amazonConnectStreams.connect.SoftphoneErrorTypes.USER_BUSY_ERROR & String = js.native
      
      /* "webrtc_error" */ val WEBRTC_ERROR: typings.amazonConnectStreams.connect.SoftphoneErrorTypes.WEBRTC_ERROR & String = js.native
    }
    
    /**
      * The TaskConnection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular task connection within a contact.
      * Like contacts, connections come and go.
      * It is good practice not to persist these objects or keep them as internal state.
      * If you need to, store the `contactId` and `connectionId` of the connection and make sure that the contact and connection still exist by fetching them in order from the `Agent` API object before calling methods on them.
      */
    @JSGlobal("connect.TaskConnection")
    @js.native
    open class TaskConnection ()
      extends StObject
         with typings.amazonConnectStreams.connect.TaskConnection
    
    /**
      * The VoiceConnection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular voice connection within a contact.
      * Like contacts, connections come and go.
      * It is good practice not to persist these objects or keep them as internal state.
      * If you need to, store the `contactId` and `connectionId` of the connection and make sure that the contact and connection still exist by fetching them in order from the `Agent` API object before calling methods on them.
      */
    @JSGlobal("connect.VoiceConnection")
    @js.native
    open class VoiceConnection ()
      extends StObject
         with typings.amazonConnectStreams.connect.VoiceConnection
    
    /**
      * Subscribe a method to be called when the agent is initialized.
      * If the agent has already been initialized, the call is synchronous and the callback is invoked immediately.
      * Otherwise, the callback is invoked once the first agent data is received from upstream.
      * This callback is provided with an `Agent` API object, which can also be created at any time after initialization is complete via `new connect.Agent()`.
      *
      * @param callback A callback that will receive an `Agent` API object instance.
      */
    inline def agent(callback: AgentCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("agent")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("connect.agentApp")
    @js.native
    val agentApp: AgentApp = js.native
    
    /**
      * Subscribe a method to be called for each newly detected agent contact.
      * Note that this function is not only for incoming contacts, but for contacts which already existed when Streams was initialized, such as from a previous agent session.
      * This callback is provided with a `Contact` API object for this contact. `Contact` API objects can also be listed from the `Agent` API by calling `agent.getContacts()`.
      *
      * @param callback A callback that will receive an `Contact` API object instance.
      */
    inline def contact(callback: ContactCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("contact")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("connect.core")
    @js.native
    val core: Core = js.native
    
    /** Gets the global logger instance. */
    inline def getLog(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLog")().asInstanceOf[Logger]
    
    /**
      * A useful utility function for creating callback closures that bind a function to an object instance.
      *
      * @param scope The instance object to be set as the scope of the function.
      * @param method The method to be encapsulated.
      */
    inline def hitch[T /* <: js.Function1[/* repeated */ Any, Any] */](scope: js.Object, method: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("hitch")(scope.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Subscribe a method to be called when the WebSocket connection fails to initialize.
      * If the WebSocket has already failed at least once in initializing, the call is
      * synchronous and the callback is invoked immediately.  Otherwise, the callback is
      * invoked once the first attempt to initialize fails.
      * 
      * @param callback A callback with no arguments
      */
    inline def onWebsocketInitFailure(callback: Callback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onWebsocketInitFailure")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
