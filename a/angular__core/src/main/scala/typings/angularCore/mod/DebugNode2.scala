package typings.angularCore.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A logical node which comprise into `LView`s.
  *
  */
@js.native
trait DebugNode2 extends StObject {
  
  /**
    * Child nodes
    */
  var children: js.Array[DebugNode2] = js.native
  
  /**
    * A list of Component/Directive types which need to be instantiated an this location.
    */
  var factories: js.Array[typings.angularCore.mod.Type[_]] = js.native
  
  /**
    * HTML representation of the node.
    */
  var html: String | Null = js.native
  
  /**
    * NodeInjector information.
    */
  var injector: NodeInjectorDebug = js.native
  
  /**
    * A list of Component/Directive instances which were instantiated an this location.
    */
  var instances: js.Array[_] = js.native
  
  /**
    * DOM native node.
    */
  var native: Node = js.native
  
  /**
    * Human readable node type.
    */
  var `type`: String = js.native
}
object DebugNode2 {
  
  @scala.inline
  def apply(
    children: js.Array[DebugNode2],
    factories: js.Array[typings.angularCore.mod.Type[_]],
    injector: NodeInjectorDebug,
    instances: js.Array[_],
    native: Node,
    `type`: String
  ): DebugNode2 = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], factories = factories.asInstanceOf[js.Any], injector = injector.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugNode2]
  }
  
  @scala.inline
  implicit class DebugNode2MutableBuilder[Self <: DebugNode2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[DebugNode2]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: DebugNode2*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setFactories(value: js.Array[typings.angularCore.mod.Type[_]]): Self = StObject.set(x, "factories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactoriesVarargs(value: typings.angularCore.mod.Type[js.Any]*): Self = StObject.set(x, "factories", js.Array(value :_*))
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlNull: Self = StObject.set(x, "html", null)
    
    @scala.inline
    def setInjector(value: NodeInjectorDebug): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstances(value: js.Array[_]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesVarargs(value: js.Any*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    @scala.inline
    def setNative(value: Node): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
