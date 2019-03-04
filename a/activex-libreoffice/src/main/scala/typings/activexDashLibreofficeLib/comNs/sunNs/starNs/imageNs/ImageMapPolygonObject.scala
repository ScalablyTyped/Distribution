package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.imageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this service describes a polygon-shaped region inside a HTML image map.
  * @see ImageMap
  * @see ImageMapObject
  */
trait ImageMapPolygonObject extends ImageMapObject {
  /** This sequence of points outlines the click area of this image map object. */
  var Polygon: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PointSequence
}

object ImageMapPolygonObject {
  @scala.inline
  def apply(
    Description: java.lang.String,
    Events: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameReplace,
    IsActive: scala.Boolean,
    Name: java.lang.String,
    Polygon: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PointSequence,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Target: java.lang.String,
    URL: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getEvents: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameReplace],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): ImageMapPolygonObject = {
    val __obj = js.Dynamic.literal(Description = Description, Events = Events, IsActive = IsActive, Name = Name, Polygon = Polygon.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo, Target = Target, URL = URL, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getEvents = getEvents, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[ImageMapPolygonObject]
  }
}

