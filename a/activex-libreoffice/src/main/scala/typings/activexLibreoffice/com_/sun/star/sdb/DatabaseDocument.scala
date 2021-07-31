package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.sdbcx.XDataDescriptorFactory
import typings.activexLibreoffice.com_.sun.star.sdbcx.XRename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a link to a document associated with a database document
  * @deprecated Deprecated
  * @since OOo 2.0
  */
trait DatabaseDocument
  extends StObject
     with XPropertySet
     with XDataDescriptorFactory
     with XRename {
  
  /** is the name of the document. */
  var Name: String
  
  /** is the URL of the document. */
  var URL: String
}
object DatabaseDocument {
  
  @scala.inline
  def apply(
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    URL: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createDataDescriptor: () => XPropertySet,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    rename: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DatabaseDocument = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), rename = js.Any.fromFunction1(rename), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DatabaseDocument]
  }
  
  @scala.inline
  implicit class DatabaseDocumentMutableBuilder[Self <: DatabaseDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
