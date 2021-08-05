package typings.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InUndoRedo extends StObject {
  
  val InUndoRedo: Boolean
  
  val NewContentControl: typings.activexWord.Word.ContentControl
}
object InUndoRedo {
  
  inline def apply(InUndoRedo: Boolean, NewContentControl: typings.activexWord.Word.ContentControl): InUndoRedo = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewContentControl = NewContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InUndoRedo]
  }
  
  extension [Self <: InUndoRedo](x: Self) {
    
    inline def setInUndoRedo(value: Boolean): Self = StObject.set(x, "InUndoRedo", value.asInstanceOf[js.Any])
    
    inline def setNewContentControl(value: typings.activexWord.Word.ContentControl): Self = StObject.set(x, "NewContentControl", value.asInstanceOf[js.Any])
  }
}
