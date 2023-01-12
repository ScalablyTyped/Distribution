package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyProductOutput extends StObject {
  
  /**
    * The token to use to track the progress of the operation.
    */
  var CopyProductToken: js.UndefOr[Id] = js.undefined
}
object CopyProductOutput {
  
  inline def apply(): CopyProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyProductOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyProductOutput] (val x: Self) extends AnyVal {
    
    inline def setCopyProductToken(value: Id): Self = StObject.set(x, "CopyProductToken", value.asInstanceOf[js.Any])
    
    inline def setCopyProductTokenUndefined: Self = StObject.set(x, "CopyProductToken", js.undefined)
  }
}
