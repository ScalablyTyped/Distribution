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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("htmlTemplateElement")(htmlTemplateElement)
    __obj.updateDynamic("mutationObserver")(mutationObserver)
    __obj.updateDynamic("scopedCSS")(scopedCSS)
    __obj.updateDynamic("shadowDOM")(shadowDOM)
    __obj.asInstanceOf[Feature]
  }
}

