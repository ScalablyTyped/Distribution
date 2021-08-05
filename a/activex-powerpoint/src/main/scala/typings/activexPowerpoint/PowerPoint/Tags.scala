package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tags extends StObject {
  
  def Add(Name: String, Value: String): Unit
  
  def AddBinary(Name: String, FilePath: String): Unit
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  def BinaryValue(Name: String): Double
  
  val Count: Double
  
  def Delete(Name: String): Unit
  
  def Item(Name: String): String
  
  def Name(Index: Double): String
  
  val Parent: js.Any
  
  /* private */ @JSName("PowerPoint.Tags_typekey")
  var PowerPointDotTags_typekey: Tags
  
  def Value(Index: Double): String
}
object Tags {
  
  inline def apply(
    Add: (String, String) => Unit,
    AddBinary: (String, String) => Unit,
    Application: Application,
    BinaryValue: String => Double,
    Count: Double,
    Delete: String => Unit,
    Item: String => String,
    Name: Double => String,
    Parent: js.Any,
    PowerPointDotTags_typekey: Tags,
    Value: Double => String
  ): Tags = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AddBinary = js.Any.fromFunction2(AddBinary), Application = Application.asInstanceOf[js.Any], BinaryValue = js.Any.fromFunction1(BinaryValue), Count = Count.asInstanceOf[js.Any], Delete = js.Any.fromFunction1(Delete), Item = js.Any.fromFunction1(Item), Name = js.Any.fromFunction1(Name), Parent = Parent.asInstanceOf[js.Any], Value = js.Any.fromFunction1(Value))
    __obj.updateDynamic("PowerPoint.Tags_typekey")(PowerPointDotTags_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tags]
  }
  
  extension [Self <: Tags](x: Self) {
    
    inline def setAdd(value: (String, String) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setAddBinary(value: (String, String) => Unit): Self = StObject.set(x, "AddBinary", js.Any.fromFunction2(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBinaryValue(value: String => Double): Self = StObject.set(x, "BinaryValue", js.Any.fromFunction1(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: String => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction1(value))
    
    inline def setItem(value: String => String): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setName(value: Double => String): Self = StObject.set(x, "Name", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotTags_typekey(value: Tags): Self = StObject.set(x, "PowerPoint.Tags_typekey", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double => String): Self = StObject.set(x, "Value", js.Any.fromFunction1(value))
  }
}
