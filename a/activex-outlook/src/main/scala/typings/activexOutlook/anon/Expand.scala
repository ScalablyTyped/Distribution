package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expand extends StObject {
  
  val Expand: Boolean
}
object Expand {
  
  inline def apply(Expand: Boolean): Expand = {
    val __obj = js.Dynamic.literal(Expand = Expand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expand]
  }
  
  extension [Self <: Expand](x: Self) {
    
    inline def setExpand(value: Boolean): Self = StObject.set(x, "Expand", value.asInstanceOf[js.Any])
  }
}
