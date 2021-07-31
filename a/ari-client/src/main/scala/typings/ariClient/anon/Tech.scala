package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tech extends StObject {
  
  var tech: String
}
object Tech {
  
  @scala.inline
  def apply(tech: String): Tech = {
    val __obj = js.Dynamic.literal(tech = tech.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tech]
  }
  
  @scala.inline
  implicit class TechMutableBuilder[Self <: Tech] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTech(value: String): Self = StObject.set(x, "tech", value.asInstanceOf[js.Any])
  }
}
