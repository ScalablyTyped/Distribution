package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsePath extends StObject {
  
  var parsePath: js.Any = js.native
  
  var parsePoint: js.Any = js.native
  
  var parsePoints: js.Any = js.native
}
object ParsePath {
  
  @scala.inline
  def apply(parsePath: js.Any, parsePoint: js.Any, parsePoints: js.Any): ParsePath = {
    val __obj = js.Dynamic.literal(parsePath = parsePath.asInstanceOf[js.Any], parsePoint = parsePoint.asInstanceOf[js.Any], parsePoints = parsePoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsePath]
  }
  
  @scala.inline
  implicit class ParsePathMutableBuilder[Self <: ParsePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParsePath(value: js.Any): Self = StObject.set(x, "parsePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsePoint(value: js.Any): Self = StObject.set(x, "parsePoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsePoints(value: js.Any): Self = StObject.set(x, "parsePoints", value.asInstanceOf[js.Any])
  }
}
