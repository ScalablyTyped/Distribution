package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Weight extends StObject {
  
  var weight: Medium
}
object Weight {
  
  inline def apply(weight: Medium): Weight = {
    val __obj = js.Dynamic.literal(weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Weight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Weight] (val x: Self) extends AnyVal {
    
    inline def setWeight(value: Medium): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
