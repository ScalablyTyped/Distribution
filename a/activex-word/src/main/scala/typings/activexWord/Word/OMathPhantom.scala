package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathPhantom extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val E: OMath
  
  val Parent: js.Any
  
  var Show: Boolean
  
  var Smash: Boolean
  
  var Transp: Boolean
  
  /* private */ @JSName("Word.OMathPhantom_typekey")
  var WordDotOMathPhantom_typekey: OMathPhantom
  
  var ZeroAsc: Boolean
  
  var ZeroDesc: Boolean
  
  var ZeroWid: Boolean
}
object OMathPhantom {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    Show: Boolean,
    Smash: Boolean,
    Transp: Boolean,
    WordDotOMathPhantom_typekey: OMathPhantom,
    ZeroAsc: Boolean,
    ZeroDesc: Boolean,
    ZeroWid: Boolean
  ): OMathPhantom = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Show = Show.asInstanceOf[js.Any], Smash = Smash.asInstanceOf[js.Any], Transp = Transp.asInstanceOf[js.Any], ZeroAsc = ZeroAsc.asInstanceOf[js.Any], ZeroDesc = ZeroDesc.asInstanceOf[js.Any], ZeroWid = ZeroWid.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathPhantom_typekey")(WordDotOMathPhantom_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathPhantom]
  }
  
  extension [Self <: OMathPhantom](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "Show", value.asInstanceOf[js.Any])
    
    inline def setSmash(value: Boolean): Self = StObject.set(x, "Smash", value.asInstanceOf[js.Any])
    
    inline def setTransp(value: Boolean): Self = StObject.set(x, "Transp", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathPhantom_typekey(value: OMathPhantom): Self = StObject.set(x, "Word.OMathPhantom_typekey", value.asInstanceOf[js.Any])
    
    inline def setZeroAsc(value: Boolean): Self = StObject.set(x, "ZeroAsc", value.asInstanceOf[js.Any])
    
    inline def setZeroDesc(value: Boolean): Self = StObject.set(x, "ZeroDesc", value.asInstanceOf[js.Any])
    
    inline def setZeroWid(value: Boolean): Self = StObject.set(x, "ZeroWid", value.asInstanceOf[js.Any])
  }
}
