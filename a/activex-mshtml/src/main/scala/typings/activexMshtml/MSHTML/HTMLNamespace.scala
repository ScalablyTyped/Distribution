package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLNamespace extends StObject {
  
  @JSName("MSHTML.HTMLNamespace_typekey")
  var MSHTMLDotHTMLNamespace_typekey: HTMLNamespace = js.native
  
  def attachEvent(event: String, pdisp: js.Any): Boolean = js.native
  
  val constructor: js.Any = js.native
  
  def detachEvent(event: String, pdisp: js.Any): Unit = js.native
  
  def doImport(bstrImplementationUrl: String): Unit = js.native
  
  val name: String = js.native
  
  var onreadystatechange: js.Any = js.native
  
  val readyState: js.Any = js.native
  
  val tagNames: js.Any = js.native
  
  val urn: String = js.native
}
object HTMLNamespace {
  
  @scala.inline
  def apply(
    MSHTMLDotHTMLNamespace_typekey: HTMLNamespace,
    attachEvent: (String, js.Any) => Boolean,
    constructor: js.Any,
    detachEvent: (String, js.Any) => Unit,
    doImport: String => Unit,
    name: String,
    onreadystatechange: js.Any,
    readyState: js.Any,
    tagNames: js.Any,
    urn: String
  ): HTMLNamespace = {
    val __obj = js.Dynamic.literal(attachEvent = js.Any.fromFunction2(attachEvent), constructor = constructor.asInstanceOf[js.Any], detachEvent = js.Any.fromFunction2(detachEvent), doImport = js.Any.fromFunction1(doImport), name = name.asInstanceOf[js.Any], onreadystatechange = onreadystatechange.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], tagNames = tagNames.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLNamespace_typekey")(MSHTMLDotHTMLNamespace_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLNamespace]
  }
  
  @scala.inline
  implicit class HTMLNamespaceMutableBuilder[Self <: HTMLNamespace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachEvent(value: (String, js.Any) => Boolean): Self = StObject.set(x, "attachEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConstructor(value: js.Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachEvent(value: (String, js.Any) => Unit): Self = StObject.set(x, "detachEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoImport(value: String => Unit): Self = StObject.set(x, "doImport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMSHTMLDotHTMLNamespace_typekey(value: HTMLNamespace): Self = StObject.set(x, "MSHTML.HTMLNamespace_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnreadystatechange(value: js.Any): Self = StObject.set(x, "onreadystatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyState(value: js.Any): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNames(value: js.Any): Self = StObject.set(x, "tagNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrn(value: String): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
  }
}
