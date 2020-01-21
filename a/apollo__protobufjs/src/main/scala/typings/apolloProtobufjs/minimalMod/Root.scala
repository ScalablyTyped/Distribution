package typings.apolloProtobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs/minimal", "Root")
@js.native
/**
  * Constructs a new root namespace instance.
  * @param [options] Top level options
  */
class Root ()
  extends typings.apolloProtobufjs.mod.Root {
  def this(options: StringDictionary[js.Any]) = this()
}

/* static members */
@JSImport("@apollo/protobufjs/minimal", "Root")
@js.native
object Root extends js.Object {
  /**
    * Loads a namespace descriptor into a root namespace.
    * @param json Nameespace descriptor
    * @param [root] Root namespace, defaults to create a new one if omitted
    * @returns Root namespace
    */
  def fromJSON(json: INamespace): typings.apolloProtobufjs.mod.Root = js.native
  def fromJSON(json: INamespace, root: typings.apolloProtobufjs.mod.Root): typings.apolloProtobufjs.mod.Root = js.native
}

