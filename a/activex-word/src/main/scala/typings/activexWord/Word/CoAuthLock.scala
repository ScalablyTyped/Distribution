package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoAuthLock extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val HeaderFooter: Boolean
  
  val Owner: CoAuthor
  
  val Parent: Any
  
  val Range: typings.activexWord.Word.Range
  
  val Type: WdLockType
  
  def Unlock(): Unit
  
  /* private */ @JSName("Word.CoAuthLock_typekey")
  var WordDotCoAuthLock_typekey: CoAuthLock
}
object CoAuthLock {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    HeaderFooter: Boolean,
    Owner: CoAuthor,
    Parent: Any,
    Range: Range,
    Type: WdLockType,
    Unlock: () => Unit,
    WordDotCoAuthLock_typekey: CoAuthLock
  ): CoAuthLock = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], HeaderFooter = HeaderFooter.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Unlock = js.Any.fromFunction0(Unlock))
    __obj.updateDynamic("Word.CoAuthLock_typekey")(WordDotCoAuthLock_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthLock]
  }
  
  extension [Self <: CoAuthLock](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setHeaderFooter(value: Boolean): Self = StObject.set(x, "HeaderFooter", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: CoAuthor): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setType(value: WdLockType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUnlock(value: () => Unit): Self = StObject.set(x, "Unlock", js.Any.fromFunction0(value))
    
    inline def setWordDotCoAuthLock_typekey(value: CoAuthLock): Self = StObject.set(x, "Word.CoAuthLock_typekey", value.asInstanceOf[js.Any])
  }
}
