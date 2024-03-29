package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimension extends StObject {
  
  /**
    * The name of the dimension. Dimension names must contain only ASCII characters, must include at least one non-whitespace character, and cannot start with a colon (:). ASCII control characters are not supported as part of dimension names.
    */
  var Name: DimensionName
  
  /**
    * The value of the dimension. Dimension values must contain only ASCII characters and must include at least one non-whitespace character. ASCII control characters are not supported as part of dimension values.
    */
  var Value: DimensionValue
}
object Dimension {
  
  inline def apply(Name: DimensionName, Value: DimensionValue): Dimension = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
    
    inline def setName(value: DimensionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DimensionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
