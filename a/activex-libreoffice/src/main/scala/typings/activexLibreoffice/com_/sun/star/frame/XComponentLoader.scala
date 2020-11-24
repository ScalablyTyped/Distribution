package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.activexLibreofficeStrings.privateColonfactorySlashscalc
import typings.activexLibreoffice.activexLibreofficeStrings.privateColonfactorySlashsdraw
import typings.activexLibreoffice.activexLibreofficeStrings.privateColonfactorySlashsimpress
import typings.activexLibreoffice.activexLibreofficeStrings.privateColonfactorySlashswriter
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.drawing.DrawingDocument
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.presentation.PresentationDocument
import typings.activexLibreoffice.com_.sun.star.sheet.SpreadsheetDocument
import typings.activexLibreoffice.com_.sun.star.text.TextDocument
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    URL: privateColonfactorySlashscalc,
    TargetFrameName: String,
    SearchFlags: Double,
    Arguments: SeqEquiv[PropertyValue]
  ): SpreadsheetDocument = js.native
  @JSName("loadComponentFromURL")
  def loadComponentFromURL_privatefactorysdraw(
    URL: privateColonfactorySlashsdraw,
    TargetFrameName: String,
    SearchFlags: Double,
    Arguments: SeqEquiv[PropertyValue]
  ): DrawingDocument = js.native
  @JSName("loadComponentFromURL")
  def loadComponentFromURL_privatefactorysimpress(
    URL: privateColonfactorySlashsimpress,
    TargetFrameName: String,
    SearchFlags: Double,
    Arguments: SeqEquiv[PropertyValue]
  ): PresentationDocument = js.native
  @JSName("loadComponentFromURL")
  def loadComponentFromURL_privatefactoryswriter(
    URL: privateColonfactorySlashswriter,
    TargetFrameName: String,
    SearchFlags: Double,
    Arguments: SeqEquiv[PropertyValue]
  ): TextDocument = js.native
}
