package typings.adobeAioLibAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classifiable extends StObject {
  
  var classifiable: Any
  
  var expansion: Any
  
  var locale: Any
  
  var reportable: Any
  
  var segmentable: Any
}
object Classifiable {
  
  inline def apply(classifiable: Any, expansion: Any, locale: Any, reportable: Any, segmentable: Any): Classifiable = {
    val __obj = js.Dynamic.literal(classifiable = classifiable.asInstanceOf[js.Any], expansion = expansion.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], reportable = reportable.asInstanceOf[js.Any], segmentable = segmentable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifiable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Classifiable] (val x: Self) extends AnyVal {
    
    inline def setClassifiable(value: Any): Self = StObject.set(x, "classifiable", value.asInstanceOf[js.Any])
    
    inline def setExpansion(value: Any): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setReportable(value: Any): Self = StObject.set(x, "reportable", value.asInstanceOf[js.Any])
    
    inline def setSegmentable(value: Any): Self = StObject.set(x, "segmentable", value.asInstanceOf[js.Any])
  }
}
