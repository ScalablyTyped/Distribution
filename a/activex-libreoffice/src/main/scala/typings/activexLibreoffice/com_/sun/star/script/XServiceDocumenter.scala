package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.com_.sun.star.lang.XServiceInfo
import typings.activexLibreoffice.com_.sun.star.lang.XTypeProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides documentation for UNO services
  * @since LibreOffice 5.1
  */
@js.native
trait XServiceDocumenter extends js.Object {
  
  var CoreBaseUrl: String = js.native
  
  var ServiceBaseUrl: String = js.native
  
  def showCoreDocs(xService: XServiceInfo): Unit = js.native
  
  def showInterfaceDocs(xTypeProvider: XTypeProvider): Unit = js.native
  
  def showServiceDocs(xService: XServiceInfo): Unit = js.native
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
    val __obj = js.Dynamic.literal(CoreBaseUrl = CoreBaseUrl.asInstanceOf[js.Any], ServiceBaseUrl = ServiceBaseUrl.asInstanceOf[js.Any], showCoreDocs = js.Any.fromFunction1(showCoreDocs), showInterfaceDocs = js.Any.fromFunction1(showInterfaceDocs), showServiceDocs = js.Any.fromFunction1(showServiceDocs))
    __obj.asInstanceOf[XServiceDocumenter]
  }
  
  @scala.inline
  implicit class XServiceDocumenterOps[Self <: XServiceDocumenter] (val x: Self) extends AnyVal {
    
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
    def setCoreBaseUrl(value: String): Self = this.set("CoreBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceBaseUrl(value: String): Self = this.set("ServiceBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCoreDocs(value: XServiceInfo => Unit): Self = this.set("showCoreDocs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowInterfaceDocs(value: XTypeProvider => Unit): Self = this.set("showInterfaceDocs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowServiceDocs(value: XServiceInfo => Unit): Self = this.set("showServiceDocs", js.Any.fromFunction1(value))
  }
}
