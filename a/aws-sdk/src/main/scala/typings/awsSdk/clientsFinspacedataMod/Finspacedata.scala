package typings.awsSdk.clientsFinspacedataMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Finspacedata extends Service {
  
  /**
    * Adds a user account to a permission group to grant permissions for actions a user can perform in FinSpace.
    */
  def associateUserToPermissionGroup(): Request[AssociateUserToPermissionGroupResponse, AWSError] = js.native
  def associateUserToPermissionGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateUserToPermissionGroupResponse, Unit]
  ): Request[AssociateUserToPermissionGroupResponse, AWSError] = js.native
  /**
    * Adds a user account to a permission group to grant permissions for actions a user can perform in FinSpace.
    */
  def associateUserToPermissionGroup(params: AssociateUserToPermissionGroupRequest): Request[AssociateUserToPermissionGroupResponse, AWSError] = js.native
  def associateUserToPermissionGroup(
    params: AssociateUserToPermissionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateUserToPermissionGroupResponse, Unit]
  ): Request[AssociateUserToPermissionGroupResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Finspacedata: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new Changeset in a FinSpace Dataset.
    */
  def createChangeset(): Request[CreateChangesetResponse, AWSError] = js.native
  def createChangeset(callback: js.Function2[/* err */ AWSError, /* data */ CreateChangesetResponse, Unit]): Request[CreateChangesetResponse, AWSError] = js.native
  /**
    * Creates a new Changeset in a FinSpace Dataset.
    */
  def createChangeset(params: CreateChangesetRequest): Request[CreateChangesetResponse, AWSError] = js.native
  def createChangeset(
    params: CreateChangesetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateChangesetResponse, Unit]
  ): Request[CreateChangesetResponse, AWSError] = js.native
  
  /**
    * Creates a Dataview for a Dataset.
    */
  def createDataView(): Request[CreateDataViewResponse, AWSError] = js.native
  def createDataView(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataViewResponse, Unit]): Request[CreateDataViewResponse, AWSError] = js.native
  /**
    * Creates a Dataview for a Dataset.
    */
  def createDataView(params: CreateDataViewRequest): Request[CreateDataViewResponse, AWSError] = js.native
  def createDataView(
    params: CreateDataViewRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataViewResponse, Unit]
  ): Request[CreateDataViewResponse, AWSError] = js.native
  
  /**
    * Creates a new FinSpace Dataset.
    */
  def createDataset(): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]): Request[CreateDatasetResponse, AWSError] = js.native
  /**
    * Creates a new FinSpace Dataset.
    */
  def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(
    params: CreateDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]
  ): Request[CreateDatasetResponse, AWSError] = js.native
  
  /**
    * Creates a group of permissions for various actions that a user can perform in FinSpace.
    */
  def createPermissionGroup(): Request[CreatePermissionGroupResponse, AWSError] = js.native
  def createPermissionGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreatePermissionGroupResponse, Unit]): Request[CreatePermissionGroupResponse, AWSError] = js.native
  /**
    * Creates a group of permissions for various actions that a user can perform in FinSpace.
    */
  def createPermissionGroup(params: CreatePermissionGroupRequest): Request[CreatePermissionGroupResponse, AWSError] = js.native
  def createPermissionGroup(
    params: CreatePermissionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePermissionGroupResponse, Unit]
  ): Request[CreatePermissionGroupResponse, AWSError] = js.native
  
  /**
    * Creates a new user in FinSpace.
    */
  def createUser(): Request[CreateUserResponse, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates a new user in FinSpace.
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResponse, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]
  ): Request[CreateUserResponse, AWSError] = js.native
  
  /**
    * Deletes a FinSpace Dataset.
    */
  def deleteDataset(): Request[DeleteDatasetResponse, AWSError] = js.native
  def deleteDataset(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatasetResponse, Unit]): Request[DeleteDatasetResponse, AWSError] = js.native
  /**
    * Deletes a FinSpace Dataset.
    */
  def deleteDataset(params: DeleteDatasetRequest): Request[DeleteDatasetResponse, AWSError] = js.native
  def deleteDataset(
    params: DeleteDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatasetResponse, Unit]
  ): Request[DeleteDatasetResponse, AWSError] = js.native
  
  /**
    * Deletes a permission group. This action is irreversible.
    */
  def deletePermissionGroup(): Request[DeletePermissionGroupResponse, AWSError] = js.native
  def deletePermissionGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeletePermissionGroupResponse, Unit]): Request[DeletePermissionGroupResponse, AWSError] = js.native
  /**
    * Deletes a permission group. This action is irreversible.
    */
  def deletePermissionGroup(params: DeletePermissionGroupRequest): Request[DeletePermissionGroupResponse, AWSError] = js.native
  def deletePermissionGroup(
    params: DeletePermissionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePermissionGroupResponse, Unit]
  ): Request[DeletePermissionGroupResponse, AWSError] = js.native
  
  /**
    * Denies access to the FinSpace web application and API for the specified user.
    */
  def disableUser(): Request[DisableUserResponse, AWSError] = js.native
  def disableUser(callback: js.Function2[/* err */ AWSError, /* data */ DisableUserResponse, Unit]): Request[DisableUserResponse, AWSError] = js.native
  /**
    * Denies access to the FinSpace web application and API for the specified user.
    */
  def disableUser(params: DisableUserRequest): Request[DisableUserResponse, AWSError] = js.native
  def disableUser(
    params: DisableUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableUserResponse, Unit]
  ): Request[DisableUserResponse, AWSError] = js.native
  
  /**
    * Removes a user account from a permission group.
    */
  def disassociateUserFromPermissionGroup(): Request[DisassociateUserFromPermissionGroupResponse, AWSError] = js.native
  def disassociateUserFromPermissionGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateUserFromPermissionGroupResponse, Unit]
  ): Request[DisassociateUserFromPermissionGroupResponse, AWSError] = js.native
  /**
    * Removes a user account from a permission group.
    */
  def disassociateUserFromPermissionGroup(params: DisassociateUserFromPermissionGroupRequest): Request[DisassociateUserFromPermissionGroupResponse, AWSError] = js.native
  def disassociateUserFromPermissionGroup(
    params: DisassociateUserFromPermissionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateUserFromPermissionGroupResponse, Unit]
  ): Request[DisassociateUserFromPermissionGroupResponse, AWSError] = js.native
  
  /**
    *  Allows the specified user to access the FinSpace web application and API.
    */
  def enableUser(): Request[EnableUserResponse, AWSError] = js.native
  def enableUser(callback: js.Function2[/* err */ AWSError, /* data */ EnableUserResponse, Unit]): Request[EnableUserResponse, AWSError] = js.native
  /**
    *  Allows the specified user to access the FinSpace web application and API.
    */
  def enableUser(params: EnableUserRequest): Request[EnableUserResponse, AWSError] = js.native
  def enableUser(
    params: EnableUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableUserResponse, Unit]
  ): Request[EnableUserResponse, AWSError] = js.native
  
  /**
    * Get information about a Changeset.
    */
  def getChangeset(): Request[GetChangesetResponse, AWSError] = js.native
  def getChangeset(callback: js.Function2[/* err */ AWSError, /* data */ GetChangesetResponse, Unit]): Request[GetChangesetResponse, AWSError] = js.native
  /**
    * Get information about a Changeset.
    */
  def getChangeset(params: GetChangesetRequest): Request[GetChangesetResponse, AWSError] = js.native
  def getChangeset(
    params: GetChangesetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetChangesetResponse, Unit]
  ): Request[GetChangesetResponse, AWSError] = js.native
  
  /**
    * Gets information about a Dataview.
    */
  def getDataView(): Request[GetDataViewResponse, AWSError] = js.native
  def getDataView(callback: js.Function2[/* err */ AWSError, /* data */ GetDataViewResponse, Unit]): Request[GetDataViewResponse, AWSError] = js.native
  /**
    * Gets information about a Dataview.
    */
  def getDataView(params: GetDataViewRequest): Request[GetDataViewResponse, AWSError] = js.native
  def getDataView(
    params: GetDataViewRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataViewResponse, Unit]
  ): Request[GetDataViewResponse, AWSError] = js.native
  
  /**
    * Returns information about a Dataset.
    */
  def getDataset(): Request[GetDatasetResponse, AWSError] = js.native
  def getDataset(callback: js.Function2[/* err */ AWSError, /* data */ GetDatasetResponse, Unit]): Request[GetDatasetResponse, AWSError] = js.native
  /**
    * Returns information about a Dataset.
    */
  def getDataset(params: GetDatasetRequest): Request[GetDatasetResponse, AWSError] = js.native
  def getDataset(
    params: GetDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDatasetResponse, Unit]
  ): Request[GetDatasetResponse, AWSError] = js.native
  
  /**
    * Returns the credentials to access the external Dataview from an S3 location. To call this API:   You must retrieve the programmatic credentials.   You must be a member of a FinSpace user group, where the dataset that you want to access has Read Dataset Data permissions.  
    */
  def getExternalDataViewAccessDetails(): Request[GetExternalDataViewAccessDetailsResponse, AWSError] = js.native
  def getExternalDataViewAccessDetails(
    callback: js.Function2[/* err */ AWSError, /* data */ GetExternalDataViewAccessDetailsResponse, Unit]
  ): Request[GetExternalDataViewAccessDetailsResponse, AWSError] = js.native
  /**
    * Returns the credentials to access the external Dataview from an S3 location. To call this API:   You must retrieve the programmatic credentials.   You must be a member of a FinSpace user group, where the dataset that you want to access has Read Dataset Data permissions.  
    */
  def getExternalDataViewAccessDetails(params: GetExternalDataViewAccessDetailsRequest): Request[GetExternalDataViewAccessDetailsResponse, AWSError] = js.native
  def getExternalDataViewAccessDetails(
    params: GetExternalDataViewAccessDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetExternalDataViewAccessDetailsResponse, Unit]
  ): Request[GetExternalDataViewAccessDetailsResponse, AWSError] = js.native
  
  /**
    * Retrieves the details of a specific permission group.
    */
  def getPermissionGroup(): Request[GetPermissionGroupResponse, AWSError] = js.native
  def getPermissionGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetPermissionGroupResponse, Unit]): Request[GetPermissionGroupResponse, AWSError] = js.native
  /**
    * Retrieves the details of a specific permission group.
    */
  def getPermissionGroup(params: GetPermissionGroupRequest): Request[GetPermissionGroupResponse, AWSError] = js.native
  def getPermissionGroup(
    params: GetPermissionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPermissionGroupResponse, Unit]
  ): Request[GetPermissionGroupResponse, AWSError] = js.native
  
  /**
    * Request programmatic credentials to use with FinSpace SDK.
    */
  def getProgrammaticAccessCredentials(): Request[GetProgrammaticAccessCredentialsResponse, AWSError] = js.native
  def getProgrammaticAccessCredentials(
    callback: js.Function2[/* err */ AWSError, /* data */ GetProgrammaticAccessCredentialsResponse, Unit]
  ): Request[GetProgrammaticAccessCredentialsResponse, AWSError] = js.native
  /**
    * Request programmatic credentials to use with FinSpace SDK.
    */
  def getProgrammaticAccessCredentials(params: GetProgrammaticAccessCredentialsRequest): Request[GetProgrammaticAccessCredentialsResponse, AWSError] = js.native
  def getProgrammaticAccessCredentials(
    params: GetProgrammaticAccessCredentialsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProgrammaticAccessCredentialsResponse, Unit]
  ): Request[GetProgrammaticAccessCredentialsResponse, AWSError] = js.native
  
  /**
    * Retrieves details for a specific user.
    */
  def getUser(): Request[GetUserResponse, AWSError] = js.native
  def getUser(callback: js.Function2[/* err */ AWSError, /* data */ GetUserResponse, Unit]): Request[GetUserResponse, AWSError] = js.native
  /**
    * Retrieves details for a specific user.
    */
  def getUser(params: GetUserRequest): Request[GetUserResponse, AWSError] = js.native
  def getUser(
    params: GetUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUserResponse, Unit]
  ): Request[GetUserResponse, AWSError] = js.native
  
  /**
    * A temporary Amazon S3 location, where you can copy your files from a source location to stage or use as a scratch space in FinSpace notebook.
    */
  def getWorkingLocation(): Request[GetWorkingLocationResponse, AWSError] = js.native
  def getWorkingLocation(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkingLocationResponse, Unit]): Request[GetWorkingLocationResponse, AWSError] = js.native
  /**
    * A temporary Amazon S3 location, where you can copy your files from a source location to stage or use as a scratch space in FinSpace notebook.
    */
  def getWorkingLocation(params: GetWorkingLocationRequest): Request[GetWorkingLocationResponse, AWSError] = js.native
  def getWorkingLocation(
    params: GetWorkingLocationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkingLocationResponse, Unit]
  ): Request[GetWorkingLocationResponse, AWSError] = js.native
  
  /**
    * Lists the FinSpace Changesets for a Dataset.
    */
  def listChangesets(): Request[ListChangesetsResponse, AWSError] = js.native
  def listChangesets(callback: js.Function2[/* err */ AWSError, /* data */ ListChangesetsResponse, Unit]): Request[ListChangesetsResponse, AWSError] = js.native
  /**
    * Lists the FinSpace Changesets for a Dataset.
    */
  def listChangesets(params: ListChangesetsRequest): Request[ListChangesetsResponse, AWSError] = js.native
  def listChangesets(
    params: ListChangesetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChangesetsResponse, Unit]
  ): Request[ListChangesetsResponse, AWSError] = js.native
  
  /**
    * Lists all available Dataviews for a Dataset.
    */
  def listDataViews(): Request[ListDataViewsResponse, AWSError] = js.native
  def listDataViews(callback: js.Function2[/* err */ AWSError, /* data */ ListDataViewsResponse, Unit]): Request[ListDataViewsResponse, AWSError] = js.native
  /**
    * Lists all available Dataviews for a Dataset.
    */
  def listDataViews(params: ListDataViewsRequest): Request[ListDataViewsResponse, AWSError] = js.native
  def listDataViews(
    params: ListDataViewsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataViewsResponse, Unit]
  ): Request[ListDataViewsResponse, AWSError] = js.native
  
  /**
    * Lists all of the active Datasets that a user has access to.
    */
  def listDatasets(): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]): Request[ListDatasetsResponse, AWSError] = js.native
  /**
    * Lists all of the active Datasets that a user has access to.
    */
  def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(
    params: ListDatasetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]
  ): Request[ListDatasetsResponse, AWSError] = js.native
  
  /**
    * Lists all available permission groups in FinSpace.
    */
  def listPermissionGroups(): Request[ListPermissionGroupsResponse, AWSError] = js.native
  def listPermissionGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionGroupsResponse, Unit]): Request[ListPermissionGroupsResponse, AWSError] = js.native
  /**
    * Lists all available permission groups in FinSpace.
    */
  def listPermissionGroups(params: ListPermissionGroupsRequest): Request[ListPermissionGroupsResponse, AWSError] = js.native
  def listPermissionGroups(
    params: ListPermissionGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionGroupsResponse, Unit]
  ): Request[ListPermissionGroupsResponse, AWSError] = js.native
  
  /**
    * Lists all the permission groups that are associated with a specific user account.
    */
  def listPermissionGroupsByUser(): Request[ListPermissionGroupsByUserResponse, AWSError] = js.native
  def listPermissionGroupsByUser(callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionGroupsByUserResponse, Unit]): Request[ListPermissionGroupsByUserResponse, AWSError] = js.native
  /**
    * Lists all the permission groups that are associated with a specific user account.
    */
  def listPermissionGroupsByUser(params: ListPermissionGroupsByUserRequest): Request[ListPermissionGroupsByUserResponse, AWSError] = js.native
  def listPermissionGroupsByUser(
    params: ListPermissionGroupsByUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionGroupsByUserResponse, Unit]
  ): Request[ListPermissionGroupsByUserResponse, AWSError] = js.native
  
  /**
    * Lists all available user accounts in FinSpace.
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Lists all available user accounts in FinSpace.
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  
  /**
    * Lists details of all the users in a specific permission group.
    */
  def listUsersByPermissionGroup(): Request[ListUsersByPermissionGroupResponse, AWSError] = js.native
  def listUsersByPermissionGroup(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersByPermissionGroupResponse, Unit]): Request[ListUsersByPermissionGroupResponse, AWSError] = js.native
  /**
    * Lists details of all the users in a specific permission group.
    */
  def listUsersByPermissionGroup(params: ListUsersByPermissionGroupRequest): Request[ListUsersByPermissionGroupResponse, AWSError] = js.native
  def listUsersByPermissionGroup(
    params: ListUsersByPermissionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersByPermissionGroupResponse, Unit]
  ): Request[ListUsersByPermissionGroupResponse, AWSError] = js.native
  
  /**
    * Resets the password for a specified user ID and generates a temporary one. Only a superuser can reset password for other users. Resetting the password immediately invalidates the previous password associated with the user.
    */
  def resetUserPassword(): Request[ResetUserPasswordResponse, AWSError] = js.native
  def resetUserPassword(callback: js.Function2[/* err */ AWSError, /* data */ ResetUserPasswordResponse, Unit]): Request[ResetUserPasswordResponse, AWSError] = js.native
  /**
    * Resets the password for a specified user ID and generates a temporary one. Only a superuser can reset password for other users. Resetting the password immediately invalidates the previous password associated with the user.
    */
  def resetUserPassword(params: ResetUserPasswordRequest): Request[ResetUserPasswordResponse, AWSError] = js.native
  def resetUserPassword(
    params: ResetUserPasswordRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResetUserPasswordResponse, Unit]
  ): Request[ResetUserPasswordResponse, AWSError] = js.native
  
  /**
    * Updates a FinSpace Changeset.
    */
  def updateChangeset(): Request[UpdateChangesetResponse, AWSError] = js.native
  def updateChangeset(callback: js.Function2[/* err */ AWSError, /* data */ UpdateChangesetResponse, Unit]): Request[UpdateChangesetResponse, AWSError] = js.native
  /**
    * Updates a FinSpace Changeset.
    */
  def updateChangeset(params: UpdateChangesetRequest): Request[UpdateChangesetResponse, AWSError] = js.native
  def updateChangeset(
    params: UpdateChangesetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateChangesetResponse, Unit]
  ): Request[UpdateChangesetResponse, AWSError] = js.native
  
  /**
    * Updates a FinSpace Dataset.
    */
  def updateDataset(): Request[UpdateDatasetResponse, AWSError] = js.native
  def updateDataset(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatasetResponse, Unit]): Request[UpdateDatasetResponse, AWSError] = js.native
  /**
    * Updates a FinSpace Dataset.
    */
  def updateDataset(params: UpdateDatasetRequest): Request[UpdateDatasetResponse, AWSError] = js.native
  def updateDataset(
    params: UpdateDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatasetResponse, Unit]
  ): Request[UpdateDatasetResponse, AWSError] = js.native
  
  /**
    * Modifies the details of a permission group. You cannot modify a permissionGroupID.
    */
  def updatePermissionGroup(): Request[UpdatePermissionGroupResponse, AWSError] = js.native
  def updatePermissionGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePermissionGroupResponse, Unit]): Request[UpdatePermissionGroupResponse, AWSError] = js.native
  /**
    * Modifies the details of a permission group. You cannot modify a permissionGroupID.
    */
  def updatePermissionGroup(params: UpdatePermissionGroupRequest): Request[UpdatePermissionGroupResponse, AWSError] = js.native
  def updatePermissionGroup(
    params: UpdatePermissionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePermissionGroupResponse, Unit]
  ): Request[UpdatePermissionGroupResponse, AWSError] = js.native
  
  /**
    * Modifies the details of the specified user account. You cannot update the userId for a user.
    */
  def updateUser(): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]): Request[UpdateUserResponse, AWSError] = js.native
  /**
    * Modifies the details of the specified user account. You cannot update the userId for a user.
    */
  def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(
    params: UpdateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]
  ): Request[UpdateUserResponse, AWSError] = js.native
}
