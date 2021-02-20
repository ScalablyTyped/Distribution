package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the access to a container of database reports.
  * @see Reports
  */
@js.native
trait XReportDocumentsSupplier extends XInterface {
  
  /**
    * returns the container of reports.
    * @returns the report documents
    * @see Reports
    */
  val ReportDocuments: XNameAccess = js.native
  
  /**
    * returns the container of reports.
    * @returns the report documents
    * @see Reports
    */
  def getReportDocuments(): XNameAccess = js.native
}
object XReportDocumentsSupplier {
  
  @scala.inline
  def apply(
    ReportDocuments: XNameAccess,
    acquire: () => Unit,
    getReportDocuments: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XReportDocumentsSupplier = {
    val __obj = js.Dynamic.literal(ReportDocuments = ReportDocuments.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getReportDocuments = js.Any.fromFunction0(getReportDocuments), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XReportDocumentsSupplier]
  }
  
  @scala.inline
  implicit class XReportDocumentsSupplierMutableBuilder[Self <: XReportDocumentsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetReportDocuments(value: () => XNameAccess): Self = StObject.set(x, "getReportDocuments", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReportDocuments(value: XNameAccess): Self = StObject.set(x, "ReportDocuments", value.asInstanceOf[js.Any])
  }
}
