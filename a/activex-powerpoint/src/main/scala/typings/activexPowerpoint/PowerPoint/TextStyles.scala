package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStyles extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Type: PpTextStyleType): TextStyle = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.TextStyles_typekey")
  var PowerPointDotTextStyles_typekey: TextStyles = js.native
}
object TextStyles {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: PpTextStyleType => TextStyle,
    Parent: js.Any,
    PowerPointDotTextStyles_typekey: TextStyles
  ): TextStyles = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextStyles_typekey")(PowerPointDotTextStyles_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyles]
  }
  
  @scala.inline
  implicit class TextStylesMutableBuilder[Self <: TextStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: PpTextStyleType => TextStyle): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTextStyles_typekey(value: TextStyles): Self = StObject.set(x, "PowerPoint.TextStyles_typekey", value.asInstanceOf[js.Any])
  }
}
