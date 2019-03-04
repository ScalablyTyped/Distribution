package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** service to get access to the properties of a single Gallery item */
trait GalleryItem
  extends XGalleryItem
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * the drawing content of the Gallery item
    *
    * This is an optional property and may not available for every item
    */
  var Drawing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
  /**
    * The type of the Gallery item
    * @see GalleryItemType
    */
  var GalleryItemType: scala.Double
  /**
    * the graphic content of the Gallery item
    *
    * This is an optional property and may not available for every item
    */
  var Graphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic
  /**
    * the thumbnail of the Gallery item
    *
    * The thumbnail may be either a pixel or a vector graphic
    */
  var Thumbnail: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic
  /** the title of the Gallery item */
  var Title: java.lang.String
  /**
    * the URL of the Gallery item
    *
    * The interpretation of the URL depends on the type of the Gallery item. In case of graphic and media items, the URL is a "real" URL, in case of
    * drawings it is a private URL
    */
  var URL: java.lang.String
}

object GalleryItem {
  @scala.inline
  def apply(
    Drawing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    GalleryItemType: scala.Double,
    Graphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Thumbnail: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic,
    Title: java.lang.String,
    Type: scala.Double,
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
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getType: js.Function0[scala.Double],
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
  ): GalleryItem = {
    val __obj = js.Dynamic.literal(Drawing = Drawing, GalleryItemType = GalleryItemType, Graphic = Graphic, PropertySetInfo = PropertySetInfo, Thumbnail = Thumbnail, Title = Title, Type = Type, URL = URL, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getType = getType, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[GalleryItem]
  }
}

