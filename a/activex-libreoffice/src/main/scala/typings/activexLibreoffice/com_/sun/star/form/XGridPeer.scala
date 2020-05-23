package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the window peer of a GridControl and allows you to set and retrieve the model data.
  *
  * Usually, the columns used are the columns as supplied by the grid control model.
  *
  * You should use this interface only if you know exactly what you are doing. Tampering with the columns of a grid control which is part of a complex
  * form can really hurt ....
  * @deprecated Deprecated
  * @see com.sun.star.awt.XWindowPeer
  * @see com.sun.star.form.component.GridControl
  */
trait XGridPeer extends XInterface {
  /** retrieves the currently used column definitions of the peer. */
  var Columns: XIndexContainer
  /** retrieves the currently used column definitions of the peer. */
  def getColumns(): XIndexContainer
  /** sets the column definition for the peer. */
  def setColumns(aColumns: XIndexContainer): Unit
}

object XGridPeer {
  @scala.inline
  def apply(
    Columns: XIndexContainer,
    acquire: () => Unit,
    getColumns: () => XIndexContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setColumns: XIndexContainer => Unit
  ): XGridPeer = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getColumns = js.Any.fromFunction0(getColumns), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setColumns = js.Any.fromFunction1(setColumns))
    __obj.asInstanceOf[XGridPeer]
  }
}

