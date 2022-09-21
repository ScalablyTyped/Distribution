package typings.auth0.mod

import typings.auth0.anon.ObjectWithIduseridstring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0", "ManagementClient")
@js.native
open class ManagementClient[A, U] protected () extends StObject {
  def this(options: ManagementClientOptions) = this()
  
  def addPermissionsInRole(params: ObjectWithId, data: PermissionsData): js.Promise[Unit] = js.native
  def addPermissionsInRole(params: ObjectWithId, data: PermissionsData, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def assignPermissionsToUser(params: ObjectWithId, data: PermissionsData): js.Promise[Unit] = js.native
  def assignPermissionsToUser(params: ObjectWithId, data: PermissionsData, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  // The lowercase 't' is like this in the auth0 sdk
  def assignRolestoUser(params: ObjectWithId, data: RolesData): js.Promise[Unit] = js.native
  def assignRolestoUser(params: ObjectWithId, data: RolesData, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def blacklistToken(token: Token): js.Promise[Any] = js.native
  def blacklistToken(token: Token, cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  
  def configureEmailProvider(data: Data): js.Promise[Any] = js.native
  def configureEmailProvider(data: Data, cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  
  def createClient(data: Data): js.Promise[Client] = js.native
  def createClient(data: Data, cb: js.Function2[/* err */ js.Error, /* client */ Client, Unit]): Unit = js.native
  
  def createClientGrant(data: CreateClientGrant): js.Promise[ClientGrant] = js.native
  def createClientGrant(data: CreateClientGrant, cb: js.Function2[/* err */ js.Error, /* data */ ClientGrant, Unit]): Unit = js.native
  
  def createConnection(data: CreateConnection): js.Promise[Connection] = js.native
  def createConnection(data: CreateConnection, cb: js.Function2[/* err */ js.Error, /* connection */ Connection, Unit]): Unit = js.native
  
  // Custom Domains
  def createCustomDomain(data: CreateDomainData): js.Promise[Domain] = js.native
  def createCustomDomain(data: CreateDomainData, cb: js.Function2[/* err */ js.Error, /* domain */ Domain, Unit]): Unit = js.native
  
  def createDevicePublicKey(data: Data): js.Promise[User[A, U]] = js.native
  def createDevicePublicKey(data: Data, cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  
  def createEmailTemplate(data: Data): Unit = js.native
  def createEmailTemplate(data: Data, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  // Templates
  @JSName("createEmailTemplate")
  def createEmailTemplate_Promise(data: Data): js.Promise[Any] = js.native
  
  def createEmailVerificationTicket(data: EmailVerificationTicketOptions): Unit = js.native
  def createEmailVerificationTicket(data: EmailVerificationTicketOptions, cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  @JSName("createEmailVerificationTicket")
  def createEmailVerificationTicket_Promise(data: EmailVerificationTicketOptions): js.Promise[Any] = js.native
  
  def createGuardianEnrollmentTicket(data: SendEnrollmentTicketData): js.Promise[SendEnrollmentTicketResponse] = js.native
  def createGuardianEnrollmentTicket(
    data: SendEnrollmentTicketData,
    cb: js.Function2[/* err */ js.Error, /* data */ SendEnrollmentTicketResponse, Unit]
  ): Unit = js.native
  
  def createPasswordChangeTicket(params: PasswordChangeTicketParams): Unit = js.native
  def createPasswordChangeTicket(
    params: PasswordChangeTicketParams,
    cb: js.Function2[/* err */ js.Error, /* data */ PasswordChangeTicketResponse, Unit]
  ): Unit = js.native
  // Tickets
  @JSName("createPasswordChangeTicket")
  def createPasswordChangeTicket_Promise(params: PasswordChangeTicketParams): js.Promise[PasswordChangeTicketResponse] = js.native
  
  def createResourceServer(data: CreateResourceServer): Unit = js.native
  def createResourceServer(data: CreateResourceServer, cb: js.Function2[/* err */ js.Error, /* data */ ResourceServer, Unit]): Unit = js.native
  // Resource Server
  @JSName("createResourceServer")
  def createResourceServer_Promise(data: CreateResourceServer): js.Promise[ResourceServer] = js.native
  
  def createRole(data: CreateRoleData): js.Promise[Role] = js.native
  def createRole(data: CreateRoleData, cb: js.Function2[/* err */ js.Error, /* role */ Role, Unit]): Unit = js.native
  
  def createRule(data: Data): js.Promise[Rule] = js.native
  def createRule(data: Data, cb: js.Function2[/* err */ js.Error, /* rule */ Rule, Unit]): Unit = js.native
  
  def createUser(data: CreateUserData): js.Promise[User[A, U]] = js.native
  def createUser(data: CreateUserData, cb: js.Function2[/* err */ js.Error, /* user */ User[A, U], Unit]): Unit = js.native
  
  // Should be removed from auth0 also. Doesn't exist in api.
  def deleteAllUsers(): js.Promise[User[A, U]] = js.native
  def deleteAllUsers(cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  
  def deleteClient(params: ClientParams): js.Promise[Unit] = js.native
  def deleteClient(params: ClientParams, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def deleteClientGrant(params: ObjectWithId): js.Promise[Unit] = js.native
  def deleteClientGrant(params: ObjectWithId, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def deleteConnection(params: ObjectWithId): js.Promise[Unit] = js.native
  def deleteConnection(params: ObjectWithId, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def deleteCustomDomain(params: ObjectWithId): js.Promise[Unit] = js.native
  def deleteCustomDomain(params: ObjectWithId, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def deleteDeviceCredential(params: ObjectWithId): js.Promise[Unit] = js.native
  def deleteDeviceCredential(params: ObjectWithId, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def deleteEmailProvider(): Unit = js.native
  def deleteEmailProvider(cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  @JSName("deleteEmailProvider")
  def deleteEmailProvider_Promise(): js.Promise[Any] = js.native
  
  def deleteGrant(params: ObjectWithIduseridstring): Unit = js.native
  def deleteGrant(params: ObjectWithIduseridstring, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  @JSName("deleteGrant")
  def deleteGrant_Promise(params: ObjectWithIduseridstring): js.Promise[Unit] = js.native
  
  def deleteGuardianEnrollment(params: ObjectWithId): Unit = js.native
  def deleteGuardianEnrollment(params: ObjectWithId, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  @JSName("deleteGuardianEnrollment")
  def deleteGuardianEnrollment_Promise(params: ObjectWithId): js.Promise[Unit] = js.native
  
  def deleteResourceServer(params: ObjectWithId): Unit = js.native
  def deleteResourceServer(params: ObjectWithId, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  @JSName("deleteResourceServer")
  def deleteResourceServer_Promise(params: ObjectWithId): js.Promise[Unit] = js.native
  
  def deleteRole(params: ObjectWithId): js.Promise[Unit] = js.native
  def deleteRole(params: ObjectWithId, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def deleteRule(params: ObjectWithId): js.Promise[Unit] = js.native
  def deleteRule(params: ObjectWithId, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def deleteRulesConfig(params: RulesConfig): js.Promise[Unit] = js.native
  def deleteRulesConfig(params: RulesConfig, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def deleteUser(params: ObjectWithId): Unit = js.native
  def deleteUser(params: ObjectWithId, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def deleteUserMultifactor(params: DeleteMultifactorParams): js.Promise[Unit] = js.native
  def deleteUserMultifactor(params: DeleteMultifactorParams, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  @JSName("deleteUser")
  def deleteUser_Promise(params: ObjectWithId): js.Promise[Unit] = js.native
  
  def exportUsers(data: ExportUsersOptions): Unit = js.native
  def exportUsers(data: ExportUsersOptions, cb: js.Function2[/* err */ js.Error, /* data */ ExportUsersJob, Unit]): Unit = js.native
  @JSName("exportUsers")
  def exportUsers_Promise(data: ExportUsersOptions): js.Promise[ExportUsersJob] = js.native
  
  // Tokens
  def getAccessToken(): js.Promise[String] = js.native
  
  def getActiveUsersCount(): Unit = js.native
  def getActiveUsersCount(cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  // Statistics
  @JSName("getActiveUsersCount")
  def getActiveUsersCount_Promise(): js.Promise[Any] = js.native
  
  def getBlacklistedTokens(): Unit = js.native
  def getBlacklistedTokens(cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  @JSName("getBlacklistedTokens")
  def getBlacklistedTokens_Promise(): js.Promise[Any] = js.native
  
  def getClient(params: ClientParams): js.Promise[Client] = js.native
  def getClient(params: ClientParams, cb: js.Function2[/* err */ js.Error, /* client */ Client, Unit]): Unit = js.native
  
  // Client Grants
  def getClientGrants(): js.Promise[js.Array[ClientGrant]] = js.native
  def getClientGrants(cb: js.Function2[/* err */ js.Error, /* data */ js.Array[ClientGrant], Unit]): Unit = js.native
  def getClientGrants(params: GetClientGrantsOptions): js.Promise[js.Array[ClientGrant]] = js.native
  def getClientGrants(params: GetClientGrantsOptionsPaged): js.Promise[ClientGrantPage] = js.native
  def getClientGrants(
    params: GetClientGrantsOptionsPaged,
    cb: js.Function2[/* err */ js.Error, /* data */ ClientGrantPage, Unit]
  ): Unit = js.native
  def getClientGrants(
    params: GetClientGrantsOptions,
    cb: js.Function2[/* err */ js.Error, /* data */ js.Array[ClientGrant], Unit]
  ): Unit = js.native
  
  def getClientInfo(): ClientInfo = js.native
  
  // Clients
  def getClients(): js.Promise[js.Array[Client]] = js.native
  def getClients(cb: js.Function2[/* err */ js.Error, /* clients */ js.Array[Client], Unit]): Unit = js.native
  def getClients(params: GetClientsOptions): js.Promise[js.Array[Client]] = js.native
  def getClients(
    params: GetClientsOptions,
    cb: js.Function2[/* err */ js.Error, /* clients */ js.Array[Client], Unit]
  ): Unit = js.native
  
  def getConnection(params: ObjectWithId): js.Promise[Connection] = js.native
  def getConnection(params: ObjectWithId, cb: js.Function2[/* err */ js.Error, /* connection */ Connection, Unit]): Unit = js.native
  
  def getConnections(): js.Promise[js.Array[Connection]] = js.native
  def getConnections(cb: js.Function2[/* err */ js.Error, /* connections */ js.Array[Connection], Unit]): Unit = js.native
  // Connections
  def getConnections(params: PagingOptions): js.Promise[js.Array[Connection]] = js.native
  
  def getCustomDomain(params: ObjectWithId): js.Promise[Domain] = js.native
  def getCustomDomain(params: ObjectWithId, cb: js.Function2[/* err */ js.Error, /* data */ Domain, Unit]): Unit = js.native
  
  def getCustomDomains(): js.Promise[js.Array[Domain]] = js.native
  def getCustomDomains(cb: js.Function2[/* err */ js.Error, /* data */ js.Array[Domain], Unit]): Unit = js.native
  
  def getDailyStats(data: StatsParams): js.Promise[Any] = js.native
  def getDailyStats(data: StatsParams, cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  
  // Device Keys
  def getDeviceCredentials(params: GetDeviceCredentialsParams): js.Promise[js.Array[DeviceCredential]] = js.native
  def getDeviceCredentials(
    params: GetDeviceCredentialsParams,
    cb: js.Function2[/* err */ js.Error, /* data */ js.Array[DeviceCredential], Unit]
  ): Unit = js.native
  
  def getEmailProvider(): Unit = js.native
  def getEmailProvider(cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  // Providers
  @JSName("getEmailProvider")
  def getEmailProvider_Promise(): js.Promise[Any] = js.native
  
  def getEmailTemplate(data: Data): Unit = js.native
  def getEmailTemplate(data: Data, cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  @JSName("getEmailTemplate")
  def getEmailTemplate_Promise(data: Data): js.Promise[Any] = js.native
  
  def getGrants(params: GetGrantsParams): Unit = js.native
  def getGrants(
    params: GetGrantsParams,
    cb: js.Function2[/* err */ js.Error, /* grants */ js.Array[GrantResponse], Unit]
  ): Unit = js.native
  // Grants
  @JSName("getGrants")
  def getGrants_Promise(params: GetGrantsParams): js.Promise[js.Array[GrantResponse]] = js.native
  
  // User enrollment
  def getGuardianEnrollment(params: ObjectWithId): js.Promise[Enrollment] = js.native
  def getGuardianEnrollment(params: ObjectWithId, cb: js.Function2[/* err */ js.Error, /* response */ Enrollment, Unit]): Unit = js.native
  
  def getGuardianEnrollments(params: ObjectWithId): js.Promise[js.Array[Enrollment]] = js.native
  def getGuardianEnrollments(
    params: ObjectWithId,
    cb: js.Function2[/* err */ js.Error, /* response */ js.Array[Enrollment], Unit]
  ): Unit = js.native
  
  def getJob(params: ObjectWithId): Unit = js.native
  def getJob(params: ObjectWithId, cb: js.Function2[/* err */ js.Error, /* data */ Job, Unit]): Unit = js.native
  // Jobs
  @JSName("getJob")
  def getJob_Promise(params: ObjectWithId): js.Promise[Job] = js.native
  
  def getLog(params: ObjectWithId): Unit = js.native
  def getLog(params: ObjectWithId, cb: js.Function2[/* err */ js.Error, /* data */ LogEvent, Unit]): Unit = js.native
  // Logs
  @JSName("getLog")
  def getLog_Promise(params: ObjectWithId): js.Promise[LogEvent] = js.native
  
  def getLogs(): Unit = js.native
  def getLogs(cb: js.Function2[/* err */ js.Error, /* data */ js.Array[LogEvent], Unit]): Unit = js.native
  def getLogs(query: Unit, cb: js.Function2[/* err */ js.Error, /* data */ js.Array[LogEvent], Unit]): Unit = js.native
  def getLogs(query: LogsQuery): Unit = js.native
  def getLogs(query: LogsQuery, cb: js.Function2[/* err */ js.Error, /* data */ js.Array[LogEvent], Unit]): Unit = js.native
  @JSName("getLogs")
  def getLogs_Promise(): js.Promise[js.Array[LogEvent]] = js.native
  @JSName("getLogs")
  def getLogs_Promise(query: LogsQuery): js.Promise[js.Array[LogEvent]] = js.native
  
  def getPermissionsInRole(params: GetRolePermissionsData): js.Promise[js.Array[Permission]] = js.native
  def getPermissionsInRole(params: GetRolePermissionsDataPaged): js.Promise[PermissionPage] = js.native
  def getPermissionsInRole(
    params: GetRolePermissionsDataPaged,
    cb: js.Function2[/* err */ js.Error, /* permissionPage */ PermissionPage, Unit]
  ): Unit = js.native
  def getPermissionsInRole(
    params: GetRolePermissionsData,
    cb: js.Function2[/* err */ js.Error, /* permissions */ js.Array[Permission], Unit]
  ): Unit = js.native
  def getPermissionsInRole(params: ObjectWithId): js.Promise[js.Array[Permission]] = js.native
  def getPermissionsInRole(
    params: ObjectWithId,
    cb: js.Function2[/* err */ js.Error, /* permissions */ js.Array[Permission], Unit]
  ): Unit = js.native
  
  def getResourceServer(data: ObjectWithId): Unit = js.native
  def getResourceServer(data: ObjectWithId, cb: js.Function2[/* err */ js.Error, /* data */ ResourceServer, Unit]): Unit = js.native
  @JSName("getResourceServer")
  def getResourceServer_Promise(data: ObjectWithId): js.Promise[ResourceServer] = js.native
  
  def getResourceServers(): Unit = js.native
  def getResourceServers(cb: js.Function2[/* err */ js.Error, /* data */ js.Array[ResourceServer], Unit]): Unit = js.native
  def getResourceServers(params: PagingOptions): js.Promise[js.Array[ResourceServer]] = js.native
  @JSName("getResourceServers")
  def getResourceServers_Promise(): js.Promise[js.Array[ResourceServer]] = js.native
  
  def getRole(params: ObjectWithId): js.Promise[Role] = js.native
  def getRole(params: ObjectWithId, cb: js.Function2[/* err */ js.Error, /* role */ Role, Unit]): Unit = js.native
  
  // Roles
  def getRoles(): js.Promise[js.Array[Role]] = js.native
  def getRoles(cb: js.Function2[/* err */ js.Error, /* roles */ js.Array[Role], Unit]): Unit = js.native
  def getRoles(params: GetRolesData): js.Promise[js.Array[Role]] = js.native
  def getRoles(params: GetRolesDataPaged): js.Promise[RolePage] = js.native
  def getRoles(params: GetRolesDataPaged, cb: js.Function2[/* err */ js.Error, /* rolePage */ RolePage, Unit]): Unit = js.native
  def getRoles(params: GetRolesData, cb: js.Function2[/* err */ js.Error, /* roles */ js.Array[Role], Unit]): Unit = js.native
  
  def getRule(params: ClientParams): js.Promise[Rule] = js.native
  def getRule(params: ClientParams, cb: js.Function2[/* err */ js.Error, /* rule */ Rule, Unit]): Unit = js.native
  
  def getRules(): js.Promise[js.Array[Rule]] = js.native
  def getRules(cb: js.Function2[/* err */ js.Error, /* rules */ js.Array[Rule], Unit]): Unit = js.native
  // Rules
  def getRules(params: PagingOptions): js.Promise[js.Array[Rule]] = js.native
  
  // Rules Configurations
  def getRulesConfigs(): js.Promise[js.Array[RulesConfig]] = js.native
  def getRulesConfigs(cb: js.Function2[/* err */ js.Error, /* rulesConfigs */ js.Array[RulesConfig], Unit]): Unit = js.native
  
  def getTenantSettings(): Unit = js.native
  def getTenantSettings(cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  // Tenant
  @JSName("getTenantSettings")
  def getTenantSettings_Promise(): js.Promise[Any] = js.native
  
  def getUser(params: ObjectWithId): Unit = js.native
  def getUser(params: ObjectWithId, cb: js.Function2[/* err */ js.Error, /* user */ User[A, U], Unit]): Unit = js.native
  
  // User Blocks
  def getUserBlocks(params: ObjectWithId): js.Promise[UserBlocks] = js.native
  def getUserBlocks(params: ObjectWithId, cb: js.Function2[/* err */ js.Error, /* response */ UserBlocks, Unit]): Unit = js.native
  
  def getUserBlocksByIdentifier(params: ObjectWithIdentifier): js.Promise[UserBlocks] = js.native
  def getUserBlocksByIdentifier(
    params: ObjectWithIdentifier,
    cb: js.Function2[/* err */ js.Error, /* response */ UserBlocks, Unit]
  ): Unit = js.native
  
  def getUserPermissions(params: GetUserPermissionsData): js.Promise[js.Array[Permission]] = js.native
  def getUserPermissions(params: GetUserPermissionsDataPaged): js.Promise[PermissionPage] = js.native
  def getUserPermissions(
    params: GetUserPermissionsDataPaged,
    cb: js.Function2[/* err */ js.Error, /* permissionPage */ PermissionPage, Unit]
  ): Unit = js.native
  def getUserPermissions(
    params: GetUserPermissionsData,
    cb: js.Function2[/* err */ js.Error, /* permissions */ js.Array[Permission], Unit]
  ): Unit = js.native
  // User permissions
  def getUserPermissions(params: ObjectWithId): js.Promise[js.Array[Permission]] = js.native
  def getUserPermissions(
    params: ObjectWithId,
    cb: js.Function2[/* err */ js.Error, /* permissions */ js.Array[Permission], Unit]
  ): Unit = js.native
  
  def getUserRoles(params: GetUserRolesData): js.Promise[js.Array[Role]] = js.native
  def getUserRoles(params: GetUserRolesDataPaged): js.Promise[RolePage] = js.native
  def getUserRoles(params: GetUserRolesDataPaged, cb: js.Function2[/* err */ js.Error, /* rolePage */ RolePage, Unit]): Unit = js.native
  def getUserRoles(params: GetUserRolesData, cb: js.Function2[/* err */ js.Error, /* roles */ js.Array[Role], Unit]): Unit = js.native
  // User roles
  def getUserRoles(params: ObjectWithId): js.Promise[js.Array[Role]] = js.native
  def getUserRoles(params: ObjectWithId, cb: js.Function2[/* err */ js.Error, /* roles */ js.Array[Role], Unit]): Unit = js.native
  
  @JSName("getUser")
  def getUser_Promise(params: ObjectWithId): js.Promise[User[A, U]] = js.native
  
  def getUsers(): Unit = js.native
  def getUsers(cb: js.Function2[/* err */ js.Error, /* users */ js.Array[User[A, U]], Unit]): Unit = js.native
  def getUsers(params: Unit, cb: js.Function2[/* err */ js.Error, /* users */ js.Array[User[A, U]], Unit]): Unit = js.native
  def getUsers(params: GetUsersData): Unit = js.native
  // Users
  def getUsers(params: GetUsersDataPaged): js.Promise[UserPage[A, U]] = js.native
  def getUsers(
    params: GetUsersDataPaged,
    cb: js.Function2[/* err */ js.Error, /* userPage */ UserPage[A, U], Unit]
  ): Unit = js.native
  def getUsers(params: GetUsersData, cb: js.Function2[/* err */ js.Error, /* users */ js.Array[User[A, U]], Unit]): Unit = js.native
  
  def getUsersByEmail(email: String): Unit = js.native
  def getUsersByEmail(email: String, cb: js.Function2[/* err */ js.Error, /* users */ js.Array[User[A, U]], Unit]): Unit = js.native
  @JSName("getUsersByEmail")
  def getUsersByEmail_Promise(email: String): js.Promise[js.Array[User[A, U]]] = js.native
  
  def getUsersInRole(params: GetRoleUsersData): js.Promise[js.Array[User[A, U]]] = js.native
  def getUsersInRole(params: GetRoleUsersDataPaged): js.Promise[UserPage[A, U]] = js.native
  def getUsersInRole(
    params: GetRoleUsersDataPaged,
    cb: js.Function2[/* err */ js.Error, /* userPage */ UserPage[A, U], Unit]
  ): Unit = js.native
  def getUsersInRole(
    params: GetRoleUsersData,
    cb: js.Function2[/* err */ js.Error, /* users */ js.Array[User[A, U]], Unit]
  ): Unit = js.native
  def getUsersInRole(params: ObjectWithId): js.Promise[js.Array[User[A, U]]] = js.native
  def getUsersInRole(params: ObjectWithId, cb: js.Function2[/* err */ js.Error, /* users */ js.Array[User[A, U]], Unit]): Unit = js.native
  
  @JSName("getUsers")
  def getUsers_Promise(): js.Promise[js.Array[User[A, U]]] = js.native
  @JSName("getUsers")
  def getUsers_Promise(params: GetUsersData): js.Promise[js.Array[User[A, U]]] = js.native
  
  def importUsers(data: ImportUsersOptions): Unit = js.native
  def importUsers(data: ImportUsersOptions, cb: js.Function2[/* err */ js.Error, /* data */ ImportUsersJob, Unit]): Unit = js.native
  
  def importUsersJob(data: ImportUsersOptions): Unit = js.native
  def importUsersJob(data: ImportUsersOptions, cb: js.Function2[/* err */ js.Error, /* data */ ImportUsersJob, Unit]): Unit = js.native
  @JSName("importUsersJob")
  def importUsersJob_Promise(data: ImportUsersOptions): js.Promise[ImportUsersJob] = js.native
  
  /**
    * @deprecated use @see importUsersJob instead
    */
  @JSName("importUsers")
  def importUsers_Promise(data: ImportUsersOptions): js.Promise[ImportUsersJob] = js.native
  
  def invalidateRememberBrowser(params: ObjectWithId): Unit = js.native
  def invalidateRememberBrowser(params: ObjectWithId, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  // MFA invalidate remember browser
  @JSName("invalidateRememberBrowser")
  def invalidateRememberBrowser_Promise(params: ObjectWithId): js.Promise[Unit] = js.native
  
  def linkUsers(userId: String, params: LinkAccountsParams): js.Promise[Any] = js.native
  def linkUsers(
    userId: String,
    params: LinkAccountsParams,
    cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]
  ): Unit = js.native
  
  var organizations: OrganizationsManager = js.native
  
  def removePermissionsFromRole(params: ObjectWithId, data: PermissionsData): js.Promise[Unit] = js.native
  def removePermissionsFromRole(params: ObjectWithId, data: PermissionsData, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def removePermissionsFromUser(params: ObjectWithId, data: PermissionsData): js.Promise[Unit] = js.native
  def removePermissionsFromUser(params: ObjectWithId, data: PermissionsData, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def removeRolesFromUser(params: ObjectWithId, data: RolesData): js.Promise[Unit] = js.native
  def removeRolesFromUser(params: ObjectWithId, data: RolesData, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def sendEmailVerification(data: VerifyEmail): Unit = js.native
  def sendEmailVerification(data: VerifyEmail, cb: js.Function2[/* err */ js.Error, /* data */ VerificationEmailJob, Unit]): Unit = js.native
  @JSName("sendEmailVerification")
  def sendEmailVerification_Promise(data: VerifyEmail): js.Promise[VerificationEmailJob] = js.native
  
  def setRulesConfig(params: RulesConfig, data: RulesConfigData): js.Promise[RulesConfig & RulesConfigData] = js.native
  def setRulesConfig(
    params: RulesConfig,
    data: RulesConfigData,
    cb: js.Function2[/* err */ js.Error, /* rulesConfig */ RulesConfig & RulesConfigData, Unit]
  ): Unit = js.native
  
  def unblockUser(params: ObjectWithId): js.Promise[String] = js.native
  def unblockUser(params: ObjectWithId, cb: js.Function2[/* err */ js.Error, /* response */ String, Unit]): Unit = js.native
  
  def unblockUserByIdentifier(params: ObjectWithIdentifier): js.Promise[String] = js.native
  def unblockUserByIdentifier(params: ObjectWithIdentifier, cb: js.Function2[/* err */ js.Error, /* response */ String, Unit]): Unit = js.native
  
  def unlinkUsers(params: UnlinkAccountsParams): js.Promise[UnlinkAccountsResponse] = js.native
  def unlinkUsers(
    params: UnlinkAccountsParams,
    cb: js.Function2[/* err */ js.Error, /* data */ UnlinkAccountsResponse, Unit]
  ): Unit = js.native
  
  def updateAppMetadata(params: ObjectWithId, data: A): js.Promise[User[A, U]] = js.native
  def updateAppMetadata(params: ObjectWithId, data: A, cb: js.Function2[/* err */ js.Error, /* data */ User[A, U], Unit]): Unit = js.native
  
  def updateClient(params: ClientParams, data: Data): js.Promise[Client] = js.native
  def updateClient(params: ClientParams, data: Data, cb: js.Function2[/* err */ js.Error, /* client */ Client, Unit]): Unit = js.native
  
  def updateClientGrant(params: ObjectWithId, data: UpdateClientGrant): js.Promise[ClientGrant] = js.native
  def updateClientGrant(
    params: ObjectWithId,
    data: UpdateClientGrant,
    cb: js.Function2[/* err */ js.Error, /* data */ ClientGrant, Unit]
  ): Unit = js.native
  
  def updateConnection(params: ObjectWithId, data: UpdateConnection): js.Promise[Connection] = js.native
  def updateConnection(
    params: ObjectWithId,
    data: UpdateConnection,
    cb: js.Function2[/* err */ js.Error, /* connection */ Connection, Unit]
  ): Unit = js.native
  
  def updateEmailProvider(params: js.Object, data: Data): Unit = js.native
  def updateEmailProvider(params: js.Object, data: Data, cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  @JSName("updateEmailProvider")
  def updateEmailProvider_Promise(params: js.Object, data: Data): js.Promise[Any] = js.native
  
  def updateEmailTemplate(params: js.Object, data: Data): Unit = js.native
  def updateEmailTemplate(params: js.Object, data: Data, cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  @JSName("updateEmailTemplate")
  def updateEmailTemplate_Promise(params: js.Object, data: Data): js.Promise[Any] = js.native
  
  def updateResourceServer(params: ObjectWithId, data: ResourceServer): Unit = js.native
  def updateResourceServer(
    params: ObjectWithId,
    data: ResourceServer,
    cb: js.Function2[/* err */ js.Error, /* data */ ResourceServer, Unit]
  ): Unit = js.native
  @JSName("updateResourceServer")
  def updateResourceServer_Promise(params: ObjectWithId, data: ResourceServer): js.Promise[ResourceServer] = js.native
  
  def updateRole(params: ObjectWithId, data: UpdateRoleData): js.Promise[Role] = js.native
  def updateRole(
    params: ObjectWithId,
    data: UpdateRoleData,
    cb: js.Function2[/* err */ js.Error, /* role */ Role, Unit]
  ): Unit = js.native
  
  def updateRule(params: ObjectWithId, data: Data): js.Promise[Rule] = js.native
  def updateRule(params: ObjectWithId, data: Data, cb: js.Function2[/* err */ js.Error, /* rule */ Rule, Unit]): Unit = js.native
  
  def updateTenantSettings(data: Data): Unit = js.native
  def updateTenantSettings(data: Data, cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  @JSName("updateTenantSettings")
  def updateTenantSettings_Promise(data: Data): js.Promise[Any] = js.native
  
  def updateUser(params: ObjectWithId, data: UpdateUserData): js.Promise[User[A, U]] = js.native
  def updateUser(
    params: ObjectWithId,
    data: UpdateUserData,
    cb: js.Function2[/* err */ js.Error, /* data */ User[A, U], Unit]
  ): Unit = js.native
  
  def updateUserMetadata(params: ObjectWithId, data: U): js.Promise[User[A, U]] = js.native
  def updateUserMetadata(params: ObjectWithId, data: U, cb: js.Function2[/* err */ js.Error, /* data */ User[A, U], Unit]): Unit = js.native
  
  var users: UsersManager[AppMetadata, UserMetadata] = js.native
  
  def verifyCustomDomain(params: ObjectWithId): js.Promise[DomainVerification] = js.native
  def verifyCustomDomain(params: ObjectWithId, cb: js.Function2[/* err */ js.Error, /* data */ DomainVerification, Unit]): Unit = js.native
}
