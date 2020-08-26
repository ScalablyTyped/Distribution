package typings.atom.toolBarMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonOptions extends js.Object {
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
  implicit class ButtonOptionsOps[Self <: ButtonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallbackVarargs(value: String*): Self = this.set("callback", js.Array(value :_*))
    @scala.inline
    def setCallbackFunction1(value: /* data */ js.UndefOr[js.Any] => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def setCallback(
      value: String | js.Array[String] | (js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | (StringDictionary[(js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | String])
    ): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setClassVarargs(value: String*): Self = this.set("class", js.Array(value :_*))
    @scala.inline
    def setClass(value: String | js.Array[String]): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconset(value: ion | fa | fab | fi | icomoon | devicon | mdi): Self = this.set("iconset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconset: Self = this.set("iconset", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTooltip(value: String | Item | Class): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

