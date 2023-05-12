package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The event pattern.
    */
  var Pattern: js.UndefOr[EventPattern] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    inline def setPattern(value: EventPattern): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "Pattern", js.undefined)
  }
}
