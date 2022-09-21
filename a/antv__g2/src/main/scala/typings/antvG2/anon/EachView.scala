package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EachView extends StObject {
  
  var eachView: Any
  
  var fields: js.Array[Any]
  
  var padding: Double
  
  var showTitle: Boolean
  
  var spacing: js.Array[Double]
}
object EachView {
  
  inline def apply(
    eachView: Any,
    fields: js.Array[Any],
    padding: Double,
    showTitle: Boolean,
    spacing: js.Array[Double]
  ): EachView = {
    val __obj = js.Dynamic.literal(eachView = eachView.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[EachView]
  }
  
  extension [Self <: EachView](x: Self) {
    
    inline def setEachView(value: Any): Self = StObject.set(x, "eachView", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: Any*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: js.Array[Double]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingVarargs(value: Double*): Self = StObject.set(x, "spacing", js.Array(value*))
  }
}
