package typings.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldContentControl extends StObject {
  
  val InUndoRedo: Boolean
  
  val OldContentControl: typings.activexWord.Word.ContentControl
}
object OldContentControl {
  
  inline def apply(InUndoRedo: Boolean, OldContentControl: typings.activexWord.Word.ContentControl): OldContentControl = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldContentControl = OldContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldContentControl]
  }
  
  extension [Self <: OldContentControl](x: Self) {
    
    inline def setInUndoRedo(value: Boolean): Self = StObject.set(x, "InUndoRedo", value.asInstanceOf[js.Any])
    
    inline def setOldContentControl(value: typings.activexWord.Word.ContentControl): Self = StObject.set(x, "OldContentControl", value.asInstanceOf[js.Any])
  }
}
