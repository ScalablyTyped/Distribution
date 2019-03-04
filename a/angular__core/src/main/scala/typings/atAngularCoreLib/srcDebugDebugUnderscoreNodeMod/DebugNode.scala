package typings
package atAngularCoreLib.srcDebugDebugUnderscoreNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugNode extends js.Object {
  val componentInstance: js.Any
  val context: js.Any
  val injector: atAngularCoreLib.srcDiMod.Injector
  val listeners: js.Array[EventListener]
  val nativeNode: js.Any
  val parent: DebugElement | scala.Null
  val providerTokens: js.Array[_]
  val references: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object DebugNode {
  @scala.inline
  def apply(
    componentInstance: js.Any,
    context: js.Any,
    injector: atAngularCoreLib.srcDiMod.Injector,
    listeners: js.Array[EventListener],
    nativeNode: js.Any,
    providerTokens: js.Array[_],
    references: org.scalablytyped.runtime.StringDictionary[js.Any],
    parent: DebugElement = null
  ): DebugNode = {
    val __obj = js.Dynamic.literal(componentInstance = componentInstance, context = context, injector = injector, listeners = listeners, nativeNode = nativeNode, providerTokens = providerTokens, references = references)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[DebugNode]
  }
}

