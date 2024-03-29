package typings.awsLambda.triggerSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SESMailHeader extends StObject {
  
  var name: String
  
  var value: String
}
object SESMailHeader {
  
  inline def apply(name: String, value: String): SESMailHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SESMailHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SESMailHeader] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
