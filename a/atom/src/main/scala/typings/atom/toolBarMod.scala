package typings.atom

import org.scalablytyped.runtime.StringDictionary
import typings.atom.anon.Class
import typings.atom.anon.Item
import typings.atom.atomStrings.devicon
import typings.atom.atomStrings.fa
import typings.atom.atomStrings.fab
import typings.atom.atomStrings.fi
import typings.atom.atomStrings.icomoon
import typings.atom.atomStrings.ion
import typings.atom.atomStrings.mdi
import typings.atom.mod.Disposable
import typings.std.HTMLButtonElement
import typings.std.HTMLHRElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolBarMod {
  
  @js.native
  trait ButtonOptions extends StObject {
    
    /** (optional) Color of the button's background */
    var background: js.UndefOr[String] = js.native
    
    /** (mandatory)
      * The callback must be either:
      * - Atom command: a string or array of  strings,
      * - a custom callback function,
      * - or an object where the keys are key modifiers (alt, ctrl or shift) and the values are commands or custom functions
      *
      * ## Example:
      * ```ts
      * callback: 'application:about',
      * ```
      *
      *
      * ## Example - Callback with modifiers
      * ```ts
      * callback: {
      *    '': 'application:cmd-1',      // Without modifiers is default action
      *    'alt': 'application:cmd-2',
      *    'ctrl': 'application:cmd-3',  // With function callback
      *    'shift'(data) {
      *      console.log(data);
      *    },
      *    'alt+shift': 'application:cmd-5',       // Multiple modifiers
      *    'alt+ctrl+shift': 'application:cmd-6'   // All modifiers
      *  },
      * data: 'foo'
      * ```
      */
    var callback: String | js.Array[String] | (js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | (StringDictionary[(js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | String]) = js.native
    
    /** Buttons can be styled with arbitrary CSS through classes.
      * An example of how the class can be used is show below.
      *
      * ## Example:
      * ```ts
      * class: 'my-awesome-class'
      * ```
      *
      * ## Example:
      * ```ts
      * class: ['multiple', 'classes', 'also', 'works']
      * ```
      */
    var `class`: js.UndefOr[String | js.Array[String]] = js.native
    
    /** (optional) Color of the button */
    var color: js.UndefOr[String] = js.native
    
    /** `data` can be passed as the input argument of callback,  If callback is of type
      * - `(data: any) => void)` or
      * - `{ [modifier: string]: ((data: any) => void) }`,
      *
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** (optional)
      * if set to `true`, `text` will be rendered as HTML
      * ## Example:
      * ```ts
      * text: '<b>BIG</b> button',
      * html: true,
      * ```
      */
    var html: js.UndefOr[Boolean] = js.native
    
    /** (optional)
      *  icon name
      * ## Example:
      * ```js
      * icon: 'octoface',
      * ```
      */
    var icon: js.UndefOr[String] = js.native
    
    /** (optional)
      * icon set name.
      * It can be chosen among these:
      *    - not given : if `iconset` is not given Octicons (default Atom's flavour) is chosen
      *    - `ion` with `ios-` and `md- `prefixes for the icon names (Ionicons)
      *    - `fa` and fab for brands (FontAwesome)
      *    - `fi` (Foundation)
      *    - `icomoon` (IcoMoon)
      *    - `devicon` (Devicon)
      *    - `mdi` (MaterialDesignIcons)
      *
      * ## Example:
      * ```ts
      *     icon: 'ios-gear-a',
      *     iconset: 'ion'
      * ```
      */
    var iconset: js.UndefOr[ion | fa | fab | fi | icomoon | devicon | mdi] = js.native
    
    /** (optional) defaults to `50` */
    var priority: js.UndefOr[Double] = js.native
    
    /** (optional)
      * You can use `text` to:
      * - add text as a button, or
      *
      * ## Example:
      * ```ts
      * text: 'hello',
      * ```
      * - use HTML for a button. Needs `html` to be set to `true`
      *
      * ## Example:
      * ```ts
      * text: '<b>BIG</b> button',
      * html: true,
      * ```
      */
    var text: js.UndefOr[String] = js.native
    
    /** (optional)
      * The tooltip option may be a string or an object that is passed to Atom's TooltipManager
      */
    var tooltip: js.UndefOr[String | Item | Class] = js.native
  }
  object ButtonOptions {
    
    @scala.inline
    def apply(
      callback: String | js.Array[String] | (js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | (StringDictionary[(js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | String])
    ): ButtonOptions = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonOptions]
    }
    
    @scala.inline
    implicit class ButtonOptionsMutableBuilder[Self <: ButtonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setCallback(
        value: String | js.Array[String] | (js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | (StringDictionary[(js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | String])
      ): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackFunction1(value: /* data */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackVarargs(value: String*): Self = StObject.set(x, "callback", js.Array(value :_*))
      
      @scala.inline
      def setClass(value: String | js.Array[String]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setClassVarargs(value: String*): Self = StObject.set(x, "class", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIconset(value: ion | fa | fab | fi | icomoon | devicon | mdi): Self = StObject.set(x, "iconset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsetUndefined: Self = StObject.set(x, "iconset", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTooltip(value: String | Item | Class): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  @js.native
  trait SpacerOptions extends StObject {
    
    /** (optional) defaults to `50` */
    var priority: js.UndefOr[Double] = js.native
  }
  object SpacerOptions {
    
    @scala.inline
    def apply(): SpacerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpacerOptions]
    }
    
    @scala.inline
    implicit class SpacerOptionsMutableBuilder[Self <: SpacerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  @js.native
  trait ToolBarButtonView extends StObject {
    
    def _onClick(event: MouseEvent): Unit = js.native
    
    def _onMouseDown(event: MouseEvent): Unit = js.native
    
    def destroy(): Unit = js.native
    
    var element: HTMLButtonElement = js.native
    
    var enabled: Boolean = js.native
    
    def executeCallback(event: MouseEvent): Unit = js.native
    
    def getSelected(): Boolean = js.native
    
    var group: String = js.native
    
    var options: ButtonOptions = js.native
    
    var priority: Double = js.native
    
    def setEnabled(enabled: Boolean): Unit = js.native
    
    def setSelected(selected: Boolean): Unit = js.native
    
    var subscriptions: Disposable = js.native
  }
  object ToolBarButtonView {
    
    @scala.inline
    def apply(
      _onClick: MouseEvent => Unit,
      _onMouseDown: MouseEvent => Unit,
      destroy: () => Unit,
      element: HTMLButtonElement,
      enabled: Boolean,
      executeCallback: MouseEvent => Unit,
      getSelected: () => Boolean,
      group: String,
      options: ButtonOptions,
      priority: Double,
      setEnabled: Boolean => Unit,
      setSelected: Boolean => Unit,
      subscriptions: Disposable
    ): ToolBarButtonView = {
      val __obj = js.Dynamic.literal(_onClick = js.Any.fromFunction1(_onClick), _onMouseDown = js.Any.fromFunction1(_onMouseDown), destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], executeCallback = js.Any.fromFunction1(executeCallback), getSelected = js.Any.fromFunction0(getSelected), group = group.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], setEnabled = js.Any.fromFunction1(setEnabled), setSelected = js.Any.fromFunction1(setSelected), subscriptions = subscriptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolBarButtonView]
    }
    
    @scala.inline
    implicit class ToolBarButtonViewMutableBuilder[Self <: ToolBarButtonView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setElement(value: HTMLButtonElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecuteCallback(value: MouseEvent => Unit): Self = StObject.set(x, "executeCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSelected(value: () => Boolean): Self = StObject.set(x, "getSelected", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: ButtonOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetEnabled(value: Boolean => Unit): Self = StObject.set(x, "setEnabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSelected(value: Boolean => Unit): Self = StObject.set(x, "setSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubscriptions(value: Disposable): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_onClick(value: MouseEvent => Unit): Self = StObject.set(x, "_onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_onMouseDown(value: MouseEvent => Unit): Self = StObject.set(x, "_onMouseDown", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ToolBarManager extends StObject {
    
    /** Adds a button. The input to this function is a `ButtonOptions` object */
    def addButton(options: ButtonOptions): ToolBarButtonView = js.native
    
    /** Adds a spacer. Optionally, you can pass a `SpacerOptions` object */
    def addSpacer(): ToolBarSpacerView = js.native
    def addSpacer(options: SpacerOptions): ToolBarSpacerView = js.native
    
    /** The onDidDestroy method takes a function that will be called when the tool-bar package is destroyed. This is useful if your package needs to do cleanup when the tool-bar is deactivated but your package continues running.
      */
    def onDidDestroy(callback: js.Function0[Unit]): Unit = js.native
    
    /** Use the method removeItems to remove the buttons added by your package. This is particular useful in your package deactivate method, but can be used at any time.
      */
    def removeItems(): Unit = js.native
  }
  
  @js.native
  trait ToolBarSpacerView extends StObject {
    
    def destroy(): Unit = js.native
    
    var element: HTMLHRElement = js.native
    
    var group: String = js.native
    
    var priority: Double = js.native
  }
  object ToolBarSpacerView {
    
    @scala.inline
    def apply(destroy: () => Unit, element: HTMLHRElement, group: String, priority: Double): ToolBarSpacerView = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolBarSpacerView]
    }
    
    @scala.inline
    implicit class ToolBarSpacerViewMutableBuilder[Self <: ToolBarSpacerView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setElement(value: HTMLHRElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  type getToolBarManager = js.Function1[/* packageName */ String, ToolBarManager]
}
