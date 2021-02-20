package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSegLinetoVerticalRel extends StObject {
  
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
  implicit class SVGPathSegLinetoVerticalRelMutableBuilder[Self <: SVGPathSegLinetoVerticalRel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotSVGPathSegLinetoVerticalRel_typekey(value: SVGPathSegLinetoVerticalRel): Self = StObject.set(x, "MSHTML.SVGPathSegLinetoVerticalRel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
