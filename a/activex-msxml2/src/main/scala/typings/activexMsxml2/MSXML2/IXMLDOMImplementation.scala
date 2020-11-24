package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXMLDOMImplementation extends js.Object {
  
  @JSName("MSXML2.IXMLDOMImplementation_typekey")
  var MSXML2DotIXMLDOMImplementation_typekey: IXMLDOMImplementation = js.native
  
  def hasFeature(feature: String, version: String): Boolean = js.native
}
object IXMLDOMImplementation {
  
  @scala.inline
  def apply(
    MSXML2DotIXMLDOMImplementation_typekey: IXMLDOMImplementation,
    hasFeature: (String, String) => Boolean
  ): IXMLDOMImplementation = {
    val __obj = js.Dynamic.literal(hasFeature = js.Any.fromFunction2(hasFeature))
    __obj.updateDynamic("MSXML2.IXMLDOMImplementation_typekey")(MSXML2DotIXMLDOMImplementation_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXMLDOMImplementation]
  }
  
  @scala.inline
  implicit class IXMLDOMImplementationOps[Self <: IXMLDOMImplementation] (val x: Self) extends AnyVal {
    
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
    def setMSXML2DotIXMLDOMImplementation_typekey(value: IXMLDOMImplementation): Self = this.set("MSXML2.IXMLDOMImplementation_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasFeature(value: (String, String) => Boolean): Self = this.set("hasFeature", js.Any.fromFunction2(value))
  }
}
