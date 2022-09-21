package typings.akuminaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Templates extends StObject {
  
  /**
    * Bind error templates for widgets
    * @param errorObj
    */
  def BindErrorTemplateForWidgets(errorObj: Any): Unit
  
  def GetCoreTemplate(htmlFile: String): String
  
  def GetErrorTemplate(data: js.Object): js.Promise[Any]
  
  def GetFullViewPrefix(): String
  
  def GetViewPrefix(): Unit
  
  def GetVirtualMasterTemplate(): String
  
  def ParseTemplate(url: String, data: Any): js.Promise[Any]
  
  def RequestTemplateFromServer(url: String): js.Promise[Any]
}
object Templates {
  
  inline def apply(
    BindErrorTemplateForWidgets: Any => Unit,
    GetCoreTemplate: String => String,
    GetErrorTemplate: js.Object => js.Promise[Any],
    GetFullViewPrefix: () => String,
    GetViewPrefix: () => Unit,
    GetVirtualMasterTemplate: () => String,
    ParseTemplate: (String, Any) => js.Promise[Any],
    RequestTemplateFromServer: String => js.Promise[Any]
  ): Templates = {
    val __obj = js.Dynamic.literal(BindErrorTemplateForWidgets = js.Any.fromFunction1(BindErrorTemplateForWidgets), GetCoreTemplate = js.Any.fromFunction1(GetCoreTemplate), GetErrorTemplate = js.Any.fromFunction1(GetErrorTemplate), GetFullViewPrefix = js.Any.fromFunction0(GetFullViewPrefix), GetViewPrefix = js.Any.fromFunction0(GetViewPrefix), GetVirtualMasterTemplate = js.Any.fromFunction0(GetVirtualMasterTemplate), ParseTemplate = js.Any.fromFunction2(ParseTemplate), RequestTemplateFromServer = js.Any.fromFunction1(RequestTemplateFromServer))
    __obj.asInstanceOf[Templates]
  }
  
  extension [Self <: Templates](x: Self) {
    
    inline def setBindErrorTemplateForWidgets(value: Any => Unit): Self = StObject.set(x, "BindErrorTemplateForWidgets", js.Any.fromFunction1(value))
    
    inline def setGetCoreTemplate(value: String => String): Self = StObject.set(x, "GetCoreTemplate", js.Any.fromFunction1(value))
    
    inline def setGetErrorTemplate(value: js.Object => js.Promise[Any]): Self = StObject.set(x, "GetErrorTemplate", js.Any.fromFunction1(value))
    
    inline def setGetFullViewPrefix(value: () => String): Self = StObject.set(x, "GetFullViewPrefix", js.Any.fromFunction0(value))
    
    inline def setGetViewPrefix(value: () => Unit): Self = StObject.set(x, "GetViewPrefix", js.Any.fromFunction0(value))
    
    inline def setGetVirtualMasterTemplate(value: () => String): Self = StObject.set(x, "GetVirtualMasterTemplate", js.Any.fromFunction0(value))
    
    inline def setParseTemplate(value: (String, Any) => js.Promise[Any]): Self = StObject.set(x, "ParseTemplate", js.Any.fromFunction2(value))
    
    inline def setRequestTemplateFromServer(value: String => js.Promise[Any]): Self = StObject.set(x, "RequestTemplateFromServer", js.Any.fromFunction1(value))
  }
}
