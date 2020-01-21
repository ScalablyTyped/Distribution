package typings.apolloReact.testUtilsMod

import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NetworkInterface * / any */ @JSImport("apollo-react/lib/test-utils", "MockNetworkInterface")
@js.native
class MockNetworkInterface_ protected () extends js.Object {
  def this(mockedResponses: MockedResponse*) = this()
  var mockedResponsesByKey: js.Any = js.native
  def addMockedReponse(mockedResponse: MockedResponse): Unit = js.native
  def query(request: Request): js.Promise[js.Object] = js.native
}

