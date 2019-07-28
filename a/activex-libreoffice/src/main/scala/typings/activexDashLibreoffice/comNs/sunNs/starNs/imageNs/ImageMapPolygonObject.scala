package typings.activexDashLibreoffice.comNs.sunNs.starNs.imageNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameReplace
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.PointSequence
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
  var Polygon: PointSequence
}

object ImageMapPolygonObject {
  @scala.inline
  def apply(
    Description: String,
    Events: XNameReplace,
    IsActive: Boolean,
    Name: String,
    Polygon: PointSequence,
    PropertySetInfo: XPropertySetInfo,
    Target: String,
    URL: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getEvents: () => XNameReplace,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): ImageMapPolygonObject = {
    val __obj = js.Dynamic.literal(Description = Description, Events = Events, IsActive = IsActive, Name = Name, Polygon = Polygon.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo, Target = Target, URL = URL, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getEvents = js.Any.fromFunction0(getEvents), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[ImageMapPolygonObject]
  }
}

