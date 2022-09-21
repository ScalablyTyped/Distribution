package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to a file dialog.
  * @deprecated Deprecated
  */
trait XFileDialog
  extends StObject
     with XInterface {
  
  /** returns the currently selected filter. */
  var CurrentFilter: String
  
  /** returns the path. */
  var Path: String
  
  /** returns the currently selected filter. */
  def getCurrentFilter(): String
  
  /** returns the path. */
  def getPath(): String
  
  /** sets the current filter. */
  def setCurrentFilter(Filter: String): Unit
  
  /** sets the filters. */
  def setFilters(rFilterNames: SeqEquiv[String], rMasks: SeqEquiv[String]): Unit
  
  /** sets the path. */
  def setPath(Path: String): Unit
}
object XFileDialog {
  
  inline def apply(
    CurrentFilter: String,
    Path: String,
    acquire: () => Unit,
    getCurrentFilter: () => String,
    getPath: () => String,
    queryInterface: `type` => Any,
    release: () => Unit,
    setCurrentFilter: String => Unit,
    setFilters: (SeqEquiv[String], SeqEquiv[String]) => Unit,
    setPath: String => Unit
  ): XFileDialog = {
    val __obj = js.Dynamic.literal(CurrentFilter = CurrentFilter.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCurrentFilter = js.Any.fromFunction0(getCurrentFilter), getPath = js.Any.fromFunction0(getPath), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentFilter = js.Any.fromFunction1(setCurrentFilter), setFilters = js.Any.fromFunction2(setFilters), setPath = js.Any.fromFunction1(setPath))
    __obj.asInstanceOf[XFileDialog]
  }
  
  extension [Self <: XFileDialog](x: Self) {
    
    inline def setCurrentFilter(value: String): Self = StObject.set(x, "CurrentFilter", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentFilter(value: () => String): Self = StObject.set(x, "getCurrentFilter", js.Any.fromFunction0(value))
    
    inline def setGetPath(value: () => String): Self = StObject.set(x, "getPath", js.Any.fromFunction0(value))
    
    inline def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setSetCurrentFilter(value: String => Unit): Self = StObject.set(x, "setCurrentFilter", js.Any.fromFunction1(value))
    
    inline def setSetFilters(value: (SeqEquiv[String], SeqEquiv[String]) => Unit): Self = StObject.set(x, "setFilters", js.Any.fromFunction2(value))
    
    inline def setSetPath(value: String => Unit): Self = StObject.set(x, "setPath", js.Any.fromFunction1(value))
  }
}
