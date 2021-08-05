package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailEnvelopeObject extends StObject {
  
  var BCC: String
  
  var CC: String
  
  /* private */ @JSName("InfoPath.MailEnvelopeObject_typekey")
  var InfoPathDotMailEnvelopeObject_typekey: MailEnvelopeObject
  
  var Subject: String
  
  var To: String
  
  var Visible: Boolean
}
object MailEnvelopeObject {
  
  inline def apply(
    BCC: String,
    CC: String,
    InfoPathDotMailEnvelopeObject_typekey: MailEnvelopeObject,
    Subject: String,
    To: String,
    Visible: Boolean
  ): MailEnvelopeObject = {
    val __obj = js.Dynamic.literal(BCC = BCC.asInstanceOf[js.Any], CC = CC.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.MailEnvelopeObject_typekey")(InfoPathDotMailEnvelopeObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailEnvelopeObject]
  }
  
  extension [Self <: MailEnvelopeObject](x: Self) {
    
    inline def setBCC(value: String): Self = StObject.set(x, "BCC", value.asInstanceOf[js.Any])
    
    inline def setCC(value: String): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotMailEnvelopeObject_typekey(value: MailEnvelopeObject): Self = StObject.set(x, "InfoPath.MailEnvelopeObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
