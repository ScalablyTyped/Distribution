package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldPosition extends StObject {
  
  /**
    * The field position is below the field specified by the string.
    */
  var below: js.UndefOr[String] = js.undefined
  
  /**
    * The field position is fixed and doesn't change in relation to other fields.
    */
  var fixed: js.UndefOr[FixedPosition] = js.undefined
  
  /**
    * The field position is to the right of the field specified by the string.
    */
  var rightOf: js.UndefOr[String] = js.undefined
}
object FieldPosition {
  
  inline def apply(): FieldPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldPosition]
  }
  
  extension [Self <: FieldPosition](x: Self) {
    
    inline def setBelow(value: String): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
    
    inline def setBelowUndefined: Self = StObject.set(x, "below", js.undefined)
    
    inline def setFixed(value: FixedPosition): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setRightOf(value: String): Self = StObject.set(x, "rightOf", value.asInstanceOf[js.Any])
    
    inline def setRightOfUndefined: Self = StObject.set(x, "rightOf", js.undefined)
  }
}
