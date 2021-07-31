package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Corners extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  val Name: String
  
  val Parent: js.Any
  
  def Select(): js.Any
  
  @JSName("Word.Corners_typekey")
  var WordDotCorners_typekey: Corners
}
object Corners {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any,
    WordDotCorners_typekey: Corners
  ): Corners = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Word.Corners_typekey")(WordDotCorners_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corners]
  }
  
  @scala.inline
  implicit class CornersMutableBuilder[Self <: Corners] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotCorners_typekey(value: Corners): Self = StObject.set(x, "Word.Corners_typekey", value.asInstanceOf[js.Any])
  }
}
