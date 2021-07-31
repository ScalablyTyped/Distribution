package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAnalyzer extends StObject {
  
  def isStandardSvgAttribute(nodeName: String, attributeName: String): Boolean
}
object SVGAnalyzer {
  
  @scala.inline
  def apply(isStandardSvgAttribute: (String, String) => Boolean): SVGAnalyzer = {
    val __obj = js.Dynamic.literal(isStandardSvgAttribute = js.Any.fromFunction2(isStandardSvgAttribute))
    __obj.asInstanceOf[SVGAnalyzer]
  }
  
  @scala.inline
  implicit class SVGAnalyzerMutableBuilder[Self <: SVGAnalyzer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsStandardSvgAttribute(value: (String, String) => Boolean): Self = StObject.set(x, "isStandardSvgAttribute", js.Any.fromFunction2(value))
  }
}
