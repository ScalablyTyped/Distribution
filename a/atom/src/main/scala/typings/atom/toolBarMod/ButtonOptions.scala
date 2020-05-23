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

trait ButtonOptions extends js.Object {
  /** (optional) Color of the button's background */
  var background: js.UndefOr[String] = js.undefined
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
  var callback: String | js.Array[String] | (js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | (StringDictionary[(js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | String])
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
  var `class`: js.UndefOr[String | js.Array[String]] = js.undefined
  /** (optional) Color of the button */
  var color: js.UndefOr[String] = js.undefined
  /** `data` can be passed as the input argument of callback,  If callback is of type
    * - `(data: any) => void)` or
    * - `{ [modifier: string]: ((data: any) => void) }`,
    *
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** (optional)
    * if set to `true`, `text` will be rendered as HTML
    * ## Example:
    * ```ts
    * text: '<b>BIG</b> button',
    * html: true,
    * ```
    */
  var html: js.UndefOr[Boolean] = js.undefined
  /** (optional)
    *  icon name
    * ## Example:
    * ```js
    * icon: 'octoface',
    * ```
    */
  var icon: js.UndefOr[String] = js.undefined
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
  var iconset: js.UndefOr[ion | fa | fab | fi | icomoon | devicon | mdi] = js.undefined
  /** (optional) defaults to `50` */
  var priority: js.UndefOr[Double] = js.undefined
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
  var text: js.UndefOr[String] = js.undefined
  /** (optional)
    * The tooltip option may be a string or an object that is passed to Atom's TooltipManager
    */
  var tooltip: js.UndefOr[String | Item | Class] = js.undefined
}

object ButtonOptions {
  @scala.inline
  def apply(
    callback: String | js.Array[String] | (js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | (StringDictionary[(js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | String]),
    background: String = null,
    `class`: String | js.Array[String] = null,
    color: String = null,
    data: js.Any = null,
    html: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    iconset: ion | fa | fab | fi | icomoon | devicon | mdi = null,
    priority: js.UndefOr[Double] = js.undefined,
    text: String = null,
    tooltip: String | Item | Class = null
  ): ButtonOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconset != null) __obj.updateDynamic("iconset")(iconset.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOptions]
  }
}

