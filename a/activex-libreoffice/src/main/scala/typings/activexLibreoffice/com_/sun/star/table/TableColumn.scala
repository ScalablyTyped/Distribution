package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a special cell range containing all cells of a single specific column in a table or spreadsheet. */
trait TableColumn
  extends StObject
     with XCellRange
     with XPropertySet
     with XNamed {
  
  /** is `TRUE` , if there is a manual horizontal page break attached to the column. */
  var IsStartOfNewPage: Boolean
  
  /** is `TRUE` , if the column is visible. */
  var IsVisible: Boolean
  
  /** is `TRUE` , if the column always keeps its optimal width. */
  var OptimalWidth: Boolean
  
  /**
    * contains the width of the column (in 1/100th mm).
    *
    * When hidden, it returns the width which the column would have, if it were visible.
    */
  var Width: Double
}
object TableColumn {
  
  inline def apply(
    IsStartOfNewPage: Boolean,
    IsVisible: Boolean,
    Name: String,
    OptimalWidth: Boolean,
    PropertySetInfo: XPropertySetInfo,
    Width: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getCellByPosition: (Double, Double) => XCell,
    getCellRangeByName: String => XCellRange,
    getCellRangeByPosition: (Double, Double, Double, Double) => XCellRange,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): TableColumn = {
    val __obj = js.Dynamic.literal(IsStartOfNewPage = IsStartOfNewPage.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OptimalWidth = OptimalWidth.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[TableColumn]
  }
  
  extension [Self <: TableColumn](x: Self) {
    
    inline def setIsStartOfNewPage(value: Boolean): Self = StObject.set(x, "IsStartOfNewPage", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "IsVisible", value.asInstanceOf[js.Any])
    
    inline def setOptimalWidth(value: Boolean): Self = StObject.set(x, "OptimalWidth", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
