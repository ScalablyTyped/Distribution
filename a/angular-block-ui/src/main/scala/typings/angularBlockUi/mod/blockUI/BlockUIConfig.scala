package typings.angularBlockUi.mod.blockUI

import typings.angular.mod.IRequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var autoBlock: js.UndefOr[Boolean] = js.native
  
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
  var autoInjectBodyBlock: js.UndefOr[Boolean] = js.native
  
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
  var blockBrowserNavigation: js.UndefOr[Boolean] = js.native
  
  /**
    * A string containing the default css classes (separated by spaces)
    * that should be applied to each block-ui element.
    *
    * The default value is "block-ui block-ui-anim-fade"
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /**
    * Specifies the amount in milliseconds before the block
    * is visible to the user. By delaying a visible block your
    * application will appear more responsive.
    *
    * The default value is 250.
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Changes the default message to be used when no message
    * has been provided to the start method of the service.
    *
    * Default value is 'Loading ...'.
    */
  var message: js.UndefOr[String] = js.native
  
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
  var requestFilter: js.UndefOr[js.Function1[/* config */ IRequestConfig, String | Boolean]] = js.native
  
  /**
    * By default the BlockUI module will reset the block count and
    * hide the overlay whenever an exception has occurred.
    *
    * You can set this value to false if you don't want this behaviour.
    *
    * The default value is 'true'
    */
  var resetOnException: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies a custom template to use as the overlay.
    */
  var template: js.UndefOr[String] = js.native
  
  /**
    * Specifies a url to retrieve the template from.
    * The current release only works with pre-cached templates,
    * which means that this url should be known in the
    * $templateCache service of Angular.
    *
    * If you're using the grunt with html2js or angular-templates,
    * which I highly recommend, you're already set.
    */
  var templateUrl: js.UndefOr[String] = js.native
}
object BlockUIConfig {
  
  @scala.inline
  def apply(): BlockUIConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockUIConfig]
  }
  
  @scala.inline
  implicit class BlockUIConfigOps[Self <: BlockUIConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoBlock(value: Boolean): Self = this.set("autoBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBlock: Self = this.set("autoBlock", js.undefined)
    
    @scala.inline
    def setAutoInjectBodyBlock(value: Boolean): Self = this.set("autoInjectBodyBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoInjectBodyBlock: Self = this.set("autoInjectBodyBlock", js.undefined)
    
    @scala.inline
    def setBlockBrowserNavigation(value: Boolean): Self = this.set("blockBrowserNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockBrowserNavigation: Self = this.set("blockBrowserNavigation", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setRequestFilter(value: /* config */ IRequestConfig => String | Boolean): Self = this.set("requestFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRequestFilter: Self = this.set("requestFilter", js.undefined)
    
    @scala.inline
    def setResetOnException(value: Boolean): Self = this.set("resetOnException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetOnException: Self = this.set("resetOnException", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
  }
}
