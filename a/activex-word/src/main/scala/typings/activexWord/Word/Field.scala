package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var Code: Range
  
  def Copy(): Unit
  
  val Creator: Double
  
  def Cut(): Unit
  
  var Data: String
  
  def Delete(): Unit
  
  def DoClick(): Unit
  
  val Index: Double
  
  val InlineShape: typings.activexWord.Word.InlineShape
  
  val Kind: WdFieldKind
  
  val LinkFormat: typings.activexWord.Word.LinkFormat
  
  var Locked: Boolean
  
  val Next: Field
  
  val OLEFormat: typings.activexWord.Word.OLEFormat
  
  val Parent: Any
  
  val Previous: Field
  
  var Result: Range
  
  def Select(): Unit
  
  var ShowCodes: Boolean
  
  val Type: WdFieldType
  
  def Unlink(): Unit
  
  def Update(): Boolean
  
  def UpdateSource(): Unit
  
  /* private */ @JSName("Word.Field_typekey")
  var WordDotField_typekey: Field
}
object Field {
  
  inline def apply(
    Application: Application,
    Code: Range,
    Copy: () => Unit,
    Creator: Double,
    Cut: () => Unit,
    Data: String,
    Delete: () => Unit,
    DoClick: () => Unit,
    Index: Double,
    InlineShape: InlineShape,
    Kind: WdFieldKind,
    LinkFormat: LinkFormat,
    Locked: Boolean,
    Next: Field,
    OLEFormat: OLEFormat,
    Parent: Any,
    Previous: Field,
    Result: Range,
    Select: () => Unit,
    ShowCodes: Boolean,
    Type: WdFieldType,
    Unlink: () => Unit,
    Update: () => Boolean,
    UpdateSource: () => Unit,
    WordDotField_typekey: Field
  ): Field = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Data = Data.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DoClick = js.Any.fromFunction0(DoClick), Index = Index.asInstanceOf[js.Any], InlineShape = InlineShape.asInstanceOf[js.Any], Kind = Kind.asInstanceOf[js.Any], LinkFormat = LinkFormat.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Next = Next.asInstanceOf[js.Any], OLEFormat = OLEFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Previous = Previous.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), ShowCodes = ShowCodes.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Unlink = js.Any.fromFunction0(Unlink), Update = js.Any.fromFunction0(Update), UpdateSource = js.Any.fromFunction0(UpdateSource))
    __obj.updateDynamic("Word.Field_typekey")(WordDotField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  extension [Self <: Field](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Range): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: () => Unit): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCut(value: () => Unit): Self = StObject.set(x, "Cut", js.Any.fromFunction0(value))
    
    inline def setData(value: String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setDoClick(value: () => Unit): Self = StObject.set(x, "DoClick", js.Any.fromFunction0(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setInlineShape(value: InlineShape): Self = StObject.set(x, "InlineShape", value.asInstanceOf[js.Any])
    
    inline def setKind(value: WdFieldKind): Self = StObject.set(x, "Kind", value.asInstanceOf[js.Any])
    
    inline def setLinkFormat(value: LinkFormat): Self = StObject.set(x, "LinkFormat", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    inline def setNext(value: Field): Self = StObject.set(x, "Next", value.asInstanceOf[js.Any])
    
    inline def setOLEFormat(value: OLEFormat): Self = StObject.set(x, "OLEFormat", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: Field): Self = StObject.set(x, "Previous", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Range): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    inline def setShowCodes(value: Boolean): Self = StObject.set(x, "ShowCodes", value.asInstanceOf[js.Any])
    
    inline def setType(value: WdFieldType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUnlink(value: () => Unit): Self = StObject.set(x, "Unlink", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: () => Boolean): Self = StObject.set(x, "Update", js.Any.fromFunction0(value))
    
    inline def setUpdateSource(value: () => Unit): Self = StObject.set(x, "UpdateSource", js.Any.fromFunction0(value))
    
    inline def setWordDotField_typekey(value: Field): Self = StObject.set(x, "Word.Field_typekey", value.asInstanceOf[js.Any])
  }
}
