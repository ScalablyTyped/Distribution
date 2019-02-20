package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this is a simple interface to load components by an URL into a frame environment
  * @see Desktop
  * @see Frame
  * @see XFrame
  */
@js.native
trait XComponentLoader
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * loads a component specified by an URL into the specified new or existing frame.
    * @param URL specifies the URL of the document to load  To create new documents, use "private:factory/scalc", "private:factory/swriter", etc. Other specia
    * @param TargetFrameName specifies the name of the frame to view the document in  If a frame with the specified name already exists, it is used, otherwise
    * @param SearchFlags use the values of {@link FrameSearchFlag} to specify how to find the specified **TargetFrameName**  Note: These flags are optional on
    * @param Arguments these arguments specify component or filter specific behavior  For example, "ReadOnly" with a boolean value specifies whether the docum
    * @returns a {@link com.sun.star.lang.XComponent} for successfully loaded documents or ; `NULL` if it failed  This interface is a generic one and can be use
    * @throws com::sun::star::io::IOException when **URL** couldn't be found or was corrupt
    * @throws com::sun::star::lang::IllegalArgumentException when given parameters doesn't perform the specification
    */
  def loadComponentFromURL(
    URL: java.lang.String,
    TargetFrameName: java.lang.String,
    SearchFlags: scala.Double,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent = js.native
  @JSName("loadComponentFromURL")
  def `loadComponentFromURL_private:factory/scalc`(
    URL: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.`private:factory/scalc`,
    TargetFrameName: java.lang.String,
    SearchFlags: scala.Double,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetDocument = js.native
  @JSName("loadComponentFromURL")
  def `loadComponentFromURL_private:factory/sdraw`(
    URL: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.`private:factory/sdraw`,
    TargetFrameName: java.lang.String,
    SearchFlags: scala.Double,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DrawingDocument = js.native
  @JSName("loadComponentFromURL")
  def `loadComponentFromURL_private:factory/simpress`(
    URL: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.`private:factory/simpress`,
    TargetFrameName: java.lang.String,
    SearchFlags: scala.Double,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.PresentationDocument = js.native
  @JSName("loadComponentFromURL")
  def `loadComponentFromURL_private:factory/swriter`(
    URL: activexDashLibreofficeLib.activexDashLibreofficeLibStrings.`private:factory/swriter`,
    TargetFrameName: java.lang.String,
    SearchFlags: scala.Double,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextDocument = js.native
}

