package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableClassSummary extends StObject {
  
  /**
    * The date and time at which the table class was last updated.
    */
  var LastUpdateDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The table class of the specified table. Valid values are STANDARD and STANDARD_INFREQUENT_ACCESS.
    */
  var TableClass: js.UndefOr[typings.awsSdk.clientsDynamodbMod.TableClass] = js.undefined
}
object TableClassSummary {
  
  inline def apply(): TableClassSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableClassSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableClassSummary] (val x: Self) extends AnyVal {
    
    inline def setLastUpdateDateTime(value: js.Date): Self = StObject.set(x, "LastUpdateDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateTimeUndefined: Self = StObject.set(x, "LastUpdateDateTime", js.undefined)
    
    inline def setTableClass(value: TableClass): Self = StObject.set(x, "TableClass", value.asInstanceOf[js.Any])
    
    inline def setTableClassUndefined: Self = StObject.set(x, "TableClass", js.undefined)
  }
}
