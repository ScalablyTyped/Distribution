package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathBar extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var BarTop: Boolean
  
  val Creator: Double
  
  val E: OMath
  
  val Parent: Any
  
  /* private */ @JSName("Word.OMathBar_typekey")
  var WordDotOMathBar_typekey: OMathBar
}
object OMathBar {
  
  inline def apply(
    Application: Application,
    BarTop: Boolean,
    Creator: Double,
    E: OMath,
    Parent: Any,
    WordDotOMathBar_typekey: OMathBar
  ): OMathBar = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BarTop = BarTop.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBar_typekey")(WordDotOMathBar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OMathBar] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBarTop(value: Boolean): Self = StObject.set(x, "BarTop", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathBar_typekey(value: OMathBar): Self = StObject.set(x, "Word.OMathBar_typekey", value.asInstanceOf[js.Any])
  }
}
