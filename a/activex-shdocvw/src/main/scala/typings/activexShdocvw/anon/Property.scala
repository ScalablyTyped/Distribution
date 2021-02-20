package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Property extends StObject {
  
  val Property: String = js.native
}
object Property {
  
  @scala.inline
  def apply(Property: String): Property = {
    val __obj = js.Dynamic.literal(Property = Property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  
  @scala.inline
  implicit class PropertyMutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
  }
}
