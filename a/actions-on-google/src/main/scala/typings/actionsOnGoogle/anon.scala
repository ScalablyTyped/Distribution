package typings.actionsOnGoogle

import org.scalablytyped.runtime.StringDictionary
import typings.actionsOnGoogle.actionsOnGoogleStrings.actionDotdevicesDotDISCONNECT
import typings.actionsOnGoogle.apiV1Mod.challengeType
import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ack extends StObject {
    
    var ack: js.UndefOr[Boolean] = js.undefined
    
    var pin: js.UndefOr[String] = js.undefined
  }
  object Ack {
    
    @scala.inline
    def apply(): Ack = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ack]
    }
    
    @scala.inline
    implicit class AckMutableBuilder[Self <: Ack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAck(value: Boolean): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAckUndefined: Self = StObject.set(x, "ack", js.undefined)
      
      @scala.inline
      def setPin(value: String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
    }
  }
  
  trait Devices extends StObject {
    
    var devices: States
  }
  object Devices {
    
    @scala.inline
    def apply(devices: States): Devices = {
      val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Devices]
    }
    
    @scala.inline
    implicit class DevicesMutableBuilder[Self <: Devices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevices(value: States): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    }
  }
  
  trait Intent extends StObject {
    
    var intent: actionDotdevicesDotDISCONNECT
  }
  object Intent {
    
    @scala.inline
    def apply(): Intent = {
      val __obj = js.Dynamic.literal(intent = "action.devices.DISCONNECT")
      __obj.asInstanceOf[Intent]
    }
    
    @scala.inline
    implicit class IntentMutableBuilder[Self <: Intent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntent(value: actionDotdevicesDotDISCONNECT): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined actions-on-google.actions-on-google/dist/common.ProtoAny<string, actions-on-google.actions-on-google/dist/common.JsonObject> */
  trait ProtoAnystringJsonObject
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var `@type`: String
  }
  object ProtoAnystringJsonObject {
    
    @scala.inline
    def apply(`@type`: String): ProtoAnystringJsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtoAnystringJsonObject]
    }
    
    @scala.inline
    implicit class ProtoAnystringJsonObjectMutableBuilder[Self <: ProtoAnystringJsonObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    }
  }
  
  trait States extends StObject {
    
    var states: ApiClientObjectMap[js.Any]
  }
  object States {
    
    @scala.inline
    def apply(states: ApiClientObjectMap[js.Any]): States = {
      val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
      __obj.asInstanceOf[States]
    }
    
    @scala.inline
    implicit class StatesMutableBuilder[Self <: States] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStates(value: ApiClientObjectMap[js.Any]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type[TType] extends StObject {
    
    var `@type`: TType
  }
  object Type {
    
    @scala.inline
    def apply[TType](`@type`: TType): Type[TType] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type[TType]]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type[?], TType] (val x: Self & Type[TType]) extends AnyVal {
      
      @scala.inline
      def `set@type`(value: TType): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeChallengeType extends StObject {
    
    var `type`: challengeType
  }
  object TypeChallengeType {
    
    @scala.inline
    def apply(`type`: challengeType): TypeChallengeType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeChallengeType]
    }
    
    @scala.inline
    implicit class TypeChallengeTypeMutableBuilder[Self <: TypeChallengeType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: challengeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
