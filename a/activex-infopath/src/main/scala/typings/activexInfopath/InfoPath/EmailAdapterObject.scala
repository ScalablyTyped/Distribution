package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailAdapterObject extends StObject {
  
  var AttachmentFileName: String
  
  var AttachmentType: XdAttachmentType
  
  var BCC: String
  
  var CC: String
  
  @JSName("InfoPath.EmailAdapterObject_typekey")
  var InfoPathDotEmailAdapterObject_typekey: EmailAdapterObject
  
  var Intro: String
  
  val Name: String
  
  def Query(): Unit
  
  val QueryAllowed: Boolean
  
  var Subject: String
  
  def Submit(): Unit
  
  val SubmitAllowed: Boolean
  
  def SubmitData(pData: IXMLDOMNode): Unit
  
  var To: String
}
object EmailAdapterObject {
  
  @scala.inline
  def apply(
    AttachmentFileName: String,
    AttachmentType: XdAttachmentType,
    BCC: String,
    CC: String,
    InfoPathDotEmailAdapterObject_typekey: EmailAdapterObject,
    Intro: String,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    Subject: String,
    Submit: () => Unit,
    SubmitAllowed: Boolean,
    SubmitData: IXMLDOMNode => Unit,
    To: String
  ): EmailAdapterObject = {
    val __obj = js.Dynamic.literal(AttachmentFileName = AttachmentFileName.asInstanceOf[js.Any], AttachmentType = AttachmentType.asInstanceOf[js.Any], BCC = BCC.asInstanceOf[js.Any], CC = CC.asInstanceOf[js.Any], Intro = Intro.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any], SubmitData = js.Any.fromFunction1(SubmitData), To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.EmailAdapterObject_typekey")(InfoPathDotEmailAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAdapterObject]
  }
  
  @scala.inline
  implicit class EmailAdapterObjectMutableBuilder[Self <: EmailAdapterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentFileName(value: String): Self = StObject.set(x, "AttachmentFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentType(value: XdAttachmentType): Self = StObject.set(x, "AttachmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBCC(value: String): Self = StObject.set(x, "BCC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCC(value: String): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotEmailAdapterObject_typekey(value: EmailAdapterObject): Self = StObject.set(x, "InfoPath.EmailAdapterObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntro(value: String): Self = StObject.set(x, "Intro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: () => Unit): Self = StObject.set(x, "Query", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmit(value: () => Unit): Self = StObject.set(x, "Submit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitData(value: IXMLDOMNode => Unit): Self = StObject.set(x, "SubmitData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
