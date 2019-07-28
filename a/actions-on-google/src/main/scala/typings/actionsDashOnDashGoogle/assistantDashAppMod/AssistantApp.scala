package typings.actionsDashOnDashGoogle.assistantDashAppMod

import typings.actionsDashOnDashGoogle.responseDashBuilderMod.BasicCard
import typings.actionsDashOnDashGoogle.responseDashBuilderMod.BrowseCarousel
import typings.actionsDashOnDashGoogle.responseDashBuilderMod.BrowseItem
import typings.actionsDashOnDashGoogle.responseDashBuilderMod.Carousel
import typings.actionsDashOnDashGoogle.responseDashBuilderMod.List
import typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaObject
import typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaResponse
import typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValuesNs.Status
import typings.actionsDashOnDashGoogle.responseDashBuilderMod.OptionItem
import typings.actionsDashOnDashGoogle.responseDashBuilderMod.RichResponse
import typings.actionsDashOnDashGoogle.responseDashBuilderMod.SimpleResponse
import typings.actionsDashOnDashGoogle.transactionsMod.ActionPaymentTransactionConfig
import typings.actionsDashOnDashGoogle.transactionsMod.Cart
import typings.actionsDashOnDashGoogle.transactionsMod.GooglePaymentTransactionConfig
import typings.actionsDashOnDashGoogle.transactionsMod.LineItem
import typings.actionsDashOnDashGoogle.transactionsMod.Order
import typings.actionsDashOnDashGoogle.transactionsMod.OrderUpdate
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionDecision
import typings.express.expressMod.Response
import typings.std.Date
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/assistant-app", "AssistantApp")
@js.native
class AssistantApp () extends js.Object {
  /**
    * List of built-in argument names.
    * @actionssdk
    * @dialogflow
    */
  val BuiltInArgNames: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BuiltInArgNames */ js.Any = js.native
  /**
    * List of possible conversation stages, as defined in the
    * {@link https://developers.google.com/actions/reference/conversation#Conversation|Conversation object}.
    * @actionssdk
    * @dialogflow
    * @deprecated Use {@link ConversationTypes} instead.
    */
  val ConversationStages: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConversationTypes */ js.Any = js.native
  /**
    * List of possible conversation types, as defined in the
    * {@link https://developers.google.com/actions/reference/conversation#Conversation|Conversation object}.
    * @actionssdk
    * @dialogflow
    */
  val ConversationTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConversationTypes */ js.Any = js.native
  /**
    * SKU (Stock Keeping Units) types for Play Package Entitlements.
    */
  val EntitlementSkuTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EntitlementSkuTypes */ js.Any = js.native
  /**
    * Values related to supporting {@link ImageDisplays}.
    */
  val ImageDisplays: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageDisplays */ js.Any = js.native
  /**
    * List of possible user input types.
    * @actionssdk
    * @dialogflow
    */
  val InputTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputTypes */ js.Any = js.native
  /**
    * Values related to supporting {@link Media}.
    */
  val Media: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaValues */ js.Any = js.native
  /**
    * List of possible sign in result status values.
    * @actionssdk
    * @dialogflow
    */
  val SignInStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SignInStatus */ js.Any = js.native
  /**
    * List of standard intents that the app provides.
    * @actionssdk
    * @dialogflow
    */
  val StandardIntents: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StandardIntents */ js.Any = js.native
  /**
    * List of supported permissions the app supports.
    * @actionssdk
    * @dialogflow
    */
  val SupportedPermissions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SupportedPermissions */ js.Any = js.native
  /**
    * List of surface capabilities supported by the app.
    * @actionssdk
    * @dialogflow
    */
  val SurfaceCapabilities: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SurfaceCapabilities */ js.Any = js.native
  /**
    * Possible update trigger time context frequencies.
    */
  val TimeContextFrequency: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TimeContextFrequency */ js.Any = js.native
  /**
    * Values related to supporting {@link Transactions}.
    */
  val Transactions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TransactionValues */ js.Any = js.native
  /**
    * The session data in JSON format.
    */
  var data: js.Object = js.native
  /**
    * The session state.
    */
  var state: String = js.native
  /**
    * The data persistent across sessions in JSON format.
    * It exists in the same context as getUser().userId
    *
    * @example
    * // Actions SDK
    * const app = new ActionsSdkApp({request: request, response: response});
    * app.userStorage.someProperty = 'someValue';
    * // Dialogflow
    * const app = new DialogflowApp({request: request, response: response});
    * app.userStorage.someProperty = 'someValue';
    */
  var userStorage: js.Object = js.native
  /**
    * Asks user for a confirmation.
    *
    * @example
    * const app = new DialogflowApp({ request, response });
    * const WELCOME_INTENT = 'input.welcome';
    * const CONFIRMATION = 'confirmation';
    *
    * function welcomeIntent (app) {
    *   app.askForConfirmation('Are you sure you want to do that?');
    * }
    *
    * function confirmation (app) {
    *   if (app.getUserConfirmation()) {
    *     app.tell('Great! I\'m glad you want to do it!');
    *   } else {
    *     app.tell('That\'s okay. Let\'s not do it now.');
    *   }
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(WELCOME_INTENT, welcomeIntent);
    * actionMap.set(CONFIRMATION, confirmation);
    * app.handleRequest(actionMap);
    *
    * @param prompt The confirmation prompt presented to the user to
    *     query for an affirmative or negative response. If undefined or null,
    *     Google will use a generic yes/no prompt.
    * @param dialogState JSON object the app uses to hold dialog state that
    *     will be circulated back by Assistant. Used in {@link ActionsSdkApp}.
    * @return HTTP response.
    * @actionssdk
    * @dialogflow
    */
  def askForConfirmation(): Response | Null = js.native
  def askForConfirmation(prompt: String): Response | Null = js.native
  def askForConfirmation(prompt: String, dialogState: js.Object): Response | Null = js.native
  /**
    * Asks user for a timezone-agnostic date and time.
    *
    * @example
    * const app = new DialogflowApp({ request, response });
    * const WELCOME_INTENT = 'input.welcome';
    * const DATETIME = 'datetime';
    *
    * function welcomeIntent (app) {
    *   app.askForDateTime('When do you want to come in?',
    *     'Which date works best for you?',
    *     'What time of day works best for you?');
    * }
    *
    * function datetime (app) {
    *   app.tell({speech: 'Great see you at your appointment!',
    *     displayText: 'Great, we will see you on '
    *     + app.getDateTime().date.month
    *     + '/' + app.getDateTime().date.day
    *     + ' at ' + app.getDateTime().time.hours
    *     + (app.getDateTime().time.minutes || '')});
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(WELCOME_INTENT, welcomeIntent);
    * actionMap.set(DATETIME, datetime);
    * app.handleRequest(actionMap);
    *
    * @param initialPrompt The initial prompt used to ask for a
    *     date and time. If undefined or null, Google will use a generic
    *     prompt.
    * @param datePrompt The prompt used to specifically ask for the
    *     date if not provided by user. If undefined or null, Google will use a
    *     generic prompt.
    * @param timePrompt The prompt used to specifically ask for the
    *     time if not provided by user. If undefined or null, Google will use a
    *     generic prompt.
    * @param dialogState JSON object the app uses to hold dialog state that
    *     will be circulated back by Assistant. Used in {@link ActionsSdkApp}.
    * @return HTTP response.
    * @actionssdk
    * @dialogflow
    */
  def askForDateTime(): Response | Null = js.native
  def askForDateTime(initialPrompt: String): Response | Null = js.native
  def askForDateTime(initialPrompt: String, datePrompt: String): Response | Null = js.native
  def askForDateTime(initialPrompt: String, datePrompt: String, timePrompt: String): Response | Null = js.native
  def askForDateTime(initialPrompt: String, datePrompt: String, timePrompt: String, dialogState: js.Object): Response | Null = js.native
  /**
    * Asks user for delivery address.
    *
    * @example
    * // For DialogflowApp:
    * const app = new DialogflowApp({request, response});
    * const WELCOME_INTENT = 'input.welcome';
    * const DELIVERY_INTENT = 'delivery.address';
    *
    * function welcomeIntent (app) {
    *   app.askForDeliveryAddress('To make sure I can deliver to you');
    * }
    *
    * function addressIntent (app) {
    *   const postalCode = app.getDeliveryAddress().postalAddress.postalCode;
    *   if (isInDeliveryZone(postalCode)) {
    *     app.tell('Great looks like you\'re in our delivery area!');
    *   } else {
    *     app.tell('I\'m sorry it looks like we can\'t deliver to you.');
    *   }
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(WELCOME_INTENT, welcomeIntent);
    * actionMap.set(DELIVERY_INTENT, addressIntent);
    * app.handleRequest(actionMap);
    *
    * // For ActionsSdkApp:
    * const app = new ActionsSdkApp({request, response});
    * const WELCOME_INTENT = app.StandardIntents.MAIN;
    * const DELIVERY_INTENT = app.StandardIntents.DELIVERY_ADDRESS;
    *
    * function welcomeIntent (app) {
    *   app.askForDeliveryAddress('To make sure I can deliver to you');
    * }
    *
    * function addressIntent (app) {
    *   const postalCode = app.getDeliveryAddress().postalAddress.postalCode;
    *   if (isInDeliveryZone(postalCode)) {
    *     app.tell('Great looks like you\'re in our delivery area!');
    *   } else {
    *     app.tell('I\'m sorry it looks like we can\'t deliver to you.');
    *   }
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(WELCOME_INTENT, welcomeIntent);
    * actionMap.set(DELIVERY_INTENT, addressIntent);
    * app.handleRequest(actionMap);
    *
    * @param reason Reason given to user for asking delivery address.
    * @param dialogState JSON object the app uses to hold dialog state that
    *     will be circulated back by Assistant.
    * @return HTTP response.
    * @actionssdk
    * @dialogflow
    */
  def askForDeliveryAddress(reason: String): Response | Null = js.native
  def askForDeliveryAddress(reason: String, dialogState: js.Object): Response | Null = js.native
  /**
    * Requests the user to switch to another surface during the conversation.
    * Works only for en-* locales.
    *
    * @example
    * const app = new DialogflowApp({ request, response });
    * const WELCOME_INTENT = 'input.welcome';
    * const SHOW_IMAGE = 'show.image';
    *
    * function welcomeIntent (app) {
    *   if (app.hasSurfaceCapability(app.SurfaceCapabilities.SCREEN_OUTPUT)) {
    *     showPicture(app);
    *   } else if (app.hasAvailableSurfaceCapabilities(app.SurfaceCapabilities.SCREEN_OUTPUT)) {
    *     app.askForNewSurface('To show you an image',
    *       'Check out this image',
    *       [app.SurfaceCapabilities.SCREEN_OUTPUT]
    *     );
    *   } else {
    *     app.tell('This part of the app only works on screen devices. Sorry about that');
    *   }
    * }
    *
    * function showImage (app) {
    *   if (!app.isNewSurface()) {
    *     app.tell('Ok, I understand. You don't want to see pictures. Bye');
    *   } else {
    *     showPicture(app, pictureType);
    *   }
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(WELCOME_INTENT, welcomeIntent);
    * actionMap.set(SHOW_IMAGE, showImage);
    * app.handleRequest(actionMap);
    *
    * @param context Context why new surface is requested; it's the TTS
    *     prompt prefix (action phrase) we ask the user.
    * @param notificationTitle Title of the notification appearing on
    *     new surface device.
    * @param capabilities The list of capabilities required in
    *     the surface.
    * @param dialogState JSON object the app uses to hold dialog state that
    *     will be circulated back by Assistant. Used in {@link ActionsSdkApp}.
    * @return HTTP response.
    * @dialogflow
    * @actionssdk
    */
  def askForNewSurface(
    context: String,
    notificationTitle: String,
    capabilities: js.Array[typings.actionsDashOnDashGoogle.assistantDashAppMod.SurfaceCapabilities]
  ): Response | Null = js.native
  def askForNewSurface(
    context: String,
    notificationTitle: String,
    capabilities: js.Array[typings.actionsDashOnDashGoogle.assistantDashAppMod.SurfaceCapabilities],
    dialogState: js.Object
  ): Response | Null = js.native
  /**
    * Asks the Assistant to guide the user to grant a permission. For example,
    * if you want your app to get access to the user's name, you would invoke
    * the askForPermission method with a context containing the reason for the request,
    * and the AssistantApp.SupportedPermissions.NAME permission. With this, the Assistant will ask
    * the user, in your agent's voice, the following: '[Context with reason for the request],
    * I'll just need to get your name from Google, is that OK?'.
    *
    * Once the user accepts or denies the request, the Assistant will fire another intent:
    * app.StandardIntents.PERMISSION with a boolean argument: app.BuiltInArgNames.PERMISSION_GRANTED
    * and, if granted, the information that you requested.
    *
    * Read more:
    *
    * * {@link https://developers.google.com/actions/reference/conversation#ExpectedIntent|
    *       Supported Permissions}
    * * Check if the permission has been granted with
    *       {@link AssistantApp#isPermissionGranted|isPermissionsGranted}
    * * {@link AssistantApp#getDeviceLocation|getDeviceLocation}
    * * {@link AssistantApp#getUserName|getUserName}
    *
    * @example
    * const app = new DialogflowApp({request: req, response: res});
    * const REQUEST_PERMISSION_ACTION = 'request_permission';
    * const GET_RIDE_ACTION = 'get_ride';
    *
    * function requestPermission (app) {
    *   const permission = app.SupportedPermissions.NAME;
    *   app.askForPermission('To pick you up', permission);
    * }
    *
    * function sendRide (app) {
    *   if (app.isPermissionGranted()) {
    *     const displayName = app.getUserName().displayName;
    *     app.tell('I will tell your driver to pick up ' + displayName);
    *   } else {
    *     // Response shows that user did not grant permission
    *     app.tell('Sorry, I could not figure out who to pick up.');
    *   }
    * }
    * const actionMap = new Map();
    * actionMap.set(REQUEST_PERMISSION_ACTION, requestPermission);
    * actionMap.set(GET_RIDE_ACTION, sendRide);
    * app.handleRequest(actionMap);
    *
    * @param context Context why permission is asked; it's the TTS
    *     prompt prefix (action phrase) we ask the user.
    * @param permission One of the permissions Assistant supports, each of
    *     which comes from AssistantApp.SupportedPermissions.
    * @param dialogState JSON object the app uses to hold dialog state that
    *     will be circulated back by Assistant.
    * @return A response is sent to the Assistant to ask for the user's permission;
    *     for any invalid input, we return null.
    * @actionssdk
    * @dialogflow
    */
  def askForPermission(context: String, permission: String): Response | Null = js.native
  def askForPermission(context: String, permission: String, dialogState: js.Object): Response | Null = js.native
  /**
    * Equivalent to {@link AssistantApp#askForPermission|askForPermission},
    * but allows you to prompt the user for more than one permission at once.
    *
    * Notes:
    *
    * * The order in which you specify the permission prompts does not matter -
    *   it is controlled by the Assistant to provide a consistent user experience.
    * * The user will be able to either accept all permissions at once, or none.
    *   If you wish to allow them to selectively accept one or other, make several
    *   dialog turns asking for each permission independently with askForPermission.
    * * Asking for DEVICE_COARSE_LOCATION and DEVICE_PRECISE_LOCATION at once is
    *   equivalent to just asking for DEVICE_PRECISE_LOCATION
    *
    * @example
    * const app = new DialogflowApp({request: req, response: res});
    * const REQUEST_PERMISSION_ACTION = 'request_permission';
    * const GET_RIDE_ACTION = 'get_ride';
    *
    * function requestPermission (app) {
    *   const permission = [
    *     app.SupportedPermissions.NAME,
    *     app.SupportedPermissions.DEVICE_PRECISE_LOCATION
    *   ];
    *   app.askForPermissions('To pick you up', permissions);
    * }
    *
    * function sendRide (app) {
    *   if (app.isPermissionGranted()) {
    *     const displayName = app.getUserName().displayName;
    *     const address = app.getDeviceLocation().address;
    *     app.tell('I will tell your driver to pick up ' + displayName +
    *         ' at ' + address);
    *   } else {
    *     // Response shows that user did not grant permission
    *     app.tell('Sorry, I could not figure out where to pick you up.');
    *   }
    * }
    * const actionMap = new Map();
    * actionMap.set(REQUEST_PERMISSION_ACTION, requestPermission);
    * actionMap.set(GET_RIDE_ACTION, sendRide);
    * app.handleRequest(actionMap);
    *
    * @param context Context why the permission is being asked; it's the TTS
    *     prompt prefix (action phrase) we ask the user.
    * @param permissions Array of permissions App supports, each of
    *     which comes from AssistantApp.SupportedPermissions.
    * @param dialogState JSON object the app uses to hold dialog state that
    *     will be circulated back by Assistant. Used in {@link ActionsSdkApp}.
    * @return A response is sent to Assistant to ask for the user's permission.
    *     For any invalid input, we return null.
    * @actionssdk
    * @dialogflow
    */
  def askForPermissions(context: String, permissions: js.Array[String]): Response | Null = js.native
  def askForPermissions(context: String, permissions: js.Array[String], dialogState: js.Object): Response | Null = js.native
  /**
    * Asks user to provide a geo-located place, possibly using contextual information,
    * like a store near the user's location or a contact's address.
    *
    * Developer provides custom text prompts to tailor the request handled by Google.
    *
    * @example
    * // For DialogflowApp:
    *
    * // Dialogflow Actions
    * const Actions = {
    *   WELCOME: 'input.welcome',
    *   PLACE: 'get.place' // Create Dialogflow Action with actions_intent_PLACE event
    * };
    *
    * const app = new DialogflowApp({request, response});
    *
    * function handleWelcome (app) {
    *   const requestPrompt = 'Where do you want to get picked up?';
    *   const permissionContext = 'To find a place to pick you up';
    *   app.askForPlace(requestPrompt, permissionContext);
    * }
    *
    * function handlePlace (app) {
    *   const place = app.getPlace();
    *   if (place) {
    *     app.tell(`Ah, I see. You want to get picked up at ${place.address}`);
    *   } else {
    *     app.tell(`Sorry, I couldn't find where you want to get picked up`);
    *   }
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(Actions.WELCOME, handleWelcome);
    * actionMap.set(Actions.PLACE, handlePlace);
    * app.handleRequest(actionMap);
    *
    * // For ActionsSdkApp:
    * const app = new ActionsSdkApp({ request, response });
    *
    * function handleWelcome (app) {
    *   const requestPrompt = 'Where do you want to get picked up?';
    *   const permissionContext = 'To find a place to pick you up';
    *   app.askForPlace(requestPrompt, permissionContext);
    * }
    *
    * function handlePlace (app) {
    *   const place = app.getPlace();
    *   if (place) {
    *     app.tell(`Ah, I see. You want to get picked up at ${place.address}`);
    *   } else {
    *     app.tell(`Sorry, I couldn't find where you want to get picked up`);
    *   }
    * }
    *
    * const actionsMap = new Map();
    * actionsMap.set(app.StandardIntents.MAIN, handleWelcome);
    * actionsMap.set(app.StandardIntents.PLACE, handlePlace);
    * app.handleRequest(actionsMap);
    *
    * @param requestPrompt This is the initial response by location sub-dialog.
    *     For example: "Where do you want to get picked up?"
    * @param permissionContext This is the context for seeking permissions.
    *     For example: "To find a place to pick you up"
    *     Prompt to user: "*To find a place to pick you up*, I just need to check your location.
    *       Can I get that from Google?".
    * @param dialogState JSON object the app uses to hold dialog state that
    *     will be circulated back by Assistant.
    * @return HTTP response.
    * @actionssdk
    * @dialogflow
    */
  def askForPlace(requestPrompt: String, permissionContext: String): Response | Null = js.native
  def askForPlace(requestPrompt: String, permissionContext: String, dialogState: js.Object): Response | Null = js.native
  /**
    * Hands the user off to a web sign in flow. App sign in and OAuth credentials
    * are set in the {@link https://console.actions.google.com|Actions Console}.
    * Retrieve the access token in subsequent intents using
    * app.getUser().accessToken.
    * Works only for en-* locales.
    *
    * @example
    * const app = new DialogflowApp({ request, response });
    * const WELCOME_INTENT = 'input.welcome';
    * const SIGN_IN = 'sign.in';
    *
    * function welcomeIntent (app) {
    *   app.askForSignIn();
    * }
    *
    * function signIn (app) {
    *   if (app.getSignInStatus() === app.SignInstatus.OK) {
    *     let accessToken = app.getUser().accessToken;
    *     app.ask('Great, thanks for signing in!');
    *   } else {
    *     app.ask('I won\'t be able to save your data, but let\'s continue!');
    *   }
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(WELCOME_INTENT, welcomeIntent);
    * actionMap.set(SIGN_IN, signIn);
    * app.handleRequest(actionMap);
    *
    * @param dialogState JSON object the app uses to hold dialog state that
    *     will be circulated back by Assistant. Used in {@link ActionsSdkApp}.
    * @return HTTP response.
    * @actionssdk
    * @dialogflow
    */
  def askForSignIn(): Response | Null = js.native
  def askForSignIn(dialogState: js.Object): Response | Null = js.native
  /**
    * Asks user to confirm transaction information.
    *
    * @example
    * const app = new DialogflowApp({request: request, response: response});
    * const WELCOME_INTENT = 'input.welcome';
    * const TXN_COMPLETE = 'txn.complete';
    *
    * let transactionConfig = {
    *     deliveryAddressRequired: false,
    *     type: app.Transactions.PaymentType.BANK,
    *     displayName: 'Checking-1234'
    * };
    *
    * let order = app.buildOrder();
    * // fill order cart
    *
    * function welcomeIntent (app) {
    *   app.askForTransaction(order, transactionConfig);
    * }
    *
    * function txnComplete (app) {
    *   // respond with order update
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(WELCOME_INTENT, welcomeIntent);
    * actionMap.set(TXN_COMPLETE, txnComplete);
    * app.handleRequest(actionMap);
    *
    * @param order Order built with buildOrder().
    * @param
    *     transactionConfig Configuration for the transaction. Includes payment
    *     options and order options.
    * @param dialogState JSON object the app uses to hold dialog state that
    *     will be circulated back by Assistant. Used in {@link ActionsSdkApp}.
    * @return HTTP response
    * @dialogflow
    */
  def askForTransactionDecision(order: Order, transactionConfig: ActionPaymentTransactionConfig): Response | Null = js.native
  def askForTransactionDecision(order: Order, transactionConfig: ActionPaymentTransactionConfig, dialogState: js.Object): Response | Null = js.native
  def askForTransactionDecision(order: Order, transactionConfig: GooglePaymentTransactionConfig): Response | Null = js.native
  def askForTransactionDecision(order: Order, transactionConfig: GooglePaymentTransactionConfig, dialogState: js.Object): Response | Null = js.native
  /**
    * Checks whether user is in transactable state.
    *
    * @example
    * const app = new DialogflowApp({request: request, response: response});
    * const WELCOME_INTENT = 'input.welcome';
    * const TXN_REQ_COMPLETE = 'txn.req.complete';
    *
    * let transactionConfig = {
    *     deliveryAddressRequired: false,
    *     type: app.Transactions.PaymentType.BANK,
    *     displayName: 'Checking-1234'
    * };
    * function welcomeIntent (app) {
    *   app.askForTransactionRequirements(transactionConfig);
    * }
    *
    * function txnReqCheck (app) {
    *   if (app.getTransactionRequirementsResult() === app.Transactions.ResultType.OK) {
    *     // continue cart building flow
    *   } else {
    *     // don't continue cart building
    *   }
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(WELCOME_INTENT, welcomeIntent);
    * actionMap.set(TXN_REQ_COMPLETE, txnReqCheck);
    * app.handleRequest(actionMap);
    *
    * @param
    *     transactionConfig Configuration for the transaction. Includes payment
    *     options and order options. Optional if order has no payment or
    *     delivery.
    * @param dialogState JSON object the app uses to hold dialog state that
    *     will be circulated back by Assistant. Used in {@link ActionsSdkApp}.
    * @return HTTP response.
    * @actionssdk
    * @dialogflow
    */
  def askForTransactionRequirements(): Response | Null = js.native
  def askForTransactionRequirements(transactionConfig: ActionPaymentTransactionConfig): Response | Null = js.native
  def askForTransactionRequirements(transactionConfig: ActionPaymentTransactionConfig, dialogState: js.Object): Response | Null = js.native
  def askForTransactionRequirements(transactionConfig: GooglePaymentTransactionConfig): Response | Null = js.native
  def askForTransactionRequirements(transactionConfig: GooglePaymentTransactionConfig, dialogState: js.Object): Response | Null = js.native
  /**
    * Prompts the user for permission to send proactive updates at any time.
    *
    * @example
    * const app = new DialogflowApp({request, response});
    * const REQUEST_PERMISSION_ACTION = 'request.permission';
    * const PERMISSION_REQUESTED = 'permission.requested';
    * const SHOW_IMAGE = 'show.image';
    *
    * function requestPermission (app) {
    *   app.askForUpdatePermission('show.image', [
    *     {
    *       name: 'image_to_show',
    *       textValue: 'image_type_1'
    *     }
    *   ]);
    * }
    *
    * function checkPermission (app) {
    *   if (app.isPermissionGranted()) {
    *     app.tell(`Great, I'll send an update whenever I notice a change`);
    *   } else {
    *     // Response shows that user did not grant permission
    *     app.tell('Alright, just let me know whenever you need the weather!');
    *   }
    * }
    *
    * function showImage (app) {
    *   showPicture(app.getArgument('image_to_show'));
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(REQUEST_PERMISSION_ACTION, requestPermission);
    * actionMap.set(PERMISSION_REQUESTED, checkPermission);
    * actionMap.set(SHOW_IMAGE, showImage);
    * app.handleRequest(actionMap);
    *
    * @param intent If using Dialogflow, the action name of the intent
    *     to be triggered when the update is received. If using Actions SDK, the
    *     intent name to be triggered when the update is received.
    * @param intentArguments The necessary arguments
    *     to fulfill the intent triggered on update. These can be retrieved using
    *     {@link AssistantApp#getArgument}.
    * @param dialogState JSON object the app uses to hold dialog state that
    *     will be circulated back by Assistant. Used in {@link ActionsSdkApp}.
    * @return A response is sent to Assistant to ask for the user's permission.
    *     For any invalid input, we return null.
    * @actionssdk
    * @dialogflow
    */
  def askForUpdatePermission(intent: String, intentArguments: js.Array[IntentArgument]): Response | Null = js.native
  def askForUpdatePermission(intent: String, intentArguments: js.Array[IntentArgument], dialogState: js.Object): Response | Null = js.native
  /**
    * Requests the user to transfer to a linked out Android app intent. Using this feature
    * requires verifying the linked app in the (Actions console)[console.actions.google.com].
    *
    * @example
    * // For DialogflowApp:
    *
    * // Dialogflow Actions
    * const WELCOME_ACTION = 'input.welcome';
    * const HANDLE_LINK = 'handle.link'; // Create Dialogflow Action with actions_intent_LINK event
    *
    * const app = new DialogflowApp({ request, response });
    *
    * console.log('Request headers: ' + JSON.stringify(request.headers));
    * console.log('Request body: ' + JSON.stringify(request.body));
    *
    * function requestLink (app) {
    *   app.askToDeepLink('Great! Looks like we can do that in the app.', 'Google',
    *     'example://gizmos', 'com.example.gizmos', 'handle this for you');
    * }
    *
    * function handleLink (app) {
    *   const linkStatus = app.getLinkStatus();
    *   app.tell('Okay maybe we can take care of that another time.');
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(WELCOME_ACTION, requestLink);
    * actionMap.set(HANDLE_LINK, handleLink);
    * app.handleRequest(actionMap);
    *
    * // For ActionsSdkApp
    * const app = new ActionsSdkApp({ request, response });
    *
    * console.log('Request headers: ' + JSON.stringify(request.headers));
    * console.log('Request body: ' + JSON.stringify(request.body));
    *
    * function requestLink (app) {
    *   app.askToDeepLink('Great! Looks like we can do that in the app.', 'Google',
    *     'example://gizmos', 'com.example.gizmos', 'handle this for you.');
    * }
    *
    * function handleLink (app) {
    *   const linkStatus = app.getLinkStatus();
    *   app.tell('Okay maybe we can take care of that another time.');
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(app.StandardIntents.MAIN, requestLink);
    * actionMap.set(app.StandardIntents.LINK, handleLink);
    * app.handleRequest(actionMap);
    *
    * @param prompt A simple response to prepend to the link request.
    * @param destinationName The name of the link destination.
    * @param url URL of Android deep link.
    * @param packageName Android app package name to which to link.
    * @param reason The reason to transfer the user. This may be appended to a
    *     Google-specified prompt.
    * @param dialogState JSON object the app uses to hold dialog state that
    *     will be circulated back by Assistant. Used in {@link ActionsSdkApp}.
    * @return HTTP response.
    * @dialogflow
    * @actionssdk
    */
  def askToDeepLink(prompt: String, destinationName: String, url: String, packageName: String): Response | Null = js.native
  def askToDeepLink(prompt: String, destinationName: String, url: String, packageName: String, reason: String): Response | Null = js.native
  def askToDeepLink(
    prompt: String,
    destinationName: String,
    url: String,
    packageName: String,
    reason: String,
    dialogState: js.Object
  ): Response | Null = js.native
  def askToDeepLink(
    prompt: String,
    destinationName: String,
    url: String,
    packageName: String,
    reason: Null,
    dialogState: js.Object
  ): Response | Null = js.native
  def askToDeepLink(prompt: Null, destinationName: String, url: String, packageName: String): Response | Null = js.native
  def askToDeepLink(prompt: Null, destinationName: String, url: String, packageName: String, reason: String): Response | Null = js.native
  def askToDeepLink(
    prompt: Null,
    destinationName: String,
    url: String,
    packageName: String,
    reason: String,
    dialogState: js.Object
  ): Response | Null = js.native
  def askToDeepLink(
    prompt: Null,
    destinationName: String,
    url: String,
    packageName: String,
    reason: Null,
    dialogState: js.Object
  ): Response | Null = js.native
  def askToDeepLink(prompt: SimpleResponse, destinationName: String, url: String, packageName: String): Response | Null = js.native
  def askToDeepLink(prompt: SimpleResponse, destinationName: String, url: String, packageName: String, reason: String): Response | Null = js.native
  def askToDeepLink(
    prompt: SimpleResponse,
    destinationName: String,
    url: String,
    packageName: String,
    reason: String,
    dialogState: js.Object
  ): Response | Null = js.native
  def askToDeepLink(
    prompt: SimpleResponse,
    destinationName: String,
    url: String,
    packageName: String,
    reason: Null,
    dialogState: js.Object
  ): Response | Null = js.native
  /**
    * Requests the user to register for daily updates.
    *
    * @example
    * const app = new DialogflowApp({ request, response });
    * const WELCOME_INTENT = 'input.welcome';
    * const SHOW_IMAGE = 'show.image';
    *
    * function welcomeIntent (app) {
    *   app.askToRegisterDailyUpdate('show.image', [
    *     {
    *       name: 'image_to_show',
    *       textValue: 'image_type_1'
    *     }
    *   ]);
    * }
    *
    * function showImage (app) {
    *   showPicture(app.getArgument('image_to_show'));
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(WELCOME_INTENT, welcomeIntent);
    * actionMap.set(SHOW_IMAGE, showImage);
    * app.handleRequest(actionMap);
    *
    * @param intent If using Dialogflow, the action name of the intent
    *     to be triggered when the update is received. If using Actions SDK, the
    *     intent name to be triggered when the update is received.
    * @param intentArguments The necessary arguments
    *     to fulfill the intent triggered on update. These can be retrieved using
    *     {@link AssistantApp#getArgument}.
    * @param dialogState JSON object the app uses to hold dialog state that
    *     will be circulated back by Assistant. Used in {@link ActionsSdkApp}.
    * @return HTTP response.
    * @dialogflow
    * @actionssdk
    */
  def askToRegisterDailyUpdate(intent: String, intentArguments: js.Array[IntentArgument]): Response | Null = js.native
  def askToRegisterDailyUpdate(intent: String, intentArguments: js.Array[IntentArgument], dialogState: js.Object): Response | Null = js.native
  /**
    * Constructs BasicCard with chainable property setters.
    *
    * @param bodyText Body text of the card. Can be set using setTitle
    *     instead.
    * @return Constructed BasicCard.
    */
  def buildBasicCard(): BasicCard = js.native
  def buildBasicCard(bodyText: String): BasicCard = js.native
  /**
    * Constructs a Browse Carousel with chainable property setters.
    *
    * @return Constructed Browse Carousel.
    */
  def buildBrowseCarousel(): BrowseCarousel = js.native
  /**
    * Constructs BrowseItem for the Browse Carousel with chainable property setters.
    *
    * @param title The displayed title of the Browse Carousel card.
    * @param url The URL linked to by clicking the card.
    * @return Constructed BrowseItem.
    */
  def buildBrowseItem(): BrowseItem = js.native
  def buildBrowseItem(title: String): BrowseItem = js.native
  def buildBrowseItem(title: String, url: String): BrowseItem = js.native
  /**
    * Constructs Carousel with chainable property setters.
    *
    * @return Constructed Carousel.
    */
  def buildCarousel(): Carousel = js.native
  /**
    * Constructs Cart with chainable property setters.
    *
    * @param cartId Unique identifier for the cart.
    * @return Constructed Cart.
    */
  def buildCart(): Cart = js.native
  def buildCart(cartId: String): Cart = js.native
  /**
    * Constructs LineItem with chainable property setters.
    * Because of a previous bug, the parameters are swapped compared to
    * the LineItem constructor to prevent a breaking change.
    *
    * @param name Name of the line item.
    * @param id Unique identifier for the item.
    * @return Constructed LineItem.
    */
  def buildLineItem(name: String, id: String): LineItem = js.native
  /**
    * Constructs List with chainable property setters.
    *
    * @param title A title to set for a new List.
    * @return Constructed List.
    */
  def buildList(): List = js.native
  def buildList(title: String): List = js.native
  /**
    * Constructs MediaObject with chainable property setters.
    *
    * @param name Name of media file.
    * @param contentUrl Location of media file.
    * @return Constructed MediaObject.
    */
  def buildMediaObject(name: String, contentUrl: String): MediaObject = js.native
  // ---------------------------------------------------------------------------
  //                   Media Builders
  // ---------------------------------------------------------------------------
  /**
    * Constructs Media Response with chainable property setters.
    *
    * @return Constructed Media Response.
    */
  def buildMediaResponse(): MediaResponse = js.native
  /**
    * Constructs OptionItem with chainable property setters.
    *
    * @param key A unique key to identify this option. This key will
    *     be returned as an argument in the resulting actions.intent.OPTION
    *     intent.
    * @param synonyms A list of synonyms which the user may
    *     use to identify this option instead of the option key.
    * @return Constructed OptionItem.
    */
  def buildOptionItem(): OptionItem = js.native
  def buildOptionItem(key: String): OptionItem = js.native
  def buildOptionItem(key: String, synonyms: String): OptionItem = js.native
  def buildOptionItem(key: String, synonyms: js.Array[String]): OptionItem = js.native
  // ---------------------------------------------------------------------------
  //                   Transaction Builders
  // ---------------------------------------------------------------------------
  /**
    * Constructs Order with chainable property setters.
    *
    * @param orderId Unique identifier for the order.
    * @return Constructed Order.
    */
  def buildOrder(orderId: String): Order = js.native
  /**
    * Constructs OrderUpdate with chainable property setters.
    *
    * @param orderId Unique identifier of the order.
    * @param isGoogleOrderId True if the order ID is provided by
    *     Google. False if the order ID is app provided.
    * @return Constructed OrderUpdate.
    */
  def buildOrderUpdate(orderId: String, isGoogleOrderId: Boolean): OrderUpdate = js.native
  // ---------------------------------------------------------------------------
  //                   Response Builders
  // ---------------------------------------------------------------------------
  /**
    * Constructs RichResponse with chainable property setters.
    *
    * @param richResponse RichResponse to clone.
    * @return Constructed RichResponse.
    */
  def buildRichResponse(): RichResponse = js.native
  def buildRichResponse(richResponse: RichResponse): RichResponse = js.native
  /**
    * Returns the set of other available surfaces for the user.
    *
    * @return Empty if no available surfaces.
    * @actionssdk
    * @dialogflow
    */
  def getAvailableSurfaces(): js.Array[Surface] = js.native
  /**
    * Gets user provided date and time. Use after askForDateTime.
    *
    * @return Date and time given by the user. Null if no user
    *     date and time given.
    * @dialogflow
    * @actionssdk
    */
  def getDateTime(): DateTime = js.native
  /**
    * Gets order delivery address. Only use after calling askForDeliveryAddress.
    *
    * @return Delivery address information. Null if user
    *     denies permission, or no address given.
    * @dialogflow
    * @actionssdk
    */
  def getDeliveryAddress(): Location = js.native
  /**
    * If granted permission to device's location in previous intent, returns device's
    * location (see {@link AssistantApp#askForPermissions|askForPermissions}).
    * If device info is unavailable, returns null.
    *
    * @example
    * const app = new DialogflowApp({request: req, response: res});
    * // or
    * const app = new ActionsSdkApp({request: req, response: res});
    * app.askForPermission("To get you a ride",
    *   app.SupportedPermissions.DEVICE_PRECISE_LOCATION);
    * // ...
    * // In response handler for permissions fallback intent:
    * if (app.isPermissionGranted()) {
    *   sendCarTo(app.getDeviceLocation().coordinates);
    * }
    *
    * @return Null if location permission is not granted.
    * @actionssdk
    * @dialogflow
    */
  def getDeviceLocation(): DeviceLocation = js.native
  /**
    * Gets type of input used for this request.
    * @return One of AssistantApp.InputTypes.
    *     Null if no input type given.
    * @dialogflow
    * @actionssdk
    */
  def getInputType(): Double | String = js.native
  /**
    * Get the user's last seen time as a Date object.
    * Not supported in V1.
    *
    * @example
    * const app = new DialogflowApp({request, response});
    * const lastSeen = app.getLastSeen();
    *
    * @return User's last seen date or null if never seen
    */
  def getLastSeen(): Date | Null = js.native
  /**
    * Returns the status of a link request. Used with
    * {@link AssistantApp#askToDeepLink}
    *
    * @return The status code of the request to link.
    * @dialogflow
    * @actionssdk
    */
  def getLinkStatus(): Double = js.native
  /**
    * Get status of MEDIA_STATUS intent.
    *
    * @example
    * const app = new DialogflowApp({request: request, response: response});
    *
    * function mediaStatusIntent (app) {
    *   const status = app.getMediaStatus();
    *   if (status === app.Media.Status.FINISHED) {
    *     app.tell('Oh, I see you are done playing the media!');
    *   } else {
    *     app.tell(`I don't understand the current media status: ${status}`);
    *   }
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(app.StandardIntents.MEDIA_STATUS, mediaStatusIntent);
    * app.handleRequest(actionMap);
    *
    * @return Result of media status intent.
    * @dialogflow
    * @actionssdk
    */
  def getMediaStatus(): Status | Null = js.native
  /**
    * Get the the list of all digital goods that your user purchased from
    * your published Android apps. To enable this feature, see the instructions
    * in the (documentation)[https://developers.google.com/actions/identity/digital-goods].
    *
    * @example
    * const app = new DialogflowApp({request, response});
    * const packageEntitlements = app.getPackageEntitlements();
    *
    * @return The list of digital goods purchased by the user in
    *     any verified Android app package. Null if no Package Entitlements present in the request.
    */
  def getPackageEntitlements(): js.Array[PackageEntitlement] | Null = js.native
  /**
    * Gets the user provided place. Use after askForPlace.
    *
    * @return Place information given by the user. Null if no place given.
    * @dialogflow
    * @actionssdk
    */
  def getPlace(): Place | Null = js.native
  /**
    * Returns the number of subsequent reprompts related to silent input from the
    * user. This should be used along with the NO_INPUT intent to reprompt the
    * user for input in cases where the Google Assistant could not pick up any
    * speech.
    *
    * @example
    * const app = new ActionsSdkApp({request, response});
    *
    * function welcome (app) {
    *   app.ask('Welcome to your app!');
    * }
    *
    * function noInput (app) {
    *   if (app.getRepromptCount() === 0) {
    *     app.ask(`What was that?`);
    *   } else if (app.getRepromptCount() === 1) {
    *     app.ask(`Sorry I didn't catch that. Could you repeat yourself?`);
    *   } else if (app.isFinalReprompt()) {
    *     app.tell(`Okay let's try this again later.`);
    *   }
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(app.StandardIntents.MAIN, welcome);
    * actionMap.set(app.StandardIntents.NO_INPUT, noInput);
    * app.handleRequest(actionMap);
    *
    * @return The current reprompt count. Null if no reprompt count
    *     available (e.g. not in the NO_INPUT intent).
    * @dialogflow
    * @actionssdk
    */
  def getRepromptCount(): Double = js.native
  /**
    * Gets status of user sign in request.
    *
    * @return Result of user sign in request. One of
    * DialogflowApp.SignInStatus or ActionsSdkApp.SignInStatus
    * Null if no sign in status.
    * @dialogflow
    * @actionssdk
    */
  def getSignInStatus(): String = js.native
  /**
    * Gets surface capabilities of user device.
    *
    * @return Supported surface capabilities, as defined in
    *     AssistantApp.SurfaceCapabilities.
    * @dialogflow
    * @actionssdk
    */
  def getSurfaceCapabilities(): js.Array[typings.actionsDashOnDashGoogle.assistantDashAppMod.SurfaceCapabilities] = js.native
  /**
    * Gets transaction decision information. Only use after calling
    * askForTransactionDecision.
    *
    * @return Transaction decision data. Returns object with
    *     userDecision only if user declines. userDecision will be one of
    *     Transactions.ConfirmationDecision. Null if no decision given.
    * @dialogflow
    * @actionssdk
    */
  def getTransactionDecision(): TransactionDecision = js.native
  /**
    * Gets transactability of user. Only use after calling
    * askForTransactionRequirements. Null if no result given.
    *
    * @return One of Transactions.ResultType.
    * @dialogflow
    * @actionssdk
    */
  def getTransactionRequirementsResult(): String = js.native
  /**
    * Gets the {@link User} object.
    * The user object contains information about the user, including
    * a string identifier and personal information (requires requesting permissions,
    * see {@link AssistantApp#askForPermissions|askForPermissions}).
    *
    * @example
    * const app = new DialogflowApp({request: request, response: response});
    * // or
    * const app = new ActionsSdkApp({request: request, response: response});
    * const userId = app.getUser().userId;
    *
    * @return Null if no value.
    * @actionssdk
    * @dialogflow
    */
  def getUser(): User = js.native
  /**
    * Gets confirmation decision. Use after askForConfirmation.
    *
    * @return False if user replied with negative response. Null if no user
    *     confirmation decision given.
    * @dialogflow
    * @actionssdk
    */
  def getUserConfirmation(): Boolean | Null = js.native
  /**
    * Gets the user locale. Returned string represents the regional language
    * information of the user set in their Assistant settings.
    * For example, 'en-US' represents US English.
    *
    * @example
    * const app = new DialogflowApp({request, response});
    * const locale = app.getUserLocale();
    *
    * @return User's locale, e.g. 'en-US'. Null if no locale given.
    * @actionssdk
    * @dialogflow
    */
  def getUserLocale(): String = js.native
  /**
    * If granted permission to user's name in previous intent, returns user's
    * display name, family name, and given name. If name info is unavailable,
    * returns null.
    *
    * @example
    * const app = new DialogflowApp({request: req, response: res});
    * const REQUEST_PERMISSION_ACTION = 'request_permission';
    * const SAY_NAME_ACTION = 'get_name';
    *
    * function requestPermission (app) {
    *   const permission = app.SupportedPermissions.NAME;
    *   app.askForPermission('To know who you are', permission);
    * }
    *
    * function sayName (app) {
    *   if (app.isPermissionGranted()) {
    *     app.tell('Your name is ' + app.getUserName().displayName));
    *   } else {
    *     // Response shows that user did not grant permission
    *     app.tell('Sorry, I could not get your name.');
    *   }
    * }
    * const actionMap = new Map();
    * actionMap.set(REQUEST_PERMISSION_ACTION, requestPermission);
    * actionMap.set(SAY_NAME_ACTION, sayName);
    * app.handleRequest(actionMap);
    * @return Null if name permission is not granted.
    * @actionssdk
    * @dialogflow
    */
  def getUserName(): UserName = js.native
  // ---------------------------------------------------------------------------
  //                   Public APIs
  // ---------------------------------------------------------------------------
  /**
    * Handles the incoming Assistant request using a handler or Map of handlers.
    * Each handler can be a function callback or Promise.
    *
    * @example
    * // Actions SDK
    * const app = new ActionsSdkApp({request: request, response: response});
    *
    * const noInputs = [
    *   `I didn't hear a number`,
    *   `If you're still there, what's the number?`,
    *   'What is the number?'
    * ];
    *
    * function mainIntent (app) {
    *   const ssml = '<speak>Hi! <break time="1"/> ' +
    *     'I can read out an ordinal like ' +
    *     '<say-as interpret-as="ordinal">123</say-as>. Say a number.</speak>';
    *   const inputPrompt = app.buildInputPrompt(true, ssml, noInputs);
    *   app.ask(inputPrompt);
    * }
    *
    * function rawInput (app) {
    *   if (app.getRawInput() === 'bye') {
    *     app.tell('Goodbye!');
    *   } else {
    *     const ssml = '<speak>You said, <say-as interpret-as="ordinal">' +
    *       app.getRawInput() + '</say-as></speak>';
    *     const inputPrompt = app.buildInputPrompt(true, ssml, noInputs);
    *     app.ask(inputPrompt);
    *   }
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(app.StandardIntents.MAIN, mainIntent);
    * actionMap.set(app.StandardIntents.TEXT, rawInput);
    *
    * app.handleRequest(actionMap);
    *
    * // Dialogflow
    * const app = new DialogflowApp({request: req, response: res});
    * const NAME_ACTION = 'make_name';
    * const COLOR_ARGUMENT = 'color';
    * const NUMBER_ARGUMENT = 'number';
    *
    * function makeName (app) {
    *   const number = app.getArgument(NUMBER_ARGUMENT);
    *   const color = app.getArgument(COLOR_ARGUMENT);
    *   app.tell('Alright, your silly name is ' +
    *     color + ' ' + number +
    *     '! I hope you like it. See you next time.');
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(NAME_ACTION, makeName);
    * app.handleRequest(actionMap);
    *
    * @param handler The handler (or Map of handlers) for the request.
    * @actionssdk
    * @dialogflow
    */
  def handleRequest(handler: js.Function1[/* app */ this.type, _]): Unit = js.native
  def handleRequest(handler: Map[String, js.Function1[/* app */ this.type, _]]): Unit = js.native
  /**
    * Asynchronously handles the incoming Assistant request using a handler or Map of handlers.
    * Each handler can be a function callback or Promise.
    *
    * @example
    * // Actions SDK
    * const app = new ActionsSdkApp({request: request, response: response});
    *
    * const noInputs = [
    *   `I didn't hear a number`,
    *   `If you're still there, what's the number?`,
    *   'What is the number?'
    * ];
    *
    * function mainIntent (app) {
    *   const ssml = '<speak>Hi! <break time="1"/> ' +
    *     'I can read out an ordinal like ' +
    *     '<say-as interpret-as="ordinal">123</say-as>. Say a number.</speak>';
    *   const inputPrompt = app.buildInputPrompt(true, ssml, noInputs);
    *   app.ask(inputPrompt);
    * }
    *
    * function rawInput (app) {
    *   if (app.getRawInput() === 'bye') {
    *     app.tell('Goodbye!');
    *   } else {
    *     const ssml = '<speak>You said, <say-as interpret-as="ordinal">' +
    *       app.getRawInput() + '</say-as></speak>';
    *     const inputPrompt = app.buildInputPrompt(true, ssml, noInputs);
    *     app.ask(inputPrompt);
    *   }
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(app.StandardIntents.MAIN, mainIntent);
    * actionMap.set(app.StandardIntents.TEXT, rawInput);
    *
    * app.handleRequestAsync(actionMap)
    * .then(
    *   (result) => {
    *     // handle the result
    *   })
    * .catch(
    *   (reason) => {
    *     // handle an error
    *   });
    *
    * // Dialogflow
    * const app = new DialogflowApp({request: req, response: res});
    * const NAME_ACTION = 'make_name';
    * const COLOR_ARGUMENT = 'color';
    * const NUMBER_ARGUMENT = 'number';
    *
    * function makeName (app) {
    *   const number = app.getArgument(NUMBER_ARGUMENT);
    *   const color = app.getArgument(COLOR_ARGUMENT);
    *   app.tell('Alright, your silly name is ' +
    *     color + ' ' + number +
    *     '! I hope you like it. See you next time.');
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(NAME_ACTION, makeName);
    *
    * app.handleRequestAsync(actionMap)
    * .then(
    *   (result) => {
    *     // handle the result
    *   })
    * .catch(
    *   (reason) => {
    *     // handle an error
    *   });
    *
    * @param handler The handler (or Map of handlers) for the request.
    * @return Promise to resolve the result of the handler that was invoked.
    * @actionssdk
    * @dialogflow
    */
  def handleRequestAsync(handler: js.Function1[/* app */ this.type, _]): js.Promise[_] = js.native
  def handleRequestAsync(handler: Map[String, js.Function1[/* app */ this.type, _]]): js.Promise[_] = js.native
  def hasAvailableSurfaceCapabilities(capabilities: js.Array[typings.actionsDashOnDashGoogle.assistantDashAppMod.SurfaceCapabilities]): Boolean = js.native
  /**
    * Returns true if user has an available surface which includes all given
    * capabilities. Available surfaces capabilities may exist on surfaces other
    * than that used for an ongoing conversation.
    *
    * @param capabilities Must be one of
    *     {@link SurfaceCapabilities}.
    * @return True if user has a capability available on some surface.
    *
    * @dialogflow
    * @actionssdk
    */
  def hasAvailableSurfaceCapabilities(capabilities: typings.actionsDashOnDashGoogle.assistantDashAppMod.SurfaceCapabilities): Boolean = js.native
  /**
    * Returns true if user device has a given surface capability.
    *
    * @param requestedCapability Must be one of {@link SurfaceCapabilities}.
    * @return True if user device has the given capability.
    *
    * @example
    * const app = new DialogflowApp({request: req, response: res});
    * const DESCRIBE_SOMETHING = 'DESCRIBE_SOMETHING';
    *
    * function describe (app) {
    *   if (app.hasSurfaceCapability(app.SurfaceCapabilities.SCREEN_OUTPUT)) {
    *     app.tell(richResponseWithBasicCard);
    *   } else {
    *     app.tell('Let me tell you about ...');
    *   }
    * }
    * const actionMap = new Map();
    * actionMap.set(DESCRIBE_SOMETHING, describe);
    * app.handleRequest(actionMap);
    *
    * @dialogflow
    * @actionssdk
    */
  def hasSurfaceCapability(requestedCapability: typings.actionsDashOnDashGoogle.assistantDashAppMod.SurfaceCapabilities): Boolean = js.native
  /**
    * Returns true if it is the final reprompt related to silent input from the
    * user. This should be used along with the NO_INPUT intent to give the final
    * response to the user after multiple silences and should be an app.tell
    * which ends the conversation.
    *
    * @example
    * const app = new ActionsSdkApp({request, response});
    *
    * function welcome (app) {
    *   app.ask('Welcome to your app!');
    * }
    *
    * function noInput (app) {
    *   if (app.getRepromptCount() === 0) {
    *     app.ask(`What was that?`);
    *   } else if (app.getRepromptCount() === 1) {
    *     app.ask(`Sorry I didn't catch that. Could you repeat yourself?`);
    *   } else if (app.isFinalReprompt()) {
    *     app.tell(`Okay let's try this again later.`);
    *   }
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(app.StandardIntents.MAIN, welcome);
    * actionMap.set(app.StandardIntents.NO_INPUT, noInput);
    * app.handleRequest(actionMap);
    *
    * @return True if in a NO_INPUT intent and this is the final turn
    *     of dialog.
    * @dialogflow
    * @actionssdk
    */
  def isFinalReprompt(): Boolean = js.native
  /**
    * Returns true if the app is being tested in sandbox mode. Enable sandbox
    * mode in the (Actions console)[console.actions.google.com] to test
    * transactions.
    *
    * @return True if app is being used in Sandbox mode.
    * @dialogflow
    * @actionssdk
    */
  def isInSandbox(): Boolean = js.native
  /**
    * Returns the result of the AskForNewSurface helper.
    *
    * @return True if user has triggered conversation on a new device
    *     following the NEW_SURFACE intent.
    * @actionssdk
    * @dialogflow
    */
  def isNewSurface(): Boolean = js.native
  /**
    * Returns true if the request follows a previous request asking for
    * permission from the user and the user granted the permission(s). Otherwise,
    * false. Use with {@link AssistantApp#askForPermissions|askForPermissions}.
    *
    * @example
    * const app = new ActionsSdkApp({request: request, response: response});
    * // or
    * const app = new DialogflowApp({request: request, response: response});
    * app.askForPermissions("To get you a ride", [
    *   app.SupportedPermissions.NAME,
    *   app.SupportedPermissions.DEVICE_PRECISE_LOCATION
    * ]);
    * // ...
    * // In response handler for subsequent intent:
    * if (app.isPermissionGranted()) {
    *  // Use the requested permission(s) to get the user a ride
    * }
    *
    * @return true if permissions granted.
    * @dialogflow
    * @actionssdk
    */
  def isPermissionGranted(): Boolean = js.native
  /**
    * Returns true if user accepted update registration request. Used with
    * {@link AssistantApp#askToRegisterDailyUpdate}
    *
    * @return True if user accepted update registration request.
    * @dialogflow
    * @actionssdk
    */
  def isUpdateRegistered(): Boolean = js.native
}

