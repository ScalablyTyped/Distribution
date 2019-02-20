package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies the control model for a clickable button which is represented by an image.
  *
  * The image to be displayed is determined by {@link com.sun.star.awt.UnoControlImageControlModel.ImageURL} property specifies the URL of an image to be
  * displayed.
  * @see CommandButton
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlImageControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, Enabled, Graphic, HelpText, HelpURL, ImageURL, Printable, ScaleImage, ScaleMode, Tabstop */ @js.native
trait ImageButton
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormControlModel
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XImageProducerSupplier {
  /** specifies the background color (RGB) of the control. */
  var BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color = js.native
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: scala.Double = js.native
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see {@link Border} ) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    * @since OOo 2.0
    */
  var BorderColor: scala.Double = js.native
  /** describes the action to be executed by the button when pressed. */
  var ButtonType: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormButtonType = js.native
  /** determines whether the control is enabled or disabled. */
  var Enabled: scala.Boolean = js.native
  /**
    * specifies a graphic to be displayed on the control
    *
    * If this property is present, it interacts with the {@link ImageURL} in the following way: If {@link ImageURL} is set, {@link Graphic} will be reset to
    * an object as loaded from the given image URL, or `NULL` if {@link ImageURL} does not point to a valid image file.If {@link Graphic} is set, {@link
    * ImageURL} will be reset to an empty string.
    * @since OOo 2.1
    */
  var Graphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic = js.native
  /** specifies the help text of the control. */
  var HelpText: java.lang.String = js.native
  /** specifies the help URL of the control. */
  var HelpURL: java.lang.String = js.native
  /**
    * specifies an URL to an image to use for the control.
    * @see Graphic
    */
  var ImageURL: java.lang.String = js.native
  /** specifies that the control will be printed with the document. */
  var Printable: scala.Boolean = js.native
  /** specifies if the image is automatically scaled to the size of the control. */
  var ScaleImage: scala.Boolean = js.native
  /**
    * defines how to scale the image
    *
    * If this property is present, it supersedes the {@link ScaleImage} property.
    *
    * The value of this property is one of the {@link ImageScaleMode} constants.
    * @since OOo 3.1
    */
  var ScaleMode: scala.Double = js.native
  /**
    * specifies that the control can be reached with the TAB key.
    * @since OOo 1.1.2
    */
  var Tabstop: scala.Boolean = js.native
  /**
    * describes the frame, where to open the document specified by the TargetURL.
    *
    * This property is evaluated if the button is of type URL.
    *
    * As always, there is a number of target names which have a special meaning, and force a special {@link com.sun.star.frame.Frame} to be used.
    */
  var TargetFrame: java.lang.String = js.native
  /**
    * specifies the URL, which should be opened if the button was clicked.
    *
    * This property is evaluated if the button is of type URL.
    * @see com.sun.star.form.FormButtonType
    */
  var TargetURL: java.lang.String = js.native
}

