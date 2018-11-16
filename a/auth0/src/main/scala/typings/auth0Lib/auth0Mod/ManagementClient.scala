package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0", "ManagementClient")
@js.native
class ManagementClient protected () extends js.Object {
  def this(options: ManagementClientOptions) = this()
  def blacklistToken(token: Token): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def blacklistToken(token: Token, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def configureEmailProvider(data: Data): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def configureEmailProvider(data: Data, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def createClient(data: Data): bluebirdLib.bluebirdMod.namespaced[Client] = js.native
  def createClient(data: Data, cb: js.Function2[/* err */ stdLib.Error, /* client */ Client, scala.Unit]): scala.Unit = js.native
  def createClientGrant(data: CreateClientGrant): bluebirdLib.bluebirdMod.namespaced[ClientGrant] = js.native
  def createClientGrant(
    data: CreateClientGrant,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ClientGrant, scala.Unit]
  ): scala.Unit = js.native
  def createConnection(data: CreateConnection): bluebirdLib.bluebirdMod.namespaced[Connection] = js.native
  def createConnection(
    data: CreateConnection,
    cb: js.Function2[/* err */ stdLib.Error, /* connection */ Connection, scala.Unit]
  ): scala.Unit = js.native
  def createDevicePublicKey(data: Data): bluebirdLib.bluebirdMod.namespaced[User] = js.native
  def createDevicePublicKey(data: Data, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def createEmailVerificationTicket(data: EmailVerificationTicketOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def createEmailVerificationTicket(
    data: EmailVerificationTicketOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("createEmailVerificationTicket")
  def createEmailVerificationTicket_Unit(data: EmailVerificationTicketOptions): scala.Unit = js.native
  // Tickets
  def createPasswordChangeTicket(params: PasswordChangeTicketParams): bluebirdLib.bluebirdMod.namespaced[PasswordChangeTicketResponse] = js.native
  def createPasswordChangeTicket(
    params: PasswordChangeTicketParams,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ PasswordChangeTicketResponse, scala.Unit]
  ): scala.Unit = js.native
  @JSName("createPasswordChangeTicket")
  def createPasswordChangeTicket_Unit(params: PasswordChangeTicketParams): scala.Unit = js.native
  // Resource Server
  def createResourceServer(data: CreateResourceServer): bluebirdLib.bluebirdMod.namespaced[ResourceServer] = js.native
  def createResourceServer(
    data: CreateResourceServer,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ResourceServer, scala.Unit]
  ): scala.Unit = js.native
  @JSName("createResourceServer")
  def createResourceServer_Unit(data: CreateResourceServer): scala.Unit = js.native
  def createRule(data: Data): bluebirdLib.bluebirdMod.namespaced[Rule] = js.native
  def createRule(data: Data, cb: js.Function2[/* err */ stdLib.Error, /* rule */ Rule, scala.Unit]): scala.Unit = js.native
  def createUser(data: CreateUserData): bluebirdLib.bluebirdMod.namespaced[User] = js.native
  def createUser(data: CreateUserData, cb: js.Function2[/* err */ stdLib.Error, /* user */ User, scala.Unit]): scala.Unit = js.native
  // Should be removed from auth0 also. Doesn't exist in api.
  def deleteAllUsers(): bluebirdLib.bluebirdMod.namespaced[User] = js.native
  def deleteAllUsers(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def deleteClient(params: ClientParams): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def deleteClient(params: ClientParams, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def deleteClientGrant(params: ObjectWithId): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def deleteClientGrant(params: ObjectWithId, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def deleteConnection(params: ObjectWithId): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def deleteConnection(params: ObjectWithId, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def deleteDeviceCredential(params: ClientParams): bluebirdLib.bluebirdMod.namespaced[User] = js.native
  def deleteDeviceCredential(params: ClientParams, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def deleteEmailProvider(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def deleteEmailProvider(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("deleteEmailProvider")
  def deleteEmailProvider_Unit(): scala.Unit = js.native
  def deleteResourceServer(params: ObjectWithId): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def deleteResourceServer(params: ObjectWithId, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  @JSName("deleteResourceServer")
  def deleteResourceServer_Unit(params: ObjectWithId): scala.Unit = js.native
  def deleteRule(params: ObjectWithId): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def deleteRule(params: ObjectWithId, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def deleteUser(params: ObjectWithId): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def deleteUser(params: ObjectWithId, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def deleteUserMultifactor(params: DeleteMultifactorParams): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def deleteUserMultifactor(params: DeleteMultifactorParams, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  @JSName("deleteUser")
  def deleteUser_Unit(params: ObjectWithId): scala.Unit = js.native
  // Statistics
  def getActiveUsersCount(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def getActiveUsersCount(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("getActiveUsersCount")
  def getActiveUsersCount_Unit(): scala.Unit = js.native
  // Tokens
  def getBlacklistedTokens(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def getBlacklistedTokens(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("getBlacklistedTokens")
  def getBlacklistedTokens_Unit(): scala.Unit = js.native
  def getClient(params: ClientParams): bluebirdLib.bluebirdMod.namespaced[Client] = js.native
  def getClient(params: ClientParams, cb: js.Function2[/* err */ stdLib.Error, /* client */ Client, scala.Unit]): scala.Unit = js.native
  // Client Grants
  def getClientGrants(): bluebirdLib.bluebirdMod.namespaced[js.Array[ClientGrant]] = js.native
  def getClientGrants(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Array[ClientGrant], scala.Unit]): scala.Unit = js.native
  def getClientInfo(): ClientInfo = js.native
  // Clients
  def getClients(): bluebirdLib.bluebirdMod.namespaced[js.Array[Client]] = js.native
  def getClients(cb: js.Function2[/* err */ stdLib.Error, /* clients */ js.Array[Client], scala.Unit]): scala.Unit = js.native
  // Clients
  def getClients(params: GetClientsOptions): bluebirdLib.bluebirdMod.namespaced[js.Array[Client]] = js.native
  def getClients(
    params: GetClientsOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* clients */ js.Array[Client], scala.Unit]
  ): scala.Unit = js.native
  def getConnection(params: ObjectWithId): bluebirdLib.bluebirdMod.namespaced[Connection] = js.native
  def getConnection(
    params: ObjectWithId,
    cb: js.Function2[/* err */ stdLib.Error, /* connection */ Connection, scala.Unit]
  ): scala.Unit = js.native
  // Connections
  def getConnections(): bluebirdLib.bluebirdMod.namespaced[js.Array[Connection]] = js.native
  def getConnections(cb: js.Function2[/* err */ stdLib.Error, /* connections */ js.Array[Connection], scala.Unit]): scala.Unit = js.native
  def getDailyStats(data: StatsParams): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def getDailyStats(data: StatsParams, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  // Device Keys
  def getDeviceCredentials(): bluebirdLib.bluebirdMod.namespaced[User] = js.native
  def getDeviceCredentials(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  // Providers
  def getEmailProvider(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def getEmailProvider(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("getEmailProvider")
  def getEmailProvider_Unit(): scala.Unit = js.native
  // Jobs
  def getJob(params: ObjectWithId): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def getJob(params: ObjectWithId, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("getJob")
  def getJob_Unit(params: ObjectWithId): scala.Unit = js.native
  // Logs
  def getLog(params: ObjectWithId): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def getLog(params: ObjectWithId, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("getLog")
  def getLog_Unit(params: ObjectWithId): scala.Unit = js.native
  def getLogs(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def getLogs(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("getLogs")
  def getLogs_Unit(): scala.Unit = js.native
  def getResourceServer(data: ObjectWithId): bluebirdLib.bluebirdMod.namespaced[ResourceServer] = js.native
  def getResourceServer(
    data: ObjectWithId,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ResourceServer, scala.Unit]
  ): scala.Unit = js.native
  @JSName("getResourceServer")
  def getResourceServer_Unit(data: ObjectWithId): scala.Unit = js.native
  def getResourceServers(): bluebirdLib.bluebirdMod.namespaced[js.Array[ResourceServer]] = js.native
  def getResourceServers(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Array[ResourceServer], scala.Unit]): scala.Unit = js.native
  @JSName("getResourceServers")
  def getResourceServers_Unit(): scala.Unit = js.native
  def getRule(params: ClientParams): bluebirdLib.bluebirdMod.namespaced[Rule] = js.native
  def getRule(params: ClientParams, cb: js.Function2[/* err */ stdLib.Error, /* rule */ Rule, scala.Unit]): scala.Unit = js.native
  // Rules
  def getRules(): bluebirdLib.bluebirdMod.namespaced[js.Array[Rule]] = js.native
  def getRules(cb: js.Function2[/* err */ stdLib.Error, /* rules */ js.Array[Rule], scala.Unit]): scala.Unit = js.native
  // Tenant
  def getTenantSettings(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def getTenantSettings(cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("getTenantSettings")
  def getTenantSettings_Unit(): scala.Unit = js.native
  def getUser(params: ObjectWithId): bluebirdLib.bluebirdMod.namespaced[User] = js.native
  def getUser(params: ObjectWithId, cb: js.Function2[/* err */ stdLib.Error, /* user */ User, scala.Unit]): scala.Unit = js.native
  @JSName("getUser")
  def getUser_Unit(params: ObjectWithId): scala.Unit = js.native
  def getUsers(): bluebirdLib.bluebirdMod.namespaced[js.Array[User]] = js.native
  def getUsers(cb: js.Function2[/* err */ stdLib.Error, /* users */ js.Array[User], scala.Unit]): scala.Unit = js.native
  def getUsers(params: GetUsersData): bluebirdLib.bluebirdMod.namespaced[js.Array[User]] = js.native
  // Users
  def getUsers(params: GetUsersDataPaged): bluebirdLib.bluebirdMod.namespaced[UserPage] = js.native
  def getUsers(
    params: GetUsersDataPaged,
    cb: js.Function2[/* err */ stdLib.Error, /* userPage */ UserPage, scala.Unit]
  ): scala.Unit = js.native
  def getUsers(
    params: GetUsersData,
    cb: js.Function2[/* err */ stdLib.Error, /* users */ js.Array[User], scala.Unit]
  ): scala.Unit = js.native
  def getUsersByEmail(email: java.lang.String): bluebirdLib.bluebirdMod.namespaced[js.Array[User]] = js.native
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
  def importUsers(data: ImportUsersOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def importUsers(data: ImportUsersOptions, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("importUsers")
  def importUsers_Unit(data: ImportUsersOptions): scala.Unit = js.native
  def linkUsers(userId: java.lang.String, params: LinkAccountsParams): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def linkUsers(
    userId: java.lang.String,
    params: LinkAccountsParams,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendEmailVerification(data: UserIdParams): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def sendEmailVerification(data: UserIdParams, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("sendEmailVerification")
  def sendEmailVerification_Unit(data: UserIdParams): scala.Unit = js.native
  def unlinkUsers(params: UnlinkAccountsParams): bluebirdLib.bluebirdMod.namespaced[UnlinkAccountsResponse] = js.native
  def unlinkUsers(
    params: UnlinkAccountsParams,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ UnlinkAccountsResponse, scala.Unit]
  ): scala.Unit = js.native
  def updateAppMetadata(params: ObjectWithId, data: AppMetadata): bluebirdLib.bluebirdMod.namespaced[User] = js.native
  def updateAppMetadata(
    params: ObjectWithId,
    data: AppMetadata,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ User, scala.Unit]
  ): scala.Unit = js.native
  def updateClient(params: ClientParams, data: Data): bluebirdLib.bluebirdMod.namespaced[Client] = js.native
  def updateClient(
    params: ClientParams,
    data: Data,
    cb: js.Function2[/* err */ stdLib.Error, /* client */ Client, scala.Unit]
  ): scala.Unit = js.native
  def updateClientGrant(params: ObjectWithId, data: UpdateClientGrant): bluebirdLib.bluebirdMod.namespaced[ClientGrant] = js.native
  def updateClientGrant(
    params: ObjectWithId,
    data: UpdateClientGrant,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ClientGrant, scala.Unit]
  ): scala.Unit = js.native
  def updateConnection(params: ObjectWithId, data: UpdateConnection): bluebirdLib.bluebirdMod.namespaced[Connection] = js.native
  def updateConnection(
    params: ObjectWithId,
    data: UpdateConnection,
    cb: js.Function2[/* err */ stdLib.Error, /* connection */ Connection, scala.Unit]
  ): scala.Unit = js.native
  def updateEmailProvider(params: js.Object, data: Data): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def updateEmailProvider(
    params: js.Object,
    data: Data,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("updateEmailProvider")
  def updateEmailProvider_Unit(params: js.Object, data: Data): scala.Unit = js.native
  def updateResourceServer(params: ObjectWithId, data: ResourceServer): bluebirdLib.bluebirdMod.namespaced[ResourceServer] = js.native
  def updateResourceServer(
    params: ObjectWithId,
    data: ResourceServer,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ ResourceServer, scala.Unit]
  ): scala.Unit = js.native
  @JSName("updateResourceServer")
  def updateResourceServer_Unit(params: ObjectWithId, data: ResourceServer): scala.Unit = js.native
  def updateRule(params: ObjectWithId, data: Data): bluebirdLib.bluebirdMod.namespaced[Rule] = js.native
  def updateRule(
    params: ObjectWithId,
    data: Data,
    cb: js.Function2[/* err */ stdLib.Error, /* rule */ Rule, scala.Unit]
  ): scala.Unit = js.native
  def updateTenantSettings(data: Data): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def updateTenantSettings(data: Data, cb: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("updateTenantSettings")
  def updateTenantSettings_Unit(data: Data): scala.Unit = js.native
  def updateUser(params: ObjectWithId, data: UpdateUserData): bluebirdLib.bluebirdMod.namespaced[User] = js.native
  def updateUser(
    params: ObjectWithId,
    data: UpdateUserData,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ User, scala.Unit]
  ): scala.Unit = js.native
  def updateUserMetadata(params: ObjectWithId, data: UserMetadata): bluebirdLib.bluebirdMod.namespaced[User] = js.native
  def updateUserMetadata(
    params: ObjectWithId,
    data: UserMetadata,
    cb: js.Function2[/* err */ stdLib.Error, /* data */ User, scala.Unit]
  ): scala.Unit = js.native
}

