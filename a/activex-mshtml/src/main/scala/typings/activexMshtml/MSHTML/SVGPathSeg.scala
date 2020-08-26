package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSeg extends js.Object {
  @JSName("MSHTML.SVGPathSeg_typekey")
  var MSHTMLDotSVGPathSeg_typekey: SVGPathSeg = js.native
  var pathSegType: Double = js.native
  val pathSegTypeAsLetter: String = js.native
}

object SVGPathSeg {
  @scala.inline
  def apply(MSHTMLDotSVGPathSeg_typekey: SVGPathSeg, pathSegType: Double, pathSegTypeAsLetter: String): SVGPathSeg = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSeg_typekey")(MSHTMLDotSVGPathSeg_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSeg]
  }
  @scala.inline
  implicit class SVGPathSegOps[Self <: SVGPathSeg] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGPathSeg_typekey(value: SVGPathSeg): Self = this.set("MSHTML.SVGPathSeg_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathSegType(value: Double): Self = this.set("pathSegType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = this.set("pathSegTypeAsLetter", value.asInstanceOf[js.Any])
  }
  
}

