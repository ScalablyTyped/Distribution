package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalDetail extends StObject {
  
  /**
    * The information type.
    */
  var AdditionalDetailType: js.UndefOr[String] = js.undefined
  
  /**
    * The path component.
    */
  var Component: js.UndefOr[AnalysisComponent] = js.undefined
}
object AdditionalDetail {
  
  inline def apply(): AdditionalDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalDetail] (val x: Self) extends AnyVal {
    
    inline def setAdditionalDetailType(value: String): Self = StObject.set(x, "AdditionalDetailType", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDetailTypeUndefined: Self = StObject.set(x, "AdditionalDetailType", js.undefined)
    
    inline def setComponent(value: AnalysisComponent): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
  }
}
