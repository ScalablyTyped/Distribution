package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.container.XContainer
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typings.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the standard model of an {@link UnoControlDialog} . */
@js.native
trait UnoControlDialogModel
  extends UnoControlModel
     with XMultiServiceFactory
     with XContainer
     with XNameContainer {
  
  /** specifies the background color (RGB) of the dialog. */
  var BackgroundColor: Color = js.native
  
  /** specifies if the dialog is closeable. */
  var Closeable: Boolean = js.native
  
  /**
    * If set to true the dialog will have the desktop as parent.
    * @since OOo 2.3
    */
  var DesktopAsParent: Boolean = js.native
  
  /** determines whether a dialog is enabled or disabled. */
  var Enabled: Boolean = js.native
  
  /** specifies the font attributes of the text in the caption bar of the dialog. */
  var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
  
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the caption bar of the dialog. */
  var FontEmphasisMark: Double = js.native
  
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the caption bar of the dialog. */
  var FontRelief: Double = js.native
  
  /**
    * specifies a graphic to be displayed as a background image
    *
    * If this property is present, it interacts with the {@link ImageURL} in the following way: If {@link ImageURL} is set, {@link Graphic} will be reset to
    * an object as loaded from the given image URL, or `NULL` if {@link ImageURL} does not point to a valid image file.If {@link Graphic} is set, {@link
    * ImageURL} will be reset to an empty string.
    * @since OOo 2.4
    */
  var Graphic: XGraphic = js.native
  
  /** specifies the help text of the dialog. */
  var HelpText: String = js.native
  
  /** specifies the help URL of the dialog. */
  var HelpURL: String = js.native
  
  /**
    * specifies a URL that references a graphic that should be used as a background image.
    * @see Graphic
    * @since OOo 2.4
    */
  var ImageURL: String = js.native
  
  /** specifies if the dialog is moveable. */
  var Moveable: Boolean = js.native
  
  /** specifies if the dialog is sizeable. */
  var Sizeable: Boolean = js.native
  
  /** specifies the text color (RGB) of the dialog. */
  var TextColor: Color = js.native
  
  /** specifies the text line color (RGB) of the dialog. */
  var TextLineColor: Color = js.native
  
  /** specifies the text that is displayed in the caption bar of the dialog. */
  var Title: String = js.native
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}
