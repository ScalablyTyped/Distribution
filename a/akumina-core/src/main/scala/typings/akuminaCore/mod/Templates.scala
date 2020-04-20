package typings.akuminaCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Templates extends js.Object {
  /**
    * Bind error templates for widgets
    * @param errorObj
    */
  def BindErrorTemplateForWidgets(errorObj: js.Any): Unit
  def GetCoreTemplate(htmlFile: String): String
  def GetErrorTemplate(data: js.Object): js.Promise[_]
  def GetViewPrefix(): Unit
  def GetVirtualMasterTemplate(): String
  def ParseTemplate(url: String, data: js.Any): js.Promise[_]
  def RequestTemplateFromServer(url: String): js.Promise[_]
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
}

