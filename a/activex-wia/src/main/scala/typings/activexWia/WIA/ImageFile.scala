package typings.activexWia.WIA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ImageFile object is a container for images transferred to your computer when you call Transfer or ShowTransfer. It also supports image files
  * through LoadFile. An ImageFile object can be created using "WIA.ImageFile" in a call to CreateObject.
  */
trait ImageFile extends StObject {
  
  /** Returns the specified item in the vector by position */
  /** Returns the raw image bits as a Vector of Long values */
  def ARGBData(Index: Double): js.Any
  /** Returns the raw image bits as a Vector of Long values */
  @JSName("ARGBData")
  val ARGBData_Original: Vector[js.Any]
  
  /** Returns/Sets the current frame in the image */
  var ActiveFrame: Double
  
  /** Returns the specified item in the vector by position */
  /** Returns the raw image file as a Vector of Bytes */
  def FileData(Index: Double): js.Any
  /** Returns the raw image file as a Vector of Bytes */
  @JSName("FileData")
  val FileData_Original: Vector[js.Any]
  
  /** Returns the file extension for this image file type */
  val FileExtension: String
  
  /** Returns the FormatID for this file type */
  val FormatID: String
  
  /** Returns the number of frames in the image */
  val FrameCount: Double
  
  /** Returns the Height of the image in pixels */
  val Height: Double
  
  /** Returns the Horizontal pixels per inch of the image */
  val HorizontalResolution: Double
  
  /** Indicates if the pixel format has an alpha component */
  val IsAlphaPixelFormat: Boolean
  
  /** Indicates whether the image is animated */
  val IsAnimated: Boolean
  
  /** Indicates if the pixel format is extended (16 bits/channel) */
  val IsExtendedPixelFormat: Boolean
  
  /** Indicates if the pixel data is an index into a palette or the actual color data */
  val IsIndexedPixelFormat: Boolean
  
  /** Loads the ImageFile object with the specified File */
  def LoadFile(Filename: String): Unit
  
  /** Returns the depth of the pixels of the image in bits per pixel */
  val PixelDepth: Double
  
  def Properties(Index: String): Property
  /** Returns the specified item in the collection either by position or name. */
  /** A collection of all properties for this image */
  def Properties(Index: Double): Property
  /** A collection of all properties for this image */
  @JSName("Properties")
  val Properties_Original: Properties
  
  /** Save the ImageFile object to the specified File */
  def SaveFile(Filename: String): Unit
  
  /** Returns the Vertical pixels per inch of the image */
  val VerticalResolution: Double
  
  /* private */ @JSName("WIA.ImageFile_typekey")
  var WIADotImageFile_typekey: ImageFile
  
  /** Returns the Width of the image in pixels */
  val Width: Double
}
object ImageFile {
  
  inline def apply(
    ARGBData: Vector[js.Any],
    ActiveFrame: Double,
    FileData: Vector[js.Any],
    FileExtension: String,
    FormatID: String,
    FrameCount: Double,
    Height: Double,
    HorizontalResolution: Double,
    IsAlphaPixelFormat: Boolean,
    IsAnimated: Boolean,
    IsExtendedPixelFormat: Boolean,
    IsIndexedPixelFormat: Boolean,
    LoadFile: String => Unit,
    PixelDepth: Double,
    Properties: Properties,
    SaveFile: String => Unit,
    VerticalResolution: Double,
    WIADotImageFile_typekey: ImageFile,
    Width: Double
  ): ImageFile = {
    val __obj = js.Dynamic.literal(ARGBData = ARGBData.asInstanceOf[js.Any], ActiveFrame = ActiveFrame.asInstanceOf[js.Any], FileData = FileData.asInstanceOf[js.Any], FileExtension = FileExtension.asInstanceOf[js.Any], FormatID = FormatID.asInstanceOf[js.Any], FrameCount = FrameCount.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HorizontalResolution = HorizontalResolution.asInstanceOf[js.Any], IsAlphaPixelFormat = IsAlphaPixelFormat.asInstanceOf[js.Any], IsAnimated = IsAnimated.asInstanceOf[js.Any], IsExtendedPixelFormat = IsExtendedPixelFormat.asInstanceOf[js.Any], IsIndexedPixelFormat = IsIndexedPixelFormat.asInstanceOf[js.Any], LoadFile = js.Any.fromFunction1(LoadFile), PixelDepth = PixelDepth.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], SaveFile = js.Any.fromFunction1(SaveFile), VerticalResolution = VerticalResolution.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.ImageFile_typekey")(WIADotImageFile_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFile]
  }
  
  extension [Self <: ImageFile](x: Self) {
    
    inline def setARGBData(value: Vector[js.Any]): Self = StObject.set(x, "ARGBData", value.asInstanceOf[js.Any])
    
    inline def setActiveFrame(value: Double): Self = StObject.set(x, "ActiveFrame", value.asInstanceOf[js.Any])
    
    inline def setFileData(value: Vector[js.Any]): Self = StObject.set(x, "FileData", value.asInstanceOf[js.Any])
    
    inline def setFileExtension(value: String): Self = StObject.set(x, "FileExtension", value.asInstanceOf[js.Any])
    
    inline def setFormatID(value: String): Self = StObject.set(x, "FormatID", value.asInstanceOf[js.Any])
    
    inline def setFrameCount(value: Double): Self = StObject.set(x, "FrameCount", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHorizontalResolution(value: Double): Self = StObject.set(x, "HorizontalResolution", value.asInstanceOf[js.Any])
    
    inline def setIsAlphaPixelFormat(value: Boolean): Self = StObject.set(x, "IsAlphaPixelFormat", value.asInstanceOf[js.Any])
    
    inline def setIsAnimated(value: Boolean): Self = StObject.set(x, "IsAnimated", value.asInstanceOf[js.Any])
    
    inline def setIsExtendedPixelFormat(value: Boolean): Self = StObject.set(x, "IsExtendedPixelFormat", value.asInstanceOf[js.Any])
    
    inline def setIsIndexedPixelFormat(value: Boolean): Self = StObject.set(x, "IsIndexedPixelFormat", value.asInstanceOf[js.Any])
    
    inline def setLoadFile(value: String => Unit): Self = StObject.set(x, "LoadFile", js.Any.fromFunction1(value))
    
    inline def setPixelDepth(value: Double): Self = StObject.set(x, "PixelDepth", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setSaveFile(value: String => Unit): Self = StObject.set(x, "SaveFile", js.Any.fromFunction1(value))
    
    inline def setVerticalResolution(value: Double): Self = StObject.set(x, "VerticalResolution", value.asInstanceOf[js.Any])
    
    inline def setWIADotImageFile_typekey(value: ImageFile): Self = StObject.set(x, "WIA.ImageFile_typekey", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
