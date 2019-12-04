package typings.applicationinsights.outAutoCollectionConsoleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/Console", JSImport.Namespace)
@js.native
class ^ protected () extends AutoCollectConsole {
  def this(client: typings.applicationinsights.outLibraryTelemetryClientMod.^) = this()
  /* CompleteClass */
  override var _client: js.Any = js.native
  /* CompleteClass */
  override var _isInitialized: js.Any = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def enable(isEnabled: Boolean, collectConsoleLog: Boolean): Unit = js.native
  /* CompleteClass */
  override def isInitialized(): Boolean = js.native
}

@JSImport("applicationinsights/out/AutoCollection/Console", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var INSTANCE: AutoCollectConsole = js.native
  var _methodNames: js.Any = js.native
  var originalMethods: StringDictionary[js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]] = js.native
}

