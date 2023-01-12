package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unauthenticated extends StObject {
  
  /**
    * 
    Specifies whether you want to turn on or turn off unauthenticated traffic to your cluster.
    
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
}
object Unauthenticated {
  
  inline def apply(): Unauthenticated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Unauthenticated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Unauthenticated] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
