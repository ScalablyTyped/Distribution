package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.collapsed
import typings.arcgisJsApi.arcgisJsApiStrings.expanded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupInputProperties
  extends StObject
     with InputBaseProperties {
  
  var state: js.UndefOr[expanded | collapsed] = js.undefined
}
object GroupInputProperties {
  
  inline def apply(): GroupInputProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupInputProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupInputProperties] (val x: Self) extends AnyVal {
    
    inline def setState(value: expanded | collapsed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
