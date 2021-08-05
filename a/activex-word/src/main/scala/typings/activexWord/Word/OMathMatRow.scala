package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathMatRow extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Args: OMathArgs
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Parent: js.Any
  
  val RowIndex: Double
  
  /* private */ @JSName("Word.OMathMatRow_typekey")
  var WordDotOMathMatRow_typekey: OMathMatRow
}
object OMathMatRow {
  
  inline def apply(
    Application: Application,
    Args: OMathArgs,
    Creator: Double,
    Delete: () => Unit,
    Parent: js.Any,
    RowIndex: Double,
    WordDotOMathMatRow_typekey: OMathMatRow
  ): OMathMatRow = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any], RowIndex = RowIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathMatRow_typekey")(WordDotOMathMatRow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathMatRow]
  }
  
  extension [Self <: OMathMatRow](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setArgs(value: OMathArgs): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "RowIndex", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathMatRow_typekey(value: OMathMatRow): Self = StObject.set(x, "Word.OMathMatRow_typekey", value.asInstanceOf[js.Any])
  }
}
