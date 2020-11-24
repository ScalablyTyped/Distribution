package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a set of properties to describe the style for rendering connector. */
@js.native
trait ConnectorProperties extends js.Object {
  
  /** This property contains the kind of the connector. */
  var EdgeKind: ConnectorType = js.native
  
  /** This property contains the horizontal distance of node 1. */
  var EdgeNode1HorzDist: Double = js.native
  
  /** This property contains the vertical distance of node 1. */
  var EdgeNode1VertDist: Double = js.native
  
  /** This property contains the horizontal distance of node 2. */
  var EdgeNode2HorzDist: Double = js.native
  
  /** This property contains the vertical distance of node 2. */
  var EdgeNode2VertDist: Double = js.native
}
object ConnectorProperties {
  
  @scala.inline
  def apply(
    EdgeKind: ConnectorType,
    EdgeNode1HorzDist: Double,
    EdgeNode1VertDist: Double,
    EdgeNode2HorzDist: Double,
    EdgeNode2VertDist: Double
  ): ConnectorProperties = {
    val __obj = js.Dynamic.literal(EdgeKind = EdgeKind.asInstanceOf[js.Any], EdgeNode1HorzDist = EdgeNode1HorzDist.asInstanceOf[js.Any], EdgeNode1VertDist = EdgeNode1VertDist.asInstanceOf[js.Any], EdgeNode2HorzDist = EdgeNode2HorzDist.asInstanceOf[js.Any], EdgeNode2VertDist = EdgeNode2VertDist.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorProperties]
  }
  
  @scala.inline
  implicit class ConnectorPropertiesOps[Self <: ConnectorProperties] (val x: Self) extends AnyVal {
    
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
    def setEdgeKind(value: ConnectorType): Self = this.set("EdgeKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeNode1HorzDist(value: Double): Self = this.set("EdgeNode1HorzDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeNode1VertDist(value: Double): Self = this.set("EdgeNode1VertDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeNode2HorzDist(value: Double): Self = this.set("EdgeNode2HorzDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeNode2VertDist(value: Double): Self = this.set("EdgeNode2VertDist", value.asInstanceOf[js.Any])
  }
}
