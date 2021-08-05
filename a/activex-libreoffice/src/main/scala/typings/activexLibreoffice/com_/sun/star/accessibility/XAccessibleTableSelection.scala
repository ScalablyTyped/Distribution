package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAccessibleTableSelection
  extends StObject
     with XInterface {
  
  def selectColumn(column: Double): Boolean
  
  def selectRow(row: Double): Boolean
  
  def unselectColumn(column: Double): Boolean
  
  def unselectRow(row: Double): Boolean
}
object XAccessibleTableSelection {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    selectColumn: Double => Boolean,
    selectRow: Double => Boolean,
    unselectColumn: Double => Boolean,
    unselectRow: Double => Boolean
  ): XAccessibleTableSelection = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectColumn = js.Any.fromFunction1(selectColumn), selectRow = js.Any.fromFunction1(selectRow), unselectColumn = js.Any.fromFunction1(unselectColumn), unselectRow = js.Any.fromFunction1(unselectRow))
    __obj.asInstanceOf[XAccessibleTableSelection]
  }
  
  extension [Self <: XAccessibleTableSelection](x: Self) {
    
    inline def setSelectColumn(value: Double => Boolean): Self = StObject.set(x, "selectColumn", js.Any.fromFunction1(value))
    
    inline def setSelectRow(value: Double => Boolean): Self = StObject.set(x, "selectRow", js.Any.fromFunction1(value))
    
    inline def setUnselectColumn(value: Double => Boolean): Self = StObject.set(x, "unselectColumn", js.Any.fromFunction1(value))
    
    inline def setUnselectRow(value: Double => Boolean): Self = StObject.set(x, "unselectRow", js.Any.fromFunction1(value))
  }
}
