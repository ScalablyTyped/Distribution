package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Corners extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  val Name: String
  
  val Parent: Any
  
  def Select(): Any
  
  /* private */ @JSName("Word.Corners_typekey")
  var WordDotCorners_typekey: Corners
}
object Corners {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Name: String,
    Parent: Any,
    Select: () => Any,
    WordDotCorners_typekey: Corners
  ): Corners = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Word.Corners_typekey")(WordDotCorners_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corners]
  }
  
  extension [Self <: Corners](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    inline def setWordDotCorners_typekey(value: Corners): Self = StObject.set(x, "Word.Corners_typekey", value.asInstanceOf[js.Any])
  }
}
