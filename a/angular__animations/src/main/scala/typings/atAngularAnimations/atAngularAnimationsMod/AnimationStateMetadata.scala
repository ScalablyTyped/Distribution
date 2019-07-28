package typings.atAngularAnimations.atAngularAnimationsMod

import typings.atAngularAnimations.Anon_Name
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
  var options: js.UndefOr[Anon_Name] = js.undefined
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
    options: Anon_Name = null
  ): AnimationStateMetadata = {
    val __obj = js.Dynamic.literal(name = name, styles = styles)
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AnimationStateMetadata]
  }
}

