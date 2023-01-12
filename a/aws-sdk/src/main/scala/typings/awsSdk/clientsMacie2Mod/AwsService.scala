package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsService extends StObject {
  
  /**
    * The name of the Amazon Web Service that performed the action.
    */
  var invokedBy: js.UndefOr[string] = js.undefined
}
object AwsService {
  
  inline def apply(): AwsService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsService] (val x: Self) extends AnyVal {
    
    inline def setInvokedBy(value: string): Self = StObject.set(x, "invokedBy", value.asInstanceOf[js.Any])
    
    inline def setInvokedByUndefined: Self = StObject.set(x, "invokedBy", js.undefined)
  }
}
