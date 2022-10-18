package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datatype extends StObject {
  
  /**
    * The datatype of the value.
    */
  var Id: GenericLimitedString
  
  /**
    * A label assigned to the datatype.
    */
  var Label: GenericLimitedString
}
object Datatype {
  
  inline def apply(Id: GenericLimitedString, Label: GenericLimitedString): Datatype = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datatype]
  }
  
  extension [Self <: Datatype](x: Self) {
    
    inline def setId(value: GenericLimitedString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: GenericLimitedString): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
  }
}
