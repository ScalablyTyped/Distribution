package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishObjects extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): PublishObject = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.PublishObjects_typekey")
  var PowerPointDotPublishObjects_typekey: PublishObjects = js.native
}
object PublishObjects {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: Double => PublishObject,
    Parent: js.Any,
    PowerPointDotPublishObjects_typekey: PublishObjects
  ): PublishObjects = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PublishObjects_typekey")(PowerPointDotPublishObjects_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishObjects]
  }
  
  @scala.inline
  implicit class PublishObjectsMutableBuilder[Self <: PublishObjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => PublishObject): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotPublishObjects_typekey(value: PublishObjects): Self = StObject.set(x, "PowerPoint.PublishObjects_typekey", value.asInstanceOf[js.Any])
  }
}
