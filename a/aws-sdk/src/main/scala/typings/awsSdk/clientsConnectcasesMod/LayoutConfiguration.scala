package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutConfiguration extends StObject {
  
  /**
    *  Unique identifier of a layout. 
    */
  var defaultLayout: js.UndefOr[LayoutId] = js.undefined
}
object LayoutConfiguration {
  
  inline def apply(): LayoutConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutConfiguration]
  }
  
  extension [Self <: LayoutConfiguration](x: Self) {
    
    inline def setDefaultLayout(value: LayoutId): Self = StObject.set(x, "defaultLayout", value.asInstanceOf[js.Any])
    
    inline def setDefaultLayoutUndefined: Self = StObject.set(x, "defaultLayout", js.undefined)
  }
}
