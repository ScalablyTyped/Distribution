package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryStagePlanNode extends StObject {
  
  /**
    * Stage plan information such as name, identifier, sub plans, and remote sources of child plan nodes/
    */
  var Children: js.UndefOr[QueryStagePlanNodes] = js.undefined
  
  /**
    * Information about the operation this query stage plan node is performing.
    */
  var Identifier: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the query stage plan that describes the operation this stage is performing as part of query execution.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * Source plan node IDs.
    */
  var RemoteSources: js.UndefOr[StringList] = js.undefined
}
object QueryStagePlanNode {
  
  inline def apply(): QueryStagePlanNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStagePlanNode]
  }
  
  extension [Self <: QueryStagePlanNode](x: Self) {
    
    inline def setChildren(value: QueryStagePlanNodes): Self = StObject.set(x, "Children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "Children", js.undefined)
    
    inline def setChildrenVarargs(value: QueryStagePlanNode*): Self = StObject.set(x, "Children", js.Array(value*))
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRemoteSources(value: StringList): Self = StObject.set(x, "RemoteSources", value.asInstanceOf[js.Any])
    
    inline def setRemoteSourcesUndefined: Self = StObject.set(x, "RemoteSources", js.undefined)
    
    inline def setRemoteSourcesVarargs(value: String*): Self = StObject.set(x, "RemoteSources", js.Array(value*))
  }
}
