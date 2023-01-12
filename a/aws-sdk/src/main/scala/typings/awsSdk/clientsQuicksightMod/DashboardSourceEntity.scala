package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardSourceEntity extends StObject {
  
  /**
    * Source template.
    */
  var SourceTemplate: js.UndefOr[DashboardSourceTemplate] = js.undefined
}
object DashboardSourceEntity {
  
  inline def apply(): DashboardSourceEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardSourceEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DashboardSourceEntity] (val x: Self) extends AnyVal {
    
    inline def setSourceTemplate(value: DashboardSourceTemplate): Self = StObject.set(x, "SourceTemplate", value.asInstanceOf[js.Any])
    
    inline def setSourceTemplateUndefined: Self = StObject.set(x, "SourceTemplate", js.undefined)
  }
}
