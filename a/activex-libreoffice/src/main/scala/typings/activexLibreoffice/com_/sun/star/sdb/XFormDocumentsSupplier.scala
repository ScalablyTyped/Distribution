package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the access to a container of database forms.
  * @see Forms
  */
@js.native
trait XFormDocumentsSupplier extends XInterface {
  
  /**
    * returns the container of forms.
    * @returns the form documents
    * @see Forms
    */
  val FormDocuments: XNameAccess = js.native
  
  /**
    * returns the container of forms.
    * @returns the form documents
    * @see Forms
    */
  def getFormDocuments(): XNameAccess = js.native
}
object XFormDocumentsSupplier {
  
  @scala.inline
  def apply(
    FormDocuments: XNameAccess,
    acquire: () => Unit,
    getFormDocuments: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFormDocumentsSupplier = {
    val __obj = js.Dynamic.literal(FormDocuments = FormDocuments.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFormDocuments = js.Any.fromFunction0(getFormDocuments), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFormDocumentsSupplier]
  }
  
  @scala.inline
  implicit class XFormDocumentsSupplierOps[Self <: XFormDocumentsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormDocuments(value: XNameAccess): Self = this.set("FormDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFormDocuments(value: () => XNameAccess): Self = this.set("getFormDocuments", js.Any.fromFunction0(value))
  }
}
