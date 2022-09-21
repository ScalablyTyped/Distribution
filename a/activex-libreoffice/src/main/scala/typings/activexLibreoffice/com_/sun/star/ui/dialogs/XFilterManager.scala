package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a filter manager interface for a {@link FilePicker} */
trait XFilterManager
  extends StObject
     with XInterface {
  
  /**
    * Returns the currently selected filter.
    * @returns The name of the selected filter or an empty string if there is no filter or no filter is currently selected.
    */
  var CurrentFilter: String
  
  /**
    * Adds a filter identified by a title.
    * @param aTitle Specifies the name of the filter as shown in the filter box of the {@link FilePicker} dialog.
    * @param aFilter Specifies the extensions of the filter. Multiple filters should be semicolon separated. The semicolon may not be used as character in a f
    * @throws com::sun::star::lang::IllegalArgumentException If a filter with the specified title already exists.
    */
  def appendFilter(aTitle: String, aFilter: String): Unit
  
  /**
    * Returns the currently selected filter.
    * @returns The name of the selected filter or an empty string if there is no filter or no filter is currently selected.
    */
  def getCurrentFilter(): String
  
  /**
    * Sets the current filter.
    * @param aTitle Specifies the name of the filter to be set.
    * @throws com::sun::star::lang::IllegalArgumentException If the specified filter was not found.
    */
  def setCurrentFilter(aTitle: String): Unit
}
object XFilterManager {
  
  inline def apply(
    CurrentFilter: String,
    acquire: () => Unit,
    appendFilter: (String, String) => Unit,
    getCurrentFilter: () => String,
    queryInterface: `type` => Any,
    release: () => Unit,
    setCurrentFilter: String => Unit
  ): XFilterManager = {
    val __obj = js.Dynamic.literal(CurrentFilter = CurrentFilter.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendFilter = js.Any.fromFunction2(appendFilter), getCurrentFilter = js.Any.fromFunction0(getCurrentFilter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentFilter = js.Any.fromFunction1(setCurrentFilter))
    __obj.asInstanceOf[XFilterManager]
  }
  
  extension [Self <: XFilterManager](x: Self) {
    
    inline def setAppendFilter(value: (String, String) => Unit): Self = StObject.set(x, "appendFilter", js.Any.fromFunction2(value))
    
    inline def setCurrentFilter(value: String): Self = StObject.set(x, "CurrentFilter", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentFilter(value: () => String): Self = StObject.set(x, "getCurrentFilter", js.Any.fromFunction0(value))
    
    inline def setSetCurrentFilter(value: String => Unit): Self = StObject.set(x, "setCurrentFilter", js.Any.fromFunction1(value))
  }
}
