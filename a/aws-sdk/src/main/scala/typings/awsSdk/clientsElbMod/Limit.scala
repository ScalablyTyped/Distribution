package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Limit extends StObject {
  
  /**
    * The maximum value of the limit.
    */
  var Max: js.UndefOr[typings.awsSdk.clientsElbMod.Max] = js.undefined
  
  /**
    * The name of the limit. The possible values are:   classic-listeners   classic-load-balancers   classic-registered-instances  
    */
  var Name: js.UndefOr[typings.awsSdk.clientsElbMod.Name] = js.undefined
}
object Limit {
  
  inline def apply(): Limit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Limit]
  }
  
  extension [Self <: Limit](x: Self) {
    
    inline def setMax(value: Max): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
