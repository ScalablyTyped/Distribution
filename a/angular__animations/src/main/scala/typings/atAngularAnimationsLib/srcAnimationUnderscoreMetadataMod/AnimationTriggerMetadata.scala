package typings
package atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod

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
  var name: java.lang.String
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: atAngularAnimationsLib.Anon_NameParams | scala.Null
}

object AnimationTriggerMetadata {
  @scala.inline
  def apply(
    definitions: js.Array[AnimationMetadata],
    name: java.lang.String,
    `type`: AnimationMetadataType,
    options: atAngularAnimationsLib.Anon_NameParams = null
  ): AnimationTriggerMetadata = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("definitions")(definitions)
    __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AnimationTriggerMetadata]
  }
}

