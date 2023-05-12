package typings.analogClock

import typings.std.AddEventListenerOptions
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("analog-clock", JSImport.Default)
  @js.native
  open class default () extends AnalogClock
  /* static members */
  object default {
    
    @JSImport("analog-clock", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("analog-clock", "default.observedAttributes")
    @js.native
    def observedAttributes: js.Array[String] = js.native
    inline def observedAttributes_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observedAttributes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("analog-clock", "AnalogClock")
  @js.native
  open class AnalogClock ()
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaAtomic: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaAutoComplete: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaBusy: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaChecked: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaColCount: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaColIndex: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaColSpan: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaCurrent: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaDisabled: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaExpanded: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaHasPopup: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaHidden: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaInvalid: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaKeyShortcuts: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaLabel: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaLevel: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaLive: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaModal: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaMultiLine: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaMultiSelectable: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaOrientation: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaPlaceholder: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaPosInSet: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaPressed: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaReadOnly: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRequired: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRoleDescription: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRowCount: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRowIndex: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRowSpan: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaSelected: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaSetSize: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaSort: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaValueMax: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaValueMin: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaValueNow: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaValueText: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val assignedSlot: HTMLSlotElement | Null = js.native
    
    // Lifecycle method called when the element is disconnected from the DOM
    def attributeChangedCallback(attr: String, oldVal: String, newVal: String): Unit = js.native
    
    def connectedCallback(): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    var contentEditable: String = js.native
    
    var dark: Boolean = js.native
    
    // Lifecycle method called when the element is connected to the DOM
    def disconnectedCallback(): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    var enterKeyHint: String = js.native
    
    /* standard dom */
    /* CompleteClass */
    var innerHTML: String = js.native
    
    /* standard dom */
    /* CompleteClass */
    var inputMode: String = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val isContentEditable: Boolean = js.native
    
    /** Returns the first following sibling that is an element, and null otherwise. */
    /* standard dom */
    /* CompleteClass */
    override val nextElementSibling: Element | Null = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    /** Returns the first preceding sibling that is an element, and null otherwise. */
    /* standard dom */
    /* CompleteClass */
    override val previousElementSibling: Element | Null = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    var role: String | Null = js.native
    
    def start(): Unit = js.native
    
    // Public methods for stopping and starting the clock
    def stop(): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val style: CSSStyleDeclaration = js.native
    
    // Called when an observed attribute changes
    // Getters and setters for time, offset, and dark mode properties
    var time: js.UndefOr[Double] = js.native
  }
  /* static members */
  object AnalogClock {
    
    @JSImport("analog-clock", "AnalogClock")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("analog-clock", "AnalogClock.observedAttributes")
    @js.native
    def observedAttributes: js.Array[String] = js.native
    inline def observedAttributes_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observedAttributes")(x.asInstanceOf[js.Any])
  }
}
