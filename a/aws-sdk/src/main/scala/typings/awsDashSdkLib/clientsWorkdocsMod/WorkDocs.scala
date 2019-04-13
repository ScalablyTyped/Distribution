package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkDocs
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_WorkDocs: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Aborts the upload of the specified document version that was previously initiated by InitiateDocumentVersionUpload. The client should make this call only when it no longer intends to upload the document version, or fails to do so.
    */
  def abortDocumentVersionUpload(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def abortDocumentVersionUpload(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Aborts the upload of the specified document version that was previously initiated by InitiateDocumentVersionUpload. The client should make this call only when it no longer intends to upload the document version, or fails to do so.
    */
  def abortDocumentVersionUpload(params: AbortDocumentVersionUploadRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def abortDocumentVersionUpload(
    params: AbortDocumentVersionUploadRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Activates the specified user. Only active users can access Amazon WorkDocs.
    */
  def activateUser(): awsDashSdkLib.libRequestMod.Request[ActivateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def activateUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ActivateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ActivateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Activates the specified user. Only active users can access Amazon WorkDocs.
    */
  def activateUser(params: ActivateUserRequest): awsDashSdkLib.libRequestMod.Request[ActivateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def activateUser(
    params: ActivateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ActivateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ActivateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if the principals already have different permissions.
    */
  def addResourcePermissions(): awsDashSdkLib.libRequestMod.Request[AddResourcePermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addResourcePermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddResourcePermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddResourcePermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if the principals already have different permissions.
    */
  def addResourcePermissions(params: AddResourcePermissionsRequest): awsDashSdkLib.libRequestMod.Request[AddResourcePermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addResourcePermissions(
    params: AddResourcePermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddResourcePermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddResourcePermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a new comment to the specified document version.
    */
  def createComment(): awsDashSdkLib.libRequestMod.Request[CreateCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createComment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCommentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a new comment to the specified document version.
    */
  def createComment(params: CreateCommentRequest): awsDashSdkLib.libRequestMod.Request[CreateCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createComment(
    params: CreateCommentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCommentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more custom properties to the specified resource (a folder, document, or version).
    */
  def createCustomMetadata(): awsDashSdkLib.libRequestMod.Request[CreateCustomMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCustomMetadata(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCustomMetadataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCustomMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more custom properties to the specified resource (a folder, document, or version).
    */
  def createCustomMetadata(params: CreateCustomMetadataRequest): awsDashSdkLib.libRequestMod.Request[CreateCustomMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCustomMetadata(
    params: CreateCustomMetadataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCustomMetadataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCustomMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a folder with the specified name and parent folder.
    */
  def createFolder(): awsDashSdkLib.libRequestMod.Request[CreateFolderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFolder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFolderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFolderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a folder with the specified name and parent folder.
    */
  def createFolder(params: CreateFolderRequest): awsDashSdkLib.libRequestMod.Request[CreateFolderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFolder(
    params: CreateFolderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFolderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFolderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds the specified list of labels to the given resource (a document or folder)
    */
  def createLabels(): awsDashSdkLib.libRequestMod.Request[CreateLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLabels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLabelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds the specified list of labels to the given resource (a document or folder)
    */
  def createLabels(params: CreateLabelsRequest): awsDashSdkLib.libRequestMod.Request[CreateLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLabels(
    params: CreateLabelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLabelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives a confirmation message, and must confirm the subscription. For more information, see Subscribe to Notifications in the Amazon WorkDocs Developer Guide.
    */
  def createNotificationSubscription(): awsDashSdkLib.libRequestMod.Request[CreateNotificationSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNotificationSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateNotificationSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateNotificationSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives a confirmation message, and must confirm the subscription. For more information, see Subscribe to Notifications in the Amazon WorkDocs Developer Guide.
    */
  def createNotificationSubscription(params: CreateNotificationSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[CreateNotificationSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNotificationSubscription(
    params: CreateNotificationSubscriptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateNotificationSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateNotificationSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is "ACTIVE". New users can access Amazon WorkDocs.
    */
  def createUser(): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is "ACTIVE". New users can access Amazon WorkDocs.
    */
  def createUser(params: CreateUserRequest): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.
    */
  def deactivateUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deactivateUser(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.
    */
  def deactivateUser(params: DeactivateUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deactivateUser(
    params: DeactivateUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified comment from the document version.
    */
  def deleteComment(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteComment(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified comment from the document version.
    */
  def deleteComment(params: DeleteCommentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteComment(
    params: DeleteCommentRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes custom metadata from the specified resource.
    */
  def deleteCustomMetadata(): awsDashSdkLib.libRequestMod.Request[DeleteCustomMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCustomMetadata(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteCustomMetadataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteCustomMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes custom metadata from the specified resource.
    */
  def deleteCustomMetadata(params: DeleteCustomMetadataRequest): awsDashSdkLib.libRequestMod.Request[DeleteCustomMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCustomMetadata(
    params: DeleteCustomMetadataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteCustomMetadataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteCustomMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently deletes the specified document and its associated metadata.
    */
  def deleteDocument(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDocument(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently deletes the specified document and its associated metadata.
    */
  def deleteDocument(params: DeleteDocumentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDocument(
    params: DeleteDocumentRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently deletes the specified folder and its contents.
    */
  def deleteFolder(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFolder(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently deletes the specified folder and its contents.
    */
  def deleteFolder(params: DeleteFolderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFolder(
    params: DeleteFolderRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the contents of the specified folder.
    */
  def deleteFolderContents(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFolderContents(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the contents of the specified folder.
    */
  def deleteFolderContents(params: DeleteFolderContentsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFolderContents(
    params: DeleteFolderContentsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified list of labels from a resource.
    */
  def deleteLabels(): awsDashSdkLib.libRequestMod.Request[DeleteLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLabels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLabelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified list of labels from a resource.
    */
  def deleteLabels(params: DeleteLabelsRequest): awsDashSdkLib.libRequestMod.Request[DeleteLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLabels(
    params: DeleteLabelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLabelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified subscription from the specified organization.
    */
  def deleteNotificationSubscription(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNotificationSubscription(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified subscription from the specified organization.
    */
  def deleteNotificationSubscription(params: DeleteNotificationSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNotificationSubscription(
    params: DeleteNotificationSubscriptionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified user from a Simple AD or Microsoft AD directory.
    */
  def deleteUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUser(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified user from a Simple AD or Microsoft AD directory.
    */
  def deleteUser(params: DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the user activities in a specified time period.
    */
  def describeActivities(): awsDashSdkLib.libRequestMod.Request[DescribeActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeActivities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeActivitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the user activities in a specified time period.
    */
  def describeActivities(params: DescribeActivitiesRequest): awsDashSdkLib.libRequestMod.Request[DescribeActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeActivities(
    params: DescribeActivitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeActivitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all the comments for the specified document version.
    */
  def describeComments(): awsDashSdkLib.libRequestMod.Request[DescribeCommentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeComments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCommentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCommentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all the comments for the specified document version.
    */
  def describeComments(params: DescribeCommentsRequest): awsDashSdkLib.libRequestMod.Request[DescribeCommentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeComments(
    params: DescribeCommentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCommentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCommentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the document versions for the specified document. By default, only active versions are returned.
    */
  def describeDocumentVersions(): awsDashSdkLib.libRequestMod.Request[DescribeDocumentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDocumentVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDocumentVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDocumentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the document versions for the specified document. By default, only active versions are returned.
    */
  def describeDocumentVersions(params: DescribeDocumentVersionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeDocumentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDocumentVersions(
    params: DescribeDocumentVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDocumentVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDocumentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the contents of the specified folder, including its documents and subfolders. By default, Amazon WorkDocs returns the first 100 active document and folder metadata items. If there are more results, the response includes a marker that you can use to request the next set of results. You can also request initialized documents.
    */
  def describeFolderContents(): awsDashSdkLib.libRequestMod.Request[DescribeFolderContentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeFolderContents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeFolderContentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeFolderContentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the contents of the specified folder, including its documents and subfolders. By default, Amazon WorkDocs returns the first 100 active document and folder metadata items. If there are more results, the response includes a marker that you can use to request the next set of results. You can also request initialized documents.
    */
  def describeFolderContents(params: DescribeFolderContentsRequest): awsDashSdkLib.libRequestMod.Request[DescribeFolderContentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeFolderContents(
    params: DescribeFolderContentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeFolderContentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeFolderContentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the groups specified by the query. Groups are defined by the underlying Active Directory.
    */
  def describeGroups(): awsDashSdkLib.libRequestMod.Request[DescribeGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the groups specified by the query. Groups are defined by the underlying Active Directory.
    */
  def describeGroups(params: DescribeGroupsRequest): awsDashSdkLib.libRequestMod.Request[DescribeGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeGroups(
    params: DescribeGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the specified notification subscriptions.
    */
  def describeNotificationSubscriptions(): awsDashSdkLib.libRequestMod.Request[DescribeNotificationSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeNotificationSubscriptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNotificationSubscriptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotificationSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the specified notification subscriptions.
    */
  def describeNotificationSubscriptions(params: DescribeNotificationSubscriptionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeNotificationSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeNotificationSubscriptions(
    params: DescribeNotificationSubscriptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNotificationSubscriptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotificationSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the permissions of a specified resource.
    */
  def describeResourcePermissions(): awsDashSdkLib.libRequestMod.Request[DescribeResourcePermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeResourcePermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeResourcePermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeResourcePermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the permissions of a specified resource.
    */
  def describeResourcePermissions(params: DescribeResourcePermissionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeResourcePermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeResourcePermissions(
    params: DescribeResourcePermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeResourcePermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeResourcePermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the current user's special folders; the RootFolder and the RecycleBin. RootFolder is the root of user's files and folders and RecycleBin is the root of recycled items. This is not a valid action for SigV4 (administrative API) clients. This action requires an authentication token. To get an authentication token, register an application with Amazon WorkDocs. For more information, see Authentication and Access Control for User Applications in the Amazon WorkDocs Developer Guide.
    */
  def describeRootFolders(): awsDashSdkLib.libRequestMod.Request[DescribeRootFoldersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRootFolders(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRootFoldersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRootFoldersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the current user's special folders; the RootFolder and the RecycleBin. RootFolder is the root of user's files and folders and RecycleBin is the root of recycled items. This is not a valid action for SigV4 (administrative API) clients. This action requires an authentication token. To get an authentication token, register an application with Amazon WorkDocs. For more information, see Authentication and Access Control for User Applications in the Amazon WorkDocs Developer Guide.
    */
  def describeRootFolders(params: DescribeRootFoldersRequest): awsDashSdkLib.libRequestMod.Request[DescribeRootFoldersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRootFolders(
    params: DescribeRootFoldersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRootFoldersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRootFoldersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified users. You can describe all users or filter the results (for example, by status or organization). By default, Amazon WorkDocs returns the first 24 active or pending users. If there are more results, the response includes a marker that you can use to request the next set of results.
    */
  def describeUsers(): awsDashSdkLib.libRequestMod.Request[DescribeUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified users. You can describe all users or filter the results (for example, by status or organization). By default, Amazon WorkDocs returns the first 24 active or pending users. If there are more results, the response includes a marker that you can use to request the next set of results.
    */
  def describeUsers(params: DescribeUsersRequest): awsDashSdkLib.libRequestMod.Request[DescribeUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUsers(
    params: DescribeUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details of the current user for whom the authentication token was generated. This is not a valid action for SigV4 (administrative API) clients.
    */
  def getCurrentUser(): awsDashSdkLib.libRequestMod.Request[GetCurrentUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCurrentUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCurrentUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCurrentUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details of the current user for whom the authentication token was generated. This is not a valid action for SigV4 (administrative API) clients.
    */
  def getCurrentUser(params: GetCurrentUserRequest): awsDashSdkLib.libRequestMod.Request[GetCurrentUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCurrentUser(
    params: GetCurrentUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCurrentUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCurrentUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details of a document.
    */
  def getDocument(): awsDashSdkLib.libRequestMod.Request[GetDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocument(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDocumentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details of a document.
    */
  def getDocument(params: GetDocumentRequest): awsDashSdkLib.libRequestMod.Request[GetDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocument(
    params: GetDocumentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDocumentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the path information (the hierarchy from the root folder) for the requested document. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested document and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the names of the parent folders.
    */
  def getDocumentPath(): awsDashSdkLib.libRequestMod.Request[GetDocumentPathResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocumentPath(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDocumentPathResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDocumentPathResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the path information (the hierarchy from the root folder) for the requested document. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested document and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the names of the parent folders.
    */
  def getDocumentPath(params: GetDocumentPathRequest): awsDashSdkLib.libRequestMod.Request[GetDocumentPathResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocumentPath(
    params: GetDocumentPathRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDocumentPathResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDocumentPathResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves version metadata for the specified document.
    */
  def getDocumentVersion(): awsDashSdkLib.libRequestMod.Request[GetDocumentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocumentVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDocumentVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDocumentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves version metadata for the specified document.
    */
  def getDocumentVersion(params: GetDocumentVersionRequest): awsDashSdkLib.libRequestMod.Request[GetDocumentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocumentVersion(
    params: GetDocumentVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDocumentVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDocumentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the metadata of the specified folder.
    */
  def getFolder(): awsDashSdkLib.libRequestMod.Request[GetFolderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFolder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFolderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFolderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the metadata of the specified folder.
    */
  def getFolder(params: GetFolderRequest): awsDashSdkLib.libRequestMod.Request[GetFolderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFolder(
    params: GetFolderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFolderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFolderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the path information (the hierarchy from the root folder) for the specified folder. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested folder and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the parent folder names.
    */
  def getFolderPath(): awsDashSdkLib.libRequestMod.Request[GetFolderPathResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFolderPath(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFolderPathResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFolderPathResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the path information (the hierarchy from the root folder) for the specified folder. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested folder and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the parent folder names.
    */
  def getFolderPath(params: GetFolderPathRequest): awsDashSdkLib.libRequestMod.Request[GetFolderPathResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFolderPath(
    params: GetFolderPathRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFolderPathResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFolderPathResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a collection of resources, including folders and documents. The only CollectionType supported is SHARED_WITH_ME.
    */
  def getResources(): awsDashSdkLib.libRequestMod.Request[GetResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a collection of resources, including folders and documents. The only CollectionType supported is SHARED_WITH_ME.
    */
  def getResources(params: GetResourcesRequest): awsDashSdkLib.libRequestMod.Request[GetResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResources(
    params: GetResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new document object and version object. The client specifies the parent folder ID and name of the document to upload. The ID is optionally specified when creating a new version of an existing document. This is the first step to upload a document. Next, upload the document to the URL returned from the call, and then call UpdateDocumentVersion. To cancel the document upload, call AbortDocumentVersionUpload.
    */
  def initiateDocumentVersionUpload(): awsDashSdkLib.libRequestMod.Request[InitiateDocumentVersionUploadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def initiateDocumentVersionUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InitiateDocumentVersionUploadResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InitiateDocumentVersionUploadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new document object and version object. The client specifies the parent folder ID and name of the document to upload. The ID is optionally specified when creating a new version of an existing document. This is the first step to upload a document. Next, upload the document to the URL returned from the call, and then call UpdateDocumentVersion. To cancel the document upload, call AbortDocumentVersionUpload.
    */
  def initiateDocumentVersionUpload(params: InitiateDocumentVersionUploadRequest): awsDashSdkLib.libRequestMod.Request[InitiateDocumentVersionUploadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def initiateDocumentVersionUpload(
    params: InitiateDocumentVersionUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InitiateDocumentVersionUploadResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InitiateDocumentVersionUploadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes all the permissions from the specified resource.
    */
  def removeAllResourcePermissions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeAllResourcePermissions(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes all the permissions from the specified resource.
    */
  def removeAllResourcePermissions(params: RemoveAllResourcePermissionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeAllResourcePermissions(
    params: RemoveAllResourcePermissionsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the permission for the specified principal from the specified resource.
    */
  def removeResourcePermission(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeResourcePermission(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the permission for the specified principal from the specified resource.
    */
  def removeResourcePermission(params: RemoveResourcePermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeResourcePermission(
    params: RemoveResourcePermissionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified attributes of a document. The user must have access to both the document and its parent folder, if applicable.
    */
  def updateDocument(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDocument(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified attributes of a document. The user must have access to both the document and its parent folder, if applicable.
    */
  def updateDocument(params: UpdateDocumentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDocument(
    params: UpdateDocumentRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the status of the document version to ACTIVE.  Amazon WorkDocs also sets its document container to ACTIVE. This is the last step in a document upload, after the client uploads the document to an S3-presigned URL returned by InitiateDocumentVersionUpload. 
    */
  def updateDocumentVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDocumentVersion(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the status of the document version to ACTIVE.  Amazon WorkDocs also sets its document container to ACTIVE. This is the last step in a document upload, after the client uploads the document to an S3-presigned URL returned by InitiateDocumentVersionUpload. 
    */
  def updateDocumentVersion(params: UpdateDocumentVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDocumentVersion(
    params: UpdateDocumentVersionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified attributes of the specified folder. The user must have access to both the folder and its parent folder, if applicable.
    */
  def updateFolder(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFolder(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified attributes of the specified folder. The user must have access to both the folder and its parent folder, if applicable.
    */
  def updateFolder(params: UpdateFolderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFolder(
    params: UpdateFolderRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the Amazon WorkDocs site.
    */
  def updateUser(): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the Amazon WorkDocs site.
    */
  def updateUser(params: UpdateUserRequest): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUser(
    params: UpdateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

