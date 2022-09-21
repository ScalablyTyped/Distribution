package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectVerbs extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  def Item(Index: Double): String
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.ObjectVerbs_typekey")
  var PowerPointDotObjectVerbs_typekey: ObjectVerbs
}
object ObjectVerbs {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Item: Double => String,
    Parent: Any,
    PowerPointDotObjectVerbs_typekey: ObjectVerbs
  ): ObjectVerbs = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ObjectVerbs_typekey")(PowerPointDotObjectVerbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectVerbs]
  }
  
  extension [Self <: ObjectVerbs](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => String): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotObjectVerbs_typekey(value: ObjectVerbs): Self = StObject.set(x, "PowerPoint.ObjectVerbs_typekey", value.asInstanceOf[js.Any])
  }
}
