package typings.aureliaPal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Feature extends js.Object {
  /**
    * Does the runtime environment support native HTMLTemplateElement?
    */
  var htmlTemplateElement: Boolean = js.native
  /**
    * Does the runtime environment support native DOM mutation observers?
    */
  var mutationObserver: Boolean = js.native
  /**
    * Does the runtime environment support the css scoped attribute?
    */
  var scopedCSS: Boolean = js.native
  /**
    * Does the runtime environment support ShadowDOM?
    */
  var shadowDOM: Boolean = js.native
}

object Feature {
  @scala.inline
  def apply(htmlTemplateElement: Boolean, mutationObserver: Boolean, scopedCSS: Boolean, shadowDOM: Boolean): Feature = {
    val __obj = js.Dynamic.literal(htmlTemplateElement = htmlTemplateElement.asInstanceOf[js.Any], mutationObserver = mutationObserver.asInstanceOf[js.Any], scopedCSS = scopedCSS.asInstanceOf[js.Any], shadowDOM = shadowDOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  @scala.inline
  implicit class FeatureOps[Self <: Feature] (val x: Self) extends AnyVal {
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
    def setHtmlTemplateElement(value: Boolean): Self = this.set("htmlTemplateElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setMutationObserver(value: Boolean): Self = this.set("mutationObserver", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopedCSS(value: Boolean): Self = this.set("scopedCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadowDOM(value: Boolean): Self = this.set("shadowDOM", value.asInstanceOf[js.Any])
  }
  
}

