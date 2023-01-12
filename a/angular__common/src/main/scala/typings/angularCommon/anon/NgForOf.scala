package typings.angularCommon.anon

import typings.angularCommon.angularCommonStrings.ngForOf
import typings.angularCommon.angularCommonStrings.ngForTemplate
import typings.angularCommon.angularCommonStrings.ngForTrackBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgForOf extends StObject {
  
  var ngForOf: typings.angularCommon.angularCommonStrings.ngForOf
  
  var ngForTemplate: typings.angularCommon.angularCommonStrings.ngForTemplate
  
  var ngForTrackBy: typings.angularCommon.angularCommonStrings.ngForTrackBy
}
object NgForOf {
  
  inline def apply(): NgForOf = {
    val __obj = js.Dynamic.literal(ngForOf = "ngForOf", ngForTemplate = "ngForTemplate", ngForTrackBy = "ngForTrackBy")
    __obj.asInstanceOf[NgForOf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NgForOf] (val x: Self) extends AnyVal {
    
    inline def setNgForOf(value: ngForOf): Self = StObject.set(x, "ngForOf", value.asInstanceOf[js.Any])
    
    inline def setNgForTemplate(value: ngForTemplate): Self = StObject.set(x, "ngForTemplate", value.asInstanceOf[js.Any])
    
    inline def setNgForTrackBy(value: ngForTrackBy): Self = StObject.set(x, "ngForTrackBy", value.asInstanceOf[js.Any])
  }
}
