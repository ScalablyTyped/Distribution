package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnalyzer extends js.Object {
  def isStandardSvgAttribute(nodeName: java.lang.String, attributeName: java.lang.String): scala.Boolean
}

object SVGAnalyzer {
  @scala.inline
  def apply(isStandardSvgAttribute: (java.lang.String, java.lang.String) => scala.Boolean): SVGAnalyzer = {
    val __obj = js.Dynamic.literal(isStandardSvgAttribute = js.Any.fromFunction2(isStandardSvgAttribute))
  
    __obj.asInstanceOf[SVGAnalyzer]
  }
}

