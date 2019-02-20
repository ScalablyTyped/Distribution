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

