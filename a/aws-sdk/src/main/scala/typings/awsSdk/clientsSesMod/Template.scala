package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Template extends StObject {
  
  /**
    * The HTML body of the email.
    */
  var HtmlPart: js.UndefOr[typings.awsSdk.clientsSesMod.HtmlPart] = js.undefined
  
  /**
    * The subject line of the email.
    */
  var SubjectPart: js.UndefOr[typings.awsSdk.clientsSesMod.SubjectPart] = js.undefined
  
  /**
    * The name of the template. You will refer to this name when you send email using the SendTemplatedEmail or SendBulkTemplatedEmail operations.
    */
  var TemplateName: typings.awsSdk.clientsSesMod.TemplateName
  
  /**
    * The email body that will be visible to recipients whose email clients do not display HTML.
    */
  var TextPart: js.UndefOr[typings.awsSdk.clientsSesMod.TextPart] = js.undefined
}
object Template {
  
  inline def apply(TemplateName: TemplateName): Template = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
    
    inline def setHtmlPart(value: HtmlPart): Self = StObject.set(x, "HtmlPart", value.asInstanceOf[js.Any])
    
    inline def setHtmlPartUndefined: Self = StObject.set(x, "HtmlPart", js.undefined)
    
    inline def setSubjectPart(value: SubjectPart): Self = StObject.set(x, "SubjectPart", value.asInstanceOf[js.Any])
    
    inline def setSubjectPartUndefined: Self = StObject.set(x, "SubjectPart", js.undefined)
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    inline def setTextPart(value: TextPart): Self = StObject.set(x, "TextPart", value.asInstanceOf[js.Any])
    
    inline def setTextPartUndefined: Self = StObject.set(x, "TextPart", js.undefined)
  }
}
