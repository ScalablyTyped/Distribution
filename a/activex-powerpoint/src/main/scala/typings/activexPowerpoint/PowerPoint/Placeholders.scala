package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Placeholders extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def FindByName(Index: js.Any): Shape = js.native
  
  def Item(Index: Double): Shape = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Placeholders_typekey")
  var PowerPointDotPlaceholders_typekey: Placeholders = js.native
}
object Placeholders {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    FindByName: js.Any => Shape,
    Item: Double => Shape,
    Parent: js.Any,
    PowerPointDotPlaceholders_typekey: Placeholders
  ): Placeholders = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], FindByName = js.Any.fromFunction1(FindByName), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Placeholders_typekey")(PowerPointDotPlaceholders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholders]
  }
  
  @scala.inline
  implicit class PlaceholdersMutableBuilder[Self <: Placeholders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindByName(value: js.Any => Shape): Self = StObject.set(x, "FindByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: Double => Shape): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotPlaceholders_typekey(value: Placeholders): Self = StObject.set(x, "PowerPoint.Placeholders_typekey", value.asInstanceOf[js.Any])
  }
}
