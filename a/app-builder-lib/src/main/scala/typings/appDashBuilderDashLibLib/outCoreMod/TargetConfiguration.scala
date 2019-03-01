package typings
package appDashBuilderDashLibLib.outCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetConfiguration extends js.Object {
  /**
    * The arch or list of archs.
    */
  val arch: js.UndefOr[
    js.Array[builderDashUtilLib.outArchMod.ArchType] | builderDashUtilLib.outArchMod.ArchType
  ] = js.undefined
  /**
    * The target name. e.g. `snap`.
    */
  val target: java.lang.String
}

object TargetConfiguration {
  @scala.inline
  def apply(
    target: java.lang.String,
    arch: js.Array[builderDashUtilLib.outArchMod.ArchType] | builderDashUtilLib.outArchMod.ArchType = null
  ): TargetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("target")(target)
    if (arch != null) __obj.updateDynamic("arch")(arch.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetConfiguration]
  }
}

