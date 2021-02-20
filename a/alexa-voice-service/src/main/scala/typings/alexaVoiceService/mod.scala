package typings.alexaVoiceService

import typings.alexaVoiceService.anon.Response
import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("alexa-voice-service", JSImport.Namespace)
  @js.native
  class ^ protected () extends AVS {
    def this(params: AVSParams) = this()
  }
  
  @js.native
  sealed trait EventTypes extends StObject
  @JSImport("alexa-voice-service", "EventTypes")
  @js.native
  object EventTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EventTypes with Double] = js.native
    
    @js.native
    sealed trait ERROR extends EventTypes
    /* 2 */ val ERROR: typings.alexaVoiceService.mod.EventTypes.ERROR with Double = js.native
    
    @js.native
    sealed trait LOG extends EventTypes
    /* 4 */ val LOG: typings.alexaVoiceService.mod.EventTypes.LOG with Double = js.native
    
    @js.native
    sealed trait LOGIN extends EventTypes
    /* 5 */ val LOGIN: typings.alexaVoiceService.mod.EventTypes.LOGIN with Double = js.native
    
    @js.native
    sealed trait LOGOUT extends EventTypes
    /* 6 */ val LOGOUT: typings.alexaVoiceService.mod.EventTypes.LOGOUT with Double = js.native
    
    @js.native
    sealed trait RECORD_START extends EventTypes
    /* 1 */ val RECORD_START: typings.alexaVoiceService.mod.EventTypes.RECORD_START with Double = js.native
    
    @js.native
    sealed trait RECORD_STOP extends EventTypes
    /* 0 */ val RECORD_STOP: typings.alexaVoiceService.mod.EventTypes.RECORD_STOP with Double = js.native
    
    @js.native
    sealed trait REFRESH_TOKEN_SET extends EventTypes
    /* 8 */ val REFRESH_TOKEN_SET: typings.alexaVoiceService.mod.EventTypes.REFRESH_TOKEN_SET with Double = js.native
    
    @js.native
    sealed trait TOKEN_INVALID extends EventTypes
    /* 3 */ val TOKEN_INVALID: typings.alexaVoiceService.mod.EventTypes.TOKEN_INVALID with Double = js.native
    
    @js.native
    sealed trait TOKEN_SET extends EventTypes
    /* 7 */ val TOKEN_SET: typings.alexaVoiceService.mod.EventTypes.TOKEN_SET with Double = js.native
  }
  
  @JSImport("alexa-voice-service", "Player")
  @js.native
  class Player () extends StObject {
    
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
      def apply(value: Double): js.UndefOr[typings.alexaVoiceService.mod.Player.EventTypes with Double] = js.native
      
      @js.native
      sealed trait DEQUE
        extends typings.alexaVoiceService.mod.Player.EventTypes
      /* 7 */ val DEQUE: typings.alexaVoiceService.mod.Player.EventTypes.DEQUE with Double = js.native
      
      @js.native
      sealed trait ENQUEUE
        extends typings.alexaVoiceService.mod.Player.EventTypes
      /* 6 */ val ENQUEUE: typings.alexaVoiceService.mod.Player.EventTypes.ENQUEUE with Double = js.native
      
      @js.native
      sealed trait ERROR
        extends typings.alexaVoiceService.mod.Player.EventTypes
      /* 1 */ val ERROR: typings.alexaVoiceService.mod.Player.EventTypes.ERROR with Double = js.native
      
      @js.native
      sealed trait LOG
        extends typings.alexaVoiceService.mod.Player.EventTypes
      /* 0 */ val LOG: typings.alexaVoiceService.mod.Player.EventTypes.LOG with Double = js.native
      
      @js.native
      sealed trait PAUSE
        extends typings.alexaVoiceService.mod.Player.EventTypes
      /* 4 */ val PAUSE: typings.alexaVoiceService.mod.Player.EventTypes.PAUSE with Double = js.native
      
      @js.native
      sealed trait PLAY
        extends typings.alexaVoiceService.mod.Player.EventTypes
      /* 2 */ val PLAY: typings.alexaVoiceService.mod.Player.EventTypes.PLAY with Double = js.native
      
      @js.native
      sealed trait REPLAY
        extends typings.alexaVoiceService.mod.Player.EventTypes
      /* 3 */ val REPLAY: typings.alexaVoiceService.mod.Player.EventTypes.REPLAY with Double = js.native
      
      @js.native
      sealed trait STOP
        extends typings.alexaVoiceService.mod.Player.EventTypes
      /* 5 */ val STOP: typings.alexaVoiceService.mod.Player.EventTypes.STOP with Double = js.native
    }
  }
  
  @js.native
  trait AVS extends StObject {
    
    def on(eventType: EventTypes): Unit = js.native
    def on(eventType: EventTypes, callback: js.Function0[Unit]): Unit = js.native
    
    var player: Player = js.native
    
    def refreshToken(): js.Promise[TokenResponse] = js.native
    
    def requestMic(): js.Promise[_] = js.native
    
    def sendAudio(dataView: DataView): js.Promise[Response] = js.native
    
    def startRecording(): js.Promise[Unit] = js.native
    
    def stopRecording(): js.Promise[js.UndefOr[DataView]] = js.native
  }
  
  @js.native
  trait AVSParams extends StObject {
    
    var clientId: String = js.native
    
    var clientSecret: String = js.native
    
    var debug: Boolean = js.native
    
    var deviceId: String = js.native
    
    var refreshToken: String = js.native
  }
  object AVSParams {
    
    @scala.inline
    def apply(clientId: String, clientSecret: String, debug: Boolean, deviceId: String, refreshToken: String): AVSParams = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[AVSParams]
    }
    
    @scala.inline
    implicit class AVSParamsMutableBuilder[Self <: AVSParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TokenResponse extends StObject {
    
    var refreshToken: String = js.native
    
    var token: String = js.native
  }
  object TokenResponse {
    
    @scala.inline
    def apply(refreshToken: String, token: String): TokenResponse = {
      val __obj = js.Dynamic.literal(refreshToken = refreshToken.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenResponse]
    }
    
    @scala.inline
    implicit class TokenResponseMutableBuilder[Self <: TokenResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
