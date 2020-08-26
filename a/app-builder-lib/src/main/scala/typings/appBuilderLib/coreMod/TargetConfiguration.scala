package typings.appBuilderLib.coreMod

import typings.builderUtil.archMod.ArchType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetConfiguration extends js.Object {
  /**
    * The arch or list of archs.
    */
  val arch: js.UndefOr[js.Array[ArchType] | ArchType] = js.native
  /**
    * The target name. e.g. `snap`.
    */
  val target: String = js.native
}

object TargetConfiguration {
  @scala.inline
  def apply(target: String): TargetConfiguration = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetConfiguration]
  }
  @scala.inline
  implicit class TargetConfigurationOps[Self <: TargetConfiguration] (val x: Self) extends AnyVal {
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
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setArchVarargs(value: ArchType*): Self = this.set("arch", js.Array(value :_*))
    @scala.inline
    def setArch(value: js.Array[ArchType] | ArchType): Self = this.set("arch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArch: Self = this.set("arch", js.undefined)
  }
  
}

