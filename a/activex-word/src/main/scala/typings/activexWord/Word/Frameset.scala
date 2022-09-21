package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frameset extends StObject {
  
  def AddNewFrame(Where: WdFramesetNewFrameLocation): Frameset
  
  val Application: typings.activexWord.Word.Application
  
  val ChildFramesetCount: Double
  
  def ChildFramesetItem(Index: Double): Frameset
  
  val Creator: Double
  
  def Delete(): Unit
  
  var FrameDefaultURL: String
  
  var FrameDisplayBorders: Boolean
  
  var FrameLinkToFile: Boolean
  
  var FrameName: String
  
  var FrameResizable: Boolean
  
  var FrameScrollbarType: WdScrollbarType
  
  var FramesetBorderColor: WdColor
  
  var FramesetBorderWidth: Double
  
  var Height: Double
  
  var HeightType: WdFramesetSizeType
  
  val Parent: Any
  
  val ParentFrameset: Frameset
  
  val Type: WdFramesetType
  
  var Width: Double
  
  var WidthType: WdFramesetSizeType
  
  /* private */ @JSName("Word.Frameset_typekey")
  var WordDotFrameset_typekey: Frameset
}
object Frameset {
  
  inline def apply(
    AddNewFrame: WdFramesetNewFrameLocation => Frameset,
    Application: Application,
    ChildFramesetCount: Double,
    ChildFramesetItem: Double => Frameset,
    Creator: Double,
    Delete: () => Unit,
    FrameDefaultURL: String,
    FrameDisplayBorders: Boolean,
    FrameLinkToFile: Boolean,
    FrameName: String,
    FrameResizable: Boolean,
    FrameScrollbarType: WdScrollbarType,
    FramesetBorderColor: WdColor,
    FramesetBorderWidth: Double,
    Height: Double,
    HeightType: WdFramesetSizeType,
    Parent: Any,
    ParentFrameset: Frameset,
    Type: WdFramesetType,
    Width: Double,
    WidthType: WdFramesetSizeType,
    WordDotFrameset_typekey: Frameset
  ): Frameset = {
    val __obj = js.Dynamic.literal(AddNewFrame = js.Any.fromFunction1(AddNewFrame), Application = Application.asInstanceOf[js.Any], ChildFramesetCount = ChildFramesetCount.asInstanceOf[js.Any], ChildFramesetItem = js.Any.fromFunction1(ChildFramesetItem), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), FrameDefaultURL = FrameDefaultURL.asInstanceOf[js.Any], FrameDisplayBorders = FrameDisplayBorders.asInstanceOf[js.Any], FrameLinkToFile = FrameLinkToFile.asInstanceOf[js.Any], FrameName = FrameName.asInstanceOf[js.Any], FrameResizable = FrameResizable.asInstanceOf[js.Any], FrameScrollbarType = FrameScrollbarType.asInstanceOf[js.Any], FramesetBorderColor = FramesetBorderColor.asInstanceOf[js.Any], FramesetBorderWidth = FramesetBorderWidth.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HeightType = HeightType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ParentFrameset = ParentFrameset.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WidthType = WidthType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Frameset_typekey")(WordDotFrameset_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frameset]
  }
  
  extension [Self <: Frameset](x: Self) {
    
    inline def setAddNewFrame(value: WdFramesetNewFrameLocation => Frameset): Self = StObject.set(x, "AddNewFrame", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setChildFramesetCount(value: Double): Self = StObject.set(x, "ChildFramesetCount", value.asInstanceOf[js.Any])
    
    inline def setChildFramesetItem(value: Double => Frameset): Self = StObject.set(x, "ChildFramesetItem", js.Any.fromFunction1(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setFrameDefaultURL(value: String): Self = StObject.set(x, "FrameDefaultURL", value.asInstanceOf[js.Any])
    
    inline def setFrameDisplayBorders(value: Boolean): Self = StObject.set(x, "FrameDisplayBorders", value.asInstanceOf[js.Any])
    
    inline def setFrameLinkToFile(value: Boolean): Self = StObject.set(x, "FrameLinkToFile", value.asInstanceOf[js.Any])
    
    inline def setFrameName(value: String): Self = StObject.set(x, "FrameName", value.asInstanceOf[js.Any])
    
    inline def setFrameResizable(value: Boolean): Self = StObject.set(x, "FrameResizable", value.asInstanceOf[js.Any])
    
    inline def setFrameScrollbarType(value: WdScrollbarType): Self = StObject.set(x, "FrameScrollbarType", value.asInstanceOf[js.Any])
    
    inline def setFramesetBorderColor(value: WdColor): Self = StObject.set(x, "FramesetBorderColor", value.asInstanceOf[js.Any])
    
    inline def setFramesetBorderWidth(value: Double): Self = StObject.set(x, "FramesetBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHeightType(value: WdFramesetSizeType): Self = StObject.set(x, "HeightType", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setParentFrameset(value: Frameset): Self = StObject.set(x, "ParentFrameset", value.asInstanceOf[js.Any])
    
    inline def setType(value: WdFramesetType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWidthType(value: WdFramesetSizeType): Self = StObject.set(x, "WidthType", value.asInstanceOf[js.Any])
    
    inline def setWordDotFrameset_typekey(value: Frameset): Self = StObject.set(x, "Word.Frameset_typekey", value.asInstanceOf[js.Any])
  }
}
