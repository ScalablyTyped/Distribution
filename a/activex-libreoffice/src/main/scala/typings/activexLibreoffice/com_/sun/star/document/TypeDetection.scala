package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.container.XContainerQuery
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.util.XFlushListener
import typings.activexLibreoffice.com_.sun.star.util.XFlushable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * encapsulate a type detection service and provide read/write access on it's configuration data.
  *
  * It's possible to make a "flat" detection which may use internal configuration data only - or a "deep" detection which use special {@link
  * ExtendedTypeDetection} services to look into the document stream. Last mode can be suppressed to perform the operation. Of course the results can't be
  * guaranteed then. (e.g. in case the extension was changed)
  */
@js.native
trait TypeDetection
  extends XNameContainer
     with XTypeDetection
     with XContainerQuery
     with XFlushable

object TypeDetection {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    addFlushListener: XFlushListener => Unit,
    createSubSetEnumerationByProperties: SeqEquiv[NamedValue] => XEnumeration,
    createSubSetEnumerationByQuery: String => XEnumeration,
    flush: () => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertByName: (String, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    queryTypeByDescriptor: (js.Array[SeqEquiv[PropertyValue]], Boolean) => String,
    queryTypeByURL: String => String,
    release: () => Unit,
    removeByName: String => Unit,
    removeFlushListener: XFlushListener => Unit,
    replaceByName: (String, js.Any) => Unit
  ): TypeDetection = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addFlushListener = js.Any.fromFunction1(addFlushListener), createSubSetEnumerationByProperties = js.Any.fromFunction1(createSubSetEnumerationByProperties), createSubSetEnumerationByQuery = js.Any.fromFunction1(createSubSetEnumerationByQuery), flush = js.Any.fromFunction0(flush), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertByName = js.Any.fromFunction2(insertByName), queryInterface = js.Any.fromFunction1(queryInterface), queryTypeByDescriptor = js.Any.fromFunction2(queryTypeByDescriptor), queryTypeByURL = js.Any.fromFunction1(queryTypeByURL), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), removeFlushListener = js.Any.fromFunction1(removeFlushListener), replaceByName = js.Any.fromFunction2(replaceByName))
    __obj.asInstanceOf[TypeDetection]
  }
}

