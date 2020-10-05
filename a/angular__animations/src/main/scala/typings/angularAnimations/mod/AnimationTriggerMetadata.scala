package typings.angularAnimations.mod

import typings.angularAnimations.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationTriggerMetadata extends AnimationMetadata {
  /**
    * An animation definition object, containing an array of state and transition declarations.
    */
  var definitions: js.Array[AnimationMetadata] = js.native
  /**
    * The trigger name, used to associate it with an element. Unique within the component.
    */
  var name: String = js.native
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: `0` | Null = js.native
}

object AnimationTriggerMetadata {
  @scala.inline
  def apply(definitions: js.Array[AnimationMetadata], name: String, `type`: AnimationMetadataType): AnimationTriggerMetadata = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTriggerMetadata]
  }
  @scala.inline
  implicit class AnimationTriggerMetadataOps[Self <: AnimationTriggerMetadata] (val x: Self) extends AnyVal {
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
    def setDefinitionsVarargs(value: AnimationMetadata*): Self = this.set("definitions", js.Array(value :_*))
    @scala.inline
    def setDefinitions(value: js.Array[AnimationMetadata]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: `0`): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsNull: Self = this.set("options", null)
  }
  
}

