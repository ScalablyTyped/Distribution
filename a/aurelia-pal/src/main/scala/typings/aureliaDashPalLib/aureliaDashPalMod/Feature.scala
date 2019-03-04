package typings
package aureliaDashPalLib.aureliaDashPalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  /**
    * Does the runtime environment support native HTMLTemplateElement?
    */
  var htmlTemplateElement: scala.Boolean
  /**
    * Does the runtime environment support native DOM mutation observers?
    */
  var mutationObserver: scala.Boolean
  /**
    * Does the runtime environment support the css scoped attribute?
    */
  var scopedCSS: scala.Boolean
  /**
    * Does the runtime environment support ShadowDOM?
    */
  var shadowDOM: scala.Boolean
}

object Feature {
  @scala.inline
  def apply(
    htmlTemplateElement: scala.Boolean,
    mutationObserver: scala.Boolean,
    scopedCSS: scala.Boolean,
    shadowDOM: scala.Boolean
  ): Feature = {
    val __obj = js.Dynamic.literal(htmlTemplateElement = htmlTemplateElement, mutationObserver = mutationObserver, scopedCSS = scopedCSS, shadowDOM = shadowDOM)
  
    __obj.asInstanceOf[Feature]
  }
}

