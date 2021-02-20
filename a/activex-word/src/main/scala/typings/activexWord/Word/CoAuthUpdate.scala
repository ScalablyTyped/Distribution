package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoAuthUpdate extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Parent: js.Any = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  @JSName("Word.CoAuthUpdate_typekey")
  var WordDotCoAuthUpdate_typekey: CoAuthUpdate = js.native
}
object CoAuthUpdate {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    Range: Range,
    WordDotCoAuthUpdate_typekey: CoAuthUpdate
  ): CoAuthUpdate = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CoAuthUpdate_typekey")(WordDotCoAuthUpdate_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthUpdate]
  }
  
  @scala.inline
  implicit class CoAuthUpdateMutableBuilder[Self <: CoAuthUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotCoAuthUpdate_typekey(value: CoAuthUpdate): Self = StObject.set(x, "Word.CoAuthUpdate_typekey", value.asInstanceOf[js.Any])
  }
}
