package typings.alexaVoiceService

import typings.alexaVoiceService.anon.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("alexa-voice-service", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with AVS {
    def this(params: AVSParams) = this()
  }
  
  @js.native
  sealed trait EventTypes extends StObject
  @JSImport("alexa-voice-service", "EventTypes")
  @js.native
  object EventTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EventTypes & Double] = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with EventTypes
    /* 2 */ val ERROR: typings.alexaVoiceService.mod.EventTypes.ERROR & Double = js.native
    
    @js.native
    sealed trait LOG
      extends StObject
         with EventTypes
    /* 4 */ val LOG: typings.alexaVoiceService.mod.EventTypes.LOG & Double = js.native
    
    @js.native
    sealed trait LOGIN
      extends StObject
         with EventTypes
    /* 5 */ val LOGIN: typings.alexaVoiceService.mod.EventTypes.LOGIN & Double = js.native
    
    @js.native
    sealed trait LOGOUT
      extends StObject
         with EventTypes
    /* 6 */ val LOGOUT: typings.alexaVoiceService.mod.EventTypes.LOGOUT & Double = js.native
    
    @js.native
    sealed trait RECORD_START
      extends StObject
         with EventTypes
    /* 1 */ val RECORD_START: typings.alexaVoiceService.mod.EventTypes.RECORD_START & Double = js.native
    
    @js.native
    sealed trait RECORD_STOP
      extends StObject
         with EventTypes
    /* 0 */ val RECORD_STOP: typings.alexaVoiceService.mod.EventTypes.RECORD_STOP & Double = js.native
    
    @js.native
    sealed trait REFRESH_TOKEN_SET
      extends StObject
         with EventTypes
    /* 8 */ val REFRESH_TOKEN_SET: typings.alexaVoiceService.mod.EventTypes.REFRESH_TOKEN_SET & Double = js.native
    
    @js.native
    sealed trait TOKEN_INVALID
      extends StObject
         with EventTypes
    /* 3 */ val TOKEN_INVALID: typings.alexaVoiceService.mod.EventTypes.TOKEN_INVALID & Double = js.native
    
    @js.native
    sealed trait TOKEN_SET
      extends StObject
         with EventTypes
    /* 7 */ val TOKEN_SET: typings.alexaVoiceService.mod.EventTypes.TOKEN_SET & Double = js.native
  }
  
  @JSImport("alexa-voice-service", "Player")
  @js.native
  open class Player () extends StObject {
    
    def on(eventType: typings.alexaVoiceService.mod.Player.EventTypes): Unit = js.native
    def on(eventType: typings.alexaVoiceService.mod.Player.EventTypes, callback: js.Function0[Unit]): Unit = js.native
  }
  object Player {
    
    @js.native
    sealed trait EventTypes extends StObject
    @JSImport("alexa-voice-service", "Player.EventTypes")
    @js.native
    object EventTypes extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.alexaVoiceService.mod.Player.EventTypes & Double] = js.native
      
      @js.native
      sealed trait DEQUE
        extends StObject
           with typings.alexaVoiceService.mod.Player.EventTypes
      /* 7 */ val DEQUE: typings.alexaVoiceService.mod.Player.EventTypes.DEQUE & Double = js.native
      
      @js.native
      sealed trait ENQUEUE
        extends StObject
           with typings.alexaVoiceService.mod.Player.EventTypes
      /* 6 */ val ENQUEUE: typings.alexaVoiceService.mod.Player.EventTypes.ENQUEUE & Double = js.native
      
      @js.native
      sealed trait ERROR
        extends StObject
           with typings.alexaVoiceService.mod.Player.EventTypes
      /* 1 */ val ERROR: typings.alexaVoiceService.mod.Player.EventTypes.ERROR & Double = js.native
      
      @js.native
      sealed trait LOG
        extends StObject
           with typings.alexaVoiceService.mod.Player.EventTypes
      /* 0 */ val LOG: typings.alexaVoiceService.mod.Player.EventTypes.LOG & Double = js.native
      
      @js.native
      sealed trait PAUSE
        extends StObject
           with typings.alexaVoiceService.mod.Player.EventTypes
      /* 4 */ val PAUSE: typings.alexaVoiceService.mod.Player.EventTypes.PAUSE & Double = js.native
      
      @js.native
      sealed trait PLAY
        extends StObject
           with typings.alexaVoiceService.mod.Player.EventTypes
      /* 2 */ val PLAY: typings.alexaVoiceService.mod.Player.EventTypes.PLAY & Double = js.native
      
      @js.native
      sealed trait REPLAY
        extends StObject
           with typings.alexaVoiceService.mod.Player.EventTypes
      /* 3 */ val REPLAY: typings.alexaVoiceService.mod.Player.EventTypes.REPLAY & Double = js.native
      
      @js.native
      sealed trait STOP
        extends StObject
           with typings.alexaVoiceService.mod.Player.EventTypes
      /* 5 */ val STOP: typings.alexaVoiceService.mod.Player.EventTypes.STOP & Double = js.native
    }
  }
  
  @js.native
  trait AVS extends StObject {
    
    def on(eventType: EventTypes): Unit = js.native
    def on(eventType: EventTypes, callback: js.Function0[Unit]): Unit = js.native
    
    var player: Player = js.native
    
    def refreshToken(): js.Promise[TokenResponse] = js.native
    
    def requestMic(): js.Promise[Any] = js.native
    
    def sendAudio(dataView: js.typedarray.DataView): js.Promise[Response] = js.native
    
    def startRecording(): js.Promise[Unit] = js.native
    
    def stopRecording(): js.Promise[js.UndefOr[js.typedarray.DataView]] = js.native
  }
  
  trait AVSParams extends StObject {
    
    var clientId: String
    
    var clientSecret: String
    
    var debug: Boolean
    
    var deviceId: String
    
    var refreshToken: String
  }
  object AVSParams {
    
    inline def apply(clientId: String, clientSecret: String, debug: Boolean, deviceId: String, refreshToken: String): AVSParams = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[AVSParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AVSParams] (val x: Self) extends AnyVal {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenResponse extends StObject {
    
    var refreshToken: String
    
    var token: String
  }
  object TokenResponse {
    
    inline def apply(refreshToken: String, token: String): TokenResponse = {
      val __obj = js.Dynamic.literal(refreshToken = refreshToken.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenResponse] (val x: Self) extends AnyVal {
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
