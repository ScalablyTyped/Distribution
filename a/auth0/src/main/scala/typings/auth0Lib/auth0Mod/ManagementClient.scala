package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0", "ManagementClient")
@js.native
class ManagementClient protected () extends js.Object {
  def this(options: ManagementClientOptions) = this()
  def blacklistToken(token: Token): js.Promise[_] = js.native
  def blacklistToken(token: Token, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def configureEmailProvider(data: Data): js.Promise[_] = js.native
  def configureEmailProvider(data: Data, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def createClient(data: Data): js.Promise[Client] = js.native
  def createClient(data: Data, cb: js.Function2[/* err */ stdLib.Error, /* client */ Client, scala.Unit]): scala.Unit = js.native
  def createClientGrant(data: CreateClientGrant): js.Promise[ClientGrant] = js.native
  def createClientGrant(
    data: CreateClientGrant,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ClientGrant, scala.Unit]
  ): scala.Unit = js.native
  def createConnection(data: CreateConnection): js.Promise[Connection] = js.native
  def createConnection(
    data: CreateConnection,
    cb: js.Function2[/* err */ stdLib.Error, /* connection */ Connection, scala.Unit]
  ): scala.Unit = js.native
  def createDevicePublicKey(data: Data): js.Promise[User] = js.native
  def createDevicePublicKey(data: Data, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def createEmailVerificationTicket(data: EmailVerificationTicketOptions): js.Promise[_] = js.native
  def createEmailVerificationTicket(
    data: EmailVerificationTicketOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("createEmailVerificationTicket")
  def createEmailVerificationTicket_Unit(data: EmailVerificationTicketOptions): scala.Unit = js.native
  // Tickets
  def createPasswordChangeTicket(params: PasswordChangeTicketParams): js.Promise[PasswordChangeTicketResponse] = js.native
  def createPasswordChangeTicket(
    params: PasswordChangeTicketParams,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ PasswordChangeTicketResponse, scala.Unit]
  ): scala.Unit = js.native
  @JSName("createPasswordChangeTicket")
  def createPasswordChangeTicket_Unit(params: PasswordChangeTicketParams): scala.Unit = js.native
  // Resource Server
  def createResourceServer(data: CreateResourceServer): js.Promise[ResourceServer] = js.native
  def createResourceServer(
    data: CreateResourceServer,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ResourceServer, scala.Unit]
  ): scala.Unit = js.native
  @JSName("createResourceServer")
  def createResourceServer_Unit(data: CreateResourceServer): scala.Unit = js.native
  def createRule(data: Data): js.Promise[Rule] = js.native
  def createRule(data: Data, cb: js.Function2[/* err */ stdLib.Error, /* rule */ Rule, scala.Unit]): scala.Unit = js.native
  def createUser(data: CreateUserData): js.Promise[User] = js.native
  def createUser(data: CreateUserData, cb: js.Function2[/* err */ stdLib.Error, /* user */ User, scala.Unit]): scala.Unit = js.native
  // Should be removed from auth0 also. Doesn't exist in api.
  def deleteAllUsers(): js.Promise[User] = js.native
  def deleteAllUsers(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def deleteClient(params: ClientParams): js.Promise[scala.Unit] = js.native
  def deleteClient(params: ClientParams, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def deleteClientGrant(params: ObjectWithId): js.Promise[scala.Unit] = js.native
  def deleteClientGrant(params: ObjectWithId, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def deleteConnection(params: ObjectWithId): js.Promise[scala.Unit] = js.native
  def deleteConnection(params: ObjectWithId, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def deleteDeviceCredential(params: ClientParams): js.Promise[User] = js.native
  def deleteDeviceCredential(params: ClientParams, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def deleteEmailProvider(): js.Promise[_] = js.native
  def deleteEmailProvider(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("deleteEmailProvider")
  def deleteEmailProvider_Unit(): scala.Unit = js.native
  def deleteResourceServer(params: ObjectWithId): js.Promise[scala.Unit] = js.native
  def deleteResourceServer(params: ObjectWithId, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  @JSName("deleteResourceServer")
  def deleteResourceServer_Unit(params: ObjectWithId): scala.Unit = js.native
  def deleteRule(params: ObjectWithId): js.Promise[scala.Unit] = js.native
  def deleteRule(params: ObjectWithId, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def deleteUser(params: ObjectWithId): js.Promise[scala.Unit] = js.native
  def deleteUser(params: ObjectWithId, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def deleteUserMultifactor(params: DeleteMultifactorParams): js.Promise[scala.Unit] = js.native
  def deleteUserMultifactor(params: DeleteMultifactorParams, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  @JSName("deleteUser")
  def deleteUser_Unit(params: ObjectWithId): scala.Unit = js.native
  def exportUsers(data: ExportUsersOptions): js.Promise[ExportUsersJob] = js.native
  def exportUsers(
    data: ExportUsersOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ExportUsersJob, scala.Unit]
  ): scala.Unit = js.native
  @JSName("exportUsers")
  def exportUsers_Unit(data: ExportUsersOptions): scala.Unit = js.native
  // Statistics
  def getActiveUsersCount(): js.Promise[_] = js.native
  def getActiveUsersCount(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("getActiveUsersCount")
  def getActiveUsersCount_Unit(): scala.Unit = js.native
  // Tokens
  def getBlacklistedTokens(): js.Promise[_] = js.native
  def getBlacklistedTokens(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("getBlacklistedTokens")
  def getBlacklistedTokens_Unit(): scala.Unit = js.native
  def getClient(params: ClientParams): js.Promise[Client] = js.native
  def getClient(params: ClientParams, cb: js.Function2[/* err */ stdLib.Error, /* client */ Client, scala.Unit]): scala.Unit = js.native
  // Client Grants
  def getClientGrants(): js.Promise[js.Array[ClientGrant]] = js.native
  def getClientGrants(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Array[ClientGrant], scala.Unit]): scala.Unit = js.native
  def getClientInfo(): ClientInfo = js.native
  // Clients
  def getClients(): js.Promise[js.Array[Client]] = js.native
  def getClients(cb: js.Function2[/* err */ stdLib.Error, /* clients */ js.Array[Client], scala.Unit]): scala.Unit = js.native
  def getClients(params: GetClientsOptions): js.Promise[js.Array[Client]] = js.native
  def getClients(
    params: GetClientsOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* clients */ js.Array[Client], scala.Unit]
  ): scala.Unit = js.native
  def getConnection(params: ObjectWithId): js.Promise[Connection] = js.native
  def getConnection(
    params: ObjectWithId,
    cb: js.Function2[/* err */ stdLib.Error, /* connection */ Connection, scala.Unit]
  ): scala.Unit = js.native
  // Connections
  def getConnections(): js.Promise[js.Array[Connection]] = js.native
  def getConnections(cb: js.Function2[/* err */ stdLib.Error, /* connections */ js.Array[Connection], scala.Unit]): scala.Unit = js.native
  def getDailyStats(data: StatsParams): js.Promise[_] = js.native
  def getDailyStats(data: StatsParams, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  // Device Keys
  def getDeviceCredentials(): js.Promise[User] = js.native
  def getDeviceCredentials(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  // Providers
  def getEmailProvider(): js.Promise[_] = js.native
  def getEmailProvider(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("getEmailProvider")
  def getEmailProvider_Unit(): scala.Unit = js.native
  // Jobs
  def getJob(params: ObjectWithId): js.Promise[Job] = js.native
  def getJob(params: ObjectWithId, cb: js.Function2[/* err */ stdLib.Error, /* data */ Job, scala.Unit]): scala.Unit = js.native
  @JSName("getJob")
  def getJob_Unit(params: ObjectWithId): scala.Unit = js.native
  // Logs
  def getLog(params: ObjectWithId): js.Promise[_] = js.native
  def getLog(params: ObjectWithId, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("getLog")
  def getLog_Unit(params: ObjectWithId): scala.Unit = js.native
  def getLogs(): js.Promise[_] = js.native
  def getLogs(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("getLogs")
  def getLogs_Unit(): scala.Unit = js.native
  def getResourceServer(data: ObjectWithId): js.Promise[ResourceServer] = js.native
  def getResourceServer(
    data: ObjectWithId,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ResourceServer, scala.Unit]
  ): scala.Unit = js.native
  @JSName("getResourceServer")
  def getResourceServer_Unit(data: ObjectWithId): scala.Unit = js.native
  def getResourceServers(): js.Promise[js.Array[ResourceServer]] = js.native
  def getResourceServers(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Array[ResourceServer], scala.Unit]): scala.Unit = js.native
  @JSName("getResourceServers")
  def getResourceServers_Unit(): scala.Unit = js.native
  def getRule(params: ClientParams): js.Promise[Rule] = js.native
  def getRule(params: ClientParams, cb: js.Function2[/* err */ stdLib.Error, /* rule */ Rule, scala.Unit]): scala.Unit = js.native
  // Rules
  def getRules(): js.Promise[js.Array[Rule]] = js.native
  def getRules(cb: js.Function2[/* err */ stdLib.Error, /* rules */ js.Array[Rule], scala.Unit]): scala.Unit = js.native
  // Tenant
  def getTenantSettings(): js.Promise[_] = js.native
  def getTenantSettings(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("getTenantSettings")
  def getTenantSettings_Unit(): scala.Unit = js.native
  def getUser(params: ObjectWithId): js.Promise[User] = js.native
  def getUser(params: ObjectWithId, cb: js.Function2[/* err */ stdLib.Error, /* user */ User, scala.Unit]): scala.Unit = js.native
  @JSName("getUser")
  def getUser_Unit(params: ObjectWithId): scala.Unit = js.native
  def getUsers(): js.Promise[js.Array[User]] = js.native
  def getUsers(cb: js.Function2[/* err */ stdLib.Error, /* users */ js.Array[User], scala.Unit]): scala.Unit = js.native
  def getUsers(params: GetUsersData): js.Promise[js.Array[User]] = js.native
  // Users
  def getUsers(params: GetUsersDataPaged): js.Promise[UserPage] = js.native
  def getUsers(
    params: GetUsersDataPaged,
    cb: js.Function2[/* err */ stdLib.Error, /* userPage */ UserPage, scala.Unit]
  ): scala.Unit = js.native
  def getUsers(
    params: GetUsersData,
    cb: js.Function2[/* err */ stdLib.Error, /* users */ js.Array[User], scala.Unit]
  ): scala.Unit = js.native
  def getUsersByEmail(email: java.lang.String): js.Promise[js.Array[User]] = js.native
  def getUsersByEmail(
    email: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* users */ js.Array[User], scala.Unit]
  ): scala.Unit = js.native
  @JSName("getUsersByEmail")
  def getUsersByEmail_Unit(email: java.lang.String): scala.Unit = js.native
  @JSName("getUsers")
  def getUsers_Unit(): scala.Unit = js.native
  @JSName("getUsers")
  def getUsers_Unit(params: GetUsersData): scala.Unit = js.native
  def importUsers(data: ImportUsersOptions): js.Promise[ImportUsersJob] = js.native
  def importUsers(
    data: ImportUsersOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ImportUsersJob, scala.Unit]
  ): scala.Unit = js.native
  @JSName("importUsers")
  def importUsers_Unit(data: ImportUsersOptions): scala.Unit = js.native
  def linkUsers(userId: java.lang.String, params: LinkAccountsParams): js.Promise[_] = js.native
  def linkUsers(
    userId: java.lang.String,
    params: LinkAccountsParams,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendEmailVerification(data: UserIdParams): js.Promise[VerificationEmailJob] = js.native
  def sendEmailVerification(
    data: UserIdParams,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ VerificationEmailJob, scala.Unit]
  ): scala.Unit = js.native
  @JSName("sendEmailVerification")
  def sendEmailVerification_Unit(data: UserIdParams): scala.Unit = js.native
  def unlinkUsers(params: UnlinkAccountsParams): js.Promise[UnlinkAccountsResponse] = js.native
  def unlinkUsers(
    params: UnlinkAccountsParams,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ UnlinkAccountsResponse, scala.Unit]
  ): scala.Unit = js.native
  def updateAppMetadata(params: ObjectWithId, data: AppMetadata): js.Promise[User] = js.native
  def updateAppMetadata(
    params: ObjectWithId,
    data: AppMetadata,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ User, scala.Unit]
  ): scala.Unit = js.native
  def updateClient(params: ClientParams, data: Data): js.Promise[Client] = js.native
  def updateClient(
    params: ClientParams,
    data: Data,
    cb: js.Function2[/* err */ stdLib.Error, /* client */ Client, scala.Unit]
  ): scala.Unit = js.native
  def updateClientGrant(params: ObjectWithId, data: UpdateClientGrant): js.Promise[ClientGrant] = js.native
  def updateClientGrant(
    params: ObjectWithId,
    data: UpdateClientGrant,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ClientGrant, scala.Unit]
  ): scala.Unit = js.native
  def updateConnection(params: ObjectWithId, data: UpdateConnection): js.Promise[Connection] = js.native
  def updateConnection(
    params: ObjectWithId,
    data: UpdateConnection,
    cb: js.Function2[/* err */ stdLib.Error, /* connection */ Connection, scala.Unit]
  ): scala.Unit = js.native
  def updateEmailProvider(params: js.Object, data: Data): js.Promise[_] = js.native
  def updateEmailProvider(
    params: js.Object,
    data: Data,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("updateEmailProvider")
  def updateEmailProvider_Unit(params: js.Object, data: Data): scala.Unit = js.native
  def updateResourceServer(params: ObjectWithId, data: ResourceServer): js.Promise[ResourceServer] = js.native
  def updateResourceServer(
    params: ObjectWithId,
    data: ResourceServer,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ResourceServer, scala.Unit]
  ): scala.Unit = js.native
  @JSName("updateResourceServer")
  def updateResourceServer_Unit(params: ObjectWithId, data: ResourceServer): scala.Unit = js.native
  def updateRule(params: ObjectWithId, data: Data): js.Promise[Rule] = js.native
  def updateRule(
    params: ObjectWithId,
    data: Data,
    cb: js.Function2[/* err */ stdLib.Error, /* rule */ Rule, scala.Unit]
  ): scala.Unit = js.native
  def updateTenantSettings(data: Data): js.Promise[_] = js.native
  def updateTenantSettings(data: Data, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("updateTenantSettings")
  def updateTenantSettings_Unit(data: Data): scala.Unit = js.native
  def updateUser(params: ObjectWithId, data: UpdateUserData): js.Promise[User] = js.native
  def updateUser(
    params: ObjectWithId,
    data: UpdateUserData,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ User, scala.Unit]
  ): scala.Unit = js.native
  def updateUserMetadata(params: ObjectWithId, data: UserMetadata): js.Promise[User] = js.native
  def updateUserMetadata(
    params: ObjectWithId,
    data: UserMetadata,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ User, scala.Unit]
  ): scala.Unit = js.native
}

