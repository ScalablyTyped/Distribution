package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Revisions extends StObject {
  
  def AcceptAll(): Unit = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): Revision = js.native
  
  val Parent: js.Any = js.native
  
  def RejectAll(): Unit = js.native
  
  @JSName("Word.Revisions_typekey")
  var WordDotRevisions_typekey: Revisions = js.native
}
object Revisions {
  
  @scala.inline
  def apply(
    AcceptAll: () => Unit,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Revision,
    Parent: js.Any,
    RejectAll: () => Unit,
    WordDotRevisions_typekey: Revisions
  ): Revisions = {
    val __obj = js.Dynamic.literal(AcceptAll = js.Any.fromFunction0(AcceptAll), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], RejectAll = js.Any.fromFunction0(RejectAll))
    __obj.updateDynamic("Word.Revisions_typekey")(WordDotRevisions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revisions]
  }
  
  @scala.inline
  implicit class RevisionsMutableBuilder[Self <: Revisions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptAll(value: () => Unit): Self = StObject.set(x, "AcceptAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => Revision): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectAll(value: () => Unit): Self = StObject.set(x, "RejectAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotRevisions_typekey(value: Revisions): Self = StObject.set(x, "Word.Revisions_typekey", value.asInstanceOf[js.Any])
  }
}
