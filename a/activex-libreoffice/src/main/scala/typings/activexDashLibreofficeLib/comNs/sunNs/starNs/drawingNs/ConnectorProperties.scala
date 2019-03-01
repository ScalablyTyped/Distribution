package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a set of properties to describe the style for rendering connector. */
trait ConnectorProperties extends js.Object {
  /** This property contains the kind of the connector. */
  var EdgeKind: ConnectorType
  /** This property contains the horizontal distance of node 1. */
  var EdgeNode1HorzDist: scala.Double
  /** This property contains the vertical distance of node 1. */
  var EdgeNode1VertDist: scala.Double
  /** This property contains the horizontal distance of node 2. */
  var EdgeNode2HorzDist: scala.Double
  /** This property contains the vertical distance of node 2. */
  var EdgeNode2VertDist: scala.Double
}

object ConnectorProperties {
  @scala.inline
  def apply(
    EdgeKind: ConnectorType,
    EdgeNode1HorzDist: scala.Double,
    EdgeNode1VertDist: scala.Double,
    EdgeNode2HorzDist: scala.Double,
    EdgeNode2VertDist: scala.Double
  ): ConnectorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EdgeKind")(EdgeKind)
    __obj.updateDynamic("EdgeNode1HorzDist")(EdgeNode1HorzDist)
    __obj.updateDynamic("EdgeNode1VertDist")(EdgeNode1VertDist)
    __obj.updateDynamic("EdgeNode2HorzDist")(EdgeNode2HorzDist)
    __obj.updateDynamic("EdgeNode2VertDist")(EdgeNode2VertDist)
    __obj.asInstanceOf[ConnectorProperties]
  }
}

