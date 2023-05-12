package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgForOf extends StObject {
  
  var ngForOf: `10`
  
  var ngForTemplate: `12`
  
  var ngForTrackBy: `11`
}
object NgForOf {
  
  inline def apply(ngForOf: `10`, ngForTemplate: `12`, ngForTrackBy: `11`): NgForOf = {
    val __obj = js.Dynamic.literal(ngForOf = ngForOf.asInstanceOf[js.Any], ngForTemplate = ngForTemplate.asInstanceOf[js.Any], ngForTrackBy = ngForTrackBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgForOf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NgForOf] (val x: Self) extends AnyVal {
    
    inline def setNgForOf(value: `10`): Self = StObject.set(x, "ngForOf", value.asInstanceOf[js.Any])
    
    inline def setNgForTemplate(value: `12`): Self = StObject.set(x, "ngForTemplate", value.asInstanceOf[js.Any])
    
    inline def setNgForTrackBy(value: `11`): Self = StObject.set(x, "ngForTrackBy", value.asInstanceOf[js.Any])
  }
}
