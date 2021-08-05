package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocSiteControl extends StObject {
  
  /* private */ @JSName("Outlook._DocSiteControl_typekey")
  var OutlookDot_DocSiteControl_typekey: DocSiteControl
  
  var ReadOnly: Double
  
  var SuppressAttachments: Double
}
object DocSiteControl {
  
  inline def apply(OutlookDot_DocSiteControl_typekey: DocSiteControl, ReadOnly: Double, SuppressAttachments: Double): DocSiteControl = {
    val __obj = js.Dynamic.literal(ReadOnly = ReadOnly.asInstanceOf[js.Any], SuppressAttachments = SuppressAttachments.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook._DocSiteControl_typekey")(OutlookDot_DocSiteControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocSiteControl]
  }
  
  extension [Self <: DocSiteControl](x: Self) {
    
    inline def setOutlookDot_DocSiteControl_typekey(value: DocSiteControl): Self = StObject.set(x, "Outlook._DocSiteControl_typekey", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Double): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setSuppressAttachments(value: Double): Self = StObject.set(x, "SuppressAttachments", value.asInstanceOf[js.Any])
  }
}
