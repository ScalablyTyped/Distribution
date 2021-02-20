package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoAuthUpdates extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): CoAuthUpdate = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.CoAuthUpdates_typekey")
  var WordDotCoAuthUpdates_typekey: CoAuthUpdates = js.native
}
object CoAuthUpdates {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => CoAuthUpdate,
    Parent: js.Any,
    WordDotCoAuthUpdates_typekey: CoAuthUpdates
  ): CoAuthUpdates = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CoAuthUpdates_typekey")(WordDotCoAuthUpdates_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthUpdates]
  }
  
  @scala.inline
  implicit class CoAuthUpdatesMutableBuilder[Self <: CoAuthUpdates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => CoAuthUpdate): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotCoAuthUpdates_typekey(value: CoAuthUpdates): Self = StObject.set(x, "Word.CoAuthUpdates_typekey", value.asInstanceOf[js.Any])
  }
}
