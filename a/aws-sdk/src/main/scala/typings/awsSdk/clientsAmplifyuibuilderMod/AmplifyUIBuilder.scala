package typings.awsSdk.clientsAmplifyuibuilderMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmplifyUIBuilder extends Service {
  
  @JSName("config")
  var config_AmplifyUIBuilder: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new component for an Amplify app.
    */
  def createComponent(): Request[CreateComponentResponse, AWSError] = js.native
  def createComponent(callback: js.Function2[/* err */ AWSError, /* data */ CreateComponentResponse, Unit]): Request[CreateComponentResponse, AWSError] = js.native
  /**
    * Creates a new component for an Amplify app.
    */
  def createComponent(params: CreateComponentRequest): Request[CreateComponentResponse, AWSError] = js.native
  def createComponent(
    params: CreateComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateComponentResponse, Unit]
  ): Request[CreateComponentResponse, AWSError] = js.native
  
  /**
    * Creates a new form for an Amplify app.
    */
  def createForm(): Request[CreateFormResponse, AWSError] = js.native
  def createForm(callback: js.Function2[/* err */ AWSError, /* data */ CreateFormResponse, Unit]): Request[CreateFormResponse, AWSError] = js.native
  /**
    * Creates a new form for an Amplify app.
    */
  def createForm(params: CreateFormRequest): Request[CreateFormResponse, AWSError] = js.native
  def createForm(
    params: CreateFormRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFormResponse, Unit]
  ): Request[CreateFormResponse, AWSError] = js.native
  
  /**
    * Creates a theme to apply to the components in an Amplify app.
    */
  def createTheme(): Request[CreateThemeResponse, AWSError] = js.native
  def createTheme(callback: js.Function2[/* err */ AWSError, /* data */ CreateThemeResponse, Unit]): Request[CreateThemeResponse, AWSError] = js.native
  /**
    * Creates a theme to apply to the components in an Amplify app.
    */
  def createTheme(params: CreateThemeRequest): Request[CreateThemeResponse, AWSError] = js.native
  def createTheme(
    params: CreateThemeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateThemeResponse, Unit]
  ): Request[CreateThemeResponse, AWSError] = js.native
  
  /**
    * Deletes a component from an Amplify app.
    */
  def deleteComponent(): Request[js.Object, AWSError] = js.native
  def deleteComponent(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a component from an Amplify app.
    */
  def deleteComponent(params: DeleteComponentRequest): Request[js.Object, AWSError] = js.native
  def deleteComponent(
    params: DeleteComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a form from an Amplify app.
    */
  def deleteForm(): Request[js.Object, AWSError] = js.native
  def deleteForm(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a form from an Amplify app.
    */
  def deleteForm(params: DeleteFormRequest): Request[js.Object, AWSError] = js.native
  def deleteForm(params: DeleteFormRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a theme from an Amplify app.
    */
  def deleteTheme(): Request[js.Object, AWSError] = js.native
  def deleteTheme(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a theme from an Amplify app.
    */
  def deleteTheme(params: DeleteThemeRequest): Request[js.Object, AWSError] = js.native
  def deleteTheme(params: DeleteThemeRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Exchanges an access code for a token.
    */
  def exchangeCodeForToken(): Request[ExchangeCodeForTokenResponse, AWSError] = js.native
  def exchangeCodeForToken(callback: js.Function2[/* err */ AWSError, /* data */ ExchangeCodeForTokenResponse, Unit]): Request[ExchangeCodeForTokenResponse, AWSError] = js.native
  /**
    * Exchanges an access code for a token.
    */
  def exchangeCodeForToken(params: ExchangeCodeForTokenRequest): Request[ExchangeCodeForTokenResponse, AWSError] = js.native
  def exchangeCodeForToken(
    params: ExchangeCodeForTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExchangeCodeForTokenResponse, Unit]
  ): Request[ExchangeCodeForTokenResponse, AWSError] = js.native
  
  /**
    * Exports component configurations to code that is ready to integrate into an Amplify app.
    */
  def exportComponents(): Request[ExportComponentsResponse, AWSError] = js.native
  def exportComponents(callback: js.Function2[/* err */ AWSError, /* data */ ExportComponentsResponse, Unit]): Request[ExportComponentsResponse, AWSError] = js.native
  /**
    * Exports component configurations to code that is ready to integrate into an Amplify app.
    */
  def exportComponents(params: ExportComponentsRequest): Request[ExportComponentsResponse, AWSError] = js.native
  def exportComponents(
    params: ExportComponentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportComponentsResponse, Unit]
  ): Request[ExportComponentsResponse, AWSError] = js.native
  
  /**
    * Exports form configurations to code that is ready to integrate into an Amplify app.
    */
  def exportForms(): Request[ExportFormsResponse, AWSError] = js.native
  def exportForms(callback: js.Function2[/* err */ AWSError, /* data */ ExportFormsResponse, Unit]): Request[ExportFormsResponse, AWSError] = js.native
  /**
    * Exports form configurations to code that is ready to integrate into an Amplify app.
    */
  def exportForms(params: ExportFormsRequest): Request[ExportFormsResponse, AWSError] = js.native
  def exportForms(
    params: ExportFormsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportFormsResponse, Unit]
  ): Request[ExportFormsResponse, AWSError] = js.native
  
  /**
    * Exports theme configurations to code that is ready to integrate into an Amplify app.
    */
  def exportThemes(): Request[ExportThemesResponse, AWSError] = js.native
  def exportThemes(callback: js.Function2[/* err */ AWSError, /* data */ ExportThemesResponse, Unit]): Request[ExportThemesResponse, AWSError] = js.native
  /**
    * Exports theme configurations to code that is ready to integrate into an Amplify app.
    */
  def exportThemes(params: ExportThemesRequest): Request[ExportThemesResponse, AWSError] = js.native
  def exportThemes(
    params: ExportThemesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportThemesResponse, Unit]
  ): Request[ExportThemesResponse, AWSError] = js.native
  
  /**
    * Returns an existing component for an Amplify app.
    */
  def getComponent(): Request[GetComponentResponse, AWSError] = js.native
  def getComponent(callback: js.Function2[/* err */ AWSError, /* data */ GetComponentResponse, Unit]): Request[GetComponentResponse, AWSError] = js.native
  /**
    * Returns an existing component for an Amplify app.
    */
  def getComponent(params: GetComponentRequest): Request[GetComponentResponse, AWSError] = js.native
  def getComponent(
    params: GetComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComponentResponse, Unit]
  ): Request[GetComponentResponse, AWSError] = js.native
  
  /**
    * Returns an existing form for an Amplify app.
    */
  def getForm(): Request[GetFormResponse, AWSError] = js.native
  def getForm(callback: js.Function2[/* err */ AWSError, /* data */ GetFormResponse, Unit]): Request[GetFormResponse, AWSError] = js.native
  /**
    * Returns an existing form for an Amplify app.
    */
  def getForm(params: GetFormRequest): Request[GetFormResponse, AWSError] = js.native
  def getForm(
    params: GetFormRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFormResponse, Unit]
  ): Request[GetFormResponse, AWSError] = js.native
  
  /**
    * Returns existing metadata for an Amplify app.
    */
  def getMetadata(): Request[GetMetadataResponse, AWSError] = js.native
  def getMetadata(callback: js.Function2[/* err */ AWSError, /* data */ GetMetadataResponse, Unit]): Request[GetMetadataResponse, AWSError] = js.native
  /**
    * Returns existing metadata for an Amplify app.
    */
  def getMetadata(params: GetMetadataRequest): Request[GetMetadataResponse, AWSError] = js.native
  def getMetadata(
    params: GetMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMetadataResponse, Unit]
  ): Request[GetMetadataResponse, AWSError] = js.native
  
  /**
    * Returns an existing theme for an Amplify app.
    */
  def getTheme(): Request[GetThemeResponse, AWSError] = js.native
  def getTheme(callback: js.Function2[/* err */ AWSError, /* data */ GetThemeResponse, Unit]): Request[GetThemeResponse, AWSError] = js.native
  /**
    * Returns an existing theme for an Amplify app.
    */
  def getTheme(params: GetThemeRequest): Request[GetThemeResponse, AWSError] = js.native
  def getTheme(
    params: GetThemeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetThemeResponse, Unit]
  ): Request[GetThemeResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of components for a specified Amplify app and backend environment.
    */
  def listComponents(): Request[ListComponentsResponse, AWSError] = js.native
  def listComponents(callback: js.Function2[/* err */ AWSError, /* data */ ListComponentsResponse, Unit]): Request[ListComponentsResponse, AWSError] = js.native
  /**
    * Retrieves a list of components for a specified Amplify app and backend environment.
    */
  def listComponents(params: ListComponentsRequest): Request[ListComponentsResponse, AWSError] = js.native
  def listComponents(
    params: ListComponentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListComponentsResponse, Unit]
  ): Request[ListComponentsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of forms for a specified Amplify app and backend environment.
    */
  def listForms(): Request[ListFormsResponse, AWSError] = js.native
  def listForms(callback: js.Function2[/* err */ AWSError, /* data */ ListFormsResponse, Unit]): Request[ListFormsResponse, AWSError] = js.native
  /**
    * Retrieves a list of forms for a specified Amplify app and backend environment.
    */
  def listForms(params: ListFormsRequest): Request[ListFormsResponse, AWSError] = js.native
  def listForms(
    params: ListFormsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFormsResponse, Unit]
  ): Request[ListFormsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of themes for a specified Amplify app and backend environment.
    */
  def listThemes(): Request[ListThemesResponse, AWSError] = js.native
  def listThemes(callback: js.Function2[/* err */ AWSError, /* data */ ListThemesResponse, Unit]): Request[ListThemesResponse, AWSError] = js.native
  /**
    * Retrieves a list of themes for a specified Amplify app and backend environment.
    */
  def listThemes(params: ListThemesRequest): Request[ListThemesResponse, AWSError] = js.native
  def listThemes(
    params: ListThemesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThemesResponse, Unit]
  ): Request[ListThemesResponse, AWSError] = js.native
  
  /**
    * Stores the metadata information about a feature on a form.
    */
  def putMetadataFlag(): Request[js.Object, AWSError] = js.native
  def putMetadataFlag(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stores the metadata information about a feature on a form.
    */
  def putMetadataFlag(params: PutMetadataFlagRequest): Request[js.Object, AWSError] = js.native
  def putMetadataFlag(
    params: PutMetadataFlagRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Refreshes a previously issued access token that might have expired.
    */
  def refreshToken(): Request[RefreshTokenResponse, AWSError] = js.native
  def refreshToken(callback: js.Function2[/* err */ AWSError, /* data */ RefreshTokenResponse, Unit]): Request[RefreshTokenResponse, AWSError] = js.native
  /**
    * Refreshes a previously issued access token that might have expired.
    */
  def refreshToken(params: RefreshTokenRequest): Request[RefreshTokenResponse, AWSError] = js.native
  def refreshToken(
    params: RefreshTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RefreshTokenResponse, Unit]
  ): Request[RefreshTokenResponse, AWSError] = js.native
  
  /**
    * Updates an existing component.
    */
  def updateComponent(): Request[UpdateComponentResponse, AWSError] = js.native
  def updateComponent(callback: js.Function2[/* err */ AWSError, /* data */ UpdateComponentResponse, Unit]): Request[UpdateComponentResponse, AWSError] = js.native
  /**
    * Updates an existing component.
    */
  def updateComponent(params: UpdateComponentRequest): Request[UpdateComponentResponse, AWSError] = js.native
  def updateComponent(
    params: UpdateComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateComponentResponse, Unit]
  ): Request[UpdateComponentResponse, AWSError] = js.native
  
  /**
    * Updates an existing form.
    */
  def updateForm(): Request[UpdateFormResponse, AWSError] = js.native
  def updateForm(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFormResponse, Unit]): Request[UpdateFormResponse, AWSError] = js.native
  /**
    * Updates an existing form.
    */
  def updateForm(params: UpdateFormRequest): Request[UpdateFormResponse, AWSError] = js.native
  def updateForm(
    params: UpdateFormRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFormResponse, Unit]
  ): Request[UpdateFormResponse, AWSError] = js.native
  
  /**
    * Updates an existing theme.
    */
  def updateTheme(): Request[UpdateThemeResponse, AWSError] = js.native
  def updateTheme(callback: js.Function2[/* err */ AWSError, /* data */ UpdateThemeResponse, Unit]): Request[UpdateThemeResponse, AWSError] = js.native
  /**
    * Updates an existing theme.
    */
  def updateTheme(params: UpdateThemeRequest): Request[UpdateThemeResponse, AWSError] = js.native
  def updateTheme(
    params: UpdateThemeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateThemeResponse, Unit]
  ): Request[UpdateThemeResponse, AWSError] = js.native
}
