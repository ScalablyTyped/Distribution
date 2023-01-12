package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddIns extends StObject {
  
  def Add(FileName: String): AddIn
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  def Item(Index: Any): AddIn
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.AddIns_typekey")
  var PowerPointDotAddIns_typekey: AddIns
  
  def Remove(Index: Any): Unit
}
object AddIns {
  
  inline def apply(
    Add: String => AddIn,
    Application: Application,
    Count: Double,
    Item: Any => AddIn,
    Parent: Any,
    PowerPointDotAddIns_typekey: AddIns,
    Remove: Any => Unit
  ): AddIns = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove))
    __obj.updateDynamic("PowerPoint.AddIns_typekey")(PowerPointDotAddIns_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddIns] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: String => AddIn): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => AddIn): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotAddIns_typekey(value: AddIns): Self = StObject.set(x, "PowerPoint.AddIns_typekey", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Any => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
