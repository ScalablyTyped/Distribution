package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait XGridPeer
  extends StObject
     with XInterface {
  
  /** retrieves the currently used column definitions of the peer. */
  var Columns: XIndexContainer
  
  /** retrieves the currently used column definitions of the peer. */
  def getColumns(): XIndexContainer
  
  /** sets the column definition for the peer. */
  def setColumns(aColumns: XIndexContainer): Unit
}
object XGridPeer {
  
  inline def apply(
    Columns: XIndexContainer,
    acquire: () => Unit,
    getColumns: () => XIndexContainer,
    queryInterface: `type` => Any,
    release: () => Unit,
    setColumns: XIndexContainer => Unit
  ): XGridPeer = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getColumns = js.Any.fromFunction0(getColumns), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setColumns = js.Any.fromFunction1(setColumns))
    __obj.asInstanceOf[XGridPeer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XGridPeer] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: XIndexContainer): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setGetColumns(value: () => XIndexContainer): Self = StObject.set(x, "getColumns", js.Any.fromFunction0(value))
    
    inline def setSetColumns(value: XIndexContainer => Unit): Self = StObject.set(x, "setColumns", js.Any.fromFunction1(value))
  }
}
