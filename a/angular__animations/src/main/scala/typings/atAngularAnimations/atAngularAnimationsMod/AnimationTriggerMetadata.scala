package typings.atAngularAnimations.atAngularAnimationsMod

import typings.atAngularAnimations.Anon_NameParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationTriggerMetadata extends AnimationMetadata {
  /**
    * An animation definition object, containing an array of state and transition declarations.
    */
  var definitions: js.Array[AnimationMetadata]
  /**
    * The trigger name, used to associate it with an element. Unique within the component.
    */
  var name: String
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: Anon_NameParams | Null
}

object AnimationTriggerMetadata {
  @scala.inline
  def apply(
    definitions: js.Array[AnimationMetadata],
    name: String,
    `type`: AnimationMetadataType,
    options: Anon_NameParams = null
  ): AnimationTriggerMetadata = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTriggerMetadata]
  }
}

