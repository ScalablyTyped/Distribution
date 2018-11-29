package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkDocs
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_WorkDocs: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.ClientConfiguration = js.native
  /**
     * Aborts the upload of the specified document version that was previously initiated by InitiateDocumentVersionUpload. The client should make this call only when it no longer intends to upload the document version, or fails to do so.
     */
  def abortDocumentVersionUpload(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Aborts the upload of the specified document version that was previously initiated by InitiateDocumentVersionUpload. The client should make this call only when it no longer intends to upload the document version, or fails to do so.
     */
  def abortDocumentVersionUpload(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Aborts the upload of the specified document version that was previously initiated by InitiateDocumentVersionUpload. The client should make this call only when it no longer intends to upload the document version, or fails to do so.
     */
  def abortDocumentVersionUpload(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.AbortDocumentVersionUploadRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Aborts the upload of the specified document version that was previously initiated by InitiateDocumentVersionUpload. The client should make this call only when it no longer intends to upload the document version, or fails to do so.
     */
  def abortDocumentVersionUpload(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.AbortDocumentVersionUploadRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Activates the specified user. Only active users can access Amazon WorkDocs.
     */
  def activateUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.ActivateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Activates the specified user. Only active users can access Amazon WorkDocs.
     */
  def activateUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.ActivateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.ActivateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Activates the specified user. Only active users can access Amazon WorkDocs.
     */
  def activateUser(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.ActivateUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.ActivateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Activates the specified user. Only active users can access Amazon WorkDocs.
     */
  def activateUser(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.ActivateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.ActivateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.ActivateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if the principals already have different permissions.
     */
  def addResourcePermissions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.AddResourcePermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if the principals already have different permissions.
     */
  def addResourcePermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.AddResourcePermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.AddResourcePermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if the principals already have different permissions.
     */
  def addResourcePermissions(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.AddResourcePermissionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.AddResourcePermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if the principals already have different permissions.
     */
  def addResourcePermissions(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.AddResourcePermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.AddResourcePermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.AddResourcePermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a new comment to the specified document version.
     */
  def createComment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateCommentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a new comment to the specified document version.
     */
  def createComment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateCommentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateCommentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a new comment to the specified document version.
     */
  def createComment(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateCommentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateCommentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a new comment to the specified document version.
     */
  def createComment(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateCommentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateCommentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateCommentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds one or more custom properties to the specified resource (a folder, document, or version).
     */
  def createCustomMetadata(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateCustomMetadataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds one or more custom properties to the specified resource (a folder, document, or version).
     */
  def createCustomMetadata(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateCustomMetadataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateCustomMetadataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds one or more custom properties to the specified resource (a folder, document, or version).
     */
  def createCustomMetadata(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateCustomMetadataRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateCustomMetadataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds one or more custom properties to the specified resource (a folder, document, or version).
     */
  def createCustomMetadata(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateCustomMetadataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateCustomMetadataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateCustomMetadataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a folder with the specified name and parent folder.
     */
  def createFolder(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateFolderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a folder with the specified name and parent folder.
     */
  def createFolder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateFolderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateFolderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a folder with the specified name and parent folder.
     */
  def createFolder(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateFolderRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateFolderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a folder with the specified name and parent folder.
     */
  def createFolder(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateFolderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateFolderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateFolderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds the specified list of labels to the given resource (a document or folder)
     */
  def createLabels(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateLabelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds the specified list of labels to the given resource (a document or folder)
     */
  def createLabels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateLabelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateLabelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds the specified list of labels to the given resource (a document or folder)
     */
  def createLabels(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateLabelsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateLabelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds the specified list of labels to the given resource (a document or folder)
     */
  def createLabels(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateLabelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateLabelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateLabelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives a confirmation message, and must confirm the subscription. For more information, see Subscribe to Notifications in the Amazon WorkDocs Developer Guide.
     */
  def createNotificationSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateNotificationSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives a confirmation message, and must confirm the subscription. For more information, see Subscribe to Notifications in the Amazon WorkDocs Developer Guide.
     */
  def createNotificationSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateNotificationSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateNotificationSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives a confirmation message, and must confirm the subscription. For more information, see Subscribe to Notifications in the Amazon WorkDocs Developer Guide.
     */
  def createNotificationSubscription(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateNotificationSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateNotificationSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives a confirmation message, and must confirm the subscription. For more information, see Subscribe to Notifications in the Amazon WorkDocs Developer Guide.
     */
  def createNotificationSubscription(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateNotificationSubscriptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateNotificationSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateNotificationSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is "ACTIVE". New users can access Amazon WorkDocs.
     */
  def createUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is "ACTIVE". New users can access Amazon WorkDocs.
     */
  def createUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is "ACTIVE". New users can access Amazon WorkDocs.
     */
  def createUser(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is "ACTIVE". New users can access Amazon WorkDocs.
     */
  def createUser(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.
     */
  def deactivateUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.
     */
  def deactivateUser(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.
     */
  def deactivateUser(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeactivateUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.
     */
  def deactivateUser(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeactivateUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified comment from the document version.
     */
  def deleteComment(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified comment from the document version.
     */
  def deleteComment(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified comment from the document version.
     */
  def deleteComment(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteCommentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified comment from the document version.
     */
  def deleteComment(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteCommentRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes custom metadata from the specified resource.
     */
  def deleteCustomMetadata(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteCustomMetadataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes custom metadata from the specified resource.
     */
  def deleteCustomMetadata(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteCustomMetadataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteCustomMetadataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes custom metadata from the specified resource.
     */
  def deleteCustomMetadata(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteCustomMetadataRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteCustomMetadataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes custom metadata from the specified resource.
     */
  def deleteCustomMetadata(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteCustomMetadataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteCustomMetadataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteCustomMetadataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Permanently deletes the specified document and its associated metadata.
     */
  def deleteDocument(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Permanently deletes the specified document and its associated metadata.
     */
  def deleteDocument(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Permanently deletes the specified document and its associated metadata.
     */
  def deleteDocument(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteDocumentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Permanently deletes the specified document and its associated metadata.
     */
  def deleteDocument(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteDocumentRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Permanently deletes the specified folder and its contents.
     */
  def deleteFolder(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Permanently deletes the specified folder and its contents.
     */
  def deleteFolder(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Permanently deletes the specified folder and its contents.
     */
  def deleteFolder(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteFolderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Permanently deletes the specified folder and its contents.
     */
  def deleteFolder(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteFolderRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the contents of the specified folder.
     */
  def deleteFolderContents(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the contents of the specified folder.
     */
  def deleteFolderContents(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the contents of the specified folder.
     */
  def deleteFolderContents(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteFolderContentsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the contents of the specified folder.
     */
  def deleteFolderContents(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteFolderContentsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified list of labels from a resource.
     */
  def deleteLabels(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteLabelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified list of labels from a resource.
     */
  def deleteLabels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteLabelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteLabelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified list of labels from a resource.
     */
  def deleteLabels(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteLabelsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteLabelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified list of labels from a resource.
     */
  def deleteLabels(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteLabelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteLabelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteLabelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified subscription from the specified organization.
     */
  def deleteNotificationSubscription(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified subscription from the specified organization.
     */
  def deleteNotificationSubscription(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified subscription from the specified organization.
     */
  def deleteNotificationSubscription(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteNotificationSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified subscription from the specified organization.
     */
  def deleteNotificationSubscription(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteNotificationSubscriptionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified user from a Simple AD or Microsoft AD directory.
     */
  def deleteUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified user from a Simple AD or Microsoft AD directory.
     */
  def deleteUser(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified user from a Simple AD or Microsoft AD directory.
     */
  def deleteUser(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified user from a Simple AD or Microsoft AD directory.
     */
  def deleteUser(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DeleteUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Describes the user activities in a specified time period.
     */
  def describeActivities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeActivitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the user activities in a specified time period.
     */
  def describeActivities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeActivitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeActivitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the user activities in a specified time period.
     */
  def describeActivities(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeActivitiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeActivitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the user activities in a specified time period.
     */
  def describeActivities(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeActivitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeActivitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeActivitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all the comments for the specified document version.
     */
  def describeComments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeCommentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all the comments for the specified document version.
     */
  def describeComments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeCommentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeCommentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all the comments for the specified document version.
     */
  def describeComments(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeCommentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeCommentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all the comments for the specified document version.
     */
  def describeComments(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeCommentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeCommentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeCommentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the document versions for the specified document. By default, only active versions are returned.
     */
  def describeDocumentVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeDocumentVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the document versions for the specified document. By default, only active versions are returned.
     */
  def describeDocumentVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeDocumentVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeDocumentVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the document versions for the specified document. By default, only active versions are returned.
     */
  def describeDocumentVersions(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeDocumentVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeDocumentVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the document versions for the specified document. By default, only active versions are returned.
     */
  def describeDocumentVersions(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeDocumentVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeDocumentVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeDocumentVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the contents of the specified folder, including its documents and subfolders. By default, Amazon WorkDocs returns the first 100 active document and folder metadata items. If there are more results, the response includes a marker that you can use to request the next set of results. You can also request initialized documents.
     */
  def describeFolderContents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeFolderContentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the contents of the specified folder, including its documents and subfolders. By default, Amazon WorkDocs returns the first 100 active document and folder metadata items. If there are more results, the response includes a marker that you can use to request the next set of results. You can also request initialized documents.
     */
  def describeFolderContents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeFolderContentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeFolderContentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the contents of the specified folder, including its documents and subfolders. By default, Amazon WorkDocs returns the first 100 active document and folder metadata items. If there are more results, the response includes a marker that you can use to request the next set of results. You can also request initialized documents.
     */
  def describeFolderContents(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeFolderContentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeFolderContentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the contents of the specified folder, including its documents and subfolders. By default, Amazon WorkDocs returns the first 100 active document and folder metadata items. If there are more results, the response includes a marker that you can use to request the next set of results. You can also request initialized documents.
     */
  def describeFolderContents(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeFolderContentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeFolderContentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeFolderContentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the groups specified by the query. Groups are defined by the underlying Active Directory.
     */
  def describeGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the groups specified by the query. Groups are defined by the underlying Active Directory.
     */
  def describeGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the groups specified by the query. Groups are defined by the underlying Active Directory.
     */
  def describeGroups(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the groups specified by the query. Groups are defined by the underlying Active Directory.
     */
  def describeGroups(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified notification subscriptions.
     */
  def describeNotificationSubscriptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeNotificationSubscriptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified notification subscriptions.
     */
  def describeNotificationSubscriptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeNotificationSubscriptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeNotificationSubscriptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified notification subscriptions.
     */
  def describeNotificationSubscriptions(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeNotificationSubscriptionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeNotificationSubscriptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified notification subscriptions.
     */
  def describeNotificationSubscriptions(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeNotificationSubscriptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeNotificationSubscriptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeNotificationSubscriptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the permissions of a specified resource.
     */
  def describeResourcePermissions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeResourcePermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the permissions of a specified resource.
     */
  def describeResourcePermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeResourcePermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeResourcePermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the permissions of a specified resource.
     */
  def describeResourcePermissions(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeResourcePermissionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeResourcePermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the permissions of a specified resource.
     */
  def describeResourcePermissions(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeResourcePermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeResourcePermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeResourcePermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the current user's special folders; the RootFolder and the RecycleBin. RootFolder is the root of user's files and folders and RecycleBin is the root of recycled items. This is not a valid action for SigV4 (administrative API) clients. This action requires an authentication token. To get an authentication token, register an application with Amazon WorkDocs. For more information, see Authentication and Access Control for User Applications in the Amazon WorkDocs Developer Guide.
     */
  def describeRootFolders(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeRootFoldersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the current user's special folders; the RootFolder and the RecycleBin. RootFolder is the root of user's files and folders and RecycleBin is the root of recycled items. This is not a valid action for SigV4 (administrative API) clients. This action requires an authentication token. To get an authentication token, register an application with Amazon WorkDocs. For more information, see Authentication and Access Control for User Applications in the Amazon WorkDocs Developer Guide.
     */
  def describeRootFolders(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeRootFoldersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeRootFoldersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the current user's special folders; the RootFolder and the RecycleBin. RootFolder is the root of user's files and folders and RecycleBin is the root of recycled items. This is not a valid action for SigV4 (administrative API) clients. This action requires an authentication token. To get an authentication token, register an application with Amazon WorkDocs. For more information, see Authentication and Access Control for User Applications in the Amazon WorkDocs Developer Guide.
     */
  def describeRootFolders(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeRootFoldersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeRootFoldersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the current user's special folders; the RootFolder and the RecycleBin. RootFolder is the root of user's files and folders and RecycleBin is the root of recycled items. This is not a valid action for SigV4 (administrative API) clients. This action requires an authentication token. To get an authentication token, register an application with Amazon WorkDocs. For more information, see Authentication and Access Control for User Applications in the Amazon WorkDocs Developer Guide.
     */
  def describeRootFolders(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeRootFoldersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeRootFoldersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeRootFoldersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the specified users. You can describe all users or filter the results (for example, by status or organization). By default, Amazon WorkDocs returns the first 24 active or pending users. If there are more results, the response includes a marker that you can use to request the next set of results.
     */
  def describeUsers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the specified users. You can describe all users or filter the results (for example, by status or organization). By default, Amazon WorkDocs returns the first 24 active or pending users. If there are more results, the response includes a marker that you can use to request the next set of results.
     */
  def describeUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the specified users. You can describe all users or filter the results (for example, by status or organization). By default, Amazon WorkDocs returns the first 24 active or pending users. If there are more results, the response includes a marker that you can use to request the next set of results.
     */
  def describeUsers(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeUsersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the specified users. You can describe all users or filter the results (for example, by status or organization). By default, Amazon WorkDocs returns the first 24 active or pending users. If there are more results, the response includes a marker that you can use to request the next set of results.
     */
  def describeUsers(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.DescribeUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves details of the current user for whom the authentication token was generated. This is not a valid action for SigV4 (administrative API) clients.
     */
  def getCurrentUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetCurrentUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves details of the current user for whom the authentication token was generated. This is not a valid action for SigV4 (administrative API) clients.
     */
  def getCurrentUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetCurrentUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetCurrentUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves details of the current user for whom the authentication token was generated. This is not a valid action for SigV4 (administrative API) clients.
     */
  def getCurrentUser(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetCurrentUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetCurrentUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves details of the current user for whom the authentication token was generated. This is not a valid action for SigV4 (administrative API) clients.
     */
  def getCurrentUser(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetCurrentUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetCurrentUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetCurrentUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves details of a document.
     */
  def getDocument(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves details of a document.
     */
  def getDocument(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves details of a document.
     */
  def getDocument(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves details of a document.
     */
  def getDocument(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the path information (the hierarchy from the root folder) for the requested document. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested document and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the names of the parent folders.
     */
  def getDocumentPath(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentPathResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the path information (the hierarchy from the root folder) for the requested document. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested document and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the names of the parent folders.
     */
  def getDocumentPath(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentPathResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentPathResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the path information (the hierarchy from the root folder) for the requested document. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested document and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the names of the parent folders.
     */
  def getDocumentPath(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentPathRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentPathResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the path information (the hierarchy from the root folder) for the requested document. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested document and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the names of the parent folders.
     */
  def getDocumentPath(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentPathRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentPathResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentPathResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves version metadata for the specified document.
     */
  def getDocumentVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves version metadata for the specified document.
     */
  def getDocumentVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves version metadata for the specified document.
     */
  def getDocumentVersion(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves version metadata for the specified document.
     */
  def getDocumentVersion(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetDocumentVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the metadata of the specified folder.
     */
  def getFolder(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetFolderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the metadata of the specified folder.
     */
  def getFolder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetFolderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetFolderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the metadata of the specified folder.
     */
  def getFolder(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetFolderRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetFolderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the metadata of the specified folder.
     */
  def getFolder(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetFolderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetFolderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetFolderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the path information (the hierarchy from the root folder) for the specified folder. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested folder and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the parent folder names.
     */
  def getFolderPath(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetFolderPathResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the path information (the hierarchy from the root folder) for the specified folder. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested folder and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the parent folder names.
     */
  def getFolderPath(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetFolderPathResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetFolderPathResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the path information (the hierarchy from the root folder) for the specified folder. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested folder and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the parent folder names.
     */
  def getFolderPath(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetFolderPathRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetFolderPathResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the path information (the hierarchy from the root folder) for the specified folder. By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested folder and only includes the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the parent folder names.
     */
  def getFolderPath(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetFolderPathRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetFolderPathResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetFolderPathResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a collection of resources, including folders and documents. The only CollectionType supported is SHARED_WITH_ME.
     */
  def getResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a collection of resources, including folders and documents. The only CollectionType supported is SHARED_WITH_ME.
     */
  def getResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a collection of resources, including folders and documents. The only CollectionType supported is SHARED_WITH_ME.
     */
  def getResources(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetResourcesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a collection of resources, including folders and documents. The only CollectionType supported is SHARED_WITH_ME.
     */
  def getResources(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.GetResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new document object and version object. The client specifies the parent folder ID and name of the document to upload. The ID is optionally specified when creating a new version of an existing document. This is the first step to upload a document. Next, upload the document to the URL returned from the call, and then call UpdateDocumentVersion. To cancel the document upload, call AbortDocumentVersionUpload.
     */
  def initiateDocumentVersionUpload(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.InitiateDocumentVersionUploadResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new document object and version object. The client specifies the parent folder ID and name of the document to upload. The ID is optionally specified when creating a new version of an existing document. This is the first step to upload a document. Next, upload the document to the URL returned from the call, and then call UpdateDocumentVersion. To cancel the document upload, call AbortDocumentVersionUpload.
     */
  def initiateDocumentVersionUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.InitiateDocumentVersionUploadResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.InitiateDocumentVersionUploadResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new document object and version object. The client specifies the parent folder ID and name of the document to upload. The ID is optionally specified when creating a new version of an existing document. This is the first step to upload a document. Next, upload the document to the URL returned from the call, and then call UpdateDocumentVersion. To cancel the document upload, call AbortDocumentVersionUpload.
     */
  def initiateDocumentVersionUpload(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.InitiateDocumentVersionUploadRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.InitiateDocumentVersionUploadResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new document object and version object. The client specifies the parent folder ID and name of the document to upload. The ID is optionally specified when creating a new version of an existing document. This is the first step to upload a document. Next, upload the document to the URL returned from the call, and then call UpdateDocumentVersion. To cancel the document upload, call AbortDocumentVersionUpload.
     */
  def initiateDocumentVersionUpload(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.InitiateDocumentVersionUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.InitiateDocumentVersionUploadResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.InitiateDocumentVersionUploadResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes all the permissions from the specified resource.
     */
  def removeAllResourcePermissions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes all the permissions from the specified resource.
     */
  def removeAllResourcePermissions(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes all the permissions from the specified resource.
     */
  def removeAllResourcePermissions(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.RemoveAllResourcePermissionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes all the permissions from the specified resource.
     */
  def removeAllResourcePermissions(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.RemoveAllResourcePermissionsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the permission for the specified principal from the specified resource.
     */
  def removeResourcePermission(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the permission for the specified principal from the specified resource.
     */
  def removeResourcePermission(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the permission for the specified principal from the specified resource.
     */
  def removeResourcePermission(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.RemoveResourcePermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the permission for the specified principal from the specified resource.
     */
  def removeResourcePermission(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.RemoveResourcePermissionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the specified attributes of a document. The user must have access to both the document and its parent folder, if applicable.
     */
  def updateDocument(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the specified attributes of a document. The user must have access to both the document and its parent folder, if applicable.
     */
  def updateDocument(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the specified attributes of a document. The user must have access to both the document and its parent folder, if applicable.
     */
  def updateDocument(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.UpdateDocumentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the specified attributes of a document. The user must have access to both the document and its parent folder, if applicable.
     */
  def updateDocument(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.UpdateDocumentRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the status of the document version to ACTIVE.  Amazon WorkDocs also sets its document container to ACTIVE. This is the last step in a document upload, after the client uploads the document to an S3-presigned URL returned by InitiateDocumentVersionUpload. 
     */
  def updateDocumentVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the status of the document version to ACTIVE.  Amazon WorkDocs also sets its document container to ACTIVE. This is the last step in a document upload, after the client uploads the document to an S3-presigned URL returned by InitiateDocumentVersionUpload. 
     */
  def updateDocumentVersion(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the status of the document version to ACTIVE.  Amazon WorkDocs also sets its document container to ACTIVE. This is the last step in a document upload, after the client uploads the document to an S3-presigned URL returned by InitiateDocumentVersionUpload. 
     */
  def updateDocumentVersion(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.UpdateDocumentVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the status of the document version to ACTIVE.  Amazon WorkDocs also sets its document container to ACTIVE. This is the last step in a document upload, after the client uploads the document to an S3-presigned URL returned by InitiateDocumentVersionUpload. 
     */
  def updateDocumentVersion(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.UpdateDocumentVersionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the specified attributes of the specified folder. The user must have access to both the folder and its parent folder, if applicable.
     */
  def updateFolder(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the specified attributes of the specified folder. The user must have access to both the folder and its parent folder, if applicable.
     */
  def updateFolder(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the specified attributes of the specified folder. The user must have access to both the folder and its parent folder, if applicable.
     */
  def updateFolder(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.UpdateFolderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the specified attributes of the specified folder. The user must have access to both the folder and its parent folder, if applicable.
     */
  def updateFolder(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.UpdateFolderRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the Amazon WorkDocs site.
     */
  def updateUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the Amazon WorkDocs site.
     */
  def updateUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.UpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the Amazon WorkDocs site.
     */
  def updateUser(params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.UpdateUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the Amazon WorkDocs site.
     */
  def updateUser(
    params: awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.UpdateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.UpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkdocsMod.WorkDocsNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

