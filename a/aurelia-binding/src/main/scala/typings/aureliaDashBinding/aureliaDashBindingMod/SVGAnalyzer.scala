package typings.aureliaDashBinding.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnalyzer extends js.Object {
  def isStandardSvgAttribute(nodeName: String, attributeName: String): Boolean
}

object SVGAnalyzer {
  @scala.inline
  def apply(isStandardSvgAttribute: (String, String) => Boolean): SVGAnalyzer = {
    val __obj = js.Dynamic.literal(isStandardSvgAttribute = js.Any.fromFunction2(isStandardSvgAttribute))
  
    __obj.asInstanceOf[SVGAnalyzer]
  }
}

