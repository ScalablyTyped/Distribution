package typings.angularAnimations.mod

import typings.angularAnimations.AnonParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationStateMetadata extends AnimationMetadata {
  /**
    * The state name, unique within the component.
    */
  var name: String
  /**
    * An options object containing
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation.
    */
  var options: js.UndefOr[AnonParams] = js.undefined
  /**
    *  The CSS styles associated with this state.
    */
  var styles: AnimationStyleMetadata
}

object AnimationStateMetadata {
  @scala.inline
  def apply(
    name: String,
    styles: AnimationStyleMetadata,
    `type`: AnimationMetadataType,
    options: AnonParams = null
  ): AnimationStateMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStateMetadata]
  }
}

