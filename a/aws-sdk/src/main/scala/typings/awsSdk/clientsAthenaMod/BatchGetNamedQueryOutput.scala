package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetNamedQueryOutput extends StObject {
  
  /**
    * Information about the named query IDs submitted.
    */
  var NamedQueries: js.UndefOr[NamedQueryList] = js.undefined
  
  /**
    * Information about provided query IDs.
    */
  var UnprocessedNamedQueryIds: js.UndefOr[UnprocessedNamedQueryIdList] = js.undefined
}
object BatchGetNamedQueryOutput {
  
  inline def apply(): BatchGetNamedQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetNamedQueryOutput]
  }
  
  extension [Self <: BatchGetNamedQueryOutput](x: Self) {
    
    inline def setNamedQueries(value: NamedQueryList): Self = StObject.set(x, "NamedQueries", value.asInstanceOf[js.Any])
    
    inline def setNamedQueriesUndefined: Self = StObject.set(x, "NamedQueries", js.undefined)
    
    inline def setNamedQueriesVarargs(value: NamedQuery*): Self = StObject.set(x, "NamedQueries", js.Array(value*))
    
    inline def setUnprocessedNamedQueryIds(value: UnprocessedNamedQueryIdList): Self = StObject.set(x, "UnprocessedNamedQueryIds", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedNamedQueryIdsUndefined: Self = StObject.set(x, "UnprocessedNamedQueryIds", js.undefined)
    
    inline def setUnprocessedNamedQueryIdsVarargs(value: UnprocessedNamedQueryId*): Self = StObject.set(x, "UnprocessedNamedQueryIds", js.Array(value*))
  }
}
