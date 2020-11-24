package typings.akuminaCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Templates extends js.Object {
  
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
  implicit class TemplatesOps[Self <: Templates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBindErrorTemplateForWidgets(value: js.Any => Unit): Self = this.set("BindErrorTemplateForWidgets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCoreTemplate(value: String => String): Self = this.set("GetCoreTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetErrorTemplate(value: js.Object => js.Promise[_]): Self = this.set("GetErrorTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetViewPrefix(value: () => Unit): Self = this.set("GetViewPrefix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVirtualMasterTemplate(value: () => String): Self = this.set("GetVirtualMasterTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParseTemplate(value: (String, js.Any) => js.Promise[_]): Self = this.set("ParseTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRequestTemplateFromServer(value: String => js.Promise[_]): Self = this.set("RequestTemplateFromServer", js.Any.fromFunction1(value))
  }
}
