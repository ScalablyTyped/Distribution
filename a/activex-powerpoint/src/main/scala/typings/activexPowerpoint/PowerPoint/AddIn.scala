package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddIn extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  var AutoLoad: MsoTriState = js.native
  
  var DisplayAlerts: MsoTriState = js.native
  
  val FullName: String = js.native
  
  var Loaded: MsoTriState = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val Path: String = js.native
  
  @JSName("PowerPoint.AddIn_typekey")
  var PowerPointDotAddIn_typekey: AddIn = js.native
  
  var Registered: MsoTriState = js.native
  
  val RegisteredInHKLM: MsoTriState = js.native
}
object AddIn {
  
  @scala.inline
  def apply(
    Application: Application,
    AutoLoad: MsoTriState,
    DisplayAlerts: MsoTriState,
    FullName: String,
    Loaded: MsoTriState,
    Name: String,
    Parent: js.Any,
    Path: String,
    PowerPointDotAddIn_typekey: AddIn,
    Registered: MsoTriState,
    RegisteredInHKLM: MsoTriState
  ): AddIn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoLoad = AutoLoad.asInstanceOf[js.Any], DisplayAlerts = DisplayAlerts.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], Loaded = Loaded.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Registered = Registered.asInstanceOf[js.Any], RegisteredInHKLM = RegisteredInHKLM.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.AddIn_typekey")(PowerPointDotAddIn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIn]
  }
  
  @scala.inline
  implicit class AddInMutableBuilder[Self <: AddIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLoad(value: MsoTriState): Self = StObject.set(x, "AutoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAlerts(value: MsoTriState): Self = StObject.set(x, "DisplayAlerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaded(value: MsoTriState): Self = StObject.set(x, "Loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotAddIn_typekey(value: AddIn): Self = StObject.set(x, "PowerPoint.AddIn_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistered(value: MsoTriState): Self = StObject.set(x, "Registered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredInHKLM(value: MsoTriState): Self = StObject.set(x, "RegisteredInHKLM", value.asInstanceOf[js.Any])
  }
}
