package typings.akuminaCore.mod.Digispace

import typings.akuminaCore.akuminaCoreBooleans.`false`
import typings.akuminaCore.igetlistrequestMod.IGetListRequest
import typings.akuminaCore.ipageinterfacesMod.IPageVersion
import typings.akuminaCore.ipageinterfacesMod.IPageVersionPriorityGroup
import typings.akuminaCore.ipageinterfacesMod.IPageVersionProperties
import typings.akuminaCore.ipagewidgetMod.IPageWidget
import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Data {
  
  @JSImport("akumina-core", "Digispace.Data.CacheManager")
  @js.native
  open class CacheManager () extends StObject {
    
    def cachedScript(Token: String): Any = js.native
  }
  
  @JSImport("akumina-core", "Digispace.Data.DataFactory")
  @js.native
  open class DataFactory () extends StObject {
    def this(legacyMode: Boolean) = this()
    
    /**
      *Load all list fields
      * @param configItem Key value pair of item which needs to be updated or added
      */
    def AddOrEditConfiguration(configItem: Any): JQueryDeferred[Any] = js.native
    
    def AddPageWidgets(listName: Any, pageId: Any, widgetName: Any, pageWidgets: Any): JQueryDeferred[Any] = js.native
    
    /**
      * Returns List of permissions for current user for passed list
      * @param listName Name of list
      * @param useRootWeb Boolean flag
      */
    def CanUserSetItemPermissions(listName: String, useRootWeb: Boolean): JQueryDeferred[Any] = js.native
    
    /**
      *Clears the cache for given cacheKey
      * @param cacheKey cacheKey to clear the cache
      */
    def ClearAppManagerCacheByKey(cacheKey: String): JQueryDeferred[Any] = js.native
    
    /**
      * Create new list
      * @param siteUrl
      * @param siteTitle
      * @param templateType
      * @param fieldsList
      */
    def CreateList(siteUrl: String, siteTitle: String, templateType: String, fieldsList: js.Array[Any]): JQueryDeferred[Any] = js.native
    
    /**
      *Load all list fields
      * @param contenttype contenttype name based on which lists will be fetched
      */
    def CreateListWithContentType(listName: String, contentType: String, isDefaultContentType: Boolean, createMLEnabledList: Boolean): JQueryDeferred[js.Object] = js.native
    def CreateListWithContentType(
      listName: String,
      contentType: String,
      isDefaultContentType: Boolean,
      createMLEnabledList: Boolean,
      isRoot: Boolean
    ): JQueryDeferred[js.Object] = js.native
    
    /**
      *Delete list item
      * @param listName listName to which item belongs
      * @param itemid
      */
    def DeleteListItem(listName: String, itemid: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get All lists from the site. By default it fetechs from root site
      * @param useRoot
      */
    def GetAllList(): JQueryDeferred[Any] = js.native
    def GetAllList(useRoot: Boolean): JQueryDeferred[Any] = js.native
    
    /**
      * Get all user groups for site
      * @param searchUniqueValue
      * @param currentPage
      * @param pageLimit
      */
    def GetGroupsForSite(
      listName: String,
      useRootWeb: Boolean,
      searchUniqueValue: Any,
      currentPage: Double,
      pageLimit: Double
    ): Any = js.native
    
    def GetItemsFromListByTitle(listName: String, searchTerm: String, isroot: Boolean): JQueryDeferred[Any] = js.native
    
    /**
      * Get list from SharePoint
      * @param request
      */
    def GetList(request: IGetListRequest): js.Promise[Any] = js.native
    
    /**
      *Get Permissin on list for current user
      * @param listName listName  to fetch permission of
      */
    def GetListEffectiveBasePermissions(listName: String, useRootWeb: Boolean): JQueryDeferred[js.Object] = js.native
    
    /**
      *Load all list fields
      * @param listName listName to fetch fields
      */
    def GetListFields(listName: String, useRootWeb: Boolean): JQueryDeferred[js.Object] = js.native
    
    /** Get List position  */
    def GetListPosition(): JQueryDeferred[Any] = js.native
    
    /**
      *Load all list fields
      * @param contenttype contenttype name based on which lists will be fetched
      */
    def GetListsByContentType(contenttype: String): JQueryDeferred[js.Object] = js.native
    def GetListsByContentType(contenttype: String, isroot: Boolean): JQueryDeferred[js.Object] = js.native
    
    /**
      * Get matching pages from Page Url List
      * @param searchText Text to search existing pages
      */
    def GetPagesFromPageUrlList(searchText: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get permissions set for list item
      * @param listName Name of list
      * @param useRootWeb use site absolute url vs. web absolute url
      * @param itemId List Item id
      */
    def GetPermissionForListItem(listName: String, useRootWeb: Boolean, itemId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get saved layout from Sharepoint
      * @param layoutName Layout Name
      */
    def GetSavedLayout(layoutName: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get Site Properties
      * @param request
      */
    def GetSiteProperties(request: Any): JQueryDeferred[Any] = js.native
    
    /**
      *Load all list fields
      * @param termsetId termsetId for which we have fetch terms
      */
    def GetTermsFromTermSet(termsetId: Any): JQueryDeferred[js.Object] = js.native
    
    /**
      * Get User Props
      */
    def GetUser(userPrincipal: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get widgets for page
      * @param pageId
      * @param legacy
      */
    def GetWidgetsForPage(pageId: String): JQueryDeferred[Any] = js.native
    def GetWidgetsForPage(pageId: String, legacy: Boolean): JQueryDeferred[Any] = js.native
    
    /**
      *Load library settings
      * @param listName listName to load settings
      */
    def LoadLibrarySettings(listName: String, isroot: Boolean, getdefaultItemOpenSetting: Boolean): JQueryDeferred[js.Object] = js.native
    
    def LoadTermSet(): JQueryDeferred[Any] = js.native
    def LoadTermSet(termSetName: String): JQueryDeferred[Any] = js.native
    def LoadTermSet(termSetName: String, columnName: String): JQueryDeferred[Any] = js.native
    def LoadTermSet(termSetName: String, columnName: String, columnValue: String): JQueryDeferred[Any] = js.native
    def LoadTermSet(termSetName: String, columnName: Null, columnValue: String): JQueryDeferred[Any] = js.native
    def LoadTermSet(termSetName: String, columnName: Unit, columnValue: String): JQueryDeferred[Any] = js.native
    def LoadTermSet(termSetName: Null, columnName: String): JQueryDeferred[Any] = js.native
    def LoadTermSet(termSetName: Null, columnName: String, columnValue: String): JQueryDeferred[Any] = js.native
    def LoadTermSet(termSetName: Null, columnName: Null, columnValue: String): JQueryDeferred[Any] = js.native
    def LoadTermSet(termSetName: Null, columnName: Unit, columnValue: String): JQueryDeferred[Any] = js.native
    def LoadTermSet(termSetName: Unit, columnName: String): JQueryDeferred[Any] = js.native
    def LoadTermSet(termSetName: Unit, columnName: String, columnValue: String): JQueryDeferred[Any] = js.native
    def LoadTermSet(termSetName: Unit, columnName: Null, columnValue: String): JQueryDeferred[Any] = js.native
    def LoadTermSet(termSetName: Unit, columnName: Unit, columnValue: String): JQueryDeferred[Any] = js.native
    
    def LoadTermSetByColumnName(request: IGetListRequest, columnName: String): JQueryDeferred[Any] = js.native
    def LoadTermSetByColumnName(request: IGetListRequest, columnName: String, columnValue: String): JQueryDeferred[Any] = js.native
    
    /**
      * Add new page to list
      * @param pageObject JSON object with properties for page
      */
    def ProvisionPageObject(pageObject: Any): JQueryDeferred[Any] = js.native
    
    /**
      * Add/Save new widgets to page
      * @param widgetName
      * @param pageId
      * @param pageWidgets
      */
    def ProvisionPageWidgets(widgetName: String, pageId: String, pageVersionId: String, pageWidgets: js.Array[Any]): JQueryDeferred[Any] = js.native
    
    /**
      * Save custom layout
      * @param layoutObject JSON object having layout details
      */
    def ProvisionSavedLayout(layoutObject: Any): JQueryDeferred[Any] = js.native
    
    /**
      * Search in sharepoint list based on request
      * @param request
      */
    def Search(request: Any): JQueryDeferred[Any] = js.native
    
    def SetContextUrl(siteCOntextUrl: String): Unit = js.native
    
    /**
      * #MARK - Not currently used.
      * @param implementation
      */
    def SetImpl(implementation: String): Unit = js.native
    
    /**
      * Set permissions for list item
      * @param listName
      * @param itemId
      * @param editgroup Array User groups for edit permission
      * @param readgroup Array User groups for read permission
      * @param useRootWeb
      */
    def SetPermissionsForListItem(listName: String, itemId: String, editgroup: Any, readgroup: Any, useRootWeb: Boolean): JQueryDeferred[Any] = js.native
    
    /**
      * Set personas for list item
      * @param listName ListName of which item belongs
      * @param itemId ID of item to set persona.
      * @param personaList Semicolon seprated List of persona to set for item
      * @param columnName column Name for persona
      */
    def SetPersonasForItem(listName: String, itemId: Double, personaList: Any): JQueryDeferred[Any] = js.native
    def SetPersonasForItem(listName: String, itemId: Double, personaList: Any, columnName: String): JQueryDeferred[Any] = js.native
    
    /**
      * Set Tags for list item
      * @param listName List Name
      * @param itemId Item Id
      * @param columnName Coloumn Name for tags
      * @param tagList semicolon seprated list of tags
      */
    def SetTagsForItem(listName: String, itemId: String, columnName: String, tagList: Any): JQueryDeferred[Any] = js.native
    
    /**
      *Updates list item
      * @param listName listName to which item belongs
      * @param itemid
      * @param queryParams data that needs to updated as an object
      */
    def UpdateListItem(listName: String, itemid: String, queryParams: Any): JQueryDeferred[Any] = js.native
    
    /**
      * Update page object Items
      * @param pageObject
      */
    def UpdatePageObjectsItem(pageTypeList: String, pageObject: Any, pageId: String): JQueryDeferred[Any] = js.native
    
    def UpdatePageUrlsItem(pageObject: Any, pageId: String): JQueryDeferred[Any] = js.native
    def UpdatePageUrlsItem(pageObject: Any, pageId: String, pageTypeList: String): JQueryDeferred[Any] = js.native
    
    /**
      * Check if user have edit permission on list item.
      * @param pageReferenceList
      * @param pageId
      * @returns Resolves with {ReadPermission: bool, EditPermission: bool}
      */
    // tslint:disable-next-line unified-signatures
    def UserPermissionsForListItem(pageReferenceList: Any, pageId: String): JQueryDeferred[Any] = js.native
    /**
      * Check user permission on list item
      * @param pageTypeList listName to which item belongs
      * @param pageId
      */
    def UserPermissionsForListItem(pageTypeList: String, pageId: String): JQueryDeferred[Any] = js.native
  }
  
  @JSImport("akumina-core", "Digispace.Data.Graph")
  @js.native
  open class Graph () extends StObject {
    
    def GetProfilePicture(email: String, flag: Boolean): js.Promise[Any] = js.native
  }
  
  @JSImport("akumina-core", "Digispace.Data.Groups")
  @js.native
  open class Groups () extends StObject {
    
    def GetGraphDataWithFullUrl(url: String, param: Any): js.Promise[Any] = js.native
    
    def GetGraphUrl(prefix: String, query: String, filterQuery: String, cacheKey: String): String = js.native
    
    def GetGroupForPage(pageId: String): JQueryDeferred[Any] = js.native
  }
  
  @JSImport("akumina-core", "Digispace.Data.Interchange")
  @js.native
  open class Interchange () extends StObject {
    
    def AddOrReplacePageVersionInCache(completePageVersion: IPageVersion): JQueryDeferred[Any] = js.native
    
    /* Added */
    // CanUserSetItemPermissions(referenceList: string): JQueryDeferred<any>;
    // GetPermissionForListItem(referenceList: string, itemId: string): JQueryDeferred<any>;
    def AppPart(referenceList: String, itemId: String): Any = js.native
    
    /**
      * Check licenses assigned to members
      * @param memberids string
      */
    def CheckAssignedLicenses(memberids: String): JQueryDeferred[Any] = js.native
    
    /**
      * Send data to decrypt
      * @param data
      */
    def DecryptData(data: String): JQueryDeferred[Any] = js.native
    
    /**
      * Send data to encrypt
      * @param data
      */
    def EncryptData(data: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get activated Features on site.
      * @returns Resolves in success with JSON object
      */
    def GetActivatedFeatures(): JQueryDeferred[Any] = js.native
    
    /**
      * @returns Resolves with language ID {number}
      */
    def GetAppManagerLanguageId(): JQueryDeferred[Any] = js.native
    
    /**
      * @returns Def Resolves in success with Version Object {FileVersion: string, ProductVersion: string}
      */
    def GetAppManagerVersion(): JQueryDeferred[Any] = js.native
    
    /**
      * Get list of apps available for user
      * @param listName String
      */
    def GetApps(listName: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get Configuration object
      */
    def GetConfiguration(): Any = js.native
    
    /**
      * @returns resolves with array of widget objects
      */
    def GetDashboardWidgets(): JQueryDeferred[Any] = js.native
    
    /**
      * Get Facets from interchange
      * @param facetObj List of facets object
      */
    def GetFacets(facetObj: js.Array[Any]): JQueryDeferred[Any] = js.native
    
    /**
      * Get sharepoint lists associated with the passed content type
      * @param contenttype
      */
    def GetListsForContentType(contenttype: String): JQueryDeferred[Any] = js.native
    
    def GetMenuApps(): Any = js.native
    
    /**
      * Get myapps cache key for the current user
      * @param attribute
      */
    def GetMyAppsCacheKey(attribute: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get page object from pageURL
      * @param relativePageUrl
      */
    def GetPageObjectForPageUrl(relativePageUrl: String): JQueryDeferred[Any] = js.native
    
    /**
      * @param listName SharePoint List name ex. GenericPages_AK
      * @param itemId Item Id for which permissions need to be checked
      */
    def GetPermissionForListItemForCurrentUser(listName: String, useRootWeb: Boolean, itemId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get UserGroup list based of type of authoristion
      * @param authorization
      */
    def GetSPGroupUsersAndUserGroupsList(authorization: Any): JQueryDeferred[Any] = js.native
    
    /**
      * Filter user accessible apps from list of apps.
      * @param groups User Groups #MARK currently not used.
      * @param appsData List of apps
      */
    def GetUserAccessibleApps(groups: Null, appsData: js.Array[Any]): JQueryDeferred[Any] = js.native
    
    /**
      * Get user groups
      * @param model
      */
    def GetUserGroups(model: Any): JQueryDeferred[Any] = js.native
    
    /**
      * Get groups the current user is added to.
      * @returns def resolves in success with Array of names of User Groups of current user.
      */
    def GetUserGroupsFromAppManager(): JQueryDeferred[Any] = js.native
    
    /**
      * To get personas assigned to a user
      * @param userId
      * @returns deferred resolves with array of presonas string
      */
    def GetUserPersonas(userId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get Users Data List
      * @param currentUserName
      * @param filters
      * @param pageSize
      * @param pageNumber
      * @param orderByField
      * @param sortDirection
      */
    def GetUsersData(
      currentUserName: String,
      filters: Any,
      pageSize: Double,
      pageNumber: Double,
      orderByField: String,
      sortDirection: String
    ): Any = js.native
    
    /**
      * Fetches widgets js
      * @param widgets Array of widget objects
      * @param widgetNames Array of widget names
      */
    def GetWidgetJS(widgets: js.Array[Any], widgetNames: js.Array[String]): JQueryDeferred[Any] = js.native
    
    /**
      * Check if user is logged into appManager
      */
    def IsLoggedIntoAppManager(): JQueryDeferred[Any] = js.native
    
    /**
      * Check if workspace is marked for delete
      * @param workspaceId string
      */
    def IsWorkspaceMarkedAsDeleted(workspaceId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Marks workspace as deleted
      * @param workspaceId workspace id
      */
    def MarkWorkspaceAsDeleted(workspaceId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Resolves with siteID
      * @param selectedSiteId
      */
    def PerformChangeSite(selectedSiteId: String): JQueryDeferred[Any] = js.native
    
    /**
      * @returns Resolves in success with boolean value
      */
    def RefreshAkToken(): JQueryDeferred[Any] = js.native
    
    def RemovePageVersionFromCache(pageId: String, pageVersionId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Update Page object Cache
      * @param pageObjects
      */
    def UpdatePageObjectsCache(pageObjects: Any): JQueryDeferred[Any] = js.native
    
    /**
      * Update Page properties
      * @param referenceList
      * @param itemId
      * @param data
      */
    def UpdatePageProperties(referenceList: String, itemId: String, data: Any): JQueryDeferred[Any] = js.native
    
    def UpdatePagePropertiesInCache(pageProperties: Any): JQueryDeferred[Any] = js.native
    
    def UpdatePageVersionPropertiesInCache(pageVersionProperties: IPageVersionProperties): JQueryDeferred[Any] = js.native
    
    /**
      * Save page widgets
      * @param pageId
      */
    // ProvisionPageWidgets(pageWidgetsRequest: ISavePageWidgetRequest): JQueryDeferred<any>;
    def UpdatePageVersionWidgetsInCache(pageId: String, pageVersionId: String, pageVersionWidgets: js.Array[IPageWidget]): JQueryDeferred[Any] = js.native
    
    def UpdatePageWidgetInstanceCacheAsModel(pageId: String, widgetInstanceId: String, virtualWidgetInstanceId: String, widgetProps: String): JQueryDeferred[Any] = js.native
    
    /**
      * Updates widget instance cache
      * @param widgetInstanceId Optional
      */
    def UpdateWidgetInstanceCache(): JQueryDeferred[Any] = js.native
    def UpdateWidgetInstanceCache(widgetInstanceId: String): JQueryDeferred[Any] = js.native
    
    def UpdateWidgetInstanceCacheAsModel(widgetInstanceId: String, widgetProps: String): JQueryDeferred[Any] = js.native
    
    /**
      * @returns Resolves in success with boolean value
      */
    def ValidateAkToken(): JQueryDeferred[Any] = js.native
  }
  
  @JSImport("akumina-core", "Digispace.Data.LanguageManager")
  @js.native
  open class LanguageManager () extends StObject {
    
    def GetDefaultLanguage(): Any = js.native
  }
  
  @JSImport("akumina-core", "Digispace.Data.PageFactory")
  @js.native
  open class PageFactory () extends StObject {
    def this(legacyMode: Boolean) = this()
    
    def AddPageVersion(newVersionProperties: Any, pageWidgets: Any): JQueryDeferred[IPageVersion] = js.native
    
    def AssignPriorityGroupToPageVersion(pageVersionPriority: IPageVersionPriorityGroup): JQueryDeferred[Any] = js.native
    
    def ClonePageVersionFrom(pageVersionId: String, newPageVersion: IPageVersionProperties): JQueryDeferred[IPageVersion] = js.native
    
    def CreatePage(createPageRequest: Any): JQueryDeferred[Any] = js.native
    
    def CreatePageVersion(createPageVersionRequest: IPageVersionProperties): JQueryDeferred[IPageVersionProperties] = js.native
    
    def DeletePageVersion(pageVersionId: String): JQueryDeferred[IPageVersionProperties] = js.native
    
    def GetAllVersionsForPage(pageId: String): JQueryDeferred[Any] = js.native
    
    def GetPageVersion(pageVersionId: String): JQueryDeferred[IPageVersionProperties] = js.native
    
    def MarkPageVersionActive(pageVersionId: String): JQueryDeferred[js.Object] = js.native
    
    def PageVersionExists(pageVersionName: String): JQueryDeferred[Any] = js.native
    
    def ProvisionPageWidgets(widgetName: String, pageVersion: Any, pageWidgets: js.Array[Any]): JQueryDeferred[Any] = js.native
    
    def SetPagePriorityGroups(pagePriorityGroups: js.Array[String]): JQueryDeferred[Any] = js.native
  }
  object PageFactory {
    
    @JSImport("akumina-core", "Digispace.Data.PageFactory")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def GetPageObjectsCacheKey(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetPageObjectsCacheKey")().asInstanceOf[String]
    
    /* static member */
    inline def GetPageWidgetsCacheKey(pageVersionId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetPageWidgetsCacheKey")(pageVersionId.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def GetSavedLayoutsCacheKey(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSavedLayoutsCacheKey")().asInstanceOf[String]
  }
  
  @JSImport("akumina-core", "Digispace.Data.PageManager")
  @js.native
  /**
    **
    */
  open class PageManager () extends StObject {
    def this(pageUrl: String) = this()
    
    /**
      * Add Page for groups
      * @param pageModel
      */
    def AddPageForGroup(pageModel: Any): JQueryDeferred[Any] = js.native
    
    /**
      * Add pages for group
      * @param model
      */
    def AddPagesForGroup(model: Any): JQueryDeferred[Any] = js.native
    
    /**
      * Returns List of permissions for current user for passed list
      * @param listName Name of list
      * @param useRootWeb Boolean flag
      */
    def CanUserSetPagePermissions(listName: String, useRootWeb: Boolean): JQueryDeferred[Any] = js.native
    
    /**
      * Execute Share point query
      * @param clientContext
      * @param collListItem
      * @param def
      * @param idArray
      * @param columnName
      */
    def ExecuteAsyncQuery(
      clientContext: Any,
      collListItem: Any,
      `def`: JQueryDeferred[Any],
      idArray: js.Array[Any],
      columnName: String
    ): JQueryDeferred[Any] = js.native
    
    /**
      * Get Available Workspace Types
      * @param groupType
      */
    def GetAvailableWorkspaceTypes(groupType: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get containers for view
      * @param viewTemplateUrl
      */
    def GetContainersForView(viewTemplateUrl: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get Dashboard Page for User
      * @param userId
      * @returns resolves with dashboard page for user {title, userId, pageId}
      */
    def GetDashboardPageForUser(userId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get Dashboard widgets
      * @param pageId
      */
    def GetDashboardWidgetsViaAppManager(pageId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get Layouts For ToolBar
      * @param pageId
      */
    def GetLayoutsForToolBar(pageId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get Page Active View
      * @param pageId
      */
    def GetPageActiveView(pageId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Retrives available page views
      * @param pageId
      */
    def GetPageAvailableViews(pageId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get Page Child widgets
      * @param pageId
      */
    def GetPageChildWidgets(pageId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get default page layouts
      * @return Array of page layout object
      * {displayOrder:, layoutId:, layoutImage:, layoutTemplate:, layoutTitle:, selectedLayout:, spPageLayoutId: }
      */
    def GetPageLayouts(): js.Array[Any] = js.native
    
    def GetPageObject(): JQueryDeferred[Any] = js.native
    
    /**
      * Get page object from pageURL
      * @param relativePageurl relative page URL
      */
    def GetPageObjectForPageUrl(relativePageurl: String): JQueryDeferred[Any] = js.native
    
    /**
      * Returns page type information
      * @param pageTypeParam Page Type
      */
    def GetPageTypeInfo(pageTypeParam: String): JQueryDeferred[Any] = js.native
    
    /**
      * Retrive page widget
      * @param pageId
      */
    def GetPageWidget(pageId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Resolves with all the page widgets
      */
    def GetPageWidgets(): JQueryDeferred[Any] = js.native
    
    /**
      * Get matching pages from Page Url List
      * @param searchText Text to search existing pages
      */
    def GetPagesFromPageUrlList(searchText: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get permissions for Page
      * @param listName Name of list
      * @param itemId Page Id
      */
    def GetPermissionForPage(listName: String, useRootWeb: Boolean, itemId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get permissions for Page list
      * @param listName Name of list
      */
    def GetPermissionForPageList(listName: String, useRootWeb: Boolean): JQueryDeferred[Any] = js.native
    
    /**
      * Get saved layout from Sharepoint
      * @param Title Layout Name
      */
    def GetSavedLayout(): JQueryDeferred[Any] = js.native
    def GetSavedLayout(Title: String): JQueryDeferred[Any] = js.native
    
    /**
      * Get widgets for page
      * @param pageId
      * @param legacy
      */
    def GetWidgetsForPage(pageId: String): JQueryDeferred[Any] = js.native
    def GetWidgetsForPage(pageId: String, legacy: Boolean): JQueryDeferred[Any] = js.native
    
    /**
      * Get Widgets For Toolbar
      */
    def GetWidgetsForToolbar(): JQueryDeferred[Any] = js.native
    
    /**
      * Returns true if widget instance is either Dashboard, PageWidget or Container
      * @param widgetInstances string of widget Type
      */
    def IsDashBoardOrPageWidgetOrContainer(widgetInstances: Any): Boolean = js.native
    
    /**
      * Returns true if widget type passed is either Dashboard, PageWidget or Container Type
      * @param widgetType string of widget Type
      */
    def IsDashboardOrPageWidgetOrContainerType(widgetType: Any): Boolean = js.native
    
    /**
      * Check if group type is custom
      * @param type
      */
    def IsGroupTypeCustom(`type`: String): Boolean = js.native
    
    /**
      * Loads a new page
      * @param pageRouteInfo JSON object with page routing information
      */
    def LoadNewPage(pageRouteInfo: Any): Unit = js.native
    
    /**
      * Save dashboard page for user
      * @param userId
      */
    def ProvisionDashboardPageForUser(userId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Save update page objects
      * @param pageObject
      */
    def ProvisionPageObject(pageObject: Any): JQueryDeferred[Any] = js.native
    
    /**
      * Save page widgets
      * @param widgetName
      * @param pageId
      * @param pageWidgets
      */
    def ProvisionPageWidgets(widgetName: String, pageId: String, pageVersionId: String, pageWidgets: js.Array[Any]): JQueryDeferred[Any] = js.native
    
    /**
      * Save custom layout
      * @param layoutObject JSON object having layout details
      */
    def ProvisionSavedLayout(data: Any): JQueryDeferred[Any] = js.native
    
    /**
      * Remove Group Page
      * @param pageIds
      */
    def RemoveGroupPage(pageIds: js.Array[String]): JQueryDeferred[Any] = js.native
    
    /**
      * Remmove group page mapping
      * @param groupId
      */
    def RemoveGroupPageMapping(groupId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Remove Group WIdget properties
      * @param widgetInstanceIds
      */
    def RemoveGroupWidgetProperties(widgetInstanceIds: js.Array[String]): JQueryDeferred[Any] = js.native
    
    /**
      * Remove pages for group
      * @param groupId
      */
    def RemovePagesForGroup(groupId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Save dashboard page
      * @param pageId
      */
    def SaveDashboardPage(pageId: String): JQueryDeferred[Any] = js.native
    
    def SavePage(pageId: String): JQueryDeferred[Any] = js.native
    
    /**
      * Save page contents(widgets)
      * @param pageId
      * @param pageWidgets
      */
    def SetPageContents(pageId: String, data: Any): JQueryDeferred[Any] = js.native
    
    /**
      * Set permissions for Page
      * @param listName
      * @param itemId Page item Id
      * @param editgroup Array User groups for edit permission
      * @param readgroup Array User groups for read permission
      * @param useRootWeb
      */
    def SetPermissionsForPage(
      listName: String,
      itemId: String,
      editgroup: js.Array[String],
      readgroup: js.Array[String],
      useRootWeb: Boolean
    ): JQueryDeferred[Any] = js.native
    
    /**
      * Set personas for page
      * @param listName ListName of which item belongs
      * @param itemId ID of item to set persona.
      * @param personaList Semicolon seprated List of persona to set for item
      * @param columnName Coloumn Name
      */
    def SetPersonasForPage(listName: String, itemId: String, personaList: Any): JQueryDeferred[Any] = js.native
    def SetPersonasForPage(listName: String, itemId: String, personaList: Any, columnName: String): JQueryDeferred[Any] = js.native
    
    /**
      * Set Tags for Page
      * @param listName List Name
      * @param itemId Item Id of page
      * @param columnName Coloumn Name to be updated for tags
      * @param list semicolon seprated list of tags
      */
    def SetTagsForPage(listName: String, itemId: String, columnName: String, list: Any): JQueryDeferred[Any] = js.native
    
    /**
      * Provide grid details
      */
    def getGrid(): js.Array[Any] = js.native
  }
  
  @JSImport("akumina-core", "Digispace.Data.PersonaManager")
  @js.native
  open class PersonaManager () extends StObject {
    
    /** Get array of Lists with persona enabled
      */
    def GetPersonaEnabledLists(): js.Array[String] = js.native
    
    /** Does List reuire persona check
      * @param listName
      */
    def IsPersonaCheckRequiredForList(listName: String): JQueryDeferred[Any] = js.native
    
    /**
      * Returns object setting filterByPersona property. Or default object
      * @param request
      */
    def IsPersonaFilteringOn(): Any = js.native
    def IsPersonaFilteringOn(request: Any): Any = js.native
  }
  
  @JSImport("akumina-core", "Digispace.Data.RestSharepoint")
  @js.native
  open class RestSharepoint () extends StObject
  
  @JSImport("akumina-core", "Digispace.Data.SharePoint")
  @js.native
  open class SharePoint () extends StObject {
    
    /**
      * Create new list item
      * @param createItemRequest
      */
    def CreateItem(createItemRequest: Any): JQueryDeferred[Any] = js.native
    
    /**
      * Create new list
      * @param siteUrl
      * @param siteTitle
      * @param templateType
      * @param fieldsList
      */
    def CreateList(siteUrl: String, siteTitle: String, templateType: String, fieldsList: js.Array[Any]): JQueryDeferred[Any] = js.native
    
    def GetAppInstances(successCallback: Any, errorCallback: Any): Unit = js.native
    
    /**
      * Get SiteID of current site
      */
    def GetCurrentSiteId(): JQueryDeferred[Any] = js.native
    
    def GetList(request: Any): JQueryDeferred[Any] = js.native
    
    /**
      * Get list of users under user groups
      * @param authorizationGroups List of authorization Groups
      */
    def GetSPGroupUsersByGroupName(authorizationGroups: js.Array[Any]): JQueryDeferred[Any] = js.native
    
    /**
      * Get User Groups current user belongs to
      */
    def GetSPUserGroups(): JQueryDeferred[Any] = js.native
    
    /**
      * @param siteUrl Absolute path
      */
    def GetSiteIdByUrl(siteUrl: String, useRootWeb: Boolean): JQueryDeferred[Any] = js.native
    
    /**
      * Get all SP user groups
      * @returns Resolves with array of {id, displayName, type, description}
      */
    def GetSiteSPGroups(): JQueryDeferred[Any] = js.native
    
    /* Added */
    def LoadTermSet(termSetName: String): JQueryDeferred[Any] = js.native
    def LoadTermSet(termSetName: String, columnName: String): JQueryDeferred[Any] = js.native
    def LoadTermSet(termSetName: String, columnName: String, columnValue: String): JQueryDeferred[Any] = js.native
    def LoadTermSet(termSetName: String, columnName: Null, columnValue: String): JQueryDeferred[Any] = js.native
    
    def LoadTermSetById(siteUrl: String, termSetId: String, columnName: String): JQueryDeferred[Any] = js.native
    def LoadTermSetById(siteUrl: String, termSetId: String, columnName: String, columnValue: String): JQueryDeferred[Any] = js.native
    
    /**
      * Update Page object item
      * @param pageTypeList List Name
      * @param pageObject Page object to be updated
      * @param pageId Item Id of page list item
      */
    def UpdatePageObjectsItem(pageTypeList: String, pageObject: Any, pageId: String): JQueryDeferred[Any] = js.native
    
    /**
      * @param pageObject
      * @param pageId
      * @param pageTypeList
      */
    def UpdatePageUrlsItem(pageObject: Any, pageId: String): JQueryDeferred[Any] = js.native
    def UpdatePageUrlsItem(pageObject: Any, pageId: String, pageTypeList: String): JQueryDeferred[Any] = js.native
  }
  
  @JSImport("akumina-core", "Digispace.Data.WidgetFactory")
  @js.native
  open class WidgetFactory () extends StObject {
    
    def UpdatePageWidgetInstancesCache(model: Any): Any = js.native
  }
  
  @JSImport("akumina-core", "Digispace.Data.WidgetManager")
  @js.native
  open class WidgetManager () extends StObject {
    
    /** Add dashboard widget instance */
    def AddDashboardWidgetInstance(dashboardWidgetTitle: String, widgetInstance: Any): JQueryDeferred[Any] = js.native
    
    // RenderWidget(data: any, pageId: string, widgetProps: string, view: string): any;
    /* Added in Alphabatical order */
    /** Check if widgetinstances are Dashboard Container widgets */
    def AreDashboardContainerWidgets(widgetInstanceIds: js.Array[Any]): JQueryDeferred[Any] = js.native
    
    /** Copy Widget Instance */
    def CopyWidgetInstance(widgetInstanceId: String): JQueryDeferred[Any] = js.native
    
    def GetAndInitWidgetsPerJSFile(item: Any, widgetDepJsArray: js.Array[Any]): Unit = js.native
    
    def GetManualDependencyMap(widgetName: String): js.Array[Any] = js.native
    
    /** Resolves with next AkId */
    def GetNextAkId(listName: String, isRoot: Boolean): JQueryDeferred[Any] = js.native
    def GetNextAkId(listName: Null, isRoot: Boolean): JQueryDeferred[Any] = js.native
    @JSName("GetNextAkId")
    def GetNextAkId_false(listName: String, isRoot: `false`): JQueryDeferred[Any] = js.native
    @JSName("GetNextAkId")
    def GetNextAkId_false(listName: Null, isRoot: `false`): JQueryDeferred[Any] = js.native
    
    /** Resolves with siteId */
    def GetSiteId(): JQueryDeferred[Any] = js.native
    
    /**
      * @returns Resolves with Array with object of all the widget Instances
      */
    def GetWidgetInstances(): JQueryDeferred[Any] = js.native
    
    /**
      * Retrives all the widget instances ID on the current page.
      * @returns object with ids: string[] & rel: Array<>
      */
    def GetWidgetInstancesOnPage(): Any = js.native
    
    /**
      * Get js file list for dependent widgets
      * @param widgetName
      * @param widgetToDeps
      * @param depJsFiles
      */
    def GetWidgetJSArrayFromWidget(widgetName: String, widgetToDeps: js.Array[Any], depJsFiles: js.Array[Any]): js.Array[Any] = js.native
    
    def GetWidgetJSFromDependency(widgets: js.Array[Any]): JQueryDeferred[Any] = js.native
    
    /**
      * @returns def Resolves in success with Widget Manager Instance ID
      */
    def GetWidgetManagerApp(): JQueryDeferred[Any] = js.native
    
    /**
      * @returns def Resolves in success with Object with authorized user groups
      */
    def GetWidgetManagerAppAuthorization(): JQueryDeferred[Any] = js.native
    
    /**
      * Get list of widget on current page.
      * @param widgets
      */
    def GetWidgetObjsOnPage(widgets: js.Array[Any]): js.Array[Any] = js.native
    
    /**
      * #MARK - dataType correction
      * @param widgetInstanceIds Array of widget Instance Ids
      */
    def GetWidgetPropertiesForInstances(): JQueryDeferred[Any] = js.native
    def GetWidgetPropertiesForInstances(widgetInstanceIds: js.Array[String]): JQueryDeferred[Any] = js.native
    
    /**
      * @param widgetType WidgetType
      * @returns def Resolves in success with array of objects of widget view of widgetType passed
      */
    def GetWidgetViews(widgetType: String): JQueryDeferred[Any] = js.native
    
    /** Initialize widget passed */
    def InitWidget(item: Any): Unit = js.native
    
    def InitializeChildWidgetsWithOverride(widgetIds: js.Array[String], pageId: String, widgetProps: js.Array[Any], view: String): Any = js.native
    
    /** Initialize widgets passed in array */
    def InitializeWidgets(widgets: js.Array[Any]): JQueryDeferred[Any] = js.native
    
    def PopulateAutoDependencyMap(widgetsWithPropsArray: js.Array[Any], widgetArray: js.Array[Any]): js.Array[Any] = js.native
    
    /**
      * Render Child Widgets
      * @param selector
      * @param pageId
      * @param mode
      */
    def RenderChildWidgets(selector: String, pageId: String, mode: String): Unit = js.native
    def RenderChildWidgets(selector: String, pageId: Null, mode: String): Unit = js.native
  }
}
