package typings.activexDashLibreoffice.comNs.sunNs.starNs.galleryNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.graphicNs.XGraphic
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
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
    val __obj = js.Dynamic.literal(Drawing = Drawing, GalleryItemType = GalleryItemType, Graphic = Graphic, PropertySetInfo = PropertySetInfo, Thumbnail = Thumbnail, Title = Title, Type = Type, URL = URL, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[GalleryItem]
  }
}

