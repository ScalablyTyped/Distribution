package typings.activexLibreoffice.com_.sun.star.image

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameReplace
import typings.activexLibreoffice.com_.sun.star.document.XEventsSupplier
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
  extends XPropertySet
     with XEventsSupplier {
  /** This is an optional description text for the link. */
  var Description: String
  /** If an object is not active, it is ignored when the user clicks on the {@link ImageMap} . */
  var IsActive: Boolean
  /** Optionally, objects could be named. */
  var Name: String
  /** This is the target frame */
  var Target: String
  /** This is the URL for this object */
  var URL: String
}

object ImageMapObject {
  @scala.inline
  def apply(
    Description: String,
    Events: XNameReplace,
    IsActive: Boolean,
    Name: String,
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
  ): ImageMapObject = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getEvents = js.Any.fromFunction0(getEvents), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ImageMapObject]
  }
}

