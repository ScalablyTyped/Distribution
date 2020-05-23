package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service connects the Java-like UNO Drag & Drop protocol to the protocol used on window platforms. It realizes the drop target.
  * @see XDropTarget
  */
trait OleDropTarget
  extends XDropTarget
     with XInitialization
     with XComponent

object OleDropTarget {
  @scala.inline
  def apply(
    DefaultActions: Double,
    acquire: () => Unit,
    addDropTargetListener: XDropTargetListener => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getDefaultActions: () => Double,
    initialize: SeqEquiv[_] => Unit,
    isActive: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDropTargetListener: XDropTargetListener => Unit,
    removeEventListener: XEventListener => Unit,
    setActive: Boolean => Unit,
    setDefaultActions: Double => Unit
  ): OleDropTarget = {
    val __obj = js.Dynamic.literal(DefaultActions = DefaultActions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDropTargetListener = js.Any.fromFunction1(addDropTargetListener), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getDefaultActions = js.Any.fromFunction0(getDefaultActions), initialize = js.Any.fromFunction1(initialize), isActive = js.Any.fromFunction0(isActive), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDropTargetListener = js.Any.fromFunction1(removeDropTargetListener), removeEventListener = js.Any.fromFunction1(removeEventListener), setActive = js.Any.fromFunction1(setActive), setDefaultActions = js.Any.fromFunction1(setDefaultActions))
    __obj.asInstanceOf[OleDropTarget]
  }
}

