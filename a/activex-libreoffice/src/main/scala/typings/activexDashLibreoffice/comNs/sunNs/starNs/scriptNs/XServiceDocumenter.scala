package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XServiceInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XTypeProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides documentation for UNO services
  * @since LibreOffice 5.1
  */
trait XServiceDocumenter extends js.Object {
  var CoreBaseUrl: String
  var ServiceBaseUrl: String
  def showCoreDocs(xService: XServiceInfo): Unit
  def showInterfaceDocs(xTypeProvider: XTypeProvider): Unit
  def showServiceDocs(xService: XServiceInfo): Unit
}

object XServiceDocumenter {
  @scala.inline
  def apply(
    CoreBaseUrl: String,
    ServiceBaseUrl: String,
    showCoreDocs: XServiceInfo => Unit,
    showInterfaceDocs: XTypeProvider => Unit,
    showServiceDocs: XServiceInfo => Unit
  ): XServiceDocumenter = {
    val __obj = js.Dynamic.literal(CoreBaseUrl = CoreBaseUrl, ServiceBaseUrl = ServiceBaseUrl, showCoreDocs = js.Any.fromFunction1(showCoreDocs), showInterfaceDocs = js.Any.fromFunction1(showInterfaceDocs), showServiceDocs = js.Any.fromFunction1(showServiceDocs))
  
    __obj.asInstanceOf[XServiceDocumenter]
  }
}

