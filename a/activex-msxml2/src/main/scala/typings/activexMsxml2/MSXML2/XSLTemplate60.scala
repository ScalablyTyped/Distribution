package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** XSL Stylesheet Cache 6.0 */
@js.native
trait XSLTemplate60 extends StObject {
  
  @JSName("MSXML2.XSLTemplate60_typekey")
  var MSXML2DotXSLTemplate60_typekey: XSLTemplate60 = js.native
  
  /** create a new processor object */
  def createProcessor(): IXSLProcessor = js.native
  
  /** stylesheet to use with processors */
  var stylesheet: IXMLDOMNode = js.native
}
object XSLTemplate60 {
  
  @scala.inline
  def apply(
    MSXML2DotXSLTemplate60_typekey: XSLTemplate60,
    createProcessor: () => IXSLProcessor,
    stylesheet: IXMLDOMNode
  ): XSLTemplate60 = {
    val __obj = js.Dynamic.literal(createProcessor = js.Any.fromFunction0(createProcessor), stylesheet = stylesheet.asInstanceOf[js.Any])
    __obj.updateDynamic("MSXML2.XSLTemplate60_typekey")(MSXML2DotXSLTemplate60_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XSLTemplate60]
  }
  
  @scala.inline
  implicit class XSLTemplate60MutableBuilder[Self <: XSLTemplate60] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateProcessor(value: () => IXSLProcessor): Self = StObject.set(x, "createProcessor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMSXML2DotXSLTemplate60_typekey(value: XSLTemplate60): Self = StObject.set(x, "MSXML2.XSLTemplate60_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesheet(value: IXMLDOMNode): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
  }
}
