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
@js.native
trait GalleryItem
  extends XGalleryItem
     with XPropertySet {
  /**
    * the drawing content of the Gallery item
    *
    * This is an optional property and may not available for every item
    */
  var Drawing: XComponent = js.native
  /**
    * The type of the Gallery item
    * @see GalleryItemType
    */
  var GalleryItemType: Double = js.native
  /**
    * the graphic content of the Gallery item
    *
    * This is an optional property and may not available for every item
    */
  var Graphic: XGraphic = js.native
  /**
    * the thumbnail of the Gallery item
    *
    * The thumbnail may be either a pixel or a vector graphic
    */
  var Thumbnail: XGraphic = js.native
  /** the title of the Gallery item */
  var Title: String = js.native
  /**
    * the URL of the Gallery item
    *
    * The interpretation of the URL depends on the type of the Gallery item. In case of graphic and media items, the URL is a "real" URL, in case of
    * drawings it is a private URL
    */
  var URL: String = js.native
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
  @scala.inline
  implicit class GalleryItemOps[Self <: GalleryItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDrawing(value: XComponent): Self = this.set("Drawing", value.asInstanceOf[js.Any])
    @scala.inline
    def setGalleryItemType(value: Double): Self = this.set("GalleryItemType", value.asInstanceOf[js.Any])
    @scala.inline
    def setGraphic(value: XGraphic): Self = this.set("Graphic", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnail(value: XGraphic): Self = this.set("Thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
  }
  
}

