package typings.absintheSocket

import typings.absintheSocket.anon.OnError
import typings.phoenix.mod.Channel
import typings.phoenix.mod.Socket
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@absinthe/socket", "cancel")
  @js.native
  def cancel(absintheSocket: AbsintheSocket[js.Object], notifier: Notifier[js.Object, js.Object]): AbsintheSocket[js.Object] = js.native
  
  @JSImport("@absinthe/socket", "create")
  @js.native
  def create(socket: Socket): AbsintheSocket[js.Object] = js.native
  
  @JSImport("@absinthe/socket", "observe")
  @js.native
  def observe[Variables](
    absintheSocket: AbsintheSocket[js.Object],
    notifier: Notifier[Variables, js.Object],
    observer: Observer[Variables, js.Object]
  ): AbsintheSocket[js.Object] = js.native
  
  @JSImport("@absinthe/socket", "send")
  @js.native
  def send[Variables](absintheSocket: AbsintheSocket[js.Object], gqlRequest: GqlRequest[Variables]): Notifier[Variables, js.Object] = js.native
  
  @JSImport("@absinthe/socket", "toObservable")
  @js.native
  def toObservable[Variables](absintheSocket: AbsintheSocket[js.Object], notifier: Notifier[Variables, js.Object]): Observer[Variables, js.Object] = js.native
  @JSImport("@absinthe/socket", "toObservable")
  @js.native
  def toObservable[Variables](
    absintheSocket: AbsintheSocket[js.Object],
    notifier: Notifier[Variables, js.Object],
    observer: OnError[Variables]
  ): Observer[Variables, js.Object] = js.native
  
  @JSImport("@absinthe/socket", "unobserve")
  @js.native
  def unobserve[Variables](
    absintheSocket: AbsintheSocket[js.Object],
    notifier: Notifier[Variables, js.Object],
    observer: Observer[Variables, js.Object]
  ): AbsintheSocket[js.Object] = js.native
  
  @JSImport("@absinthe/socket", "unobserveOrCancel")
  @js.native
  def unobserveOrCancel[Variables](
    absintheSocket: AbsintheSocket[js.Object],
    notifier: Notifier[Variables, js.Object],
    observer: Observer[Variables, js.Object]
  ): AbsintheSocket[js.Object] = js.native
  
  @js.native
  trait AbsintheSocket[T] extends StObject {
    
    var channel: Channel = js.native
    
    var channelJoinCreated: Boolean = js.native
    
    var notifiers: js.Array[Notifier[T, js.Object]] = js.native
    
    var phoenixSocket: Socket = js.native
  }
  object AbsintheSocket {
    
    @scala.inline
    def apply[T](
      channel: Channel,
      channelJoinCreated: Boolean,
      notifiers: js.Array[Notifier[T, js.Object]],
      phoenixSocket: Socket
    ): AbsintheSocket[T] = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], channelJoinCreated = channelJoinCreated.asInstanceOf[js.Any], notifiers = notifiers.asInstanceOf[js.Any], phoenixSocket = phoenixSocket.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbsintheSocket[T]]
    }
    
    @scala.inline
    implicit class AbsintheSocketMutableBuilder[Self <: AbsintheSocket[_], T] (val x: Self with AbsintheSocket[T]) extends AnyVal {
      
      @scala.inline
      def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelJoinCreated(value: Boolean): Self = StObject.set(x, "channelJoinCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifiers(value: js.Array[Notifier[T, js.Object]]): Self = StObject.set(x, "notifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifiersVarargs(value: (Notifier[T, js.Object])*): Self = StObject.set(x, "notifiers", js.Array(value :_*))
      
      @scala.inline
      def setPhoenixSocket(value: Socket): Self = StObject.set(x, "phoenixSocket", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.absintheSocket.absintheSocketStrings.mutation
    - typings.absintheSocket.absintheSocketStrings.query
    - typings.absintheSocket.absintheSocketStrings.subscription
  */
  trait GqlOperationType extends StObject
  object GqlOperationType {
    
    @scala.inline
    def mutation: typings.absintheSocket.absintheSocketStrings.mutation = "mutation".asInstanceOf[typings.absintheSocket.absintheSocketStrings.mutation]
    
    @scala.inline
    def query: typings.absintheSocket.absintheSocketStrings.query = "query".asInstanceOf[typings.absintheSocket.absintheSocketStrings.query]
    
    @scala.inline
    def subscription: typings.absintheSocket.absintheSocketStrings.subscription = "subscription".asInstanceOf[typings.absintheSocket.absintheSocketStrings.subscription]
  }
  
  @js.native
  trait GqlRequest[Variables] extends StObject {
    
    var operation: String = js.native
    
    var variables: js.UndefOr[Variables] = js.native
  }
  object GqlRequest {
    
    @scala.inline
    def apply[Variables](operation: String): GqlRequest[Variables] = {
      val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[GqlRequest[Variables]]
    }
    
    @scala.inline
    implicit class GqlRequestMutableBuilder[Self <: GqlRequest[_], Variables] (val x: Self with GqlRequest[Variables]) extends AnyVal {
      
      @scala.inline
      def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  @js.native
  trait Notifier[Variables, Result] extends StObject {
    
    var activeObservers: js.Array[Observer[Variables, Result]] = js.native
    
    var canceledObservers: js.Array[Observer[Variables, Result]] = js.native
    
    var isActive: Boolean = js.native
    
    var operationType: GqlOperationType = js.native
    
    var request: GqlRequest[Variables] = js.native
    
    var requestStatus: RequestStatus = js.native
    
    var subscriptionId: js.UndefOr[String] = js.native
  }
  object Notifier {
    
    @scala.inline
    def apply[Variables, Result](
      activeObservers: js.Array[Observer[Variables, Result]],
      canceledObservers: js.Array[Observer[Variables, Result]],
      isActive: Boolean,
      operationType: GqlOperationType,
      request: GqlRequest[Variables],
      requestStatus: RequestStatus
    ): Notifier[Variables, Result] = {
      val __obj = js.Dynamic.literal(activeObservers = activeObservers.asInstanceOf[js.Any], canceledObservers = canceledObservers.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestStatus = requestStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notifier[Variables, Result]]
    }
    
    @scala.inline
    implicit class NotifierMutableBuilder[Self <: Notifier[_, _], Variables, Result] (val x: Self with (Notifier[Variables, Result])) extends AnyVal {
      
      @scala.inline
      def setActiveObservers(value: js.Array[Observer[Variables, Result]]): Self = StObject.set(x, "activeObservers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveObserversVarargs(value: (Observer[Variables, Result])*): Self = StObject.set(x, "activeObservers", js.Array(value :_*))
      
      @scala.inline
      def setCanceledObservers(value: js.Array[Observer[Variables, Result]]): Self = StObject.set(x, "canceledObservers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanceledObserversVarargs(value: (Observer[Variables, Result])*): Self = StObject.set(x, "canceledObservers", js.Array(value :_*))
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationType(value: GqlOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: GqlRequest[Variables]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestStatus(value: RequestStatus): Self = StObject.set(x, "requestStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
    }
  }
  
  @js.native
  trait Observer[Variables, Result] extends StObject {
    
    var onAbort: js.UndefOr[js.Function1[/* error */ Error, _]] = js.native
    
    var onCancel: js.UndefOr[js.Function0[_]] = js.native
    
    var onError: js.UndefOr[js.Function1[/* error */ Error, _]] = js.native
    
    var onResult: js.UndefOr[js.Function1[/* result */ Result, _]] = js.native
    
    var onStart: js.UndefOr[js.Function1[/* notifier */ Notifier[Variables, js.Object], _]] = js.native
  }
  object Observer {
    
    @scala.inline
    def apply[Variables, Result](): Observer[Variables, Result] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Observer[Variables, Result]]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer[_, _], Variables, Result] (val x: Self with (Observer[Variables, Result])) extends AnyVal {
      
      @scala.inline
      def setOnAbort(value: /* error */ Error => _): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnCancel(value: () => _): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnError(value: /* error */ Error => _): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnResult(value: /* result */ Result => _): Self = StObject.set(x, "onResult", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResultUndefined: Self = StObject.set(x, "onResult", js.undefined)
      
      @scala.inline
      def setOnStart(value: /* notifier */ Notifier[Variables, js.Object] => _): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.absintheSocket.absintheSocketStrings.canceled
    - typings.absintheSocket.absintheSocketStrings.canceling
    - typings.absintheSocket.absintheSocketStrings.pending
    - typings.absintheSocket.absintheSocketStrings.sent
    - typings.absintheSocket.absintheSocketStrings.sending
  */
  trait RequestStatus extends StObject
  object RequestStatus {
    
    @scala.inline
    def canceled: typings.absintheSocket.absintheSocketStrings.canceled = "canceled".asInstanceOf[typings.absintheSocket.absintheSocketStrings.canceled]
    
    @scala.inline
    def canceling: typings.absintheSocket.absintheSocketStrings.canceling = "canceling".asInstanceOf[typings.absintheSocket.absintheSocketStrings.canceling]
    
    @scala.inline
    def pending: typings.absintheSocket.absintheSocketStrings.pending = "pending".asInstanceOf[typings.absintheSocket.absintheSocketStrings.pending]
    
    @scala.inline
    def sending: typings.absintheSocket.absintheSocketStrings.sending = "sending".asInstanceOf[typings.absintheSocket.absintheSocketStrings.sending]
    
    @scala.inline
    def sent: typings.absintheSocket.absintheSocketStrings.sent = "sent".asInstanceOf[typings.absintheSocket.absintheSocketStrings.sent]
  }
}
