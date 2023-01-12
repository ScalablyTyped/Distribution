package typings.amapJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Batch extends StObject {
  
  var batch: js.UndefOr[Boolean] = js.undefined
  
  var city: js.UndefOr[String] = js.undefined
  
  var extensions: js.UndefOr[String] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
}
object Batch {
  
  inline def apply(): Batch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Batch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Batch] (val x: Self) extends AnyVal {
    
    inline def setBatch(value: Boolean): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setExtensions(value: String): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
