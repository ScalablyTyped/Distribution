package typings.activexLibreoffice.com_.sun.star.xml.dom

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`10`
import typings.activexLibreoffice.activexLibreofficeNumbers.`11`
import typings.activexLibreoffice.activexLibreofficeNumbers.`12`
import typings.activexLibreoffice.activexLibreofficeNumbers.`13`
import typings.activexLibreoffice.activexLibreofficeNumbers.`14`
import typings.activexLibreoffice.activexLibreofficeNumbers.`15`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import typings.activexLibreoffice.activexLibreofficeNumbers.`6`
import typings.activexLibreoffice.activexLibreofficeNumbers.`7`
import typings.activexLibreoffice.activexLibreofficeNumbers.`8`
import typings.activexLibreoffice.activexLibreofficeNumbers.`9`
import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Time
import typings.activexLibreoffice.com_.sun.star.xml.dom.views.XAbstractView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  */
  trait AttrChangeType extends StObject
  object AttrChangeType {
    
    @scala.inline
    def ADDITION: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def MODIFICATION: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def REMOVAL: `2` = 2.asInstanceOf[`2`]
  }
  
  @js.native
  trait EventException extends Exception {
    
    var code: Double = js.native
  }
  object EventException {
    
    @scala.inline
    def apply(Context: XInterface, Message: String, code: Double): EventException = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventException]
    }
    
    @scala.inline
    implicit class EventExceptionMutableBuilder[Self <: EventException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`14`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`15`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`10`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`13`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`11`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`12`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`9`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`7`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`8`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`6`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  */
  trait EventType extends StObject
  object EventType {
    
    @scala.inline
    def DOMActivate: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def DOMAttrModified: `14` = 14.asInstanceOf[`14`]
    
    @scala.inline
    def DOMCharacterDataModified: `15` = 15.asInstanceOf[`15`]
    
    @scala.inline
    def DOMFocusIn: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def DOMFocusOut: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def DOMNodeInserted: `10` = 10.asInstanceOf[`10`]
    
    @scala.inline
    def DOMNodeInsertedIntoDocument: `13` = 13.asInstanceOf[`13`]
    
    @scala.inline
    def DOMNodeRemoved: `11` = 11.asInstanceOf[`11`]
    
    @scala.inline
    def DOMNodeRemovedFromDocument: `12` = 12.asInstanceOf[`12`]
    
    @scala.inline
    def DOMSubtreeModified: `9` = 9.asInstanceOf[`9`]
    
    @scala.inline
    def click: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def mousedown: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def mousemove: `7` = 7.asInstanceOf[`7`]
    
    @scala.inline
    def mouseout: `8` = 8.asInstanceOf[`8`]
    
    @scala.inline
    def mouseover: `6` = 6.asInstanceOf[`6`]
    
    @scala.inline
    def mouseup: `5` = 5.asInstanceOf[`5`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  */
  trait PhaseType extends StObject
  object PhaseType {
    
    @scala.inline
    def AT_TARGET: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def BUBBLING_PHASE: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def CAPTURING_PHASE: `0` = 0.asInstanceOf[`0`]
  }
  
  @js.native
  trait XDocumentEvent extends XInterface {
    
    def createEvent(eventType: String): XEvent = js.native
  }
  object XDocumentEvent {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      createEvent: String => XEvent,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XDocumentEvent = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createEvent = js.Any.fromFunction1(createEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XDocumentEvent]
    }
    
    @scala.inline
    implicit class XDocumentEventMutableBuilder[Self <: XDocumentEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateEvent(value: String => XEvent): Self = StObject.set(x, "createEvent", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait XEvent extends XInterface {
    
    val Bubbles: Boolean = js.native
    
    val Cancelable: Boolean = js.native
    
    val CurrentTarget: XEventTarget = js.native
    
    val EventPhase: PhaseType = js.native
    
    val Target: XEventTarget = js.native
    
    val TimeStamp: Time = js.native
    
    val Type: String = js.native
    
    def getBubbles(): Boolean = js.native
    
    def getCancelable(): Boolean = js.native
    
    def getCurrentTarget(): XEventTarget = js.native
    
    def getEventPhase(): PhaseType = js.native
    
    def getTarget(): XEventTarget = js.native
    
    def getTimeStamp(): Time = js.native
    
    def getType(): String = js.native
    
    def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = js.native
    
    def preventDefault(): Unit = js.native
    
    def stopPropagation(): Unit = js.native
  }
  object XEvent {
    
    @scala.inline
    def apply(
      Bubbles: Boolean,
      Cancelable: Boolean,
      CurrentTarget: XEventTarget,
      EventPhase: PhaseType,
      Target: XEventTarget,
      TimeStamp: Time,
      Type: String,
      acquire: () => Unit,
      getBubbles: () => Boolean,
      getCancelable: () => Boolean,
      getCurrentTarget: () => XEventTarget,
      getEventPhase: () => PhaseType,
      getTarget: () => XEventTarget,
      getTimeStamp: () => Time,
      getType: () => String,
      initEvent: (String, Boolean, Boolean) => Unit,
      preventDefault: () => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      stopPropagation: () => Unit
    ): XEvent = {
      val __obj = js.Dynamic.literal(Bubbles = Bubbles.asInstanceOf[js.Any], Cancelable = Cancelable.asInstanceOf[js.Any], CurrentTarget = CurrentTarget.asInstanceOf[js.Any], EventPhase = EventPhase.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBubbles = js.Any.fromFunction0(getBubbles), getCancelable = js.Any.fromFunction0(getCancelable), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getEventPhase = js.Any.fromFunction0(getEventPhase), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), initEvent = js.Any.fromFunction3(initEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
      __obj.asInstanceOf[XEvent]
    }
    
    @scala.inline
    implicit class XEventMutableBuilder[Self <: XEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "Bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "Cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTarget(value: XEventTarget): Self = StObject.set(x, "CurrentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPhase(value: PhaseType): Self = StObject.set(x, "EventPhase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetBubbles(value: () => Boolean): Self = StObject.set(x, "getBubbles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCancelable(value: () => Boolean): Self = StObject.set(x, "getCancelable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrentTarget(value: () => XEventTarget): Self = StObject.set(x, "getCurrentTarget", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEventPhase(value: () => PhaseType): Self = StObject.set(x, "getEventPhase", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTarget(value: () => XEventTarget): Self = StObject.set(x, "getTarget", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTimeStamp(value: () => Time): Self = StObject.set(x, "getTimeStamp", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitEvent(value: (String, Boolean, Boolean) => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTarget(value: XEventTarget): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: Time): Self = StObject.set(x, "TimeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XEventListener extends XInterface {
    
    def handleEvent(evt: XEvent): Unit = js.native
  }
  object XEventListener {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      handleEvent: XEvent => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XEventListener = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), handleEvent = js.Any.fromFunction1(handleEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XEventListener]
    }
    
    @scala.inline
    implicit class XEventListenerMutableBuilder[Self <: XEventListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleEvent(value: XEvent => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait XEventTarget extends XInterface {
    
    def addEventListener(eventType: String, listener: XEventListener, useCapture: Boolean): Unit = js.native
    
    def dispatchEvent(evt: XEvent): Boolean = js.native
    
    def removeEventListener(eventType: String, listener: XEventListener, useCapture: Boolean): Unit = js.native
  }
  object XEventTarget {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      addEventListener: (String, XEventListener, Boolean) => Unit,
      dispatchEvent: XEvent => Boolean,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: (String, XEventListener, Boolean) => Unit
    ): XEventTarget = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction3(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction3(removeEventListener))
      __obj.asInstanceOf[XEventTarget]
    }
    
    @scala.inline
    implicit class XEventTargetMutableBuilder[Self <: XEventTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEventListener(value: (String, XEventListener, Boolean) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDispatchEvent(value: XEvent => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveEventListener(value: (String, XEventListener, Boolean) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait XMouseEvent extends XUIEvent {
    
    val AltKey: Boolean = js.native
    
    val Button: Double = js.native
    
    val ClientX: Double = js.native
    
    val ClientY: Double = js.native
    
    val CtrlKey: Boolean = js.native
    
    val MetaKey: Boolean = js.native
    
    val RelatedTarget: XEventTarget = js.native
    
    val ScreenX: Double = js.native
    
    val ScreenY: Double = js.native
    
    val ShiftKey: Boolean = js.native
    
    def getAltKey(): Boolean = js.native
    
    def getButton(): Double = js.native
    
    def getClientX(): Double = js.native
    
    def getClientY(): Double = js.native
    
    def getCtrlKey(): Boolean = js.native
    
    def getMetaKey(): Boolean = js.native
    
    def getRelatedTarget(): XEventTarget = js.native
    
    def getScreenX(): Double = js.native
    
    def getScreenY(): Double = js.native
    
    def getShiftKey(): Boolean = js.native
    
    def initMouseEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      viewArg: XAbstractView,
      detailArg: Double,
      screenXArg: Double,
      screenYArg: Double,
      clientXArg: Double,
      clientYArg: Double,
      ctrlKeyArg: Boolean,
      altKeyArg: Boolean,
      shiftKeyArg: Boolean,
      metaKeyArg: Boolean,
      buttonArg: Double,
      relatedTargetArg: XEventTarget
    ): Unit = js.native
  }
  object XMouseEvent {
    
    @scala.inline
    def apply(
      AltKey: Boolean,
      Bubbles: Boolean,
      Button: Double,
      Cancelable: Boolean,
      ClientX: Double,
      ClientY: Double,
      CtrlKey: Boolean,
      CurrentTarget: XEventTarget,
      Detail: Double,
      EventPhase: PhaseType,
      MetaKey: Boolean,
      RelatedTarget: XEventTarget,
      ScreenX: Double,
      ScreenY: Double,
      ShiftKey: Boolean,
      Target: XEventTarget,
      TimeStamp: Time,
      Type: String,
      View: XAbstractView,
      acquire: () => Unit,
      getAltKey: () => Boolean,
      getBubbles: () => Boolean,
      getButton: () => Double,
      getCancelable: () => Boolean,
      getClientX: () => Double,
      getClientY: () => Double,
      getCtrlKey: () => Boolean,
      getCurrentTarget: () => XEventTarget,
      getDetail: () => Double,
      getEventPhase: () => PhaseType,
      getMetaKey: () => Boolean,
      getRelatedTarget: () => XEventTarget,
      getScreenX: () => Double,
      getScreenY: () => Double,
      getShiftKey: () => Boolean,
      getTarget: () => XEventTarget,
      getTimeStamp: () => Time,
      getType: () => String,
      getView: () => XAbstractView,
      initEvent: (String, Boolean, Boolean) => Unit,
      initMouseEvent: (String, Boolean, Boolean, XAbstractView, Double, Double, Double, Double, Double, Boolean, Boolean, Boolean, Boolean, Double, XEventTarget) => Unit,
      initUIEvent: (String, Boolean, Boolean, XAbstractView, Double) => Unit,
      preventDefault: () => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      stopPropagation: () => Unit
    ): XMouseEvent = {
      val __obj = js.Dynamic.literal(AltKey = AltKey.asInstanceOf[js.Any], Bubbles = Bubbles.asInstanceOf[js.Any], Button = Button.asInstanceOf[js.Any], Cancelable = Cancelable.asInstanceOf[js.Any], ClientX = ClientX.asInstanceOf[js.Any], ClientY = ClientY.asInstanceOf[js.Any], CtrlKey = CtrlKey.asInstanceOf[js.Any], CurrentTarget = CurrentTarget.asInstanceOf[js.Any], Detail = Detail.asInstanceOf[js.Any], EventPhase = EventPhase.asInstanceOf[js.Any], MetaKey = MetaKey.asInstanceOf[js.Any], RelatedTarget = RelatedTarget.asInstanceOf[js.Any], ScreenX = ScreenX.asInstanceOf[js.Any], ScreenY = ScreenY.asInstanceOf[js.Any], ShiftKey = ShiftKey.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAltKey = js.Any.fromFunction0(getAltKey), getBubbles = js.Any.fromFunction0(getBubbles), getButton = js.Any.fromFunction0(getButton), getCancelable = js.Any.fromFunction0(getCancelable), getClientX = js.Any.fromFunction0(getClientX), getClientY = js.Any.fromFunction0(getClientY), getCtrlKey = js.Any.fromFunction0(getCtrlKey), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getDetail = js.Any.fromFunction0(getDetail), getEventPhase = js.Any.fromFunction0(getEventPhase), getMetaKey = js.Any.fromFunction0(getMetaKey), getRelatedTarget = js.Any.fromFunction0(getRelatedTarget), getScreenX = js.Any.fromFunction0(getScreenX), getScreenY = js.Any.fromFunction0(getScreenY), getShiftKey = js.Any.fromFunction0(getShiftKey), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), getView = js.Any.fromFunction0(getView), initEvent = js.Any.fromFunction3(initEvent), initMouseEvent = js.Any.fromFunction15(initMouseEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
      __obj.asInstanceOf[XMouseEvent]
    }
    
    @scala.inline
    implicit class XMouseEventMutableBuilder[Self <: XMouseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltKey(value: Boolean): Self = StObject.set(x, "AltKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton(value: Double): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientX(value: Double): Self = StObject.set(x, "ClientX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientY(value: Double): Self = StObject.set(x, "ClientY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlKey(value: Boolean): Self = StObject.set(x, "CtrlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAltKey(value: () => Boolean): Self = StObject.set(x, "getAltKey", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetButton(value: () => Double): Self = StObject.set(x, "getButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetClientX(value: () => Double): Self = StObject.set(x, "getClientX", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetClientY(value: () => Double): Self = StObject.set(x, "getClientY", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCtrlKey(value: () => Boolean): Self = StObject.set(x, "getCtrlKey", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMetaKey(value: () => Boolean): Self = StObject.set(x, "getMetaKey", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRelatedTarget(value: () => XEventTarget): Self = StObject.set(x, "getRelatedTarget", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScreenX(value: () => Double): Self = StObject.set(x, "getScreenX", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScreenY(value: () => Double): Self = StObject.set(x, "getScreenY", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetShiftKey(value: () => Boolean): Self = StObject.set(x, "getShiftKey", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitMouseEvent(
        value: (String, Boolean, Boolean, XAbstractView, Double, Double, Double, Double, Double, Boolean, Boolean, Boolean, Boolean, Double, XEventTarget) => Unit
      ): Self = StObject.set(x, "initMouseEvent", js.Any.fromFunction15(value))
      
      @scala.inline
      def setMetaKey(value: Boolean): Self = StObject.set(x, "MetaKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedTarget(value: XEventTarget): Self = StObject.set(x, "RelatedTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenX(value: Double): Self = StObject.set(x, "ScreenX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenY(value: Double): Self = StObject.set(x, "ScreenY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftKey(value: Boolean): Self = StObject.set(x, "ShiftKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XMutationEvent extends XEvent {
    
    val AttrChange: AttrChangeType = js.native
    
    val AttrName: String = js.native
    
    val NewValue: String = js.native
    
    val PrevValue: String = js.native
    
    val RelatedNode: XNode = js.native
    
    def getAttrChange(): AttrChangeType = js.native
    
    def getAttrName(): String = js.native
    
    def getNewValue(): String = js.native
    
    def getPrevValue(): String = js.native
    
    def getRelatedNode(): XNode = js.native
    
    def initMutationEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      relatedNodeArg: XNode,
      prevValueArg: String,
      newValueArg: String,
      attrNameArg: String,
      attrChangeArg: AttrChangeType
    ): Unit = js.native
  }
  object XMutationEvent {
    
    @scala.inline
    def apply(
      AttrChange: AttrChangeType,
      AttrName: String,
      Bubbles: Boolean,
      Cancelable: Boolean,
      CurrentTarget: XEventTarget,
      EventPhase: PhaseType,
      NewValue: String,
      PrevValue: String,
      RelatedNode: XNode,
      Target: XEventTarget,
      TimeStamp: Time,
      Type: String,
      acquire: () => Unit,
      getAttrChange: () => AttrChangeType,
      getAttrName: () => String,
      getBubbles: () => Boolean,
      getCancelable: () => Boolean,
      getCurrentTarget: () => XEventTarget,
      getEventPhase: () => PhaseType,
      getNewValue: () => String,
      getPrevValue: () => String,
      getRelatedNode: () => XNode,
      getTarget: () => XEventTarget,
      getTimeStamp: () => Time,
      getType: () => String,
      initEvent: (String, Boolean, Boolean) => Unit,
      initMutationEvent: (String, Boolean, Boolean, XNode, String, String, String, AttrChangeType) => Unit,
      preventDefault: () => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      stopPropagation: () => Unit
    ): XMutationEvent = {
      val __obj = js.Dynamic.literal(AttrChange = AttrChange.asInstanceOf[js.Any], AttrName = AttrName.asInstanceOf[js.Any], Bubbles = Bubbles.asInstanceOf[js.Any], Cancelable = Cancelable.asInstanceOf[js.Any], CurrentTarget = CurrentTarget.asInstanceOf[js.Any], EventPhase = EventPhase.asInstanceOf[js.Any], NewValue = NewValue.asInstanceOf[js.Any], PrevValue = PrevValue.asInstanceOf[js.Any], RelatedNode = RelatedNode.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAttrChange = js.Any.fromFunction0(getAttrChange), getAttrName = js.Any.fromFunction0(getAttrName), getBubbles = js.Any.fromFunction0(getBubbles), getCancelable = js.Any.fromFunction0(getCancelable), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getEventPhase = js.Any.fromFunction0(getEventPhase), getNewValue = js.Any.fromFunction0(getNewValue), getPrevValue = js.Any.fromFunction0(getPrevValue), getRelatedNode = js.Any.fromFunction0(getRelatedNode), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), initEvent = js.Any.fromFunction3(initEvent), initMutationEvent = js.Any.fromFunction8(initMutationEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
      __obj.asInstanceOf[XMutationEvent]
    }
    
    @scala.inline
    implicit class XMutationEventMutableBuilder[Self <: XMutationEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrChange(value: AttrChangeType): Self = StObject.set(x, "AttrChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrName(value: String): Self = StObject.set(x, "AttrName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAttrChange(value: () => AttrChangeType): Self = StObject.set(x, "getAttrChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAttrName(value: () => String): Self = StObject.set(x, "getAttrName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNewValue(value: () => String): Self = StObject.set(x, "getNewValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPrevValue(value: () => String): Self = StObject.set(x, "getPrevValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRelatedNode(value: () => XNode): Self = StObject.set(x, "getRelatedNode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitMutationEvent(value: (String, Boolean, Boolean, XNode, String, String, String, AttrChangeType) => Unit): Self = StObject.set(x, "initMutationEvent", js.Any.fromFunction8(value))
      
      @scala.inline
      def setNewValue(value: String): Self = StObject.set(x, "NewValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevValue(value: String): Self = StObject.set(x, "PrevValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedNode(value: XNode): Self = StObject.set(x, "RelatedNode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XUIEvent extends XEvent {
    
    val Detail: Double = js.native
    
    val View: XAbstractView = js.native
    
    def getDetail(): Double = js.native
    
    def getView(): XAbstractView = js.native
    
    def initUIEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      viewArg: XAbstractView,
      detailArg: Double
    ): Unit = js.native
  }
  object XUIEvent {
    
    @scala.inline
    def apply(
      Bubbles: Boolean,
      Cancelable: Boolean,
      CurrentTarget: XEventTarget,
      Detail: Double,
      EventPhase: PhaseType,
      Target: XEventTarget,
      TimeStamp: Time,
      Type: String,
      View: XAbstractView,
      acquire: () => Unit,
      getBubbles: () => Boolean,
      getCancelable: () => Boolean,
      getCurrentTarget: () => XEventTarget,
      getDetail: () => Double,
      getEventPhase: () => PhaseType,
      getTarget: () => XEventTarget,
      getTimeStamp: () => Time,
      getType: () => String,
      getView: () => XAbstractView,
      initEvent: (String, Boolean, Boolean) => Unit,
      initUIEvent: (String, Boolean, Boolean, XAbstractView, Double) => Unit,
      preventDefault: () => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      stopPropagation: () => Unit
    ): XUIEvent = {
      val __obj = js.Dynamic.literal(Bubbles = Bubbles.asInstanceOf[js.Any], Cancelable = Cancelable.asInstanceOf[js.Any], CurrentTarget = CurrentTarget.asInstanceOf[js.Any], Detail = Detail.asInstanceOf[js.Any], EventPhase = EventPhase.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBubbles = js.Any.fromFunction0(getBubbles), getCancelable = js.Any.fromFunction0(getCancelable), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getDetail = js.Any.fromFunction0(getDetail), getEventPhase = js.Any.fromFunction0(getEventPhase), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), getView = js.Any.fromFunction0(getView), initEvent = js.Any.fromFunction3(initEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
      __obj.asInstanceOf[XUIEvent]
    }
    
    @scala.inline
    implicit class XUIEventMutableBuilder[Self <: XUIEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetail(value: Double): Self = StObject.set(x, "Detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDetail(value: () => Double): Self = StObject.set(x, "getDetail", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetView(value: () => XAbstractView): Self = StObject.set(x, "getView", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitUIEvent(value: (String, Boolean, Boolean, XAbstractView, Double) => Unit): Self = StObject.set(x, "initUIEvent", js.Any.fromFunction5(value))
      
      @scala.inline
      def setView(value: XAbstractView): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    }
  }
}
