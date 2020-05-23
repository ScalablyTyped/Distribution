package typings.activexLibreoffice.com_.sun.star.gallery

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** service to get access to the properties of a single Gallery item */
trait GalleryItem
  extends XGalleryItem
     with XPropertySet {
  /**
    * the drawing content of the Gallery item
    *
    * This is an optional property and may not available for every item
    */
  var Drawing: XComponent
  /**
    * The type of the Gallery item
    * @see GalleryItemType
    */
  var GalleryItemType: Double
  /**
    * the graphic content of the Gallery item
    *
    * This is an optional property and may not available for every item
    */
  var Graphic: XGraphic
  /**
    * the thumbnail of the Gallery item
    *
    * The thumbnail may be either a pixel or a vector graphic
    */
  var Thumbnail: XGraphic
  /** the title of the Gallery item */
  var Title: String
  /**
    * the URL of the Gallery item
    *
    * The interpretation of the URL depends on the type of the Gallery item. In case of graphic and media items, the URL is a "real" URL, in case of
    * drawings it is a private URL
    */
  var URL: String
}

object GalleryItem {
  @scala.inline
  def apply(
    Drawing: XComponent,
    GalleryItemType: Double,
    Graphic: XGraphic,
    PropertySetInfo: XPropertySetInfo,
    Thumbnail: XGraphic,
    Title: String,
    Type: Double,
    URL: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): GalleryItem = {
    val __obj = js.Dynamic.literal(Drawing = Drawing.asInstanceOf[js.Any], GalleryItemType = GalleryItemType.asInstanceOf[js.Any], Graphic = Graphic.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Thumbnail = Thumbnail.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[GalleryItem]
  }
}

