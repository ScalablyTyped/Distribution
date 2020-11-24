package typings.angularCore.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A logical node which comprise into `LView`s.
  *
  */
@js.native
trait DebugNode2 extends js.Object {
  
  /**
    * Child nodes
    */
  var children: js.Array[DebugNode2] = js.native
  
  /**
    * A list of Component/Directive types which need to be instantiated an this location.
    */
  var factories: js.Array[Type[_]] = js.native
  
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
    factories: js.Array[Type[_]],
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
  implicit class DebugNode2Ops[Self <: DebugNode2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenVarargs(value: DebugNode2*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[DebugNode2]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactoriesVarargs(value: Type[js.Any]*): Self = this.set("factories", js.Array(value :_*))
    
    @scala.inline
    def setFactories(value: js.Array[Type[_]]): Self = this.set("factories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInjector(value: NodeInjectorDebug): Self = this.set("injector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesVarargs(value: js.Any*): Self = this.set("instances", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: js.Array[_]): Self = this.set("instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: Node): Self = this.set("native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlNull: Self = this.set("html", null)
  }
}
