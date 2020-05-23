package typings.angularBlockUi.mod.blockUI

import typings.angular.mod.IRequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockUIConfig extends js.Object {
  /**
    * By default the BlockUI module will start a block whenever
    * the Angular $http service has an pending request.
    *
    * If you don't want this behaviour and want to do all the
    * blocking manually you can change this value to false.
    *
    * The default value is 'true'
    */
  var autoBlock: js.UndefOr[Boolean] = js.undefined
  /**
    * When the module is started it will inject the main block element
    * by adding the "block-ui" directive to the <body> element.
    *
    * Set this to false if there no need for any fullscreen blocking or if there's
    * more control required. For instance when your ng-app directive is a child
    * element of the body element it is impossible for the blockUI resolve the main
    * instance. In such a case the auto injection of the main block scope should
    * be disabled and the main block element should be relocated.
    *
    * The default value is 'true'
    */
  var autoInjectBodyBlock: js.UndefOr[Boolean] = js.undefined
  /**
    * While a user interface block is active the user can still navigate
    * away using the back and forward buttons of the browser.
    *
    * Callbacks registered to handle responses from the server will
    * be executed even if a different view/controller is active at the
    * time the response arrives.
    *
    * You can set this value to true if you want to prevent navigation
    * with the browser back and forward buttons while a fullscreen
    * block is active.
    *
    * Programatic location changes via the $location service are still
    * allowed however.
    *
    * The default value is 'false'
    */
  var blockBrowserNavigation: js.UndefOr[Boolean] = js.undefined
  /**
    * A string containing the default css classes (separated by spaces)
    * that should be applied to each block-ui element.
    *
    * The default value is "block-ui block-ui-anim-fade"
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /**
    * Specifies the amount in milliseconds before the block
    * is visible to the user. By delaying a visible block your
    * application will appear more responsive.
    *
    * The default value is 250.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Changes the default message to be used when no message
    * has been provided to the start method of the service.
    *
    * Default value is 'Loading ...'.
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * Allows you to specify a filter function to exclude certain ajax
    * requests from blocking the user interface.
    * The blockUI service will ignore requests when the function returns `false`.
    *
    * If the filter function returns a string it will be passed as the message
    * argument to the start method of the service.
    *
    * @param config the Angular request config object.
    *
    */
  var requestFilter: js.UndefOr[js.Function1[/* config */ IRequestConfig, String | Boolean]] = js.undefined
  /**
    * By default the BlockUI module will reset the block count and
    * hide the overlay whenever an exception has occurred.
    *
    * You can set this value to false if you don't want this behaviour.
    *
    * The default value is 'true'
    */
  var resetOnException: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies a custom template to use as the overlay.
    */
  var template: js.UndefOr[String] = js.undefined
  /**
    * Specifies a url to retrieve the template from.
    * The current release only works with pre-cached templates,
    * which means that this url should be known in the
    * $templateCache service of Angular.
    *
    * If you're using the grunt with html2js or angular-templates,
    * which I highly recommend, you're already set.
    */
  var templateUrl: js.UndefOr[String] = js.undefined
}

object BlockUIConfig {
  @scala.inline
  def apply(
    autoBlock: js.UndefOr[Boolean] = js.undefined,
    autoInjectBodyBlock: js.UndefOr[Boolean] = js.undefined,
    blockBrowserNavigation: js.UndefOr[Boolean] = js.undefined,
    cssClass: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    message: String = null,
    requestFilter: /* config */ IRequestConfig => String | Boolean = null,
    resetOnException: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    templateUrl: String = null
  ): BlockUIConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBlock)) __obj.updateDynamic("autoBlock")(autoBlock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoInjectBodyBlock)) __obj.updateDynamic("autoInjectBodyBlock")(autoInjectBodyBlock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blockBrowserNavigation)) __obj.updateDynamic("blockBrowserNavigation")(blockBrowserNavigation.get.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (requestFilter != null) __obj.updateDynamic("requestFilter")(js.Any.fromFunction1(requestFilter))
    if (!js.isUndefined(resetOnException)) __obj.updateDynamic("resetOnException")(resetOnException.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockUIConfig]
  }
}

