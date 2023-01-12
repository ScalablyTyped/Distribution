package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reviewers extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): Reviewer
  
  val Parent: Any
  
  /* private */ @JSName("Word.Reviewers_typekey")
  var WordDotReviewers_typekey: Reviewers
}
object Reviewers {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => Reviewer,
    Parent: Any,
    WordDotReviewers_typekey: Reviewers
  ): Reviewers = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Reviewers_typekey")(WordDotReviewers_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reviewers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reviewers] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Reviewer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotReviewers_typekey(value: Reviewers): Self = StObject.set(x, "Word.Reviewers_typekey", value.asInstanceOf[js.Any])
  }
}
