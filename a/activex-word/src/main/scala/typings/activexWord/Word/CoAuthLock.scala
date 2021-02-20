package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoAuthLock extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val HeaderFooter: Boolean = js.native
  
  val Owner: CoAuthor = js.native
  
  val Parent: js.Any = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  val Type: WdLockType = js.native
  
  def Unlock(): Unit = js.native
  
  @JSName("Word.CoAuthLock_typekey")
  var WordDotCoAuthLock_typekey: CoAuthLock = js.native
}
object CoAuthLock {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    HeaderFooter: Boolean,
    Owner: CoAuthor,
    Parent: js.Any,
    Range: Range,
    Type: WdLockType,
    Unlock: () => Unit,
    WordDotCoAuthLock_typekey: CoAuthLock
  ): CoAuthLock = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], HeaderFooter = HeaderFooter.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Unlock = js.Any.fromFunction0(Unlock))
    __obj.updateDynamic("Word.CoAuthLock_typekey")(WordDotCoAuthLock_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthLock]
  }
  
  @scala.inline
  implicit class CoAuthLockMutableBuilder[Self <: CoAuthLock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFooter(value: Boolean): Self = StObject.set(x, "HeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: CoAuthor): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WdLockType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlock(value: () => Unit): Self = StObject.set(x, "Unlock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotCoAuthLock_typekey(value: CoAuthLock): Self = StObject.set(x, "Word.CoAuthLock_typekey", value.asInstanceOf[js.Any])
  }
}
