package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MsoDebugOptions extends StObject {
  
  def AddIgnoredAssertTag(bstrTagToIgnore: String): Unit
  
  val Application: Any
  
  val Creator: Double
  
  var FeatureReports: Double
  
  /* private */ @JSName("Office.MsoDebugOptions_typekey")
  var OfficeDotMsoDebugOptions_typekey: MsoDebugOptions
  
  var OutputToDebugger: Boolean
  
  var OutputToFile: Boolean
  
  var OutputToMessageBox: Boolean
  
  def RemoveIgnoredAssertTag(bstrTagToIgnore: String): Unit
  
  val UnitTestManager: Any
}
object MsoDebugOptions {
  
  inline def apply(
    AddIgnoredAssertTag: String => Unit,
    Application: Any,
    Creator: Double,
    FeatureReports: Double,
    OfficeDotMsoDebugOptions_typekey: MsoDebugOptions,
    OutputToDebugger: Boolean,
    OutputToFile: Boolean,
    OutputToMessageBox: Boolean,
    RemoveIgnoredAssertTag: String => Unit,
    UnitTestManager: Any
  ): MsoDebugOptions = {
    val __obj = js.Dynamic.literal(AddIgnoredAssertTag = js.Any.fromFunction1(AddIgnoredAssertTag), Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FeatureReports = FeatureReports.asInstanceOf[js.Any], OutputToDebugger = OutputToDebugger.asInstanceOf[js.Any], OutputToFile = OutputToFile.asInstanceOf[js.Any], OutputToMessageBox = OutputToMessageBox.asInstanceOf[js.Any], RemoveIgnoredAssertTag = js.Any.fromFunction1(RemoveIgnoredAssertTag), UnitTestManager = UnitTestManager.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.MsoDebugOptions_typekey")(OfficeDotMsoDebugOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsoDebugOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MsoDebugOptions] (val x: Self) extends AnyVal {
    
    inline def setAddIgnoredAssertTag(value: String => Unit): Self = StObject.set(x, "AddIgnoredAssertTag", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFeatureReports(value: Double): Self = StObject.set(x, "FeatureReports", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotMsoDebugOptions_typekey(value: MsoDebugOptions): Self = StObject.set(x, "Office.MsoDebugOptions_typekey", value.asInstanceOf[js.Any])
    
    inline def setOutputToDebugger(value: Boolean): Self = StObject.set(x, "OutputToDebugger", value.asInstanceOf[js.Any])
    
    inline def setOutputToFile(value: Boolean): Self = StObject.set(x, "OutputToFile", value.asInstanceOf[js.Any])
    
    inline def setOutputToMessageBox(value: Boolean): Self = StObject.set(x, "OutputToMessageBox", value.asInstanceOf[js.Any])
    
    inline def setRemoveIgnoredAssertTag(value: String => Unit): Self = StObject.set(x, "RemoveIgnoredAssertTag", js.Any.fromFunction1(value))
    
    inline def setUnitTestManager(value: Any): Self = StObject.set(x, "UnitTestManager", value.asInstanceOf[js.Any])
  }
}
