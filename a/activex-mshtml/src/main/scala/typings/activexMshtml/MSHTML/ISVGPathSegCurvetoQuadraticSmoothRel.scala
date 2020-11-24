package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegCurvetoQuadraticSmoothRel extends js.Object {
  
  @JSName("MSHTML.ISVGPathSegCurvetoQuadraticSmoothRel_typekey")
  var MSHTMLDotISVGPathSegCurvetoQuadraticSmoothRel_typekey: ISVGPathSegCurvetoQuadraticSmoothRel = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object ISVGPathSegCurvetoQuadraticSmoothRel {
  
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoQuadraticSmoothRel_typekey: ISVGPathSegCurvetoQuadraticSmoothRel,
    x: Double,
    y: Double
  ): ISVGPathSegCurvetoQuadraticSmoothRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoQuadraticSmoothRel_typekey")(MSHTMLDotISVGPathSegCurvetoQuadraticSmoothRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoQuadraticSmoothRel]
  }
  
  @scala.inline
  implicit class ISVGPathSegCurvetoQuadraticSmoothRelOps[Self <: ISVGPathSegCurvetoQuadraticSmoothRel] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotISVGPathSegCurvetoQuadraticSmoothRel_typekey(value: ISVGPathSegCurvetoQuadraticSmoothRel): Self = this.set("MSHTML.ISVGPathSegCurvetoQuadraticSmoothRel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
