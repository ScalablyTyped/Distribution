package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncrementalPullConfig extends StObject {
  
  /**
    *  A field that specifies the date time or timestamp field as the criteria to use when importing incremental records from the source. 
    */
  var datetimeTypeFieldName: js.UndefOr[DatetimeTypeFieldName] = js.native
}
object IncrementalPullConfig {
  
  @scala.inline
  def apply(): IncrementalPullConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncrementalPullConfig]
  }
  
  @scala.inline
  implicit class IncrementalPullConfigMutableBuilder[Self <: IncrementalPullConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatetimeTypeFieldName(value: DatetimeTypeFieldName): Self = StObject.set(x, "datetimeTypeFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetimeTypeFieldNameUndefined: Self = StObject.set(x, "datetimeTypeFieldName", js.undefined)
  }
}
