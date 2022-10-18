package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stages extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var item: js.UndefOr[ListOfStage] = js.undefined
}
object Stages {
  
  inline def apply(): Stages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stages]
  }
  
  extension [Self <: Stages](x: Self) {
    
    inline def setItem(value: ListOfStage): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: Stage*): Self = StObject.set(x, "item", js.Array(value*))
  }
}
