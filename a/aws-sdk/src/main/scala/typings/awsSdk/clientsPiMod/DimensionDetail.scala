package typings.awsSdk.clientsPiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionDetail extends StObject {
  
  /**
    * The identifier of a dimension.
    */
  var Identifier: js.UndefOr[String] = js.undefined
}
object DimensionDetail {
  
  inline def apply(): DimensionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionDetail] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
  }
}
