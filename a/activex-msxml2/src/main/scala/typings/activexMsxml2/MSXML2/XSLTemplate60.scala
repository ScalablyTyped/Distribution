package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** XSL Stylesheet Cache 6.0 */
trait XSLTemplate60 extends js.Object {
  @JSName("MSXML2.XSLTemplate60_typekey")
  var MSXML2DotXSLTemplate60_typekey: XSLTemplate60
  /** stylesheet to use with processors */
  var stylesheet: IXMLDOMNode
  /** create a new processor object */
  def createProcessor(): IXSLProcessor
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
}

