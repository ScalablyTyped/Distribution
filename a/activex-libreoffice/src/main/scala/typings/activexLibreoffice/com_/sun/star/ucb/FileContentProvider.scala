package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The File {@link Content} Provider (FCP) implements a {@link ContentProvider} for the {@link UniversalContentBroker} (UCB).
  *
  * The served contents enable access to the local file system.
  *
  * The FCP is able to restrict access to the local file system to a number of directories shown to the client under configurable alias names.
  * @see com.sun.star.ucb.Content
  */
trait FileContentProvider
  extends StObject
     with XContentProvider
     with XContentIdentifierFactory
     with XPropertySet
     with XFileIdentifierConverter
object FileContentProvider {
  
  inline def apply(
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => Double,
    createContentIdentifier: String => XContentIdentifier,
    getFileProviderLocality: String => Double,
    getFileURLFromSystemPath: (String, String) => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    getSystemPathFromFileURL: String => String,
    queryContent: XContentIdentifier => XContent,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, Any) => Unit
  ): FileContentProvider = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), compareContentIds = js.Any.fromFunction2(compareContentIds), createContentIdentifier = js.Any.fromFunction1(createContentIdentifier), getFileProviderLocality = js.Any.fromFunction1(getFileProviderLocality), getFileURLFromSystemPath = js.Any.fromFunction2(getFileURLFromSystemPath), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSystemPathFromFileURL = js.Any.fromFunction1(getSystemPathFromFileURL), queryContent = js.Any.fromFunction1(queryContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[FileContentProvider]
  }
}
