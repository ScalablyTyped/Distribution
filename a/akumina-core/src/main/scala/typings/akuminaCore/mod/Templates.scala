package typings.akuminaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Templates extends StObject {
  
  /**
    * Bind error templates for widgets
    * @param errorObj
    */
  def BindErrorTemplateForWidgets(errorObj: js.Any): Unit = js.native
  
  def GetCoreTemplate(htmlFile: String): String = js.native
  
  def GetErrorTemplate(data: js.Object): js.Promise[_] = js.native
  
  def GetViewPrefix(): Unit = js.native
  
  def GetVirtualMasterTemplate(): String = js.native
  
  def ParseTemplate(url: String, data: js.Any): js.Promise[_] = js.native
  
  def RequestTemplateFromServer(url: String): js.Promise[_] = js.native
}
object Templates {
  
  @scala.inline
  def apply(
    BindErrorTemplateForWidgets: js.Any => Unit,
    GetCoreTemplate: String => String,
    GetErrorTemplate: js.Object => js.Promise[_],
    GetViewPrefix: () => Unit,
    GetVirtualMasterTemplate: () => String,
    ParseTemplate: (String, js.Any) => js.Promise[_],
    RequestTemplateFromServer: String => js.Promise[_]
  ): Templates = {
    val __obj = js.Dynamic.literal(BindErrorTemplateForWidgets = js.Any.fromFunction1(BindErrorTemplateForWidgets), GetCoreTemplate = js.Any.fromFunction1(GetCoreTemplate), GetErrorTemplate = js.Any.fromFunction1(GetErrorTemplate), GetViewPrefix = js.Any.fromFunction0(GetViewPrefix), GetVirtualMasterTemplate = js.Any.fromFunction0(GetVirtualMasterTemplate), ParseTemplate = js.Any.fromFunction2(ParseTemplate), RequestTemplateFromServer = js.Any.fromFunction1(RequestTemplateFromServer))
    __obj.asInstanceOf[Templates]
  }
  
  @scala.inline
  implicit class TemplatesMutableBuilder[Self <: Templates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindErrorTemplateForWidgets(value: js.Any => Unit): Self = StObject.set(x, "BindErrorTemplateForWidgets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCoreTemplate(value: String => String): Self = StObject.set(x, "GetCoreTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetErrorTemplate(value: js.Object => js.Promise[_]): Self = StObject.set(x, "GetErrorTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetViewPrefix(value: () => Unit): Self = StObject.set(x, "GetViewPrefix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVirtualMasterTemplate(value: () => String): Self = StObject.set(x, "GetVirtualMasterTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParseTemplate(value: (String, js.Any) => js.Promise[_]): Self = StObject.set(x, "ParseTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRequestTemplateFromServer(value: String => js.Promise[_]): Self = StObject.set(x, "RequestTemplateFromServer", js.Any.fromFunction1(value))
  }
}
