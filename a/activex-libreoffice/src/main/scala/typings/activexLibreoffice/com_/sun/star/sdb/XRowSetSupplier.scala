package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.sdbc.XRowSet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * uses a row set as datasource.
  * @see XRowSetChangeBroadcaster
  */
@js.native
trait XRowSetSupplier extends XInterface {
  
  /**
    * provides access to the data source.
    * @returns the {@link RowSet} object
    */
  var RowSet: XRowSet = js.native
  
  /**
    * provides access to the data source.
    * @returns the {@link RowSet} object
    */
  def getRowSet(): XRowSet = js.native
  
  /**
    * sets the data source.
    * @param xDataSource the {@link RowSet} object to set
    */
  def setRowSet(xDataSource: XRowSet): Unit = js.native
}
object XRowSetSupplier {
  
  @scala.inline
  def apply(
    RowSet: XRowSet,
    acquire: () => Unit,
    getRowSet: () => XRowSet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setRowSet: XRowSet => Unit
  ): XRowSetSupplier = {
    val __obj = js.Dynamic.literal(RowSet = RowSet.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getRowSet = js.Any.fromFunction0(getRowSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setRowSet = js.Any.fromFunction1(setRowSet))
    __obj.asInstanceOf[XRowSetSupplier]
  }
  
  @scala.inline
  implicit class XRowSetSupplierOps[Self <: XRowSetSupplier] (val x: Self) extends AnyVal {
    
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
    def setRowSet(value: XRowSet): Self = this.set("RowSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRowSet(value: () => XRowSet): Self = this.set("getRowSet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetRowSet(value: XRowSet => Unit): Self = this.set("setRowSet", js.Any.fromFunction1(value))
  }
}
