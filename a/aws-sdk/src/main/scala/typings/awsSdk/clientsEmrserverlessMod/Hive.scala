package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hive extends StObject {
  
  /**
    * The query file for the Hive job run.
    */
  var initQueryFile: js.UndefOr[InitScriptPath] = js.undefined
  
  /**
    * The parameters for the Hive job run.
    */
  var parameters: js.UndefOr[HiveCliParameters] = js.undefined
  
  /**
    * The query for the Hive job run.
    */
  var query: Query
}
object Hive {
  
  inline def apply(query: Query): Hive = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hive] (val x: Self) extends AnyVal {
    
    inline def setInitQueryFile(value: InitScriptPath): Self = StObject.set(x, "initQueryFile", value.asInstanceOf[js.Any])
    
    inline def setInitQueryFileUndefined: Self = StObject.set(x, "initQueryFile", js.undefined)
    
    inline def setParameters(value: HiveCliParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
