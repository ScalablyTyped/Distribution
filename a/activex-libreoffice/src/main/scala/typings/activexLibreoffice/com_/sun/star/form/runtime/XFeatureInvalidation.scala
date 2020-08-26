package typings.activexLibreoffice.com_.sun.star.form.runtime

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implements a callback for a {@link XFormOperations} instance, which is called when the state of one or more FormFeatures might have changed.
  * @see XFormOperations
  * @since OOo 2.2
  */
@js.native
trait XFeatureInvalidation extends js.Object {
  /**
    * invalidates all features
    *
    * This method is used of it cannot be exactly and reliably determined which features might actually have changed their state. In this case, the callee
    * should assume all features it is interested in must be requeried.
    */
  def invalidateAllFeatures(): Unit = js.native
  /**
    * invalidates the given FormFeatures
    *
    * Invalidation means that any user interface representation (such as toolbox buttons), or any dispatches associated with the features in question are
    * potentially out-of-date, and need to be updated.
    * @param Features The set of features whose state might have changed.
    */
  def invalidateFeatures(Features: SeqEquiv[Double]): Unit = js.native
}

object XFeatureInvalidation {
  @scala.inline
  def apply(invalidateAllFeatures: () => Unit, invalidateFeatures: SeqEquiv[Double] => Unit): XFeatureInvalidation = {
    val __obj = js.Dynamic.literal(invalidateAllFeatures = js.Any.fromFunction0(invalidateAllFeatures), invalidateFeatures = js.Any.fromFunction1(invalidateFeatures))
    __obj.asInstanceOf[XFeatureInvalidation]
  }
  @scala.inline
  implicit class XFeatureInvalidationOps[Self <: XFeatureInvalidation] (val x: Self) extends AnyVal {
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
    def setInvalidateAllFeatures(value: () => Unit): Self = this.set("invalidateAllFeatures", js.Any.fromFunction0(value))
    @scala.inline
    def setInvalidateFeatures(value: SeqEquiv[Double] => Unit): Self = this.set("invalidateFeatures", js.Any.fromFunction1(value))
  }
  
}

