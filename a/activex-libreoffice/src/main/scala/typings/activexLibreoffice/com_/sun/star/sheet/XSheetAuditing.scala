package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides methods to access auditing (detective) features in a spreadsheet. */
trait XSheetAuditing
  extends StObject
     with XInterface {
  
  /** removes all auditing arrows from the spreadsheet. */
  def clearArrows(): Unit
  
  /**
    * removes arrows for one level of dependents of a formula cell.
    *
    * If the method is executed again for the same cell, the previous level of dependent cells is removed.
    * @param aPosition the address of the formula cell.
    */
  def hideDependents(aPosition: CellAddress): Boolean
  
  /**
    * removes arrows for one level of precedents of a formula cell.
    *
    * If the method is executed again for the same cell, the previous level of dependent cells is removed.
    * @param aPosition the address of the formula cell.
    */
  def hidePrecedents(aPosition: CellAddress): Boolean
  
  /**
    * draws arrows between a formula cell and its dependents.
    *
    * If the method is executed again for the same cell, the next level of dependent cells is marked.
    * @param aPosition the address of the formula cell.
    */
  def showDependents(aPosition: CellAddress): Boolean
  
  /** draws arrows between a formula cell containing an error and the cells causing the error. */
  def showErrors(aPosition: CellAddress): Boolean
  
  /** marks all cells containing invalid values. */
  def showInvalid(): Boolean
  
  /**
    * draws arrows between a formula cell and its precedents.
    *
    * If the method is executed again for the same cell, the next level of dependent cells is marked.
    * @param aPosition the address of the formula cell.
    */
  def showPrecedents(aPosition: CellAddress): Boolean
}
object XSheetAuditing {
  
  inline def apply(
    acquire: () => Unit,
    clearArrows: () => Unit,
    hideDependents: CellAddress => Boolean,
    hidePrecedents: CellAddress => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    showDependents: CellAddress => Boolean,
    showErrors: CellAddress => Boolean,
    showInvalid: () => Boolean,
    showPrecedents: CellAddress => Boolean
  ): XSheetAuditing = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), clearArrows = js.Any.fromFunction0(clearArrows), hideDependents = js.Any.fromFunction1(hideDependents), hidePrecedents = js.Any.fromFunction1(hidePrecedents), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), showDependents = js.Any.fromFunction1(showDependents), showErrors = js.Any.fromFunction1(showErrors), showInvalid = js.Any.fromFunction0(showInvalid), showPrecedents = js.Any.fromFunction1(showPrecedents))
    __obj.asInstanceOf[XSheetAuditing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSheetAuditing] (val x: Self) extends AnyVal {
    
    inline def setClearArrows(value: () => Unit): Self = StObject.set(x, "clearArrows", js.Any.fromFunction0(value))
    
    inline def setHideDependents(value: CellAddress => Boolean): Self = StObject.set(x, "hideDependents", js.Any.fromFunction1(value))
    
    inline def setHidePrecedents(value: CellAddress => Boolean): Self = StObject.set(x, "hidePrecedents", js.Any.fromFunction1(value))
    
    inline def setShowDependents(value: CellAddress => Boolean): Self = StObject.set(x, "showDependents", js.Any.fromFunction1(value))
    
    inline def setShowErrors(value: CellAddress => Boolean): Self = StObject.set(x, "showErrors", js.Any.fromFunction1(value))
    
    inline def setShowInvalid(value: () => Boolean): Self = StObject.set(x, "showInvalid", js.Any.fromFunction0(value))
    
    inline def setShowPrecedents(value: CellAddress => Boolean): Self = StObject.set(x, "showPrecedents", js.Any.fromFunction1(value))
  }
}
