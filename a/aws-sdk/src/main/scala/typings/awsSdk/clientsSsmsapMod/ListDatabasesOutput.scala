package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatabasesOutput extends StObject {
  
  /**
    * 
    */
  var Databases: js.UndefOr[DatabaseSummaryList] = js.undefined
  
  /**
    * 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmsapMod.NextToken] = js.undefined
}
object ListDatabasesOutput {
  
  inline def apply(): ListDatabasesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatabasesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDatabasesOutput] (val x: Self) extends AnyVal {
    
    inline def setDatabases(value: DatabaseSummaryList): Self = StObject.set(x, "Databases", value.asInstanceOf[js.Any])
    
    inline def setDatabasesUndefined: Self = StObject.set(x, "Databases", js.undefined)
    
    inline def setDatabasesVarargs(value: DatabaseSummary*): Self = StObject.set(x, "Databases", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
