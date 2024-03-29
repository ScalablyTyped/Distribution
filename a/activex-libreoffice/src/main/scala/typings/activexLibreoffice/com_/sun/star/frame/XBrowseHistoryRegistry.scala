package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XBrowseHistoryRegistry
  extends StObject
     with XInterface {
  
  /** @deprecated Deprecated */
  def createNewEntry(URL: String, Arguments: SeqEquiv[PropertyValue], Title: String): Unit
  
  /** @deprecated Deprecated */
  def updateViewData(Value: Any): Unit
}
object XBrowseHistoryRegistry {
  
  inline def apply(
    acquire: () => Unit,
    createNewEntry: (String, SeqEquiv[PropertyValue], String) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    updateViewData: Any => Unit
  ): XBrowseHistoryRegistry = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createNewEntry = js.Any.fromFunction3(createNewEntry), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateViewData = js.Any.fromFunction1(updateViewData))
    __obj.asInstanceOf[XBrowseHistoryRegistry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XBrowseHistoryRegistry] (val x: Self) extends AnyVal {
    
    inline def setCreateNewEntry(value: (String, SeqEquiv[PropertyValue], String) => Unit): Self = StObject.set(x, "createNewEntry", js.Any.fromFunction3(value))
    
    inline def setUpdateViewData(value: Any => Unit): Self = StObject.set(x, "updateViewData", js.Any.fromFunction1(value))
  }
}
