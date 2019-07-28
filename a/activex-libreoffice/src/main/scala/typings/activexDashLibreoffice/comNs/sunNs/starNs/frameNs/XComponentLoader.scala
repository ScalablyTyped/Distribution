package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`private:factory/scalc`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`private:factory/sdraw`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`private:factory/simpress`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`private:factory/swriter`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.DrawingDocument
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs.PresentationDocument
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs.SpreadsheetDocument
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.TextDocument
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
trait XComponentLoader extends XInterface {
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
  def loadComponentFromURL(URL: String, TargetFrameName: String, SearchFlags: Double, Arguments: SeqEquiv[PropertyValue]): XComponent = js.native
  @JSName("loadComponentFromURL")
  def loadComponentFromURL_privatefactoryscalc(
    URL: `private:factory/scalc`,
    TargetFrameName: String,
    SearchFlags: Double,
    Arguments: SeqEquiv[PropertyValue]
  ): SpreadsheetDocument = js.native
  @JSName("loadComponentFromURL")
  def loadComponentFromURL_privatefactorysdraw(
    URL: `private:factory/sdraw`,
    TargetFrameName: String,
    SearchFlags: Double,
    Arguments: SeqEquiv[PropertyValue]
  ): DrawingDocument = js.native
  @JSName("loadComponentFromURL")
  def loadComponentFromURL_privatefactorysimpress(
    URL: `private:factory/simpress`,
    TargetFrameName: String,
    SearchFlags: Double,
    Arguments: SeqEquiv[PropertyValue]
  ): PresentationDocument = js.native
  @JSName("loadComponentFromURL")
  def loadComponentFromURL_privatefactoryswriter(
    URL: `private:factory/swriter`,
    TargetFrameName: String,
    SearchFlags: Double,
    Arguments: SeqEquiv[PropertyValue]
  ): TextDocument = js.native
}

