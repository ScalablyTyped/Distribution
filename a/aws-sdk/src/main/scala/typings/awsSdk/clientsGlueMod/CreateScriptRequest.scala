package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateScriptRequest extends StObject {
  
  /**
    * A list of the edges in the DAG.
    */
  var DagEdges: js.UndefOr[typings.awsSdk.clientsGlueMod.DagEdges] = js.undefined
  
  /**
    * A list of the nodes in the DAG.
    */
  var DagNodes: js.UndefOr[typings.awsSdk.clientsGlueMod.DagNodes] = js.undefined
  
  /**
    * The programming language of the resulting code from the DAG.
    */
  var Language: js.UndefOr[typings.awsSdk.clientsGlueMod.Language] = js.undefined
}
object CreateScriptRequest {
  
  inline def apply(): CreateScriptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateScriptRequest]
  }
  
  extension [Self <: CreateScriptRequest](x: Self) {
    
    inline def setDagEdges(value: DagEdges): Self = StObject.set(x, "DagEdges", value.asInstanceOf[js.Any])
    
    inline def setDagEdgesUndefined: Self = StObject.set(x, "DagEdges", js.undefined)
    
    inline def setDagEdgesVarargs(value: CodeGenEdge*): Self = StObject.set(x, "DagEdges", js.Array(value*))
    
    inline def setDagNodes(value: DagNodes): Self = StObject.set(x, "DagNodes", value.asInstanceOf[js.Any])
    
    inline def setDagNodesUndefined: Self = StObject.set(x, "DagNodes", js.undefined)
    
    inline def setDagNodesVarargs(value: CodeGenNode*): Self = StObject.set(x, "DagNodes", js.Array(value*))
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "Language", js.undefined)
  }
}
