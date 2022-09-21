package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the access to a container of database forms.
  * @see Forms
  */
trait XFormDocumentsSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the container of forms.
    * @returns the form documents
    * @see Forms
    */
  val FormDocuments: XNameAccess
  
  /**
    * returns the container of forms.
    * @returns the form documents
    * @see Forms
    */
  def getFormDocuments(): XNameAccess
}
object XFormDocumentsSupplier {
  
  inline def apply(
    FormDocuments: XNameAccess,
    acquire: () => Unit,
    getFormDocuments: () => XNameAccess,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XFormDocumentsSupplier = {
    val __obj = js.Dynamic.literal(FormDocuments = FormDocuments.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFormDocuments = js.Any.fromFunction0(getFormDocuments), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFormDocumentsSupplier]
  }
  
  extension [Self <: XFormDocumentsSupplier](x: Self) {
    
    inline def setFormDocuments(value: XNameAccess): Self = StObject.set(x, "FormDocuments", value.asInstanceOf[js.Any])
    
    inline def setGetFormDocuments(value: () => XNameAccess): Self = StObject.set(x, "getFormDocuments", js.Any.fromFunction0(value))
  }
}
