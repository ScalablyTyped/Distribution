package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceItem extends StObject {
  
  /**
    * The reference's ARN.
    */
  var referenceArn: js.UndefOr[ReferenceArn] = js.undefined
}
object ReferenceItem {
  
  inline def apply(): ReferenceItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceItem] (val x: Self) extends AnyVal {
    
    inline def setReferenceArn(value: ReferenceArn): Self = StObject.set(x, "referenceArn", value.asInstanceOf[js.Any])
    
    inline def setReferenceArnUndefined: Self = StObject.set(x, "referenceArn", js.undefined)
  }
}
