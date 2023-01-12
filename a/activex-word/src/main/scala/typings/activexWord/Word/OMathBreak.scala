package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathBreak extends StObject {
  
  var AlignAt: Double
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Parent: Any
  
  val Range: typings.activexWord.Word.Range
  
  /* private */ @JSName("Word.OMathBreak_typekey")
  var WordDotOMathBreak_typekey: OMathBreak
}
object OMathBreak {
  
  inline def apply(
    AlignAt: Double,
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Parent: Any,
    Range: Range,
    WordDotOMathBreak_typekey: OMathBreak
  ): OMathBreak = {
    val __obj = js.Dynamic.literal(AlignAt = AlignAt.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBreak_typekey")(WordDotOMathBreak_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBreak]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OMathBreak] (val x: Self) extends AnyVal {
    
    inline def setAlignAt(value: Double): Self = StObject.set(x, "AlignAt", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathBreak_typekey(value: OMathBreak): Self = StObject.set(x, "Word.OMathBreak_typekey", value.asInstanceOf[js.Any])
  }
}
