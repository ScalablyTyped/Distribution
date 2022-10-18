package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schema extends StObject {
  
  /**
    * An array of attributes specifying the name and type of each field in a dataset.
    */
  var Attributes: js.UndefOr[SchemaAttributes] = js.undefined
}
object Schema {
  
  inline def apply(): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schema]
  }
  
  extension [Self <: Schema](x: Self) {
    
    inline def setAttributes(value: SchemaAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: SchemaAttribute*): Self = StObject.set(x, "Attributes", js.Array(value*))
  }
}
