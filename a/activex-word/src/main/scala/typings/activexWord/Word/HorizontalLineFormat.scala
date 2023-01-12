package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalLineFormat extends StObject {
  
  var Alignment: WdHorizontalLineAlignment
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  var NoShade: Boolean
  
  val Parent: Any
  
  var PercentWidth: Double
  
  var WidthType: WdHorizontalLineWidthType
  
  /* private */ @JSName("Word.HorizontalLineFormat_typekey")
  var WordDotHorizontalLineFormat_typekey: HorizontalLineFormat
}
object HorizontalLineFormat {
  
  inline def apply(
    Alignment: WdHorizontalLineAlignment,
    Application: Application,
    Creator: Double,
    NoShade: Boolean,
    Parent: Any,
    PercentWidth: Double,
    WidthType: WdHorizontalLineWidthType,
    WordDotHorizontalLineFormat_typekey: HorizontalLineFormat
  ): HorizontalLineFormat = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], NoShade = NoShade.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PercentWidth = PercentWidth.asInstanceOf[js.Any], WidthType = WidthType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HorizontalLineFormat_typekey")(WordDotHorizontalLineFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalLineFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HorizontalLineFormat] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: WdHorizontalLineAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setNoShade(value: Boolean): Self = StObject.set(x, "NoShade", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPercentWidth(value: Double): Self = StObject.set(x, "PercentWidth", value.asInstanceOf[js.Any])
    
    inline def setWidthType(value: WdHorizontalLineWidthType): Self = StObject.set(x, "WidthType", value.asInstanceOf[js.Any])
    
    inline def setWordDotHorizontalLineFormat_typekey(value: HorizontalLineFormat): Self = StObject.set(x, "Word.HorizontalLineFormat_typekey", value.asInstanceOf[js.Any])
  }
}
