package typings.apolloReact.testUtilsMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscriptionNetworkInterface * / any */ @JSImport("apollo-react/lib/test-utils", "MockSubscriptionNetworkInterface")
@js.native
class MockSubscriptionNetworkInterface_ protected () extends MockNetworkInterface_ {
  def this(mockedSubscriptions: js.Array[MockedSubscription], mockedResponses: MockedResponse*) = this()
  var handlersById: NumberDictionary[js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]] = js.native
  var mockedSubscriptionsById: NumberDictionary[MockedSubscription] = js.native
  var mockedSubscriptionsByKey: StringDictionary[js.Array[MockedSubscription]] = js.native
  var subId: Double = js.native
  def addMockedSubscription(mockedSubscription: MockedSubscription): Unit = js.native
  def fireResult(id: Double): Unit = js.native
  def generateSubscriptionId(): Double = js.native
  def subscribe(request: Request, handler: js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]): Double = js.native
  def unsubscribe(id: Double): Unit = js.native
}

