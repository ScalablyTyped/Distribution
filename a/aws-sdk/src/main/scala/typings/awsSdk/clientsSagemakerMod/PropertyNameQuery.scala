package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyNameQuery extends StObject {
  
  /**
    * Text that begins a property's name.
    */
  var PropertyNameHint: typings.awsSdk.clientsSagemakerMod.PropertyNameHint
}
object PropertyNameQuery {
  
  inline def apply(PropertyNameHint: PropertyNameHint): PropertyNameQuery = {
    val __obj = js.Dynamic.literal(PropertyNameHint = PropertyNameHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyNameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyNameQuery] (val x: Self) extends AnyVal {
    
    inline def setPropertyNameHint(value: PropertyNameHint): Self = StObject.set(x, "PropertyNameHint", value.asInstanceOf[js.Any])
  }
}
