package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link UnoControlDialog} . */
@js.native
trait UnoControlDialogModel
  extends UnoControlModel
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer {
  /** specifies the background color (RGB) of the dialog. */
  var BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color = js.native
  /** specifies if the dialog is closeable. */
  var Closeable: scala.Boolean = js.native
  /**
    * If set to true the dialog will have the desktop as parent.
    * @since OOo 2.3
    */
  var DesktopAsParent: scala.Boolean = js.native
  /** determines whether a dialog is enabled or disabled. */
  var Enabled: scala.Boolean = js.native
  /** specifies the font attributes of the text in the caption bar of the dialog. */
  var FontDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor = js.native
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the caption bar of the dialog. */
  var FontEmphasisMark: scala.Double = js.native
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the caption bar of the dialog. */
  var FontRelief: scala.Double = js.native
  /**
    * specifies a graphic to be displayed as a background image
    *
    * If this property is present, it interacts with the {@link ImageURL} in the following way: If {@link ImageURL} is set, {@link Graphic} will be reset to
    * an object as loaded from the given image URL, or `NULL` if {@link ImageURL} does not point to a valid image file.If {@link Graphic} is set, {@link
    * ImageURL} will be reset to an empty string.
    * @since OOo 2.4
    */
  var Graphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic = js.native
  /** specifies the help text of the dialog. */
  var HelpText: java.lang.String = js.native
  /** specifies the help URL of the dialog. */
  var HelpURL: java.lang.String = js.native
  /**
    * specifies a URL that references a graphic that should be used as a background image.
    * @see Graphic
    * @since OOo 2.4
    */
  var ImageURL: java.lang.String = js.native
  /** specifies if the dialog is moveable. */
  var Moveable: scala.Boolean = js.native
  /** specifies if the dialog is sizeable. */
  var Sizeable: scala.Boolean = js.native
  /** specifies the text color (RGB) of the dialog. */
  var TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color = js.native
  /** specifies the text line color (RGB) of the dialog. */
  var TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color = js.native
  /** specifies the text that is displayed in the caption bar of the dialog. */
  var Title: java.lang.String = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo = js.native
}

