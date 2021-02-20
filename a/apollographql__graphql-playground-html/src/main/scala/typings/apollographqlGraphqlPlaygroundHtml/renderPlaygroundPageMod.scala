package typings.apollographqlGraphqlPlaygroundHtml

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderPlaygroundPageMod {
  
  @JSImport("@apollographql/graphql-playground-html/dist/render-playground-page", "renderPlaygroundPage")
  @js.native
  def renderPlaygroundPage(options: RenderPageOptions): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.line
    - typings.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.block
    - typings.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.underline
  */
  trait CursorShape extends StObject
  object CursorShape {
    
    @scala.inline
    def block: typings.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.block = "block".asInstanceOf[typings.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.block]
    
    @scala.inline
    def line: typings.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.line = "line".asInstanceOf[typings.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.line]
    
    @scala.inline
    def underline: typings.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.underline = "underline".asInstanceOf[typings.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.underline]
  }
  
  @js.native
  trait EditorColours extends StObject {
    
    var atom: String = js.native
    
    var attribute: String = js.native
    
    var builtin: String = js.native
    
    var comment: String = js.native
    
    var cursorColor: String = js.native
    
    var `def`: String = js.native
    
    var editorBackground: String = js.native
    
    var keyword: String = js.native
    
    var leftDrawerBackground: String = js.native
    
    var meta: String = js.native
    
    var number: String = js.native
    
    var property: String = js.native
    
    var punctuation: String = js.native
    
    var qualifier: String = js.native
    
    var resultBackground: String = js.native
    
    var rightDrawerBackground: String = js.native
    
    var selection: String = js.native
    
    var string: String = js.native
    
    var string2: String = js.native
    
    var variable: String = js.native
    
    var ws: String = js.native
  }
  object EditorColours {
    
    @scala.inline
    def apply(
      atom: String,
      attribute: String,
      builtin: String,
      comment: String,
      cursorColor: String,
      `def`: String,
      editorBackground: String,
      keyword: String,
      leftDrawerBackground: String,
      meta: String,
      number: String,
      property: String,
      punctuation: String,
      qualifier: String,
      resultBackground: String,
      rightDrawerBackground: String,
      selection: String,
      string: String,
      string2: String,
      variable: String,
      ws: String
    ): EditorColours = {
      val __obj = js.Dynamic.literal(atom = atom.asInstanceOf[js.Any], attribute = attribute.asInstanceOf[js.Any], builtin = builtin.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], cursorColor = cursorColor.asInstanceOf[js.Any], editorBackground = editorBackground.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], leftDrawerBackground = leftDrawerBackground.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], punctuation = punctuation.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any], resultBackground = resultBackground.asInstanceOf[js.Any], rightDrawerBackground = rightDrawerBackground.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], string2 = string2.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any], ws = ws.asInstanceOf[js.Any])
      __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorColours]
    }
    
    @scala.inline
    implicit class EditorColoursMutableBuilder[Self <: EditorColours] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtom(value: String): Self = StObject.set(x, "atom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuiltin(value: String): Self = StObject.set(x, "builtin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorColor(value: String): Self = StObject.set(x, "cursorColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDef(value: String): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorBackground(value: String): Self = StObject.set(x, "editorBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftDrawerBackground(value: String): Self = StObject.set(x, "leftDrawerBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPunctuation(value: String): Self = StObject.set(x, "punctuation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifier(value: String): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultBackground(value: String): Self = StObject.set(x, "resultBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightDrawerBackground(value: String): Self = StObject.set(x, "rightDrawerBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString2(value: String): Self = StObject.set(x, "string2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWs(value: String): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISettings extends StObject {
    
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
    implicit class ISettingsMutableBuilder[Self <: ISettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEditorDotcursorShape(value: CursorShape): Self = StObject.set(x, "editor.cursorShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorDotfontFamily(value: String): Self = StObject.set(x, "editor.fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorDotfontSize(value: Double): Self = StObject.set(x, "editor.fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorDotreuseHeaders(value: Boolean): Self = StObject.set(x, "editor.reuseHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorDottheme(value: Theme): Self = StObject.set(x, "editor.theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneralDotbetaUpdates(value: Boolean): Self = StObject.set(x, "general.betaUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryPlanDothideQueryPlanResponse(value: Boolean): Self = StObject.set(x, "queryPlan.hideQueryPlanResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryPlanDothideQueryPlanResponseUndefined: Self = StObject.set(x, "queryPlan.hideQueryPlanResponse", js.undefined)
      
      @scala.inline
      def setRequestDotcredentials(value: String): Self = StObject.set(x, "request.credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracingDothideTracingResponse(value: Boolean): Self = StObject.set(x, "tracing.hideTracingResponse", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IntrospectionResult extends StObject {
    
    var __schema: js.Any = js.native
  }
  object IntrospectionResult {
    
    @scala.inline
    def apply(__schema: js.Any): IntrospectionResult = {
      val __obj = js.Dynamic.literal(__schema = __schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntrospectionResult]
    }
    
    @scala.inline
    implicit class IntrospectionResultMutableBuilder[Self <: IntrospectionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__schema(value: js.Any): Self = StObject.set(x, "__schema", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MiddlewareOptions extends StObject {
    
    var codeTheme: js.UndefOr[EditorColours] = js.native
    
    var config: js.UndefOr[js.Any] = js.native
    
    var endpoint: js.UndefOr[String] = js.native
    
    var env: js.UndefOr[js.Any] = js.native
    
    var schema: js.UndefOr[IntrospectionResult] = js.native
    
    var settings: js.UndefOr[ISettings] = js.native
    
    var subscriptionEndpoint: js.UndefOr[String] = js.native
    
    var tabs: js.UndefOr[js.Array[Tab]] = js.native
    
    var workspaceName: js.UndefOr[String] = js.native
  }
  object MiddlewareOptions {
    
    @scala.inline
    def apply(): MiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MiddlewareOptions]
    }
    
    @scala.inline
    implicit class MiddlewareOptionsMutableBuilder[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodeTheme(value: EditorColours): Self = StObject.set(x, "codeTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeThemeUndefined: Self = StObject.set(x, "codeTheme", js.undefined)
      
      @scala.inline
      def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setSchema(value: IntrospectionResult): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setSettings(value: ISettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      @scala.inline
      def setSubscriptionEndpoint(value: String): Self = StObject.set(x, "subscriptionEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionEndpointUndefined: Self = StObject.set(x, "subscriptionEndpoint", js.undefined)
      
      @scala.inline
      def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      @scala.inline
      def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value :_*))
      
      @scala.inline
      def setWorkspaceName(value: String): Self = StObject.set(x, "workspaceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaceNameUndefined: Self = StObject.set(x, "workspaceName", js.undefined)
    }
  }
  
  @js.native
  trait RenderPageOptions extends MiddlewareOptions {
    
    var cdnUrl: js.UndefOr[String] = js.native
    
    var faviconUrl: js.UndefOr[String | Null] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object RenderPageOptions {
    
    @scala.inline
    def apply(): RenderPageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderPageOptions]
    }
    
    @scala.inline
    implicit class RenderPageOptionsMutableBuilder[Self <: RenderPageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCdnUrl(value: String): Self = StObject.set(x, "cdnUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCdnUrlUndefined: Self = StObject.set(x, "cdnUrl", js.undefined)
      
      @scala.inline
      def setFaviconUrl(value: String): Self = StObject.set(x, "faviconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaviconUrlNull: Self = StObject.set(x, "faviconUrl", null)
      
      @scala.inline
      def setFaviconUrlUndefined: Self = StObject.set(x, "faviconUrl", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Tab extends StObject {
    
    var endpoint: String = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var query: String = js.native
    
    var responses: js.UndefOr[js.Array[String]] = js.native
    
    var variables: js.UndefOr[String] = js.native
  }
  object Tab {
    
    @scala.inline
    def apply(endpoint: String, query: String): Tab = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tab]
    }
    
    @scala.inline
    implicit class TabMutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponses(value: js.Array[String]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
      
      @scala.inline
      def setResponsesVarargs(value: String*): Self = StObject.set(x, "responses", js.Array(value :_*))
      
      @scala.inline
      def setVariables(value: String): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.dark
    - typings.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.light
  */
  trait Theme extends StObject
  object Theme {
    
    @scala.inline
    def dark: typings.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.dark = "dark".asInstanceOf[typings.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.dark]
    
    @scala.inline
    def light: typings.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.light = "light".asInstanceOf[typings.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.light]
  }
}
