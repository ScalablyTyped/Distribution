package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetValue extends StObject {
  
  /**
    * Link to the asset object.
    */
  var Href: js.UndefOr[String] = js.undefined
}
object AssetValue {
  
  inline def apply(): AssetValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetValue] (val x: Self) extends AnyVal {
    
    inline def setHref(value: String): Self = StObject.set(x, "Href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "Href", js.undefined)
  }
}
