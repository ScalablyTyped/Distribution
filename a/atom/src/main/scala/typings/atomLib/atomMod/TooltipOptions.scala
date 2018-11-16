package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TooltipOptions extends js.Object {
  /** Apply a CSS fade transition to the tooltip. */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /** Appends the tooltip to a specific element. */
  var container: js.UndefOr[java.lang.String | stdLib.HTMLElement | atomLib.atomLibNumbers.`false`] = js.undefined
  /**
       *  Delay showing and hiding the tooltip (ms) - does not apply to manual
       *  trigger type.
       */
  var delay: js.UndefOr[scala.Double | atomLib.Anon_Hide] = js.undefined
  /** Allow HTML in the tooltip. */
  var html: js.UndefOr[scala.Boolean] = js.undefined
  /** How to position the tooltip. */
  var placement: js.UndefOr[
    atomLib.atomLibStrings.top | atomLib.atomLibStrings.bottom | atomLib.atomLibStrings.left | atomLib.atomLibStrings.right | atomLib.atomLibStrings.auto
  ] = js.undefined
  /**
       *  If a selector is provided, tooltip objects will be delegated to the
       *  specified targets.
       */
  var selector: js.UndefOr[java.lang.String] = js.undefined
  /** Base HTML to use when creating the tooltip. */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /**
       *  Default title value if title attribute isn't present.
       *  If a function is given, it will be called with its this reference set to
       *  the element that the tooltip is attached to.
       */
  var title: js.UndefOr[java.lang.String | stdLib.HTMLElement | js.Function0[java.lang.String]] = js.undefined
  /**
       *  How tooltip is triggered - click | hover | focus | manual.
       *  You may pass multiple triggers; separate them with a space.
       */
  var trigger: js.UndefOr[java.lang.String] = js.undefined
}

