package typings.activexLibreoffice.com_.sun.star.form.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * encapsulates the state of a {@link FormFeature}
  * @see XFormOperations
  * @since OOo 2.2
  */
@js.native
trait FeatureState extends js.Object {
  /** determines whether the respective feature is enabled (i.e. available) in the current state of the form. */
  var Enabled: Boolean = js.native
  /** determines the state of the feature. The concrete semantics depends on the concrete {@link FormFeature} . */
  var State: js.Any = js.native
}

object FeatureState {
  @scala.inline
  def apply(Enabled: Boolean, State: js.Any): FeatureState = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureState]
  }
  @scala.inline
  implicit class FeatureStateOps[Self <: FeatureState] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: js.Any): Self = this.set("State", value.asInstanceOf[js.Any])
  }
  
}

