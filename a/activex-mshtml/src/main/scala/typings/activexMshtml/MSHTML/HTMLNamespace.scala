package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLNamespace extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLNamespace_typekey")
  var MSHTMLDotHTMLNamespace_typekey: HTMLNamespace
  
  def attachEvent(event: String, pdisp: Any): Boolean
  
  val constructor: Any
  
  def detachEvent(event: String, pdisp: Any): Unit
  
  def doImport(bstrImplementationUrl: String): Unit
  
  val name: String
  
  var onreadystatechange: Any
  
  val readyState: Any
  
  val tagNames: Any
  
  val urn: String
}
object HTMLNamespace {
  
  inline def apply(
    MSHTMLDotHTMLNamespace_typekey: HTMLNamespace,
    attachEvent: (String, Any) => Boolean,
    constructor: Any,
    detachEvent: (String, Any) => Unit,
    doImport: String => Unit,
    name: String,
    onreadystatechange: Any,
    readyState: Any,
    tagNames: Any,
    urn: String
  ): HTMLNamespace = {
    val __obj = js.Dynamic.literal(attachEvent = js.Any.fromFunction2(attachEvent), constructor = constructor.asInstanceOf[js.Any], detachEvent = js.Any.fromFunction2(detachEvent), doImport = js.Any.fromFunction1(doImport), name = name.asInstanceOf[js.Any], onreadystatechange = onreadystatechange.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], tagNames = tagNames.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLNamespace_typekey")(MSHTMLDotHTMLNamespace_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLNamespace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLNamespace] (val x: Self) extends AnyVal {
    
    inline def setAttachEvent(value: (String, Any) => Boolean): Self = StObject.set(x, "attachEvent", js.Any.fromFunction2(value))
    
    inline def setConstructor(value: Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setDetachEvent(value: (String, Any) => Unit): Self = StObject.set(x, "detachEvent", js.Any.fromFunction2(value))
    
    inline def setDoImport(value: String => Unit): Self = StObject.set(x, "doImport", js.Any.fromFunction1(value))
    
    inline def setMSHTMLDotHTMLNamespace_typekey(value: HTMLNamespace): Self = StObject.set(x, "MSHTML.HTMLNamespace_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnreadystatechange(value: Any): Self = StObject.set(x, "onreadystatechange", value.asInstanceOf[js.Any])
    
    inline def setReadyState(value: Any): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
    
    inline def setTagNames(value: Any): Self = StObject.set(x, "tagNames", value.asInstanceOf[js.Any])
    
    inline def setUrn(value: String): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
  }
}
