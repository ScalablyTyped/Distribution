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
  def apply(isStandardSvgAttribute: js.Function2[java.lang.String, java.lang.String, scala.Boolean]): SVGAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isStandardSvgAttribute")(isStandardSvgAttribute)
    __obj.asInstanceOf[SVGAnalyzer]
  }
}

