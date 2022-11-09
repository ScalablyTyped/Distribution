package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludedProperty extends StObject {
  
  /**
    * The name of the property that is included in this view. You can specify the following property names for this field:    Tags   
    */
  var Name: IncludedPropertyNameString
}
object IncludedProperty {
  
  inline def apply(Name: IncludedPropertyNameString): IncludedProperty = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludedProperty]
  }
  
  extension [Self <: IncludedProperty](x: Self) {
    
    inline def setName(value: IncludedPropertyNameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
