package typings.appDashBuilderDashLib.outCoreMod

import typings.builderDashUtil.outArchMod.ArchType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetConfiguration extends js.Object {
  /**
    * The arch or list of archs.
    */
  val arch: js.UndefOr[js.Array[ArchType] | ArchType] = js.undefined
  /**
    * The target name. e.g. `snap`.
    */
  val target: String
}

object TargetConfiguration {
  @scala.inline
  def apply(target: String, arch: js.Array[ArchType] | ArchType = null): TargetConfiguration = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (arch != null) __obj.updateDynamic("arch")(arch.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetConfiguration]
  }
}

