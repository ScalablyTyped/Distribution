package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comments extends StObject {
  
  def Add(Left: Double, Top: Double, Author: String, AuthorInitials: String, Text: String): Comment
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  def Item(Index: Double): Comment
  
  val Parent: js.Any
  
  @JSName("PowerPoint.Comments_typekey")
  var PowerPointDotComments_typekey: Comments
}
object Comments {
  
  @scala.inline
  def apply(
    Add: (Double, Double, String, String, String) => Comment,
    Application: Application,
    Count: Double,
    Item: Double => Comment,
    Parent: js.Any,
    PowerPointDotComments_typekey: Comments
  ): Comments = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction5(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Comments_typekey")(PowerPointDotComments_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comments]
  }
  
  @scala.inline
  implicit class CommentsMutableBuilder[Self <: Comments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, Double, String, String, String) => Comment): Self = StObject.set(x, "Add", js.Any.fromFunction5(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => Comment): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotComments_typekey(value: Comments): Self = StObject.set(x, "PowerPoint.Comments_typekey", value.asInstanceOf[js.Any])
  }
}
