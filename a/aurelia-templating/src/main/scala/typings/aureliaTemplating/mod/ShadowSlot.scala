package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "ShadowSlot")
@js.native
class ShadowSlot () extends StObject {
  def this(anchor: js.Any) = this()
  def this(anchor: js.Any, name: js.Any) = this()
  def this(anchor: Unit, name: js.Any) = this()
  def this(anchor: js.Any, name: js.Any, fallbackFactory: js.Any) = this()
  def this(anchor: js.Any, name: Unit, fallbackFactory: js.Any) = this()
  def this(anchor: Unit, name: js.Any, fallbackFactory: js.Any) = this()
  def this(anchor: Unit, name: Unit, fallbackFactory: js.Any) = this()
  
  /**
    * @param {View} view
    * @param {Node} node
    * @param {ViewSlot} projectionSource
    * @param {number} index
    * @param {string} destination
    */
  def addNode(): js.Any = js.native
  def addNode(view: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: js.Any, projectionSource: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: js.Any, projectionSource: js.Any, index: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: js.Any, projectionSource: js.Any, index: js.Any, destination: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: js.Any, projectionSource: js.Any, index: Unit, destination: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: js.Any, projectionSource: Unit, index: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: js.Any, projectionSource: Unit, index: js.Any, destination: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: js.Any, projectionSource: Unit, index: Unit, destination: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: Unit, projectionSource: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: Unit, projectionSource: js.Any, index: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: Unit, projectionSource: js.Any, index: js.Any, destination: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: Unit, projectionSource: js.Any, index: Unit, destination: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: Unit, projectionSource: Unit, index: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: Unit, projectionSource: Unit, index: js.Any, destination: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: Unit, projectionSource: Unit, index: Unit, destination: js.Any): js.Any = js.native
  def addNode(view: Unit, node: js.Any): js.Any = js.native
  def addNode(view: Unit, node: js.Any, projectionSource: js.Any): js.Any = js.native
  def addNode(view: Unit, node: js.Any, projectionSource: js.Any, index: js.Any): js.Any = js.native
  def addNode(view: Unit, node: js.Any, projectionSource: js.Any, index: js.Any, destination: js.Any): js.Any = js.native
  def addNode(view: Unit, node: js.Any, projectionSource: js.Any, index: Unit, destination: js.Any): js.Any = js.native
  def addNode(view: Unit, node: js.Any, projectionSource: Unit, index: js.Any): js.Any = js.native
  def addNode(view: Unit, node: js.Any, projectionSource: Unit, index: js.Any, destination: js.Any): js.Any = js.native
  def addNode(view: Unit, node: js.Any, projectionSource: Unit, index: Unit, destination: js.Any): js.Any = js.native
  def addNode(view: Unit, node: Unit, projectionSource: js.Any): js.Any = js.native
  def addNode(view: Unit, node: Unit, projectionSource: js.Any, index: js.Any): js.Any = js.native
  def addNode(view: Unit, node: Unit, projectionSource: js.Any, index: js.Any, destination: js.Any): js.Any = js.native
  def addNode(view: Unit, node: Unit, projectionSource: js.Any, index: Unit, destination: js.Any): js.Any = js.native
  def addNode(view: Unit, node: Unit, projectionSource: Unit, index: js.Any): js.Any = js.native
  def addNode(view: Unit, node: Unit, projectionSource: Unit, index: js.Any, destination: js.Any): js.Any = js.native
  def addNode(view: Unit, node: Unit, projectionSource: Unit, index: Unit, destination: js.Any): js.Any = js.native
  
  def attached(): js.Any = js.native
  
  /**
    * @param {View} view
    */
  def bind(): js.Any = js.native
  def bind(view: js.Any): js.Any = js.native
  
  /**
    * @param {View} ownerView
    */
  def created(): js.Any = js.native
  def created(ownerView: js.Any): js.Any = js.native
  
  def detached(): js.Any = js.native
  
  var needsFallbackRendering: js.Any = js.native
  
  /**
    * @param {View} view
    * @param {ViewSlot} projectionSource
    */
  def projectFrom(): js.Any = js.native
  def projectFrom(view: js.Any): js.Any = js.native
  def projectFrom(view: js.Any, projectionSource: js.Any): js.Any = js.native
  def projectFrom(view: Unit, projectionSource: js.Any): js.Any = js.native
  
  /**
    * @param {Record<string, ShadowSlot | PassThroughSlot>} slots
    */
  def projectTo(): js.Any = js.native
  def projectTo(slots: js.Any): js.Any = js.native
  
  /**
    * @param {ViewSlot} projectionSource
    */
  def removeAll(): js.Any = js.native
  def removeAll(projectionSource: js.Any): js.Any = js.native
  
  /**
    * @param {View} view
    * @param {ViewSlot} projectionSource
    */
  def removeView(): js.Any = js.native
  def removeView(view: js.Any): js.Any = js.native
  def removeView(view: js.Any, projectionSource: js.Any): js.Any = js.native
  def removeView(view: Unit, projectionSource: js.Any): js.Any = js.native
  
  /**
    * @param {View} view
    * @param {Node[]} nodes
    * @param {ViewSlot} projectionSource
    * @param {number} index
    */
  def renderFallbackContent(): js.Any = js.native
  def renderFallbackContent(view: js.Any): js.Any = js.native
  def renderFallbackContent(view: js.Any, nodes: js.Any): js.Any = js.native
  def renderFallbackContent(view: js.Any, nodes: js.Any, projectionSource: js.Any): js.Any = js.native
  def renderFallbackContent(view: js.Any, nodes: js.Any, projectionSource: js.Any, index: js.Any): js.Any = js.native
  def renderFallbackContent(view: js.Any, nodes: js.Any, projectionSource: Unit, index: js.Any): js.Any = js.native
  def renderFallbackContent(view: js.Any, nodes: Unit, projectionSource: js.Any): js.Any = js.native
  def renderFallbackContent(view: js.Any, nodes: Unit, projectionSource: js.Any, index: js.Any): js.Any = js.native
  def renderFallbackContent(view: js.Any, nodes: Unit, projectionSource: Unit, index: js.Any): js.Any = js.native
  def renderFallbackContent(view: Unit, nodes: js.Any): js.Any = js.native
  def renderFallbackContent(view: Unit, nodes: js.Any, projectionSource: js.Any): js.Any = js.native
  def renderFallbackContent(view: Unit, nodes: js.Any, projectionSource: js.Any, index: js.Any): js.Any = js.native
  def renderFallbackContent(view: Unit, nodes: js.Any, projectionSource: Unit, index: js.Any): js.Any = js.native
  def renderFallbackContent(view: Unit, nodes: Unit, projectionSource: js.Any): js.Any = js.native
  def renderFallbackContent(view: Unit, nodes: Unit, projectionSource: js.Any, index: js.Any): js.Any = js.native
  def renderFallbackContent(view: Unit, nodes: Unit, projectionSource: Unit, index: js.Any): js.Any = js.native
  
  def unbind(): js.Any = js.native
}
