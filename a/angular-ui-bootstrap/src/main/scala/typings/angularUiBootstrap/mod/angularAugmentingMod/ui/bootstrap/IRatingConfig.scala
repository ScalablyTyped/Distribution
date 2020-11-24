package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRatingConfig extends js.Object {
  
  /**
    * Changes the number of icons.
    *
    * @default: 5
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * A variable used in the template to specify the state for unselected icons.
    *
    * @default: null
    */
  var stateOff: js.UndefOr[String] = js.native
  
  /**
    * A variable used in the template to specify the state for selected icons.
    *
    * @default: null
    */
  var stateOn: js.UndefOr[String] = js.native
  
  /**
    * An array of strings defining titles for all icons.
    *
    * @default: ["one", "two", "three", "four", "five"]
    */
  var titles: js.UndefOr[js.Array[String]] = js.native
}
object IRatingConfig {
  
  @scala.inline
  def apply(): IRatingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRatingConfig]
  }
  
  @scala.inline
  implicit class IRatingConfigOps[Self <: IRatingConfig] (val x: Self) extends AnyVal {
    
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setStateOff(value: String): Self = this.set("stateOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateOff: Self = this.set("stateOff", js.undefined)
    
    @scala.inline
    def setStateOn(value: String): Self = this.set("stateOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateOn: Self = this.set("stateOn", js.undefined)
    
    @scala.inline
    def setTitlesVarargs(value: String*): Self = this.set("titles", js.Array(value :_*))
    
    @scala.inline
    def setTitles(value: js.Array[String]): Self = this.set("titles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitles: Self = this.set("titles", js.undefined)
  }
}
