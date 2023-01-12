package typings.adobeAioLibAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var expansion: Any
  
  var locale: Any
  
  var segmentable: Any
}
object Locale {
  
  inline def apply(expansion: Any, locale: Any, segmentable: Any): Locale = {
    val __obj = js.Dynamic.literal(expansion = expansion.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], segmentable = segmentable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
    
    inline def setExpansion(value: Any): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setSegmentable(value: Any): Self = StObject.set(x, "segmentable", value.asInstanceOf[js.Any])
  }
}
