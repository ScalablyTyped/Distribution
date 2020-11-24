package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegCurvetoQuadraticRel extends js.Object {
  
  @JSName("MSHTML.ISVGPathSegCurvetoQuadraticRel_typekey")
  var MSHTMLDotISVGPathSegCurvetoQuadraticRel_typekey: ISVGPathSegCurvetoQuadraticRel = js.native
  
  var x: Double = js.native
  
  var x1: Double = js.native
  
  var y: Double = js.native
  
  var y1: Double = js.native
}
object ISVGPathSegCurvetoQuadraticRel {
  
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoQuadraticRel_typekey: ISVGPathSegCurvetoQuadraticRel,
    x: Double,
    x1: Double,
    y: Double,
    y1: Double
  ): ISVGPathSegCurvetoQuadraticRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoQuadraticRel_typekey")(MSHTMLDotISVGPathSegCurvetoQuadraticRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoQuadraticRel]
  }
  
  @scala.inline
  implicit class ISVGPathSegCurvetoQuadraticRelOps[Self <: ISVGPathSegCurvetoQuadraticRel] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotISVGPathSegCurvetoQuadraticRel_typekey(value: ISVGPathSegCurvetoQuadraticRel): Self = this.set("MSHTML.ISVGPathSegCurvetoQuadraticRel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
  }
}
