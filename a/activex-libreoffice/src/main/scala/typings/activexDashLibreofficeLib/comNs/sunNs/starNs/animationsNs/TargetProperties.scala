package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of an animated target.
  *
  * This struct collects all global attributes that apply to an animation target. An animation target is anything that is referenced from a given {@link
  * XAnimationNode} tree as a target object.
  */
trait TargetProperties extends js.Object {
  var Properties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  var Target: js.Any
}

object TargetProperties {
  @scala.inline
  def apply(
    Properties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    Target: js.Any
  ): TargetProperties = {
    val __obj = js.Dynamic.literal(Properties = Properties, Target = Target)
  
    __obj.asInstanceOf[TargetProperties]
  }
}

