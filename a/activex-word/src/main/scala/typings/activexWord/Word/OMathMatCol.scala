package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathMatCol extends StObject {
  
  var Align: WdOMathHorizAlignType = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Args: OMathArgs = js.native
  
  val ColIndex: Double = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.OMathMatCol_typekey")
  var WordDotOMathMatCol_typekey: OMathMatCol = js.native
}
object OMathMatCol {
  
  @scala.inline
  def apply(
    Align: WdOMathHorizAlignType,
    Application: Application,
    Args: OMathArgs,
    ColIndex: Double,
    Creator: Double,
    Delete: () => Unit,
    Parent: js.Any,
    WordDotOMathMatCol_typekey: OMathMatCol
  ): OMathMatCol = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], ColIndex = ColIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathMatCol_typekey")(WordDotOMathMatCol_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathMatCol]
  }
  
  @scala.inline
  implicit class OMathMatColMutableBuilder[Self <: OMathMatCol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: WdOMathHorizAlignType): Self = StObject.set(x, "Align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: OMathArgs): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColIndex(value: Double): Self = StObject.set(x, "ColIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathMatCol_typekey(value: OMathMatCol): Self = StObject.set(x, "Word.OMathMatCol_typekey", value.asInstanceOf[js.Any])
  }
}
