package typings.activexLibreoffice.com_.sun.star.form.component

import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel
import typings.activexLibreoffice.com_.sun.star.form.XImageProducerSupplier
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the model of a control used for displaying images stored in a database.
  *
  * As every {@link com.sun.star.form.DataAwareControlModel} , an image control can be bound to a database field. This means that for instance with every
  * record change, the content of the database field is taken, interpreted as image, and displayed in the control. ;  Unlike other more text-based
  * controls, it does not interpret the content of the field as text or double, but as binary stream (see {@link
  * com.sun.star.sdb.XColumn.getBinaryStream()} ).
  *
  * Usually, an image control model can be bound to binary columns only, namely {@link com.sun.star.sdbc.DataType.BINARY} , {@link
  * com.sun.star.sdbc.DataType.VARBINARY} , {@link com.sun.star.sdbc.DataType.LONGVARBINARY} , {@link com.sun.star.sdbc.DataType.OTHER} , {@link
  * com.sun.star.sdbc.DataType.LONGVARCHAR}
  *
  * Note that besides taking the image to be displayed from the bound field, there is another option. The {@link
  * com.sun.star.awt.UnoControlImageControlModel.ImageURL} property specifies the URL of an image to be displayed. If this property is changed from
  * outside, the respective file is loaded and set as image source.
  *
  * In a usual data form, the scenario will be as follows: There is a {@link DatabaseImageControl} as part of the document model, which acts as control
  * model for an {@link com.sun.star.form.control.ImageControl} .
  *
  * The control is an {@link com.sun.star.awt.XImageConsumer} for the {@link com.sun.star.awt.XImageProducer} supplied by the model.
  *
  * Whenever the form's cursor is positioned on a new record, the column the control model is bound to is examined for a binary data stream. This stream
  * is set as source at the image producer, which notifies it's consumers, which leads to the control displaying the image.
  *
  * When the user by some interaction tells the control to contain a new image, this is exchanged by URL. For example, implementations of the control
  * service may allow the user to browse for image. After this, the URL of the image is set as {@link
  * com.sun.star.awt.UnoControlImageControlModel.ImageURL} property at the model. ;  Now the control loads the image determined by the property value, and
  * starts producing a new data stream, which is displayed by the control (which is a consumer for this stream). ;  From now on, the control and thus the
  * database record counts as modified. If the cursor of the form is moved further, the modified record is saved, means the content of the image pointed
  * to by {@link com.sun.star.awt.UnoControlImageControlModel.ImageURL} is saved into the column.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
- typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlImageControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, Enabled, Graphic, HelpText, HelpURL, ImageURL, Printable, ScaleImage, ScaleMode, Tabstop */ @js.native
trait DatabaseImageControl
  extends DataAwareControlModel
     with XImageProducerSupplier {
  /** specifies the background color (RGB) of the control. */
  var BackgroundColor: Color = js.native
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: Double = js.native
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see {@link Border} ) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    * @since OOo 2.0
    */
  var BorderColor: Double = js.native
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean = js.native
  /**
    * specifies a graphic to be displayed on the control
    *
    * If this property is present, it interacts with the {@link ImageURL} in the following way: If {@link ImageURL} is set, {@link Graphic} will be reset to
    * an object as loaded from the given image URL, or `NULL` if {@link ImageURL} does not point to a valid image file.If {@link Graphic} is set, {@link
    * ImageURL} will be reset to an empty string.
    * @since OOo 2.1
    */
  var Graphic: XGraphic = js.native
  /** specifies the help text of the control. */
  var HelpText: String = js.native
  /** specifies the help URL of the control. */
  var HelpURL: String = js.native
  /**
    * specifies an URL to an image to use for the control.
    * @see Graphic
    */
  var ImageURL: String = js.native
  /** specifies that the control will be printed with the document. */
  var Printable: Boolean = js.native
  /** indicates if it is possible to change the image being displayed. */
  var ReadOnly: Boolean = js.native
  /** specifies if the image is automatically scaled to the size of the control. */
  var ScaleImage: Boolean = js.native
  /**
    * defines how to scale the image
    *
    * If this property is present, it supersedes the {@link ScaleImage} property.
    *
    * The value of this property is one of the {@link ImageScaleMode} constants.
    * @since OOo 3.1
    */
  var ScaleMode: Double = js.native
  /**
    * specifies that the control can be reached with the TAB key.
    * @since OOo 1.1.2
    */
  var Tabstop: Boolean = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}

