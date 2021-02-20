package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reviewer extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Parent: js.Any = js.native
  
  var Visible: Boolean = js.native
  
  @JSName("Word.Reviewer_typekey")
  var WordDotReviewer_typekey: Reviewer = js.native
}
object Reviewer {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    Visible: Boolean,
    WordDotReviewer_typekey: Reviewer
  ): Reviewer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Reviewer_typekey")(WordDotReviewer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reviewer]
  }
  
  @scala.inline
  implicit class ReviewerMutableBuilder[Self <: Reviewer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotReviewer_typekey(value: Reviewer): Self = StObject.set(x, "Word.Reviewer_typekey", value.asInstanceOf[js.Any])
  }
}
