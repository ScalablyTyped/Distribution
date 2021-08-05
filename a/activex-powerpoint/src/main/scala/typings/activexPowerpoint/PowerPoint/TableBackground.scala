package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.ReflectionFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableBackground extends StObject {
  
  val Fill: FillFormat
  
  val Picture: PictureFormat
  
  /* private */ @JSName("PowerPoint.TableBackground_typekey")
  var PowerPointDotTableBackground_typekey: TableBackground
  
  val Reflection: ReflectionFormat
  
  val Shadow: ShadowFormat
}
object TableBackground {
  
  inline def apply(
    Fill: FillFormat,
    Picture: PictureFormat,
    PowerPointDotTableBackground_typekey: TableBackground,
    Reflection: ReflectionFormat,
    Shadow: ShadowFormat
  ): TableBackground = {
    val __obj = js.Dynamic.literal(Fill = Fill.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], Reflection = Reflection.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TableBackground_typekey")(PowerPointDotTableBackground_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBackground]
  }
  
  extension [Self <: TableBackground](x: Self) {
    
    inline def setFill(value: FillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setPicture(value: PictureFormat): Self = StObject.set(x, "Picture", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotTableBackground_typekey(value: TableBackground): Self = StObject.set(x, "PowerPoint.TableBackground_typekey", value.asInstanceOf[js.Any])
    
    inline def setReflection(value: ReflectionFormat): Self = StObject.set(x, "Reflection", value.asInstanceOf[js.Any])
    
    inline def setShadow(value: ShadowFormat): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
  }
}
