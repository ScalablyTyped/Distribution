package typings.angularHttpAuth

import typings.angular.mod.IRequestConfig
import typings.angular.mod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("angular", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object httpAuth extends js.Object {
    @js.native
    trait IAuthService extends js.Object {
      def loginCancelled(): Unit = js.native
      def loginCancelled(data: js.Any): Unit = js.native
      def loginCancelled(data: js.Any, reason: js.Any): Unit = js.native
      def loginConfirmed(): Unit = js.native
      def loginConfirmed(data: js.Any): Unit = js.native
      def loginConfirmed(data: js.Any, configUpdater: Function): Unit = js.native
    }
    
    @js.native
    trait IHttpBuffer extends js.Object {
      def append(config: IRequestConfig, deferred: AnonData): Unit = js.native
      def rejectAll(): Unit = js.native
      def rejectAll(reason: js.Any): Unit = js.native
      def retryAll(): Unit = js.native
      def retryAll(updater: Function): Unit = js.native
    }
    
  }
  
}

