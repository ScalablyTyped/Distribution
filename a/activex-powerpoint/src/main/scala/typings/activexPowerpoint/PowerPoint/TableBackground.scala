package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.ReflectionFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableBackground extends StObject {
  
  val Fill: FillFormat = js.native
  
  val Picture: PictureFormat = js.native
  
  @JSName("PowerPoint.TableBackground_typekey")
  var PowerPointDotTableBackground_typekey: TableBackground = js.native
  
  val Reflection: ReflectionFormat = js.native
  
  val Shadow: ShadowFormat = js.native
}
object TableBackground {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class TableBackgroundMutableBuilder[Self <: TableBackground] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: FillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: PictureFormat): Self = StObject.set(x, "Picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTableBackground_typekey(value: TableBackground): Self = StObject.set(x, "PowerPoint.TableBackground_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflection(value: ReflectionFormat): Self = StObject.set(x, "Reflection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadow(value: ShadowFormat): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
  }
}
