package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0", "ManagementClient")
@js.native
class ManagementClient protected () extends js.Object {
  def this(options: ManagementClientOptions) = this()
  def blacklistToken(token: Token): stdLib.Promise[_] = js.native
  def blacklistToken(token: Token, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def configureEmailProvider(data: Data): stdLib.Promise[_] = js.native
  def configureEmailProvider(data: Data, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def createClient(data: Data): stdLib.Promise[Client] = js.native
  def createClient(data: Data, cb: js.Function2[/* err */ stdLib.Error, /* client */ Client, scala.Unit]): scala.Unit = js.native
  def createClientGrant(data: CreateClientGrant): stdLib.Promise[ClientGrant] = js.native
  def createClientGrant(
    data: CreateClientGrant,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ClientGrant, scala.Unit]
  ): scala.Unit = js.native
  def createConnection(data: CreateConnection): stdLib.Promise[Connection] = js.native
  def createConnection(
    data: CreateConnection,
    cb: js.Function2[/* err */ stdLib.Error, /* connection */ Connection, scala.Unit]
  ): scala.Unit = js.native
  def createDevicePublicKey(data: Data): stdLib.Promise[User] = js.native
  def createDevicePublicKey(data: Data, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def createEmailVerificationTicket(data: EmailVerificationTicketOptions): scala.Unit = js.native
  def createEmailVerificationTicket(
    data: EmailVerificationTicketOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("createEmailVerificationTicket")
  def createEmailVerificationTicket_Promise(data: EmailVerificationTicketOptions): stdLib.Promise[_] = js.native
  def createPasswordChangeTicket(params: PasswordChangeTicketParams): scala.Unit = js.native
  def createPasswordChangeTicket(
    params: PasswordChangeTicketParams,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ PasswordChangeTicketResponse, scala.Unit]
  ): scala.Unit = js.native
  // Tickets
  @JSName("createPasswordChangeTicket")
  def createPasswordChangeTicket_Promise(params: PasswordChangeTicketParams): stdLib.Promise[PasswordChangeTicketResponse] = js.native
  def createResourceServer(data: CreateResourceServer): scala.Unit = js.native
  def createResourceServer(
    data: CreateResourceServer,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ResourceServer, scala.Unit]
  ): scala.Unit = js.native
  // Resource Server
  @JSName("createResourceServer")
  def createResourceServer_Promise(data: CreateResourceServer): stdLib.Promise[ResourceServer] = js.native
  def createRule(data: Data): stdLib.Promise[Rule] = js.native
  def createRule(data: Data, cb: js.Function2[/* err */ stdLib.Error, /* rule */ Rule, scala.Unit]): scala.Unit = js.native
  def createUser(data: CreateUserData): stdLib.Promise[User] = js.native
  def createUser(data: CreateUserData, cb: js.Function2[/* err */ stdLib.Error, /* user */ User, scala.Unit]): scala.Unit = js.native
  // Should be removed from auth0 also. Doesn't exist in api.
  def deleteAllUsers(): stdLib.Promise[User] = js.native
  def deleteAllUsers(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def deleteClient(params: ClientParams): stdLib.Promise[scala.Unit] = js.native
  def deleteClient(params: ClientParams, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def deleteClientGrant(params: ObjectWithId): stdLib.Promise[scala.Unit] = js.native
  def deleteClientGrant(params: ObjectWithId, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def deleteConnection(params: ObjectWithId): stdLib.Promise[scala.Unit] = js.native
  def deleteConnection(params: ObjectWithId, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def deleteDeviceCredential(params: ClientParams): stdLib.Promise[User] = js.native
  def deleteDeviceCredential(params: ClientParams, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def deleteEmailProvider(): scala.Unit = js.native
  def deleteEmailProvider(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("deleteEmailProvider")
  def deleteEmailProvider_Promise(): stdLib.Promise[_] = js.native
  def deleteResourceServer(params: ObjectWithId): scala.Unit = js.native
  def deleteResourceServer(params: ObjectWithId, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  @JSName("deleteResourceServer")
  def deleteResourceServer_Promise(params: ObjectWithId): stdLib.Promise[scala.Unit] = js.native
  def deleteRule(params: ObjectWithId): stdLib.Promise[scala.Unit] = js.native
  def deleteRule(params: ObjectWithId, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def deleteUser(params: ObjectWithId): scala.Unit = js.native
  def deleteUser(params: ObjectWithId, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def deleteUserMultifactor(params: DeleteMultifactorParams): stdLib.Promise[scala.Unit] = js.native
  def deleteUserMultifactor(params: DeleteMultifactorParams, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  @JSName("deleteUser")
  def deleteUser_Promise(params: ObjectWithId): stdLib.Promise[scala.Unit] = js.native
  def getActiveUsersCount(): scala.Unit = js.native
  def getActiveUsersCount(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  // Statistics
  @JSName("getActiveUsersCount")
  def getActiveUsersCount_Promise(): stdLib.Promise[_] = js.native
  def getBlacklistedTokens(): scala.Unit = js.native
  def getBlacklistedTokens(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  // Tokens
  @JSName("getBlacklistedTokens")
  def getBlacklistedTokens_Promise(): stdLib.Promise[_] = js.native
  def getClient(params: ClientParams): stdLib.Promise[Client] = js.native
  def getClient(params: ClientParams, cb: js.Function2[/* err */ stdLib.Error, /* client */ Client, scala.Unit]): scala.Unit = js.native
  // Client Grants
  def getClientGrants(): stdLib.Promise[js.Array[ClientGrant]] = js.native
  def getClientGrants(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Array[ClientGrant], scala.Unit]): scala.Unit = js.native
  def getClientInfo(): ClientInfo = js.native
  // Clients
  def getClients(): stdLib.Promise[js.Array[Client]] = js.native
  def getClients(cb: js.Function2[/* err */ stdLib.Error, /* clients */ js.Array[Client], scala.Unit]): scala.Unit = js.native
  // Clients
  def getClients(params: GetClientsOptions): stdLib.Promise[js.Array[Client]] = js.native
  def getClients(
    params: GetClientsOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* clients */ js.Array[Client], scala.Unit]
  ): scala.Unit = js.native
  def getConnection(params: ObjectWithId): stdLib.Promise[Connection] = js.native
  def getConnection(
    params: ObjectWithId,
    cb: js.Function2[/* err */ stdLib.Error, /* connection */ Connection, scala.Unit]
  ): scala.Unit = js.native
  // Connections
  def getConnections(): stdLib.Promise[js.Array[Connection]] = js.native
  def getConnections(cb: js.Function2[/* err */ stdLib.Error, /* connections */ js.Array[Connection], scala.Unit]): scala.Unit = js.native
  def getDailyStats(data: StatsParams): stdLib.Promise[_] = js.native
  def getDailyStats(data: StatsParams, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  // Device Keys
  def getDeviceCredentials(): stdLib.Promise[User] = js.native
  def getDeviceCredentials(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def getEmailProvider(): scala.Unit = js.native
  def getEmailProvider(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  // Providers
  @JSName("getEmailProvider")
  def getEmailProvider_Promise(): stdLib.Promise[_] = js.native
  def getJob(params: ObjectWithId): scala.Unit = js.native
  def getJob(params: ObjectWithId, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  // Jobs
  @JSName("getJob")
  def getJob_Promise(params: ObjectWithId): stdLib.Promise[_] = js.native
  def getLog(params: ObjectWithId): scala.Unit = js.native
  def getLog(params: ObjectWithId, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  // Logs
  @JSName("getLog")
  def getLog_Promise(params: ObjectWithId): stdLib.Promise[_] = js.native
  def getLogs(): scala.Unit = js.native
  def getLogs(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("getLogs")
  def getLogs_Promise(): stdLib.Promise[_] = js.native
  def getResourceServer(data: ObjectWithId): scala.Unit = js.native
  def getResourceServer(
    data: ObjectWithId,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ResourceServer, scala.Unit]
  ): scala.Unit = js.native
  @JSName("getResourceServer")
  def getResourceServer_Promise(data: ObjectWithId): stdLib.Promise[ResourceServer] = js.native
  def getResourceServers(): scala.Unit = js.native
  def getResourceServers(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Array[ResourceServer], scala.Unit]): scala.Unit = js.native
  @JSName("getResourceServers")
  def getResourceServers_Promise(): stdLib.Promise[js.Array[ResourceServer]] = js.native
  def getRule(params: ClientParams): stdLib.Promise[Rule] = js.native
  def getRule(params: ClientParams, cb: js.Function2[/* err */ stdLib.Error, /* rule */ Rule, scala.Unit]): scala.Unit = js.native
  // Rules
  def getRules(): stdLib.Promise[js.Array[Rule]] = js.native
  def getRules(cb: js.Function2[/* err */ stdLib.Error, /* rules */ js.Array[Rule], scala.Unit]): scala.Unit = js.native
  def getTenantSettings(): scala.Unit = js.native
  def getTenantSettings(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  // Tenant
  @JSName("getTenantSettings")
  def getTenantSettings_Promise(): stdLib.Promise[_] = js.native
  def getUser(params: ObjectWithId): scala.Unit = js.native
  def getUser(params: ObjectWithId, cb: js.Function2[/* err */ stdLib.Error, /* user */ User, scala.Unit]): scala.Unit = js.native
  @JSName("getUser")
  def getUser_Promise(params: ObjectWithId): stdLib.Promise[User] = js.native
  def getUsers(): scala.Unit = js.native
  def getUsers(cb: js.Function2[/* err */ stdLib.Error, /* users */ js.Array[User], scala.Unit]): scala.Unit = js.native
  def getUsers(params: GetUsersData): scala.Unit = js.native
  // Users
  def getUsers(params: GetUsersDataPaged): stdLib.Promise[UserPage] = js.native
  def getUsers(
    params: GetUsersDataPaged,
    cb: js.Function2[/* err */ stdLib.Error, /* userPage */ UserPage, scala.Unit]
  ): scala.Unit = js.native
  def getUsers(
    params: GetUsersData,
    cb: js.Function2[/* err */ stdLib.Error, /* users */ js.Array[User], scala.Unit]
  ): scala.Unit = js.native
  def getUsersByEmail(email: java.lang.String): scala.Unit = js.native
  def getUsersByEmail(
    email: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* users */ js.Array[User], scala.Unit]
  ): scala.Unit = js.native
  @JSName("getUsersByEmail")
  def getUsersByEmail_Promise(email: java.lang.String): stdLib.Promise[js.Array[User]] = js.native
  @JSName("getUsers")
  def getUsers_Promise(): stdLib.Promise[js.Array[User]] = js.native
  @JSName("getUsers")
  def getUsers_Promise(params: GetUsersData): stdLib.Promise[js.Array[User]] = js.native
  def importUsers(data: ImportUsersOptions): scala.Unit = js.native
  def importUsers(data: ImportUsersOptions, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("importUsers")
  def importUsers_Promise(data: ImportUsersOptions): stdLib.Promise[_] = js.native
  def linkUsers(userId: java.lang.String, params: LinkAccountsParams): stdLib.Promise[_] = js.native
  def linkUsers(
    userId: java.lang.String,
    params: LinkAccountsParams,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendEmailVerification(data: UserIdParams): scala.Unit = js.native
  def sendEmailVerification(data: UserIdParams, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("sendEmailVerification")
  def sendEmailVerification_Promise(data: UserIdParams): stdLib.Promise[_] = js.native
  def unlinkUsers(params: UnlinkAccountsParams): stdLib.Promise[UnlinkAccountsResponse] = js.native
  def unlinkUsers(
    params: UnlinkAccountsParams,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ UnlinkAccountsResponse, scala.Unit]
  ): scala.Unit = js.native
  def updateAppMetadata(params: ObjectWithId, data: AppMetadata): stdLib.Promise[User] = js.native
  def updateAppMetadata(
    params: ObjectWithId,
    data: AppMetadata,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ User, scala.Unit]
  ): scala.Unit = js.native
  def updateClient(params: ClientParams, data: Data): stdLib.Promise[Client] = js.native
  def updateClient(
    params: ClientParams,
    data: Data,
    cb: js.Function2[/* err */ stdLib.Error, /* client */ Client, scala.Unit]
  ): scala.Unit = js.native
  def updateClientGrant(params: ObjectWithId, data: UpdateClientGrant): stdLib.Promise[ClientGrant] = js.native
  def updateClientGrant(
    params: ObjectWithId,
    data: UpdateClientGrant,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ClientGrant, scala.Unit]
  ): scala.Unit = js.native
  def updateConnection(params: ObjectWithId, data: UpdateConnection): stdLib.Promise[Connection] = js.native
  def updateConnection(
    params: ObjectWithId,
    data: UpdateConnection,
    cb: js.Function2[/* err */ stdLib.Error, /* connection */ Connection, scala.Unit]
  ): scala.Unit = js.native
  def updateEmailProvider(params: js.Object, data: Data): scala.Unit = js.native
  def updateEmailProvider(
    params: js.Object,
    data: Data,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("updateEmailProvider")
  def updateEmailProvider_Promise(params: js.Object, data: Data): stdLib.Promise[_] = js.native
  def updateResourceServer(params: ObjectWithId, data: ResourceServer): scala.Unit = js.native
  def updateResourceServer(
    params: ObjectWithId,
    data: ResourceServer,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ResourceServer, scala.Unit]
  ): scala.Unit = js.native
  @JSName("updateResourceServer")
  def updateResourceServer_Promise(params: ObjectWithId, data: ResourceServer): stdLib.Promise[ResourceServer] = js.native
  def updateRule(params: ObjectWithId, data: Data): stdLib.Promise[Rule] = js.native
  def updateRule(
    params: ObjectWithId,
    data: Data,
    cb: js.Function2[/* err */ stdLib.Error, /* rule */ Rule, scala.Unit]
  ): scala.Unit = js.native
  def updateTenantSettings(data: Data): scala.Unit = js.native
  def updateTenantSettings(data: Data, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("updateTenantSettings")
  def updateTenantSettings_Promise(data: Data): stdLib.Promise[_] = js.native
  def updateUser(params: ObjectWithId, data: UpdateUserData): stdLib.Promise[User] = js.native
  def updateUser(
    params: ObjectWithId,
    data: UpdateUserData,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ User, scala.Unit]
  ): scala.Unit = js.native
  def updateUserMetadata(params: ObjectWithId, data: UserMetadata): stdLib.Promise[User] = js.native
  def updateUserMetadata(
    params: ObjectWithId,
    data: UserMetadata,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ User, scala.Unit]
  ): scala.Unit = js.native
}

