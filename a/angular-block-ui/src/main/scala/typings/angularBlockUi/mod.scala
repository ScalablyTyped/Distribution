package typings.angularBlockUi

import typings.angular.mod.IRequestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object blockUI {
    
    @js.native
    trait BlockUIConfig extends StObject {
      
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
      implicit class BlockUIConfigMutableBuilder[Self <: BlockUIConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutoBlock(value: Boolean): Self = StObject.set(x, "autoBlock", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoBlockUndefined: Self = StObject.set(x, "autoBlock", js.undefined)
        
        @scala.inline
        def setAutoInjectBodyBlock(value: Boolean): Self = StObject.set(x, "autoInjectBodyBlock", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoInjectBodyBlockUndefined: Self = StObject.set(x, "autoInjectBodyBlock", js.undefined)
        
        @scala.inline
        def setBlockBrowserNavigation(value: Boolean): Self = StObject.set(x, "blockBrowserNavigation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockBrowserNavigationUndefined: Self = StObject.set(x, "blockBrowserNavigation", js.undefined)
        
        @scala.inline
        def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
        
        @scala.inline
        def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        @scala.inline
        def setRequestFilter(value: /* config */ IRequestConfig => String | Boolean): Self = StObject.set(x, "requestFilter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRequestFilterUndefined: Self = StObject.set(x, "requestFilter", js.undefined)
        
        @scala.inline
        def setResetOnException(value: Boolean): Self = StObject.set(x, "resetOnException", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResetOnExceptionUndefined: Self = StObject.set(x, "resetOnException", js.undefined)
        
        @scala.inline
        def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
        
        @scala.inline
        def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
      }
    }
    
    @js.native
    trait BlockUIInstances extends StObject {
      
      def get(id: String): BlockUIService = js.native
    }
    object BlockUIInstances {
      
      @scala.inline
      def apply(get: String => BlockUIService): BlockUIInstances = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
        __obj.asInstanceOf[BlockUIInstances]
      }
      
      @scala.inline
      implicit class BlockUIInstancesMutableBuilder[Self <: BlockUIInstances] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGet(value: String => BlockUIService): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait BlockUIService extends StObject {
      
      /**
        * Queues a callback function to be called when the block has finished.
        *
        * This can be useful whenever you wish to redirect the user
        * to a different location while there are still pending AJAX requests.
        */
      def done(doneCallback: js.Function0[Unit]): Unit = js.native
      
      var instances: BlockUIInstances = js.native
      
      /**
        * Returns whether currently a block is shown for the instance or not.
        */
      def isBlocking(): Boolean = js.native
      
      /**
        * Allows the message shown in the overlay to be updated
        * while to block is active.
        *
        * @param message The message to show in the overlay.
        */
      def message(message: String): Unit = js.native
      
      /**
        * The reset will force an unblock by setting the block count to 0.
        */
      def reset(): Unit = js.native
      
      /**
        * The start method will start the user interface block.
        * Because multiple user interface elements can request
        * a user interface block at the same time, the service
        * keeps track of the number of start calls.
        *
        * Each call to start() will increase the count and every
        * call to stop() will decrease the value.
        * Whenever the count reaches 0 the block will end.
        *
        * Note: By default the block is immediately active after
        * calling this method, but to prevent trashing the user
        * interface each time a button is pressed, the block is
        * visible after a short delay.
        *
        * This behaviour can be modified in the configuration.
        *
        * @param messageOrOptions
        *     Either supply the message (string) to be show in the
        *     overlay or specify an IBlockUIConfig object that will be
        *     merged/extended into the block ui instance state.
        *     If no argument is specified the default text message
        *     from the configuration is used.
        */
      def start(): Unit = js.native
      def start(messageOrOptions: String): Unit = js.native
      def start(messageOrOptions: BlockUIConfig): Unit = js.native
      
      /**
        * This will decrease the block count.
        *
        * The block will end if the count is 0.
        */
      def stop(): Unit = js.native
    }
  }
}
