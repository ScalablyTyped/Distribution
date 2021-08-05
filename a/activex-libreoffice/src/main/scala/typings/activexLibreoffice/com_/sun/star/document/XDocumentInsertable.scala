package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to import a document from a given URL into this document. */
trait XDocumentInsertable
  extends StObject
     with XInterface {
  
  /** inserts the document that is specified by the URL. */
  def insertDocumentFromURL(aURL: String, aOptions: SeqEquiv[PropertyValue]): Unit
}
object XDocumentInsertable {
  
  inline def apply(
    acquire: () => Unit,
    insertDocumentFromURL: (String, SeqEquiv[PropertyValue]) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDocumentInsertable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), insertDocumentFromURL = js.Any.fromFunction2(insertDocumentFromURL), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDocumentInsertable]
  }
  
  extension [Self <: XDocumentInsertable](x: Self) {
    
    inline def setInsertDocumentFromURL(value: (String, SeqEquiv[PropertyValue]) => Unit): Self = StObject.set(x, "insertDocumentFromURL", js.Any.fromFunction2(value))
  }
}
