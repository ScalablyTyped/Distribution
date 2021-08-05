package typings.activexAccess

import typings.activexAccess.AccWizObjects.FieldList
import typings.activexAccess.AccWizObjects.ImexGrid
import typings.activexAccess.AccWizObjects.WizShellLinkA
import typings.activexAccess.Access.Application
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("ACCWIZ.FieldListCtrl")
  var ACCWIZDotFieldListCtrl: FieldList
  
  @JSName("ACCWIZ.ImexGridCtrl")
  var ACCWIZDotImexGridCtrl: ImexGrid
  
  @JSName("Access.Application")
  var AccessDotApplication: Application
  
  var lnkfile: WizShellLinkA
}
object ActiveXObjectNameMap {
  
  inline def apply(
    ACCWIZDotFieldListCtrl: FieldList,
    ACCWIZDotImexGridCtrl: ImexGrid,
    AccessDotApplication: Application,
    lnkfile: WizShellLinkA
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(lnkfile = lnkfile.asInstanceOf[js.Any])
    __obj.updateDynamic("ACCWIZ.FieldListCtrl")(ACCWIZDotFieldListCtrl.asInstanceOf[js.Any])
    __obj.updateDynamic("ACCWIZ.ImexGridCtrl")(ACCWIZDotImexGridCtrl.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.Application")(AccessDotApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  extension [Self <: ActiveXObjectNameMap](x: Self) {
    
    inline def setACCWIZDotFieldListCtrl(value: FieldList): Self = StObject.set(x, "ACCWIZ.FieldListCtrl", value.asInstanceOf[js.Any])
    
    inline def setACCWIZDotImexGridCtrl(value: ImexGrid): Self = StObject.set(x, "ACCWIZ.ImexGridCtrl", value.asInstanceOf[js.Any])
    
    inline def setAccessDotApplication(value: Application): Self = StObject.set(x, "Access.Application", value.asInstanceOf[js.Any])
    
    inline def setLnkfile(value: WizShellLinkA): Self = StObject.set(x, "lnkfile", value.asInstanceOf[js.Any])
  }
}
