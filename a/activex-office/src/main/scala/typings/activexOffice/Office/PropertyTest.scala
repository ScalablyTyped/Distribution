package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyTest extends StObject {
  
  val Application: Any
  
  val Condition: MsoCondition
  
  val Connector: MsoConnector
  
  val Creator: Double
  
  val Name: String
  
  /* private */ @JSName("Office.PropertyTest_typekey")
  var OfficeDotPropertyTest_typekey: PropertyTest
  
  val SecondValue: Any
  
  val Value: Any
}
object PropertyTest {
  
  inline def apply(
    Application: Any,
    Condition: MsoCondition,
    Connector: MsoConnector,
    Creator: Double,
    Name: String,
    OfficeDotPropertyTest_typekey: PropertyTest,
    SecondValue: Any,
    Value: Any
  ): PropertyTest = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Condition = Condition.asInstanceOf[js.Any], Connector = Connector.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SecondValue = SecondValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PropertyTest_typekey")(OfficeDotPropertyTest_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyTest]
  }
  
  extension [Self <: PropertyTest](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCondition(value: MsoCondition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConnector(value: MsoConnector): Self = StObject.set(x, "Connector", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotPropertyTest_typekey(value: PropertyTest): Self = StObject.set(x, "Office.PropertyTest_typekey", value.asInstanceOf[js.Any])
    
    inline def setSecondValue(value: Any): Self = StObject.set(x, "SecondValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
