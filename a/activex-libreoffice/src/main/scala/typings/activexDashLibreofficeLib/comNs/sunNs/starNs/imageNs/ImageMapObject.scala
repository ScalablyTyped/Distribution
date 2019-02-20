package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.imageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this is a base service for objects inside a image maps.
  * @see ImageMap
  * @see ImageMapRectangleObject
  * @see ImageMapCircleObject
  * @see ImageMapPolygonObject
  */
trait ImageMapObject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventsSupplier {
  /** This is an optional description text for the link. */
  var Description: java.lang.String
  /** If an object is not active, it is ignored when the user clicks on the {@link ImageMap} . */
  var IsActive: scala.Boolean
  /** Optionally, objects could be named. */
  var Name: java.lang.String
  /** This is the target frame */
  var Target: java.lang.String
  /** This is the URL for this object */
  var URL: java.lang.String
}

