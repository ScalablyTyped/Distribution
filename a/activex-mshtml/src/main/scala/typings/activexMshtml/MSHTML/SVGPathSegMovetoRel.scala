package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSegMovetoRel extends StObject {
  
  @JSName("MSHTML.SVGPathSegMovetoRel_typekey")
  var MSHTMLDotSVGPathSegMovetoRel_typekey: SVGPathSegMovetoRel = js.native
  
  var pathSegType: Double = js.native
  
  val pathSegTypeAsLetter: String = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object SVGPathSegMovetoRel {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegMovetoRel_typekey: SVGPathSegMovetoRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegMovetoRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegMovetoRel_typekey")(MSHTMLDotSVGPathSegMovetoRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegMovetoRel]
  }
  
  @scala.inline
  implicit class SVGPathSegMovetoRelMutableBuilder[Self <: SVGPathSegMovetoRel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotSVGPathSegMovetoRel_typekey(value: SVGPathSegMovetoRel): Self = StObject.set(x, "MSHTML.SVGPathSegMovetoRel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
