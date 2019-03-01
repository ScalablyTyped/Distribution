package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Class extends js.Object {
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[Anon_Hide] = js.undefined
  var placement: js.UndefOr[
    atomLib.atomMod.TooltipPlacement | js.Function0[atomLib.atomMod.TooltipPlacement]
  ] = js.undefined
  var trigger: js.UndefOr[
    atomLib.atomLibStrings.click | atomLib.atomLibStrings.hover | atomLib.atomLibStrings.focus | atomLib.atomLibStrings.manual
  ] = js.undefined
}

object Anon_Class {
  @scala.inline
  def apply(
    `class`: java.lang.String = null,
    delay: Anon_Hide = null,
    placement: atomLib.atomMod.TooltipPlacement | js.Function0[atomLib.atomMod.TooltipPlacement] = null,
    trigger: atomLib.atomLibStrings.click | atomLib.atomLibStrings.hover | atomLib.atomLibStrings.focus | atomLib.atomLibStrings.manual = null
  ): Anon_Class = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Class]
  }
}

