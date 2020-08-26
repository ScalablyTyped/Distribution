package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Reference Resolved Listener.
  *
  * This interface is used to receive the collection completion notification for a element collector.
  */
@js.native
trait XReferenceResolvedListener extends XInterface {
  /**
    * Notifies an element has been collected by an element collector.
    * @param referenceId the id of the element collector
    */
  def referenceResolved(referenceId: Double): Unit = js.native
}

object XReferenceResolvedListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    referenceResolved: Double => Unit,
    release: () => Unit
  ): XReferenceResolvedListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), referenceResolved = js.Any.fromFunction1(referenceResolved), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XReferenceResolvedListener]
  }
  @scala.inline
  implicit class XReferenceResolvedListenerOps[Self <: XReferenceResolvedListener] (val x: Self) extends AnyVal {
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
    def setReferenceResolved(value: Double => Unit): Self = this.set("referenceResolved", js.Any.fromFunction1(value))
  }
  
}

