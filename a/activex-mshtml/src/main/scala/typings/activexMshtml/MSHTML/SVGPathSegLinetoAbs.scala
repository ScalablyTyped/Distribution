package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegLinetoAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegLinetoAbs_typekey")
  var MSHTMLDotSVGPathSegLinetoAbs_typekey: SVGPathSegLinetoAbs = js.native
  var pathSegType: Double = js.native
  val pathSegTypeAsLetter: String = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SVGPathSegLinetoAbs {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegLinetoAbs_typekey: SVGPathSegLinetoAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegLinetoAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoAbs_typekey")(MSHTMLDotSVGPathSegLinetoAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoAbs]
  }
  @scala.inline
  implicit class SVGPathSegLinetoAbsOps[Self <: SVGPathSegLinetoAbs] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGPathSegLinetoAbs_typekey(value: SVGPathSegLinetoAbs): Self = this.set("MSHTML.SVGPathSegLinetoAbs_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathSegType(value: Double): Self = this.set("pathSegType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = this.set("pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

