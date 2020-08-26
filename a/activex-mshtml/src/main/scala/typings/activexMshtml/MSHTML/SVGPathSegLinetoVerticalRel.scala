package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegLinetoVerticalRel extends js.Object {
  @JSName("MSHTML.SVGPathSegLinetoVerticalRel_typekey")
  var MSHTMLDotSVGPathSegLinetoVerticalRel_typekey: SVGPathSegLinetoVerticalRel = js.native
  var pathSegType: Double = js.native
  val pathSegTypeAsLetter: String = js.native
  var y: Double = js.native
}

object SVGPathSegLinetoVerticalRel {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegLinetoVerticalRel_typekey: SVGPathSegLinetoVerticalRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    y: Double
  ): SVGPathSegLinetoVerticalRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoVerticalRel_typekey")(MSHTMLDotSVGPathSegLinetoVerticalRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoVerticalRel]
  }
  @scala.inline
  implicit class SVGPathSegLinetoVerticalRelOps[Self <: SVGPathSegLinetoVerticalRel] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGPathSegLinetoVerticalRel_typekey(value: SVGPathSegLinetoVerticalRel): Self = this.set("MSHTML.SVGPathSegLinetoVerticalRel_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathSegType(value: Double): Self = this.set("pathSegType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = this.set("pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

