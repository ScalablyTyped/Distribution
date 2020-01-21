package typings.applicationinsights.contextMod

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsights.contractsMod.ContextTagKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var keys: ContextTagKeys = js.native
  var tags: StringDictionary[String] = js.native
  /* private */ def _loadApplicationContext(): js.Any = js.native
  /* private */ def _loadApplicationContext(packageJsonPath: js.Any): js.Any = js.native
  /* private */ def _loadDeviceContext(): js.Any = js.native
  /* private */ def _loadInternalContext(): js.Any = js.native
}

