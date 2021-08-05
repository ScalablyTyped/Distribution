package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface could be incomplete since I derived it from its places of use.
  * @since LibreOffice 4.1
  */
trait AddressBookSourceDialog
  extends StObject
     with XExecutableDialog {
  
  def createWithDataSource(
    ParentWindow: XWindow,
    DataSource: XPropertySet,
    DataSourceName: String,
    Command: String,
    Title: String
  ): Unit
}
object AddressBookSourceDialog {
  
  inline def apply(
    acquire: () => Unit,
    createWithDataSource: (XWindow, XPropertySet, String, String, String) => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): AddressBookSourceDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithDataSource = js.Any.fromFunction5(createWithDataSource), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[AddressBookSourceDialog]
  }
  
  extension [Self <: AddressBookSourceDialog](x: Self) {
    
    inline def setCreateWithDataSource(value: (XWindow, XPropertySet, String, String, String) => Unit): Self = StObject.set(x, "createWithDataSource", js.Any.fromFunction5(value))
  }
}
