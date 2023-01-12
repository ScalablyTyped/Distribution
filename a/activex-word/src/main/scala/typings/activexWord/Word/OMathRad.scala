package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathRad extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val Deg: OMath
  
  val E: OMath
  
  var HideDeg: Boolean
  
  val Parent: Any
  
  /* private */ @JSName("Word.OMathRad_typekey")
  var WordDotOMathRad_typekey: OMathRad
}
object OMathRad {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Deg: OMath,
    E: OMath,
    HideDeg: Boolean,
    Parent: Any,
    WordDotOMathRad_typekey: OMathRad
  ): OMathRad = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Deg = Deg.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], HideDeg = HideDeg.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathRad_typekey")(WordDotOMathRad_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathRad]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OMathRad] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDeg(value: OMath): Self = StObject.set(x, "Deg", value.asInstanceOf[js.Any])
    
    inline def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    inline def setHideDeg(value: Boolean): Self = StObject.set(x, "HideDeg", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathRad_typekey(value: OMathRad): Self = StObject.set(x, "Word.OMathRad_typekey", value.asInstanceOf[js.Any])
  }
}
