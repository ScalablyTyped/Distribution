package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMaths extends StObject {
  
  def Add(Range: Range): Range = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def BuildUp(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): OMath = js.native
  
  def Linearize(): Unit = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.OMaths_typekey")
  var WordDotOMaths_typekey: OMaths = js.native
}
object OMaths {
  
  @scala.inline
  def apply(
    Add: Range => Range,
    Application: Application,
    BuildUp: () => Unit,
    Count: Double,
    Creator: Double,
    Item: Double => OMath,
    Linearize: () => Unit,
    Parent: js.Any,
    WordDotOMaths_typekey: OMaths
  ): OMaths = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], BuildUp = js.Any.fromFunction0(BuildUp), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Linearize = js.Any.fromFunction0(Linearize), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMaths_typekey")(WordDotOMaths_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMaths]
  }
  
  @scala.inline
  implicit class OMathsMutableBuilder[Self <: OMaths] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Range => Range): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUp(value: () => Unit): Self = StObject.set(x, "BuildUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => OMath): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLinearize(value: () => Unit): Self = StObject.set(x, "Linearize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMaths_typekey(value: OMaths): Self = StObject.set(x, "Word.OMaths_typekey", value.asInstanceOf[js.Any])
  }
}
