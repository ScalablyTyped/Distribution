package typings.angularCore.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A logical node which comprise into `LView`s.
  *
  */
trait DebugNode2 extends StObject {
  
  /**
    * Child nodes
    */
  var children: js.Array[DebugNode2]
  
  /**
    * A list of Component/Directive types which need to be instantiated an this location.
    */
  var factories: js.Array[Type[Any]]
  
  /**
    * HTML representation of the node.
    */
  var html: String | Null
  
  /**
    * NodeInjector information.
    */
  var injector: NodeInjectorDebug
  
  /**
    * Injector resolution path.
    */
  var injectorResolutionPath: Any
  
  /**
    * A list of Component/Directive instances which were instantiated an this location.
    */
  var instances: js.Array[Any]
  
  /**
    * DOM native node.
    */
  var native: Node
  
  /**
    * Associated `TNode`
    */
  var tNode: TNode
  
  /**
    * Human readable node type.
    */
  var `type`: String
}
object DebugNode2 {
  
  inline def apply(
    children: js.Array[DebugNode2],
    factories: js.Array[Type[Any]],
    injector: NodeInjectorDebug,
    injectorResolutionPath: Any,
    instances: js.Array[Any],
    native: Node,
    tNode: TNode,
    `type`: String
  ): DebugNode2 = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], factories = factories.asInstanceOf[js.Any], injector = injector.asInstanceOf[js.Any], injectorResolutionPath = injectorResolutionPath.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], tNode = tNode.asInstanceOf[js.Any], html = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugNode2]
  }
  
  extension [Self <: DebugNode2](x: Self) {
    
    inline def setChildren(value: js.Array[DebugNode2]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: DebugNode2*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setFactories(value: js.Array[Type[Any]]): Self = StObject.set(x, "factories", value.asInstanceOf[js.Any])
    
    inline def setFactoriesVarargs(value: Type[Any]*): Self = StObject.set(x, "factories", js.Array(value*))
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlNull: Self = StObject.set(x, "html", null)
    
    inline def setInjector(value: NodeInjectorDebug): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
    
    inline def setInjectorResolutionPath(value: Any): Self = StObject.set(x, "injectorResolutionPath", value.asInstanceOf[js.Any])
    
    inline def setInstances(value: js.Array[Any]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesVarargs(value: Any*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setNative(value: Node): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setTNode(value: TNode): Self = StObject.set(x, "tNode", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
