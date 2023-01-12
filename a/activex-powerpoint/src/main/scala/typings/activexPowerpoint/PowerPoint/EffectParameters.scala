package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectParameters extends StObject {
  
  var Amount: Double
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Color2: ColorFormat
  
  var Direction: MsoAnimDirection
  
  var FontName: String
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.EffectParameters_typekey")
  var PowerPointDotEffectParameters_typekey: EffectParameters
  
  var Relative: MsoTriState
  
  var Size: Double
}
object EffectParameters {
  
  inline def apply(
    Amount: Double,
    Application: Application,
    Color2: ColorFormat,
    Direction: MsoAnimDirection,
    FontName: String,
    Parent: Any,
    PowerPointDotEffectParameters_typekey: EffectParameters,
    Relative: MsoTriState,
    Size: Double
  ): EffectParameters = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Color2 = Color2.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Relative = Relative.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.EffectParameters_typekey")(PowerPointDotEffectParameters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EffectParameters] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setColor2(value: ColorFormat): Self = StObject.set(x, "Color2", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: MsoAnimDirection): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    inline def setFontName(value: String): Self = StObject.set(x, "FontName", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotEffectParameters_typekey(value: EffectParameters): Self = StObject.set(x, "PowerPoint.EffectParameters_typekey", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: MsoTriState): Self = StObject.set(x, "Relative", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
  }
}
