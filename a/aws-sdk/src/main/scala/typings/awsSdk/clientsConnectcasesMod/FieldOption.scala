package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldOption extends StObject {
  
  /**
    * Describes whether the FieldOption is active (displayed) or inactive.
    */
  var active: Boolean
  
  /**
    *  FieldOptionName has max length 100 and disallows trailing spaces.
    */
  var name: FieldOptionName
  
  /**
    *  FieldOptionValue has max length 100 and must be alphanumeric with hyphens and underscores.
    */
  var value: FieldOptionValue
}
object FieldOption {
  
  inline def apply(active: Boolean, name: FieldOptionName, value: FieldOptionValue): FieldOption = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOption]
  }
  
  extension [Self <: FieldOption](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setName(value: FieldOptionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FieldOptionValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
