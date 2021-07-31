package typings.activexLibreoffice.com_.sun.star.task

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type InteractionRequestStringResolver = typings.activexLibreoffice.com_.sun.star.task.XInteractionRequestStringResolver

/**
  * A legacy (single-instance) service-variant of {@link theJobExecutor} singleton.
  * @deprecated DeprecatedUse theJobExecutor singleton instead.
  */
type JobExecutor = typings.activexLibreoffice.com_.sun.star.task.XJobExecutor

/**
  * this request specifies the mode in which the password should be asked
  *
  * It is supported by {@link InteractionHandler} service, and can be used to interact for a master password. Continuations for using with the mentioned
  * service are Abort and Approve.
  * @since OOo 1.1.2
  */
type MasterPasswordRequest = typings.activexLibreoffice.com_.sun.star.task.PasswordRequest

/**
  * This singleton is intended to allow to restart the office asynchronously.
  * @since OOo 3.3
  */
type OfficeRestartManager = typings.activexLibreoffice.com_.sun.star.task.XRestartManager

/**
  * this service is kind of storage that allows to store passwords and to retrieve already stored.
  *
  * A password can be stored for the session period or persistently. The persistent way is only possible if configuration allows to use storage. It stores
  * passwords encrypted with a super password. An interaction is used to ask a user for a super password. To allow such an interaction, an object that
  * implements {@link XInteractionHandler} interface should be provided. For this purpose {@link InteractionHandler} service can be used.
  *
  * In case no interaction handler is provided all passwords are stored for the session period. In case an interaction handler is provided, but the super
  * password interaction does not return super password ( for any reason ), {@link NoMasterException} exception is thrown to let user use non-persistent
  * way explicitly.
  */
type PasswordContainer = typings.activexLibreoffice.com_.sun.star.task.XPasswordContainer2

/**
  * An interaction request handler that uses the {@link com.sun.star.task.PasswordContainer} service to handle {@link
  * com.sun.star.ucb.AuthenticationRequest} .
  *
  * If the password container contains credentials matching the authentication request, the service implementation selects the {@link
  * com.sun.star.ucb.XInteractionSupplyAuthentication} continuation, that should be supplied with the interaction request.
  *
  * If the password container does not contain credentials matching the authentication request, the service implementation selects no continuation.
  * @since OOo 3.3
  */
type PasswordContainerInteractionHandler = typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler

/** An interaction continuation specifing to abort executing the process that issued the request. */
type XInteractionAbort = typings.activexLibreoffice.com_.sun.star.task.XInteractionContinuation

/** An interaction continuation specifying "approval". */
type XInteractionApprove = typings.activexLibreoffice.com_.sun.star.task.XInteractionContinuation

/** specifies a continuation where the user does not actually decide the question they were confronted with, but postpones the decision to a later time. */
type XInteractionAskLater = typings.activexLibreoffice.com_.sun.star.task.XInteractionContinuation

/** An interaction continuation specifying "disapproval". */
type XInteractionDisapprove = typings.activexLibreoffice.com_.sun.star.task.XInteractionContinuation

/** An interaction continuation specifing to try to re-execute the process that issued the request. */
type XInteractionRetry = typings.activexLibreoffice.com_.sun.star.task.XInteractionContinuation

/**
  * Generic job execution singleton
  *
  * Can start registered uno services on triggered events and handle there own configuration and there lifetime. Such events are simple strings which
  * meaning doesn't matter for any real service implementation of this specification. But triggered events must be available inside the configuration and
  * some Jobs or AsyncJobs must be registered for that.
  *
  * Prior to LibreOffice 4.3, this singleton was only available as a (single-instance) {@link JobExecutor} service.
  * @see Job
  * @see AsyncJob
  * @since LibreOffice 4.3
  */
type theJobExecutor = typings.activexLibreoffice.com_.sun.star.task.XJobExecutor
