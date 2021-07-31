package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conflict extends StObject {
  
  def Accept(): Unit
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val Index: Double
  
  val Parent: js.Any
  
  val Range: typings.activexWord.Word.Range
  
  def Reject(): Unit
  
  val Type: WdRevisionType
  
  @JSName("Word.Conflict_typekey")
  var WordDotConflict_typekey: Conflict
}
object Conflict {
  
  @scala.inline
  def apply(
    Accept: () => Unit,
    Application: Application,
    Creator: Double,
    Index: Double,
    Parent: js.Any,
    Range: Range,
    Reject: () => Unit,
    Type: WdRevisionType,
    WordDotConflict_typekey: Conflict
  ): Conflict = {
    val __obj = js.Dynamic.literal(Accept = js.Any.fromFunction0(Accept), Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reject = js.Any.fromFunction0(Reject), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Conflict_typekey")(WordDotConflict_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflict]
  }
  
  @scala.inline
  implicit class ConflictMutableBuilder[Self <: Conflict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: () => Unit): Self = StObject.set(x, "Accept", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReject(value: () => Unit): Self = StObject.set(x, "Reject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: WdRevisionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotConflict_typekey(value: Conflict): Self = StObject.set(x, "Word.Conflict_typekey", value.asInstanceOf[js.Any])
  }
}
