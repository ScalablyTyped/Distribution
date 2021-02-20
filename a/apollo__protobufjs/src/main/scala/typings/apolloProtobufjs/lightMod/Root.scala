package typings.apolloProtobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/light", "Root")
@js.native
/**
  * Constructs a new root namespace instance.
  * @param [options] Top level options
  */
class Root ()
  extends typings.apolloProtobufjs.mod.Root {
  def this(options: StringDictionary[js.UndefOr[js.Any]]) = this()
}
/* static members */
object Root {
  
  /**
    * Loads a namespace descriptor into a root namespace.
    * @param json Nameespace descriptor
    * @param [root] Root namespace, defaults to create a new one if omitted
    * @returns Root namespace
    */
  @JSImport("@apollo/protobufjs/light", "Root.fromJSON")
  @js.native
  def fromJSON(json: INamespace): typings.apolloProtobufjs.mod.Root = js.native
  @JSImport("@apollo/protobufjs/light", "Root.fromJSON")
  @js.native
  def fromJSON(json: INamespace, root: typings.apolloProtobufjs.mod.Root): typings.apolloProtobufjs.mod.Root = js.native
}
