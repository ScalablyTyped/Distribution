package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectVerbs extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): String = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.ObjectVerbs_typekey")
  var PowerPointDotObjectVerbs_typekey: ObjectVerbs = js.native
}
object ObjectVerbs {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: Double => String,
    Parent: js.Any,
    PowerPointDotObjectVerbs_typekey: ObjectVerbs
  ): ObjectVerbs = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ObjectVerbs_typekey")(PowerPointDotObjectVerbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectVerbs]
  }
  
  @scala.inline
  implicit class ObjectVerbsMutableBuilder[Self <: ObjectVerbs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => String): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotObjectVerbs_typekey(value: ObjectVerbs): Self = StObject.set(x, "PowerPoint.ObjectVerbs_typekey", value.asInstanceOf[js.Any])
  }
}
