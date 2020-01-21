package typings.activexWia.WIA

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
  var ActiveFrame: Double = js.native
  /** Returns the raw image file as a Vector of Bytes */
  @JSName("FileData")
  val FileData_Original: Vector[_] = js.native
  /** Returns the file extension for this image file type */
  val FileExtension: String = js.native
  /** Returns the FormatID for this file type */
  val FormatID: String = js.native
  /** Returns the number of frames in the image */
  val FrameCount: Double = js.native
  /** Returns the Height of the image in pixels */
  val Height: Double = js.native
  /** Returns the Horizontal pixels per inch of the image */
  val HorizontalResolution: Double = js.native
  /** Indicates if the pixel format has an alpha component */
  val IsAlphaPixelFormat: Boolean = js.native
  /** Indicates whether the image is animated */
  val IsAnimated: Boolean = js.native
  /** Indicates if the pixel format is extended (16 bits/channel) */
  val IsExtendedPixelFormat: Boolean = js.native
  /** Indicates if the pixel data is an index into a palette or the actual color data */
  val IsIndexedPixelFormat: Boolean = js.native
  /** Returns the depth of the pixels of the image in bits per pixel */
  val PixelDepth: Double = js.native
  /** A collection of all properties for this image */
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  /** Returns the Vertical pixels per inch of the image */
  val VerticalResolution: Double = js.native
  @JSName("WIA.ImageFile_typekey")
  var WIADotImageFile_typekey: ImageFile = js.native
  /** Returns the Width of the image in pixels */
  val Width: Double = js.native
  /** Returns the specified item in the vector by position */
  /** Returns the raw image bits as a Vector of Long values */
  def ARGBData(Index: Double): js.Any = js.native
  /** Returns the specified item in the vector by position */
  /** Returns the raw image file as a Vector of Bytes */
  def FileData(Index: Double): js.Any = js.native
  /** Loads the ImageFile object with the specified File */
  def LoadFile(Filename: String): Unit = js.native
  def Properties(Index: String): Property = js.native
  /** Returns the specified item in the collection either by position or name. */
  /** A collection of all properties for this image */
  def Properties(Index: Double): Property = js.native
  /** Save the ImageFile object to the specified File */
  def SaveFile(Filename: String): Unit = js.native
}

