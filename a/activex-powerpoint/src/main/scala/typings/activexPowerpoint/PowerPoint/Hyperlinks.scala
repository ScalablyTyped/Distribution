package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hyperlinks extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  def Item(Index: Double): Hyperlink
  
  val Parent: js.Any
  
  @JSName("PowerPoint.Hyperlinks_typekey")
  var PowerPointDotHyperlinks_typekey: Hyperlinks
}
object Hyperlinks {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: Double => Hyperlink,
    Parent: js.Any,
    PowerPointDotHyperlinks_typekey: Hyperlinks
  ): Hyperlinks = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Hyperlinks_typekey")(PowerPointDotHyperlinks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hyperlinks]
  }
  
  @scala.inline
  implicit class HyperlinksMutableBuilder[Self <: Hyperlinks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => Hyperlink): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotHyperlinks_typekey(value: Hyperlinks): Self = StObject.set(x, "PowerPoint.Hyperlinks_typekey", value.asInstanceOf[js.Any])
  }
}
