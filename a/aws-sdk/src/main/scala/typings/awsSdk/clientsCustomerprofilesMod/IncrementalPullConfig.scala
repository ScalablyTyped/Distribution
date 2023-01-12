package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncrementalPullConfig extends StObject {
  
  /**
    * A field that specifies the date time or timestamp field as the criteria to use when importing incremental records from the source.
    */
  var DatetimeTypeFieldName: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.DatetimeTypeFieldName] = js.undefined
}
object IncrementalPullConfig {
  
  inline def apply(): IncrementalPullConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncrementalPullConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncrementalPullConfig] (val x: Self) extends AnyVal {
    
    inline def setDatetimeTypeFieldName(value: DatetimeTypeFieldName): Self = StObject.set(x, "DatetimeTypeFieldName", value.asInstanceOf[js.Any])
    
    inline def setDatetimeTypeFieldNameUndefined: Self = StObject.set(x, "DatetimeTypeFieldName", js.undefined)
  }
}
