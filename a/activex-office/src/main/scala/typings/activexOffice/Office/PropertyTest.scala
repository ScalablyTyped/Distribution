package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyTest extends StObject {
  
  val Application: js.Any = js.native
  
  val Condition: MsoCondition = js.native
  
  val Connector: MsoConnector = js.native
  
  val Creator: Double = js.native
  
  val Name: String = js.native
  
  @JSName("Office.PropertyTest_typekey")
  var OfficeDotPropertyTest_typekey: PropertyTest = js.native
  
  val SecondValue: js.Any = js.native
  
  val Value: js.Any = js.native
}
object PropertyTest {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Condition: MsoCondition,
    Connector: MsoConnector,
    Creator: Double,
    Name: String,
    OfficeDotPropertyTest_typekey: PropertyTest,
    SecondValue: js.Any,
    Value: js.Any
  ): PropertyTest = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Condition = Condition.asInstanceOf[js.Any], Connector = Connector.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SecondValue = SecondValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PropertyTest_typekey")(OfficeDotPropertyTest_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyTest]
  }
  
  @scala.inline
  implicit class PropertyTestMutableBuilder[Self <: PropertyTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: MsoCondition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnector(value: MsoConnector): Self = StObject.set(x, "Connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotPropertyTest_typekey(value: PropertyTest): Self = StObject.set(x, "Office.PropertyTest_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondValue(value: js.Any): Self = StObject.set(x, "SecondValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
