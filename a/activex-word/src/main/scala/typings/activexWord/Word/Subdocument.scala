package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subdocument extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  def Delete(): Unit
  
  val HasFile: Boolean
  
  val Level: Double
  
  var Locked: Boolean
  
  val Name: String
  
  def Open(): Document
  
  val Parent: Any
  
  val Path: String
  
  val Range: typings.activexWord.Word.Range
  
  def Split(Range: typings.activexWord.Word.Range): Unit
  
  /* private */ @JSName("Word.Subdocument_typekey")
  var WordDotSubdocument_typekey: Subdocument
}
object Subdocument {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    HasFile: Boolean,
    Level: Double,
    Locked: Boolean,
    Name: String,
    Open: () => Document,
    Parent: Any,
    Path: String,
    Range: Range,
    Split: Range => Unit,
    WordDotSubdocument_typekey: Subdocument
  ): Subdocument = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), HasFile = HasFile.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Open = js.Any.fromFunction0(Open), Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Split = js.Any.fromFunction1(Split))
    __obj.updateDynamic("Word.Subdocument_typekey")(WordDotSubdocument_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subdocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subdocument] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setHasFile(value: Boolean): Self = StObject.set(x, "HasFile", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: () => Document): Self = StObject.set(x, "Open", js.Any.fromFunction0(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setSplit(value: Range => Unit): Self = StObject.set(x, "Split", js.Any.fromFunction1(value))
    
    inline def setWordDotSubdocument_typekey(value: Subdocument): Self = StObject.set(x, "Word.Subdocument_typekey", value.asInstanceOf[js.Any])
  }
}
