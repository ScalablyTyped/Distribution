package typings.angularFeatureFlags.mod.featureflags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureFlagsProvider extends js.Object {
  
  def setInitialFlags(flags: js.Array[FlagData]): Unit = js.native
}
object FeatureFlagsProvider {
  
  @scala.inline
  def apply(setInitialFlags: js.Array[FlagData] => Unit): FeatureFlagsProvider = {
    val __obj = js.Dynamic.literal(setInitialFlags = js.Any.fromFunction1(setInitialFlags))
    __obj.asInstanceOf[FeatureFlagsProvider]
  }
  
  @scala.inline
  implicit class FeatureFlagsProviderOps[Self <: FeatureFlagsProvider] (val x: Self) extends AnyVal {
    
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
    def setSetInitialFlags(value: js.Array[FlagData] => Unit): Self = this.set("setInitialFlags", js.Any.fromFunction1(value))
  }
}
