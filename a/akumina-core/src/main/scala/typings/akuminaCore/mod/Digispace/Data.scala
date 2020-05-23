package typings.akuminaCore.mod.Digispace

import typings.akuminaCore.igetlistrequestMod.IGetListRequest
import typings.akuminaCore.isavepagewidgetrequestMod.ISavePageWidgetRequest
import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("akumina-core", "Digispace.Data")
@js.native
object Data extends js.Object {
  @js.native
  class CacheManager () extends js.Object {
    def cachedScript(Token: String): js.Any = js.native
  }
  
  @js.native
  class DataFactory () extends js.Object {
    def this(legacyMode: Boolean) = this()
    /**
      * Returns List of permissions for current user for passed list
      * @param listName Name of list
      * @param useRootWeb Boolean flag
      */
    def CanUserSetItemPermissions(listName: String, useRootWeb: Boolean): JQueryDeferred[_] = js.native
    /**
      * Create new list
      * @param siteUrl
      * @param siteTitle
      * @param templateType
      * @param fieldsList
      */
    def CreateList(siteUrl: String, siteTitle: String, templateType: String, fieldsList: js.Array[_]): JQueryDeferred[_] = js.native
    /**
      *Delete list item
      * @param listName listName to which item belongs
      * @param itemid
      */
    def DeleteListItem(listName: String, itemid: String): JQueryDeferred[_] = js.native
    /**
      * Get All lists from the site. By default it fetechs from root site
      * @param useRoot
      */
    def GetAllList(): JQueryDeferred[_] = js.native
    def GetAllList(useRoot: Boolean): JQueryDeferred[_] = js.native
    /**
      * Get all user groups for site
      * @param searchUniqueValue
      * @param currentPage
      * @param pageLimit
      */
    def GetGroupsForSite(searchUniqueValue: js.Any, currentPage: Double, pageLimit: Double): js.Any = js.native
    def GetItemsFromListByTitle(listName: String, searchTerm: String, isroot: Boolean): JQueryDeferred[_] = js.native
    /**
      * Get list from SharePoint
      * @param request
      */
    def GetList(request: IGetListRequest): js.Promise[_] = js.native
    /**
      *Get Permissin on list for current user
      * @param listName listName  to fetch permission of
      */
    def GetListEffectiveBasePermissions(listName: String): JQueryDeferred[js.Object] = js.native
    /** Get List position  */
    def GetListPosition(): JQueryDeferred[_] = js.native
    /**
      * Get matching pages from Page Url List
      * @param searchText Text to search existing pages
      */
    def GetPagesFromPageUrlList(searchText: String): JQueryDeferred[_] = js.native
    /**
      * Get permissions set for list item
      * @param listName Name of list
      * @param itemId List Item id
      */
    def GetPermissionForListItem(listName: String, itemId: String): JQueryDeferred[_] = js.native
    /**
      * Get saved layout from Sharepoint
      * @param layoutName Layout Name
      */
    def GetSavedLayout(layoutName: String): JQueryDeferred[_] = js.native
    /**
      * Get Site Properties
      * @param request
      */
    def GetSiteProperties(request: js.Any): JQueryDeferred[_] = js.native
    /**
      * Get widgets for page
      * @param pageId
      * @param legacy
      */
    def GetWidgetsForPage(pageId: String): JQueryDeferred[_] = js.native
    def GetWidgetsForPage(pageId: String, legacy: Boolean): JQueryDeferred[_] = js.native
    def LoadTermSet(): JQueryDeferred[_] = js.native
    def LoadTermSet(termSetName: String): JQueryDeferred[_] = js.native
    def LoadTermSet(termSetName: String, columnName: String): JQueryDeferred[_] = js.native
    def LoadTermSet(termSetName: String, columnName: String, columnValue: String): JQueryDeferred[_] = js.native
    def LoadTermSet(termSetName: String, columnName: Null, columnValue: String): JQueryDeferred[_] = js.native
    def LoadTermSet(termSetName: Null, columnName: String): JQueryDeferred[_] = js.native
    def LoadTermSet(termSetName: Null, columnName: String, columnValue: String): JQueryDeferred[_] = js.native
    def LoadTermSet(termSetName: Null, columnName: Null, columnValue: String): JQueryDeferred[_] = js.native
    def LoadTermSetByColumnName(request: IGetListRequest, columnName: String): JQueryDeferred[_] = js.native
    def LoadTermSetByColumnName(request: IGetListRequest, columnName: String, columnValue: String): JQueryDeferred[_] = js.native
    /**
      * Add new page to list
      * @param pageObject JSON object with properties for page
      */
    def ProvisionPageObject(pageObject: js.Any): JQueryDeferred[_] = js.native
    /**
      * Add/Save new widgets to page
      * @param widgetName
      * @param pageId
      * @param pageWidgets
      */
    def ProvisionPageWidgets(widgetName: String, pageId: String, pageWidgets: js.Array[_]): JQueryDeferred[_] = js.native
    /**
      * Save custom layout
      * @param layoutObject JSON object having layout details
      */
    def ProvisionSavedLayout(layoutObject: js.Any): JQueryDeferred[_] = js.native
    /**
      * Search in sharepoint list based on request
      * @param request
      */
    def Search(request: js.Any): JQueryDeferred[_] = js.native
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
    def SetPermissionsForListItem(listName: String, itemId: String, editgroup: js.Any, readgroup: js.Any, useRootWeb: Boolean): JQueryDeferred[_] = js.native
    /**
      * Set personas for list item
      * @param listName ListName of which item belongs
      * @param itemId ID of item to set persona.
      * @param personaList Semicolon seprated List of persona to set for item
      * @param columnName column Name for persona
      */
    def SetPersonasForItem(listName: String, itemId: Double, personaList: js.Any): JQueryDeferred[_] = js.native
    def SetPersonasForItem(listName: String, itemId: Double, personaList: js.Any, columnName: String): JQueryDeferred[_] = js.native
    /**
      * Set Tags for list item
      * @param listName List Name
      * @param itemId Item Id
      * @param columnName Coloumn Name for tags
      * @param tagList semicolon seprated list of tags
      */
    def SetTagsForItem(listName: String, itemId: String, columnName: String, tagList: js.Any): JQueryDeferred[_] = js.native
    /**
      *Updates list item
      * @param listName listName to which item belongs
      * @param itemid
      * @param queryParams data that needs to updated as an object
      */
    def UpdateListItem(listName: String, itemid: String, queryParams: js.Any): JQueryDeferred[_] = js.native
    /**
      * Update page object Items
      * @param pageObject
      */
    def UpdatePageObjectsItem(pageTypeList: String, pageObject: js.Any, pageId: String): JQueryDeferred[_] = js.native
    def UpdatePageUrlsItem(pageObject: js.Any, pageId: String): JQueryDeferred[_] = js.native
    def UpdatePageUrlsItem(pageObject: js.Any, pageId: String, pageTypeList: String): JQueryDeferred[_] = js.native
    /**
      * Check if user have edit permission on list item.
      * @param pageReferenceList
      * @param pageId
      * @returns Resolves with {ReadPermission: bool, EditPermission: bool}
      */
    // tslint:disable-next-line unified-signatures
    def UserPermissionsForListItem(pageReferenceList: js.Any, pageId: String): JQueryDeferred[_] = js.native
    /**
      * Check user permission on list item
      * @param pageTypeList listName to which item belongs
      * @param pageId
      */
    def UserPermissionsForListItem(pageTypeList: String, pageId: String): JQueryDeferred[_] = js.native
  }
  
