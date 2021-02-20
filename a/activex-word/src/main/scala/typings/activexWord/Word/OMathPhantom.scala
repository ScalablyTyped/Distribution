package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathPhantom extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val E: OMath = js.native
  
  val Parent: js.Any = js.native
  
  var Show: Boolean = js.native
  
  var Smash: Boolean = js.native
  
  var Transp: Boolean = js.native
  
  @JSName("Word.OMathPhantom_typekey")
  var WordDotOMathPhantom_typekey: OMathPhantom = js.native
  
  var ZeroAsc: Boolean = js.native
  
  var ZeroDesc: Boolean = js.native
  
  var ZeroWid: Boolean = js.native
}
object OMathPhantom {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class OMathPhantomMutableBuilder[Self <: OMathPhantom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "Show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmash(value: Boolean): Self = StObject.set(x, "Smash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransp(value: Boolean): Self = StObject.set(x, "Transp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathPhantom_typekey(value: OMathPhantom): Self = StObject.set(x, "Word.OMathPhantom_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroAsc(value: Boolean): Self = StObject.set(x, "ZeroAsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroDesc(value: Boolean): Self = StObject.set(x, "ZeroDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroWid(value: Boolean): Self = StObject.set(x, "ZeroWid", value.asInstanceOf[js.Any])
  }
}
