package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMaths extends StObject {
  
  def Add(Range: Range): Range
  
  val Application: typings.activexWord.Word.Application
  
  def BuildUp(): Unit
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): OMath
  
  def Linearize(): Unit
  
  val Parent: Any
  
  /* private */ @JSName("Word.OMaths_typekey")
  var WordDotOMaths_typekey: OMaths
}
object OMaths {
  
  inline def apply(
    Add: Range => Range,
    Application: Application,
    BuildUp: () => Unit,
    Count: Double,
    Creator: Double,
    Item: Double => OMath,
    Linearize: () => Unit,
    Parent: Any,
    WordDotOMaths_typekey: OMaths
  ): OMaths = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], BuildUp = js.Any.fromFunction0(BuildUp), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Linearize = js.Any.fromFunction0(Linearize), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMaths_typekey")(WordDotOMaths_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMaths]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OMaths] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: Range => Range): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBuildUp(value: () => Unit): Self = StObject.set(x, "BuildUp", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => OMath): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setLinearize(value: () => Unit): Self = StObject.set(x, "Linearize", js.Any.fromFunction0(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMaths_typekey(value: OMaths): Self = StObject.set(x, "Word.OMaths_typekey", value.asInstanceOf[js.Any])
  }
}