  @js.native
  class Graph () extends js.Object {
    def GetProfilePicture(email: String, flag: Boolean): js.Promise[_] = js.native
  }
  
  @js.native
  class Groups () extends js.Object {
    def GetGraphDataWithFullUrl(url: String, param: js.Any): js.Promise[_] = js.native
    def GetGraphUrl(prefix: String, query: String, filterQuery: String, cacheKey: String): String = js.native
    def GetGroupForPage(pageId: String): JQueryDeferred[_] = js.native
  }
  
  @js.native
  class Interchange () extends js.Object {
    /* Added */
    // CanUserSetItemPermissions(referenceList: string): JQueryDeferred<any>;
    // GetPermissionForListItem(referenceList: string, itemId: string): JQueryDeferred<any>;
    def AppPart(referenceList: String, itemId: String): js.Any = js.native
    /**
      * Check licenses assigned to members
      * @param memberids string
      */
    def CheckAssignedLicenses(memberids: String): JQueryDeferred[_] = js.native
    /**
      * Send data to decrypt
      * @param data
      */
    def DecryptData(data: String): JQueryDeferred[_] = js.native
    /**
      * Send data to encrypt
      * @param data
      */
    def EncryptData(data: String): JQueryDeferred[_] = js.native
    /**
      * Get activated Features on site.
      * @returns Resolves in success with JSON object
      */
    def GetActivatedFeatures(): JQueryDeferred[_] = js.native
    /**
      * @returns Resolves with language ID {number}
      */
    def GetAppManagerLanguageId(): JQueryDeferred[_] = js.native
    /**
      * @returns Def Resolves in success with Version Object {FileVersion: string, ProductVersion: string}
      */
    def GetAppManagerVersion(): JQueryDeferred[_] = js.native
    /**
      * Get list of apps available for user
      * @param listName String
      */
    def GetApps(listName: String): JQueryDeferred[_] = js.native
    /**
      * Get Configuration object
      */
    def GetConfiguration(): js.Any = js.native
    /**
      * @returns resolves with array of widget objects
      */
    def GetDashboardWidgets(): JQueryDeferred[_] = js.native
    /**
      * Get Facets from interchange
      * @param facetObj List of facets object
      */
    def GetFacets(facetObj: js.Array[_]): JQueryDeferred[_] = js.native
    /**
      * Get sharepoint lists associated with the passed content type
      * @param contenttype
      */
    def GetListsForContentType(contenttype: String): JQueryDeferred[_] = js.native
    def GetMenuApps(): js.Any = js.native
    /**
      * Get myapps cache key for the current user
      * @param attribute
      */
    def GetMyAppsCacheKey(attribute: String): JQueryDeferred[_] = js.native
    /**
      * Get page object from pageURL
      * @param relativePageUrl
      */
    def GetPageObjectForPageUrl(relativePageUrl: String): JQueryDeferred[_] = js.native
    /**
      * @param listName SharePoint List name ex. GenericPages_AK
      * @param itemId Item Id for which permissions need to be checked
      */
    def GetPermissionForListItemForCurrentUser(listName: String, itemId: String): JQueryDeferred[_] = js.native
    /**
      * Get UserGroup list based of type of authoristion
      * @param authorization
      */
    def GetSPGroupUsersAndUserGroupsList(authorization: js.Any): JQueryDeferred[_] = js.native
    /**
      * Filter user accessible apps from list of apps.
      * @param groups User Groups #MARK currently not used.
      * @param appsData List of apps
      */
    def GetUserAccessibleApps(groups: Null, appsData: js.Array[_]): JQueryDeferred[_] = js.native
    /**
      * Get user groups
      * @param model
      */
    def GetUserGroups(model: js.Any): JQueryDeferred[_] = js.native
    /**
      * Get groups the current user is added to.
      * @returns def resolves in success with Array of names of User Groups of current user.
      */
    def GetUserGroupsFromAppManager(): JQueryDeferred[_] = js.native
    /**
      * To get personas assigned to a user
      * @param userId
      * @returns deferred resolves with array of presonas string
      */
    def GetUserPersonas(userId: String): JQueryDeferred[_] = js.native
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
      filters: js.Any,
      pageSize: Double,
      pageNumber: Double,
      orderByField: String,
      sortDirection: String
    ): js.Any = js.native
    /**
      * Fetches widgets js
      * @param widgets Array of widget objects
      * @param widgetNames Array of widget names
      */
    def GetWidgetJS(widgets: js.Array[_], widgetNames: js.Array[String]): JQueryDeferred[_] = js.native
    /**
      * Check if user is logged into appManager
      */
    def IsLoggedIntoAppManager(): JQueryDeferred[_] = js.native
    /**
      * Check if workspace is marked for delete
      * @param workspaceId string
      */
    def IsWorkspaceMarkedAsDeleted(workspaceId: String): JQueryDeferred[_] = js.native
    /**
      * Marks workspace as deleted
      * @param workspaceId workspace id
      */
    def MarkWorkspaceAsDeleted(workspaceId: String): JQueryDeferred[_] = js.native
    /**
      * Resolves with siteID
      * @param selectedSiteId
      */
    def PerformChangeSite(selectedSiteId: String): JQueryDeferred[_] = js.native
    /**
      * Save page widgets
      * @param pageId
      */
    def ProvisionPageWidgets(pageWidgetsRequest: ISavePageWidgetRequest): JQueryDeferred[_] = js.native
    /**
      * @returns Resolves in success with boolean value
      */
    def RefreshAkToken(): JQueryDeferred[_] = js.native
    /**
      * Update Page object Cache
      * @param pageObjects
      */
    def UpdatePageObjectsCache(pageObjects: js.Any): JQueryDeferred[_] = js.native
    /**
      * Update Page properties
      * @param referenceList
      * @param itemId
      * @param data
      */
    def UpdatePageProperties(referenceList: String, itemId: String, data: js.Any): JQueryDeferred[_] = js.native
    /**
      * Updates widget instance cache
      * @param widgetInstanceId Optional
      */
    def UpdateWidgetInstanceCache(): JQueryDeferred[_] = js.native
    def UpdateWidgetInstanceCache(widgetInstanceId: String): JQueryDeferred[_] = js.native
    /**
      * @returns Resolves in success with boolean value
      */
    def ValidateAkToken(): JQueryDeferred[_] = js.native
  }
  
  @js.native
  class LanguageManager () extends js.Object {
    def GetDefaultLanguage(): js.Any = js.native
  }
  
  @js.native
  class PageManager () extends js.Object {
    /**
      * Add Page for groups
      * @param pageModel
      */
    def AddPageForGroup(pageModel: js.Any): JQueryDeferred[_] = js.native
    /**
      * Add pages for group
      * @param model
      */
    def AddPagesForGroup(model: js.Any): JQueryDeferred[_] = js.native
    /**
      * Returns List of permissions for current user for passed list
      * @param listName Name of list
      * @param useRootWeb Boolean flag
      */
    def CanUserSetPagePermissions(listName: String, useRootWeb: Boolean): JQueryDeferred[_] = js.native
    /**
      * Execute Share point query
      * @param clientContext
      * @param collListItem
      * @param def
      * @param idArray
      * @param columnName
      */
    def ExecuteAsyncQuery(
      clientContext: js.Any,
      collListItem: js.Any,
      `def`: JQueryDeferred[_],
      idArray: js.Array[_],
      columnName: String
    ): JQueryDeferred[_] = js.native
    /**
      * Get Available Workspace Types
      * @param groupType
      */
    def GetAvailableWorkspaceTypes(groupType: String): JQueryDeferred[_] = js.native
    /**
      * Get containers for view
      * @param viewTemplateUrl
      */
    def GetContainersForView(viewTemplateUrl: String): JQueryDeferred[_] = js.native
    /**
      * Get Dashboard Page for User
      * @param userId
      * @returns resolves with dashboard page for user {title, userId, pageId}
      */
    def GetDashboardPageForUser(userId: String): JQueryDeferred[_] = js.native
    /**
      * Get Dashboard widgets
      * @param pageId
      */
    def GetDashboardWidgetsViaAppManager(pageId: String): JQueryDeferred[_] = js.native
    /**
      * Get Layouts For ToolBar
      * @param pageId
      */
    def GetLayoutsForToolBar(pageId: String): JQueryDeferred[_] = js.native
    /**
      * Get Page Active View
      * @param pageId
      */
    def GetPageActiveView(pageId: String): JQueryDeferred[_] = js.native
    /**
      * Retrives available page views
      * @param pageId
      */
    def GetPageAvailableViews(pageId: String): JQueryDeferred[_] = js.native
    /**
      * Get Page Child widgets
      * @param pageId
      */
    def GetPageChildWidgets(pageId: String): JQueryDeferred[_] = js.native
    /**
      * Get default page layouts
      * @return Array of page layout object
      * {displayOrder:, layoutId:, layoutImage:, layoutTemplate:, layoutTitle:, selectedLayout:, spPageLayoutId: }
      */
    def GetPageLayouts(): js.Array[_] = js.native
    def GetPageObject(): JQueryDeferred[_] = js.native
    /**
      * Get page object from pageURL
      * @param relativePageurl relative page URL
      */
    def GetPageObjectForPageUrl(relativePageurl: String): JQueryDeferred[_] = js.native
    /**
      * Returns page type information
      * @param pageTypeParam Page Type
      */
    def GetPageTypeInfo(pageTypeParam: String): JQueryDeferred[_] = js.native
    /**
      * Retrive page widget
      * @param pageId
      */
    def GetPageWidget(pageId: String): JQueryDeferred[_] = js.native
    /**
      * Resolves with all the page widgets
      */
    def GetPageWidgets(): JQueryDeferred[_] = js.native
    /**
      * Get matching pages from Page Url List
      * @param searchText Text to search existing pages
      */
    def GetPagesFromPageUrlList(searchText: String): JQueryDeferred[_] = js.native
    /**
      * Get permissions for Page
      * @param listName Name of list
      * @param itemId Page Id
      */
    def GetPermissionForPage(listName: String, itemId: String): JQueryDeferred[_] = js.native
    /**
      * Get saved layout from Sharepoint
      * @param Title Layout Name
      */
    def GetSavedLayout(): JQueryDeferred[_] = js.native
    def GetSavedLayout(Title: String): JQueryDeferred[_] = js.native
    /**
      * Get widgets for page
      * @param pageId
      * @param legacy
      */
    def GetWidgetsForPage(pageId: String): JQueryDeferred[_] = js.native
    def GetWidgetsForPage(pageId: String, legacy: Boolean): JQueryDeferred[_] = js.native
    /**
      * Get Widgets For Toolbar
      */
    def GetWidgetsForToolbar(): JQueryDeferred[_] = js.native
    /**
      * Returns true if widget instance is either Dashboard, PageWidget or Container
      * @param widgetInstances string of widget Type
      */
    def IsDashBoardOrPageWidgetOrContainer(widgetInstances: js.Any): Boolean = js.native
    /**
      * Returns true if widget type passed is either Dashboard, PageWidget or Container Type
      * @param widgetType string of widget Type
      */
    def IsDashboardOrPageWidgetOrContainerType(widgetType: js.Any): Boolean = js.native
    /**
      * Check if group type is custom
      * @param type
      */
    def IsGroupTypeCustom(`type`: String): Boolean = js.native
    /**
      * Loads a new page
      * @param pageRouteInfo JSON object with page routing information
      */
    def LoadNewPage(pageRouteInfo: js.Any): Unit = js.native
    /**
      * Save dashboard page for user
      * @param userId
      */
    def ProvisionDashboardPageForUser(userId: String): JQueryDeferred[_] = js.native
    /**
      * Save update page objects
      * @param pageObject
      */
    def ProvisionPageObject(pageObject: js.Any): JQueryDeferred[_] = js.native
    /**
      * Save page widgets
      * @param widgetName
      * @param pageId
      * @param pageWidgets
      */
    def ProvisionPageWidgets(widgetName: String, pageId: String, pageWidgets: js.Array[_]): JQueryDeferred[_] = js.native
    /**
      * Save custom layout
      * @param layoutObject JSON object having layout details
      */
    def ProvisionSavedLayout(data: js.Any): JQueryDeferred[_] = js.native
    /**
      * Remove Group Page
      * @param pageIds
      */
    def RemoveGroupPage(pageIds: js.Array[String]): JQueryDeferred[_] = js.native
    /**
      * Remmove group page mapping
      * @param groupId
      */
    def RemoveGroupPageMapping(groupId: String): JQueryDeferred[_] = js.native
    /**
      * Remove Group WIdget properties
      * @param widgetInstanceIds
      */
    def RemoveGroupWidgetProperties(widgetInstanceIds: js.Array[String]): JQueryDeferred[_] = js.native
    /**
      * Remove pages for group
      * @param groupId
      */
    def RemovePagesForGroup(groupId: String): JQueryDeferred[_] = js.native
    /**
      * Save dashboard page
      * @param pageId
      */
    def SaveDashboardPage(pageId: String): JQueryDeferred[_] = js.native
    def SavePage(pageId: String): JQueryDeferred[_] = js.native
    /**
      * Save page contents(widgets)
      * @param pageId
      * @param pageWidgets
      */
    def SetPageContents(pageId: String, data: js.Any): JQueryDeferred[_] = js.native
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
    ): JQueryDeferred[_] = js.native
    /**
      * Set personas for page
      * @param listName ListName of which item belongs
      * @param itemId ID of item to set persona.
      * @param personaList Semicolon seprated List of persona to set for item
      * @param columnName Coloumn Name
      */
    def SetPersonasForPage(listName: String, itemId: String, personaList: js.Any): JQueryDeferred[_] = js.native
    def SetPersonasForPage(listName: String, itemId: String, personaList: js.Any, columnName: String): JQueryDeferred[_] = js.native
    /**
      * Set Tags for Page
      * @param listName List Name
      * @param itemId Item Id of page
      * @param columnName Coloumn Name to be updated for tags
      * @param list semicolon seprated list of tags
      */
    def SetTagsForPage(listName: String, itemId: String, columnName: String, list: js.Any): JQueryDeferred[_] = js.native
    /**
      * Provide grid details
      */
    def getGrid(): js.Array[_] = js.native
  }
  
  @js.native
  class PersonaManager () extends js.Object {
    /** Get array of Lists with persona enabled
      */
    def GetPersonaEnabledLists(): js.Array[String] = js.native
    /** Does List reuire persona check
      * @param listName
      */
    def IsPersonaCheckRequiredForList(listName: String): JQueryDeferred[_] = js.native
    /**
      * Returns object setting filterByPersona property. Or default object
      * @param request
      */
    def IsPersonaFilteringOn(): js.Any = js.native
    def IsPersonaFilteringOn(request: js.Any): js.Any = js.native
  }
  
  @js.native
  class RestSharepoint () extends js.Object
  
  @js.native
  class SharePoint () extends js.Object {
    /**
      * Create new list item
      * @param createItemRequest
      */
    def CreateItem(createItemRequest: js.Any): JQueryDeferred[_] = js.native
    /**
      * Create new list
      * @param siteUrl
      * @param siteTitle
      * @param templateType
      * @param fieldsList
      */
    def CreateList(siteUrl: String, siteTitle: String, templateType: String, fieldsList: js.Array[_]): JQueryDeferred[_] = js.native
    def GetAppInstances(successCallback: js.Any, errorCallback: js.Any): Unit = js.native
    /**
      * Get SiteID of current site
      */
    def GetCurrentSiteId(): JQueryDeferred[_] = js.native
    def GetList(request: js.Any): JQueryDeferred[_] = js.native
    /**
      * Get list of users under user groups
      * @param authorizationGroups List of authorization Groups
      */
    def GetSPGroupUsersByGroupName(authorizationGroups: js.Array[_]): JQueryDeferred[_] = js.native
    /**
      * Get User Groups current user belongs to
      */
    def GetSPUserGroups(): JQueryDeferred[_] = js.native
    /**
      * @param siteUrl Absolute path
      */
    def GetSiteIdByUrl(siteUrl: String, useRootWeb: Boolean): JQueryDeferred[_] = js.native
    /**
      * Get all SP user groups
      * @returns Resolves with array of {id, displayName, type, description}
      */
    def GetSiteSPGroups(): JQueryDeferred[_] = js.native
    def LoadTermSet(termSetName: String): JQueryDeferred[_] = js.native
    def LoadTermSet(termSetName: String, columnName: String): JQueryDeferred[_] = js.native
    /* Added */
    def LoadTermSet(termSetName: String, columnName: String, columnValue: String): JQueryDeferred[_] = js.native
    def LoadTermSet(termSetName: String, columnName: Null, columnValue: String): JQueryDeferred[_] = js.native
    def LoadTermSetById(termSetId: String, columnName: String): JQueryDeferred[_] = js.native
    def LoadTermSetById(termSetId: String, columnName: String, columnValue: String): JQueryDeferred[_] = js.native
    /**
      * Update Page object item
      * @param pageTypeList List Name
      * @param pageObject Page object to be updated
      * @param pageId Item Id of page list item
      */
    def UpdatePageObjectsItem(pageTypeList: String, pageObject: js.Any, pageId: String): JQueryDeferred[_] = js.native
    /**
      * @param pageObject
      * @param pageId
      * @param pageTypeList
      */
    def UpdatePageUrlsItem(pageObject: js.Any, pageId: String): JQueryDeferred[_] = js.native
    def UpdatePageUrlsItem(pageObject: js.Any, pageId: String, pageTypeList: String): JQueryDeferred[_] = js.native
  }
  
  @js.native
  class WidgetFactory () extends js.Object {
    def UpdatePageWidgetInstancesCache(model: js.Any): js.Any = js.native
  }
  
  @js.native
  class WidgetManager () extends js.Object {
    /** Add dashboard widget instance */
    def AddDashboardWidgetInstance(dashboardWidgetTitle: String, widgetInstance: js.Any): JQueryDeferred[_] = js.native
    // RenderWidget(data: any, pageId: string, widgetProps: string, view: string): any;
    /* Added in Alphabatical order */
    /** Check if widgetinstances are Dashboard Container widgets */
    def AreDashboardContainerWidgets(widgetInstanceIds: js.Array[_]): JQueryDeferred[_] = js.native
    /** Copy Widget Instance */
    def CopyWidgetInstance(widgetInstanceId: String): JQueryDeferred[_] = js.native
    def GetAndInitWidgetsPerJSFile(item: js.Any, widgetDepJsArray: js.Array[_]): Unit = js.native
    def GetManualDependencyMap(widgetName: String): js.Array[_] = js.native
    /** Resolves with next AkId */
    def GetNextAkId(): JQueryDeferred[_] = js.native
    /** Resolves with siteId */
    def GetSiteId(): JQueryDeferred[_] = js.native
    /**
      * @returns Resolves with Array with object of all the widget Instances
      */
    def GetWidgetInstances(): JQueryDeferred[_] = js.native
    /**
      * Retrives all the widget instances ID on the current page.
      * @returns object with ids: string[] & rel: Array<>
      */
    def GetWidgetInstancesOnPage(): js.Any = js.native
    /**
      * Get js file list for dependent widgets
      * @param widgetName
      * @param widgetToDeps
      * @param depJsFiles
      */
    def GetWidgetJSArrayFromWidget(widgetName: String, widgetToDeps: js.Array[_], depJsFiles: js.Array[_]): js.Array[_] = js.native
    def GetWidgetJSFromDependency(widgets: js.Array[_]): JQueryDeferred[_] = js.native
    /**
      * @returns def Resolves in success with Widget Manager Instance ID
      */
    def GetWidgetManagerApp(): JQueryDeferred[_] = js.native
    /**
      * @returns def Resolves in success with Object with authorized user groups
      */
    def GetWidgetManagerAppAuthorization(): JQueryDeferred[_] = js.native
    /**
      * Get list of widget on current page.
      * @param widgets
      */
    def GetWidgetObjsOnPage(widgets: js.Array[_]): js.Array[_] = js.native
    def GetWidgetPropertiesForInstances(): JQueryDeferred[_] = js.native
    /**
      * #MARK - dataType correction
      * @param widgetInstanceIds Array of widget Instance Ids
      */
    def GetWidgetPropertiesForInstances(widgetInstanceIds: js.Array[String]): JQueryDeferred[_] = js.native
    /**
      * @param widgetType WidgetType
      * @returns def Resolves in success with array of objects of widget view of widgetType passed
      */
    def GetWidgetViews(widgetType: String): JQueryDeferred[_] = js.native
    /** Initialize widget passed */
    def InitWidget(item: js.Any): Unit = js.native
    def InitializeChildWidgetsWithOverride(widgetIds: js.Array[String], pageId: String, widgetProps: js.Array[_], view: String): js.Any = js.native
    /** Initialize widgets passed in array */
    def InitializeWidgets(widgets: js.Array[_]): JQueryDeferred[_] = js.native
    def PopulateAutoDependencyMap(widgetsWithPropsArray: js.Array[_], widgetArray: js.Array[_]): js.Array[_] = js.native
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

