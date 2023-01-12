package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathMatCol extends StObject {
  
  var Align: WdOMathHorizAlignType
  
  val Application: typings.activexWord.Word.Application
  
  val Args: OMathArgs
  
  val ColIndex: Double
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Parent: Any
  
  /* private */ @JSName("Word.OMathMatCol_typekey")
  var WordDotOMathMatCol_typekey: OMathMatCol
}
object OMathMatCol {
  
  inline def apply(
    Align: WdOMathHorizAlignType,
    Application: Application,
    Args: OMathArgs,
    ColIndex: Double,
    Creator: Double,
    Delete: () => Unit,
    Parent: Any,
    WordDotOMathMatCol_typekey: OMathMatCol
  ): OMathMatCol = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], ColIndex = ColIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathMatCol_typekey")(WordDotOMathMatCol_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathMatCol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OMathMatCol] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: WdOMathHorizAlignType): Self = StObject.set(x, "Align", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setArgs(value: OMathArgs): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    inline def setColIndex(value: Double): Self = StObject.set(x, "ColIndex", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathMatCol_typekey(value: OMathMatCol): Self = StObject.set(x, "Word.OMathMatCol_typekey", value.asInstanceOf[js.Any])
  }
}
