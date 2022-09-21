package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endnote extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Index: Double
  
  val Parent: Any
  
  val Range: typings.activexWord.Word.Range
  
  val Reference: typings.activexWord.Word.Range
  
  /* private */ @JSName("Word.Endnote_typekey")
  var WordDotEndnote_typekey: Endnote
}
object Endnote {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Parent: Any,
    Range: Range,
    Reference: Range,
    WordDotEndnote_typekey: Endnote
  ): Endnote = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reference = Reference.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Endnote_typekey")(WordDotEndnote_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endnote]
  }
  
  extension [Self <: Endnote](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setReference(value: Range): Self = StObject.set(x, "Reference", value.asInstanceOf[js.Any])
    
    inline def setWordDotEndnote_typekey(value: Endnote): Self = StObject.set(x, "Word.Endnote_typekey", value.asInstanceOf[js.Any])
  }
}
