package typings.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISettings extends js.Object {
  
  @JSName("editor.cursorShape")
  var editorDotcursorShape: CursorShape = js.native
  
  @JSName("editor.fontFamily")
  var editorDotfontFamily: String = js.native
  
  @JSName("editor.fontSize")
  var editorDotfontSize: Double = js.native
  
  @JSName("editor.reuseHeaders")
  var editorDotreuseHeaders: Boolean = js.native
  
  @JSName("editor.theme")
  var editorDottheme: Theme = js.native
  
  @JSName("general.betaUpdates")
  var generalDotbetaUpdates: Boolean = js.native
  
  @JSName("queryPlan.hideQueryPlanResponse")
  var queryPlanDothideQueryPlanResponse: js.UndefOr[Boolean] = js.native
  
  @JSName("request.credentials")
  var requestDotcredentials: String = js.native
  
  @JSName("tracing.hideTracingResponse")
  var tracingDothideTracingResponse: Boolean = js.native
}
object ISettings {
  
  @scala.inline
  def apply(
    editorDotcursorShape: CursorShape,
    editorDotfontFamily: String,
    editorDotfontSize: Double,
    editorDotreuseHeaders: Boolean,
    editorDottheme: Theme,
    generalDotbetaUpdates: Boolean,
    requestDotcredentials: String,
    tracingDothideTracingResponse: Boolean
  ): ISettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("editor.cursorShape")(editorDotcursorShape.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.fontFamily")(editorDotfontFamily.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.fontSize")(editorDotfontSize.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.reuseHeaders")(editorDotreuseHeaders.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.theme")(editorDottheme.asInstanceOf[js.Any])
    __obj.updateDynamic("general.betaUpdates")(generalDotbetaUpdates.asInstanceOf[js.Any])
    __obj.updateDynamic("request.credentials")(requestDotcredentials.asInstanceOf[js.Any])
    __obj.updateDynamic("tracing.hideTracingResponse")(tracingDothideTracingResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettings]
  }
  
  @scala.inline
  implicit class ISettingsOps[Self <: ISettings] (val x: Self) extends AnyVal {
    
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
    def setEditorDotcursorShape(value: CursorShape): Self = this.set("editor.cursorShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorDotfontFamily(value: String): Self = this.set("editor.fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorDotfontSize(value: Double): Self = this.set("editor.fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorDotreuseHeaders(value: Boolean): Self = this.set("editor.reuseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorDottheme(value: Theme): Self = this.set("editor.theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneralDotbetaUpdates(value: Boolean): Self = this.set("general.betaUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestDotcredentials(value: String): Self = this.set("request.credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingDothideTracingResponse(value: Boolean): Self = this.set("tracing.hideTracingResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryPlanDothideQueryPlanResponse(value: Boolean): Self = this.set("queryPlan.hideQueryPlanResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryPlanDothideQueryPlanResponse: Self = this.set("queryPlan.hideQueryPlanResponse", js.undefined)
  }
}
