package typings.aureliaPal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  /**
    * Does the runtime environment support native HTMLTemplateElement?
    */
  var htmlTemplateElement: Boolean
  /**
    * Does the runtime environment support native DOM mutation observers?
    */
  var mutationObserver: Boolean
  /**
    * Does the runtime environment support the css scoped attribute?
    */
  var scopedCSS: Boolean
  /**
    * Does the runtime environment support ShadowDOM?
    */
  var shadowDOM: Boolean
}

object Feature {
  @scala.inline
  def apply(htmlTemplateElement: Boolean, mutationObserver: Boolean, scopedCSS: Boolean, shadowDOM: Boolean): Feature = {
    val __obj = js.Dynamic.literal(htmlTemplateElement = htmlTemplateElement.asInstanceOf[js.Any], mutationObserver = mutationObserver.asInstanceOf[js.Any], scopedCSS = scopedCSS.asInstanceOf[js.Any], shadowDOM = shadowDOM.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Feature]
  }
}

