package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iam extends StObject {
  
  /**
    * 
    Indicates whether IAM access control is enabled.
    
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
}
object Iam {
  
  inline def apply(): Iam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Iam]
  }
  
  extension [Self <: Iam](x: Self) {
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
