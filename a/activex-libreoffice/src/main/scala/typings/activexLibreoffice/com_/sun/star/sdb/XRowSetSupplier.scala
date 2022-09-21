package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.sdbc.XRowSet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * uses a row set as datasource.
  * @see XRowSetChangeBroadcaster
  */
trait XRowSetSupplier
  extends StObject
     with XInterface {
  
  /**
    * provides access to the data source.
    * @returns the {@link RowSet} object
    */
  var RowSet: XRowSet
  
  /**
    * provides access to the data source.
    * @returns the {@link RowSet} object
    */
  def getRowSet(): XRowSet
  
  /**
    * sets the data source.
    * @param xDataSource the {@link RowSet} object to set
    */
  def setRowSet(xDataSource: XRowSet): Unit
}
object XRowSetSupplier {
  
  inline def apply(
    RowSet: XRowSet,
    acquire: () => Unit,
    getRowSet: () => XRowSet,
    queryInterface: `type` => Any,
    release: () => Unit,
    setRowSet: XRowSet => Unit
  ): XRowSetSupplier = {
    val __obj = js.Dynamic.literal(RowSet = RowSet.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getRowSet = js.Any.fromFunction0(getRowSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setRowSet = js.Any.fromFunction1(setRowSet))
    __obj.asInstanceOf[XRowSetSupplier]
  }
  
  extension [Self <: XRowSetSupplier](x: Self) {
    
    inline def setGetRowSet(value: () => XRowSet): Self = StObject.set(x, "getRowSet", js.Any.fromFunction0(value))
    
    inline def setRowSet(value: XRowSet): Self = StObject.set(x, "RowSet", value.asInstanceOf[js.Any])
    
    inline def setSetRowSet(value: XRowSet => Unit): Self = StObject.set(x, "setRowSet", js.Any.fromFunction1(value))
  }
}
