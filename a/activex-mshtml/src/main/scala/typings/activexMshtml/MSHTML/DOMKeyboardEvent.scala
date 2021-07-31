package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMKeyboardEvent extends StObject {
  
  @JSName("MSHTML.DOMKeyboardEvent_typekey")
  var MSHTMLDotDOMKeyboardEvent_typekey: DOMKeyboardEvent
  
  val altKey: Boolean
  
  val bubbles: Boolean
  
  var cancelBubble: Boolean
  
  val cancelable: Boolean
  
  val charCode: Double
  
  val ctrlKey: Boolean
  
  val currentTarget: IEventTarget
  
  val defaultPrevented: Boolean
  
  val detail: Double
  
  val eventPhase: Double
  
  def getModifierState(keyArg: String): Boolean
  
  val ie9_char: js.Any
  
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit
  
  def initKeyboardEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    viewArg: IHTMLWindow2,
    keyArg: String,
    locationArg: Double,
    modifiersListArg: String,
    repeat: Boolean,
    locale: String
  ): Unit
  
  def initUIEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, view: IHTMLWindow2, detail: Double): Unit
  
  val isTrusted: Boolean
  
  val key: String
  
  val keyCode: Double
  
  val locale: String
  
  val location: Double
  
  val metaKey: Boolean
  
  def preventDefault(): Unit
  
  val repeat: Boolean
  
  val shiftKey: Boolean
  
  val srcElement: IHTMLElement
  
  def stopImmediatePropagation(): Unit
  
  def stopPropagation(): Unit
  
  val target: IEventTarget
  
  val timeStamp: Double
  
  val `type`: String
  
  def view(pvarIndex: js.Any): js.Any
  @JSName("view")
  val view_Original: IHTMLWindow2
  
  val which: Double
}
object DOMKeyboardEvent {
  
  @scala.inline
  def apply(
    MSHTMLDotDOMKeyboardEvent_typekey: DOMKeyboardEvent,
    altKey: Boolean,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    charCode: Double,
    ctrlKey: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    detail: Double,
    eventPhase: Double,
    getModifierState: String => Boolean,
    ie9_char: js.Any,
    initEvent: (String, Boolean, Boolean) => Unit,
    initKeyboardEvent: (String, Boolean, Boolean, IHTMLWindow2, String, Double, String, Boolean, String) => Unit,
    initUIEvent: (String, Boolean, Boolean, IHTMLWindow2, Double) => Unit,
    isTrusted: Boolean,
    key: String,
    keyCode: Double,
    locale: String,
    location: Double,
    metaKey: Boolean,
    preventDefault: () => Unit,
    repeat: Boolean,
    shiftKey: Boolean,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: IEventTarget,
    timeStamp: Double,
    `type`: String,
    view: IHTMLWindow2,
    which: Double
  ): DOMKeyboardEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), ie9_char = ie9_char.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initKeyboardEvent = js.Any.fromFunction9(initKeyboardEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), isTrusted = isTrusted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), repeat = repeat.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMKeyboardEvent_typekey")(MSHTMLDotDOMKeyboardEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMKeyboardEvent]
  }
  
  @scala.inline
  implicit class DOMKeyboardEventMutableBuilder[Self <: DOMKeyboardEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharCode(value: Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTarget(value: IEventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetModifierState(value: String => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIe9_char(value: js.Any): Self = StObject.set(x, "ie9_char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitEvent(value: (String, Boolean, Boolean) => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInitKeyboardEvent(value: (String, Boolean, Boolean, IHTMLWindow2, String, Double, String, Boolean, String) => Unit): Self = StObject.set(x, "initKeyboardEvent", js.Any.fromFunction9(value))
    
    @scala.inline
    def setInitUIEvent(value: (String, Boolean, Boolean, IHTMLWindow2, Double) => Unit): Self = StObject.set(x, "initUIEvent", js.Any.fromFunction5(value))
    
    @scala.inline
    def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotDOMKeyboardEvent_typekey(value: DOMKeyboardEvent): Self = StObject.set(x, "MSHTML.DOMKeyboardEvent_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcElement(value: IHTMLElement): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: IEventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: IHTMLWindow2): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
  }
}
