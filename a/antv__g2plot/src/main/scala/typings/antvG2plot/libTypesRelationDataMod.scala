package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesRelationDataMod {
  
  trait Link extends StObject {
    
    val source: Double
    
    val target: Double
    
    val value: Double
  }
  object Link {
    
    inline def apply(source: Double, target: Double, value: Double): Link = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node extends StObject {
    
    val id: Double
    
    val name: String
  }
  object Node {
    
    inline def apply(id: Double, name: String): Node = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeLinkData extends StObject {
    
    val links: js.Array[Link]
    
    val nodes: js.Array[Node]
  }
  object NodeLinkData {
    
    inline def apply(links: js.Array[Link], nodes: js.Array[Node]): NodeLinkData = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeLinkData]
    }
    
    extension [Self <: NodeLinkData](x: Self) {
      
      inline def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
}
