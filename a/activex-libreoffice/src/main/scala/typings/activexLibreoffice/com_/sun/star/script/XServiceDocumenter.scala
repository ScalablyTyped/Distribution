package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.com_.sun.star.lang.XServiceInfo
import typings.activexLibreoffice.com_.sun.star.lang.XTypeProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides documentation for UNO services
  * @since LibreOffice 5.1
  */
@js.native
trait XServiceDocumenter extends StObject {
  
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
  implicit class XServiceDocumenterMutableBuilder[Self <: XServiceDocumenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoreBaseUrl(value: String): Self = StObject.set(x, "CoreBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceBaseUrl(value: String): Self = StObject.set(x, "ServiceBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCoreDocs(value: XServiceInfo => Unit): Self = StObject.set(x, "showCoreDocs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowInterfaceDocs(value: XTypeProvider => Unit): Self = StObject.set(x, "showInterfaceDocs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowServiceDocs(value: XServiceInfo => Unit): Self = StObject.set(x, "showServiceDocs", js.Any.fromFunction1(value))
  }
}
