package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LFResourceDetails extends StObject {
  
  /**
    * Details about the database resource included in the AWS Lake Formation data permission.
    */
  var Database: js.UndefOr[DatabaseLFTagPolicy] = js.undefined
  
  /**
    * Details about the table resource included in the AWS Lake Formation data permission.
    */
  var Table: js.UndefOr[TableLFTagPolicy] = js.undefined
}
object LFResourceDetails {
  
  inline def apply(): LFResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LFResourceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LFResourceDetails] (val x: Self) extends AnyVal {
    
    inline def setDatabase(value: DatabaseLFTagPolicy): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
    
    inline def setTable(value: TableLFTagPolicy): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
  }
}
