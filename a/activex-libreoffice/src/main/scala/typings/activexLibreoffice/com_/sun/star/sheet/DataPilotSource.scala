package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typings.activexLibreoffice.com_.sun.star.util.XRefreshable
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a data pilot source.
  *
  * A component that implements this service can be used as data source for a data pilot table in a spreadsheet document.
  */
trait DataPilotSource
  extends StObject
     with XDimensionsSupplier
     with XDataPilotResults
     with XRefreshable
     with XPropertySet {
  
  /**
    * specifies the number of column fields.
    * @since OOo 3.0
    */
  var ColumnFieldCount: Double
  
  /** specifies if grand totals for the columns are inserted. */
  var ColumnGrand: Boolean
  
  /**
    * specifies the number of data fields.
    * @since OOo 3.0
    */
  var DataFieldCount: Double
  
  /**
    * specifies the number of row fields.
    * @since OOo 3.0
    */
  var RowFieldCount: Double
  
  /** specifies if grand totals for the rows are inserted. */
  var RowGrand: Boolean
}
object DataPilotSource {
  
  inline def apply(
    ColumnFieldCount: Double,
    ColumnGrand: Boolean,
    DataFieldCount: Double,
    Dimensions: XNameAccess,
    PropertySetInfo: XPropertySetInfo,
    Results: SafeArray[SafeArray[DataResult]],
    RowFieldCount: Double,
    RowGrand: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addRefreshListener: XRefreshListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getDimensions: () => XNameAccess,
    getFilteredResults: SeqEquiv[DataPilotFieldFilter] => SafeArray[Double],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getResults: () => SafeArray[SafeArray[DataResult]],
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeRefreshListener: XRefreshListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DataPilotSource = {
    val __obj = js.Dynamic.literal(ColumnFieldCount = ColumnFieldCount.asInstanceOf[js.Any], ColumnGrand = ColumnGrand.asInstanceOf[js.Any], DataFieldCount = DataFieldCount.asInstanceOf[js.Any], Dimensions = Dimensions.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Results = Results.asInstanceOf[js.Any], RowFieldCount = RowFieldCount.asInstanceOf[js.Any], RowGrand = RowGrand.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getDimensions = js.Any.fromFunction0(getDimensions), getFilteredResults = js.Any.fromFunction1(getFilteredResults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getResults = js.Any.fromFunction0(getResults), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DataPilotSource]
  }
  
  extension [Self <: DataPilotSource](x: Self) {
    
    inline def setColumnFieldCount(value: Double): Self = StObject.set(x, "ColumnFieldCount", value.asInstanceOf[js.Any])
    
    inline def setColumnGrand(value: Boolean): Self = StObject.set(x, "ColumnGrand", value.asInstanceOf[js.Any])
    
    inline def setDataFieldCount(value: Double): Self = StObject.set(x, "DataFieldCount", value.asInstanceOf[js.Any])
    
    inline def setRowFieldCount(value: Double): Self = StObject.set(x, "RowFieldCount", value.asInstanceOf[js.Any])
    
    inline def setRowGrand(value: Boolean): Self = StObject.set(x, "RowGrand", value.asInstanceOf[js.Any])
  }
}
