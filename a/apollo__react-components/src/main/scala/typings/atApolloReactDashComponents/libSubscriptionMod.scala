package typings.atApolloReactDashComponents

import typings.atApolloReactDashComponents.libTypesMod.SubscriptionComponentOptions
import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.Validator
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-components/lib/Subscription", JSImport.Namespace)
@js.native
object libSubscriptionMod extends js.Object {
  def Subscription[TData, TVariables](props: SubscriptionComponentOptions[TData, TVariables]): Element | Null = js.native
  @JSName("Subscription")
  @js.native
  object SubscriptionNs extends js.Object {
    @js.native
    object propTypes extends js.Object {
      var children: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onSubscriptionComplete: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onSubscriptionData: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var shouldResubscribe: Requireable[Boolean | (js.Function1[/* repeated */ _, _])] = js.native
      var subscription: Validator[js.Object] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
}

