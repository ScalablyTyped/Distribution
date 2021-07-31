package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeNotifier
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfoChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfoChangeNotifier
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A {@link FTPContent} provides an object representing either a (ftp-server-side) directory object allowing listing of children or a content object
  * providing access to a (ftp-server-side) file.
  * @see com.sun.star.ucb.FTPContentProvider
  * @since OOo 1.1.2
  */
trait FTPContent
  extends StObject
     with XComponent
     with XContent
     with XContentCreator
     with XCommandProcessor
     with XPropertiesChangeNotifier
     with XPropertyContainer
     with XPropertySetInfoChangeNotifier
     with XCommandInfoChangeNotifier
     with XChild
object FTPContent {
  
  @scala.inline
  def apply(
    ContentType: String,
    Identifier: XContentIdentifier,
    Parent: XInterface,
    abort: Double => Unit,
    acquire: () => Unit,
    addCommandInfoChangeListener: XCommandInfoChangeListener => Unit,
    addContentEventListener: XContentEventListener => Unit,
    addEventListener: XEventListener => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addProperty: (String, Double, js.Any) => Unit,
    addPropertySetInfoChangeListener: XPropertySetInfoChangeListener => Unit,
    createCommandIdentifier: () => Double,
    createNewContent: ContentInfo => XContent,
    dispose: () => Unit,
    execute: (Command, Double, XCommandEnvironment) => js.Any,
    getContentType: () => String,
    getIdentifier: () => XContentIdentifier,
    getParent: () => XInterface,
    queryCreatableContentsInfo: () => SafeArray[ContentInfo],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeCommandInfoChangeListener: XCommandInfoChangeListener => Unit,
    removeContentEventListener: XContentEventListener => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    removeProperty: String => Unit,
    removePropertySetInfoChangeListener: XPropertySetInfoChangeListener => Unit,
    setParent: XInterface => Unit
  ): FTPContent = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], abort = js.Any.fromFunction1(abort), acquire = js.Any.fromFunction0(acquire), addCommandInfoChangeListener = js.Any.fromFunction1(addCommandInfoChangeListener), addContentEventListener = js.Any.fromFunction1(addContentEventListener), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addProperty = js.Any.fromFunction3(addProperty), addPropertySetInfoChangeListener = js.Any.fromFunction1(addPropertySetInfoChangeListener), createCommandIdentifier = js.Any.fromFunction0(createCommandIdentifier), createNewContent = js.Any.fromFunction1(createNewContent), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction3(execute), getContentType = js.Any.fromFunction0(getContentType), getIdentifier = js.Any.fromFunction0(getIdentifier), getParent = js.Any.fromFunction0(getParent), queryCreatableContentsInfo = js.Any.fromFunction0(queryCreatableContentsInfo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCommandInfoChangeListener = js.Any.fromFunction1(removeCommandInfoChangeListener), removeContentEventListener = js.Any.fromFunction1(removeContentEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction2(removePropertiesChangeListener), removeProperty = js.Any.fromFunction1(removeProperty), removePropertySetInfoChangeListener = js.Any.fromFunction1(removePropertySetInfoChangeListener), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[FTPContent]
  }
}
