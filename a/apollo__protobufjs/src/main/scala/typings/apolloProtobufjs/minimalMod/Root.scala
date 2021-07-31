package typings.apolloProtobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/minimal", "Root")
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
  
  @JSImport("@apollo/protobufjs/minimal", "Root")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Loads a namespace descriptor into a root namespace.
    * @param json Nameespace descriptor
    * @param [root] Root namespace, defaults to create a new one if omitted
    * @returns Root namespace
    */
  @scala.inline
  def fromJSON(json: INamespace): typings.apolloProtobufjs.mod.Root = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.apolloProtobufjs.mod.Root]
  @scala.inline
  def fromJSON(json: INamespace, root: typings.apolloProtobufjs.mod.Root): typings.apolloProtobufjs.mod.Root = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.apolloProtobufjs.mod.Root]
}
