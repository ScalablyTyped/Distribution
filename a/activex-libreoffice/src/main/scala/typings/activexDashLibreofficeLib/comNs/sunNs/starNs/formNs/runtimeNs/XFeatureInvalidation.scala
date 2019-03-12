package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implements a callback for a {@link XFormOperations} instance, which is called when the state of one or more FormFeatures might have changed.
  * @see XFormOperations
  * @since OOo 2.2
  */
trait XFeatureInvalidation extends js.Object {
  /**
    * invalidates all features
    *
    * This method is used of it cannot be exactly and reliably determined which features might actually have changed their state. In this case, the callee
    * should assume all features it is interested in must be requeried.
    */
  def invalidateAllFeatures(): scala.Unit
  /**
    * invalidates the given FormFeatures
    *
    * Invalidation means that any user interface representation (such as toolbox buttons), or any dispatches associated with the features in question are
    * potentially out-of-date, and need to be updated.
    * @param Features The set of features whose state might have changed.
    */
  def invalidateFeatures(Features: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
}

object XFeatureInvalidation {
  @scala.inline
  def apply(
    invalidateAllFeatures: () => scala.Unit,
    invalidateFeatures: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit
  ): XFeatureInvalidation = {
    val __obj = js.Dynamic.literal(invalidateAllFeatures = js.Any.fromFunction0(invalidateAllFeatures), invalidateFeatures = js.Any.fromFunction1(invalidateFeatures))
  
    __obj.asInstanceOf[XFeatureInvalidation]
  }
}

