package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The ImageFile object is a container for images transferred to your computer when you call Transfer or ShowTransfer. It also supports image files
     * through LoadFile. An ImageFile object can be created using "WIA.ImageFile" in a call to CreateObject.
     */
@JSGlobal("WIA.ImageFile")
@js.native
class ImageFile protected () extends js.Object {
  /** Returns the raw image bits as a Vector of Long values */
  @JSName("ARGBData")
  val ARGBData_Original: Vector[_] = js.native
  /** Returns/Sets the current frame in the image */
  var ActiveFrame: scala.Double = js.native
  /** Returns the raw image file as a Vector of Bytes */
  @JSName("FileData")
  val FileData_Original: Vector[_] = js.native
  /** Returns the file extension for this image file type */
  val FileExtension: java.lang.String = js.native
  /** Returns the FormatID for this file type */
  val FormatID: java.lang.String = js.native
  /** Returns the number of frames in the image */
  val FrameCount: scala.Double = js.native
  /** Returns the Height of the image in pixels */
  val Height: scala.Double = js.native
  /** Returns the Horizontal pixels per inch of the image */
  val HorizontalResolution: scala.Double = js.native
  /** Indicates if the pixel format has an alpha component */
  val IsAlphaPixelFormat: scala.Boolean = js.native
  /** Indicates whether the image is animated */
  val IsAnimated: scala.Boolean = js.native
  /** Indicates if the pixel format is extended (16 bits/channel) */
  val IsExtendedPixelFormat: scala.Boolean = js.native
  /** Indicates if the pixel data is an index into a palette or the actual color data */
  val IsIndexedPixelFormat: scala.Boolean = js.native
  /** Returns the depth of the pixels of the image in bits per pixel */
  val PixelDepth: scala.Double = js.native
  /** A collection of all properties for this image */
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  /** Returns the Vertical pixels per inch of the image */
  val VerticalResolution: scala.Double = js.native
  var `WIA.ImageFile_typekey`: ImageFile = js.native
  /** Returns the Width of the image in pixels */
  val Width: scala.Double = js.native
  /** Returns the specified item in the vector by position */
  /** Returns the raw image bits as a Vector of Long values */
  def ARGBData(Index: scala.Double): js.Any = js.native
  /** Returns the specified item in the vector by position */
  /** Returns the raw image file as a Vector of Bytes */
  def FileData(Index: scala.Double): js.Any = js.native
  /** Loads the ImageFile object with the specified File */
  def LoadFile(Filename: java.lang.String): scala.Unit = js.native
  /** Returns the specified item in the collection either by position or name. */
  /** A collection of all properties for this image */
  def Properties(Index: java.lang.String): Property = js.native
  /** Returns the specified item in the collection either by position or name. */
  /** A collection of all properties for this image */
  def Properties(Index: scala.Double): Property = js.native
  /** Save the ImageFile object to the specified File */
  def SaveFile(Filename: java.lang.String): scala.Unit = js.native
}

