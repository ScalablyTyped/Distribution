package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXMLDOMImplementation extends js.Object {
  @JSName("MSXML2.IXMLDOMImplementation_typekey")
  var MSXML2DotIXMLDOMImplementation_typekey: IXMLDOMImplementation
  def hasFeature(feature: String, version: String): Boolean
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
}

