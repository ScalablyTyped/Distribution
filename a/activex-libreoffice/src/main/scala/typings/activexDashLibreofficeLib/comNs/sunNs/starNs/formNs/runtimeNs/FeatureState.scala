package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * encapsulates the state of a {@link FormFeature}
  * @see XFormOperations
  * @since OOo 2.2
  */
trait FeatureState extends js.Object {
  /** determines whether the respective feature is enabled (i.e. available) in the current state of the form. */
  var Enabled: scala.Boolean
  /** determines the state of the feature. The concrete semantics depends on the concrete {@link FormFeature} . */
  var State: js.Any
}

object FeatureState {
  @scala.inline
  def apply(Enabled: scala.Boolean, State: js.Any): FeatureState = {
    val __obj = js.Dynamic.literal(Enabled = Enabled, State = State)
  
    __obj.asInstanceOf[FeatureState]
  }
}

