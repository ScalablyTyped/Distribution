package typings.angularAnimations.mod

import typings.angularAnimations.anon.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationStateMetadata extends AnimationMetadata {
  /**
    * The state name, unique within the component.
    */
  var name: String = js.native
  /**
    * An options object containing
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation.
    */
  var options: js.UndefOr[Params] = js.native
  /**
    *  The CSS styles associated with this state.
    */
  var styles: AnimationStyleMetadata = js.native
}

object AnimationStateMetadata {
  @scala.inline
  def apply(name: String, styles: AnimationStyleMetadata, `type`: AnimationMetadataType): AnimationStateMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStateMetadata]
  }
  @scala.inline
  implicit class AnimationStateMetadataOps[Self <: AnimationStateMetadata] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyles(value: AnimationStyleMetadata): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Params): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

