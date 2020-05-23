package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a set of properties to describe the style for rendering connector. */
trait ConnectorProperties extends js.Object {
  /** This property contains the kind of the connector. */
  var EdgeKind: ConnectorType
  /** This property contains the horizontal distance of node 1. */
  var EdgeNode1HorzDist: Double
  /** This property contains the vertical distance of node 1. */
  var EdgeNode1VertDist: Double
  /** This property contains the horizontal distance of node 2. */
  var EdgeNode2HorzDist: Double
  /** This property contains the vertical distance of node 2. */
  var EdgeNode2VertDist: Double
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
}

