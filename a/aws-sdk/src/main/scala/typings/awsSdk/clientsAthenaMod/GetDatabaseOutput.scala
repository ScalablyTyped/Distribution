package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatabaseOutput extends StObject {
  
  /**
    * The database returned.
    */
  var Database: js.UndefOr[typings.awsSdk.clientsAthenaMod.Database] = js.undefined
}
object GetDatabaseOutput {
  
  inline def apply(): GetDatabaseOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatabaseOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDatabaseOutput] (val x: Self) extends AnyVal {
    
    inline def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
  }
}
