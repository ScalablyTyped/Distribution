package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.imageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this service describes a circular-shaped region inside a HTML image map.
  * @see ImageMap
  * @see ImageMapObject
  */
trait ImageMapCircleObject extends ImageMapObject {
  /** This is the center point of the circle in pixels */
  var Center: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** This is the radius of the circle in pixels */
  var Radius: scala.Double
}

object ImageMapCircleObject {
  @scala.inline
  def apply(
    Center: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    Description: java.lang.String,
    Events: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameReplace,
    IsActive: scala.Boolean,
    Name: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Radius: scala.Double,
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
  ): ImageMapCircleObject = {
    val __obj = js.Dynamic.literal(Center = Center, Description = Description, Events = Events, IsActive = IsActive, Name = Name, PropertySetInfo = PropertySetInfo, Radius = Radius, Target = Target, URL = URL, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getEvents = getEvents, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[ImageMapCircleObject]
  }
}

