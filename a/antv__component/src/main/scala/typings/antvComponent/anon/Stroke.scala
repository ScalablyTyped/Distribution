package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stroke extends StObject {
  
  var lineWidth: Double = js.native
  
  var stroke: String = js.native
}
object Stroke {
  
  @scala.inline
  def apply(lineWidth: Double, stroke: String): Stroke = {
    val __obj = js.Dynamic.literal(lineWidth = lineWidth.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stroke]
  }
  
  @scala.inline
  implicit class StrokeMutableBuilder[Self <: Stroke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
  }
}
